import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import java.text.DateFormat
import java.text.SimpleDateFormat

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile

import internal.GlobalVariable as GlobalVariable

Mobile.startApplication(GlobalVariable.app_url,true)

Mobile.verifyElementText(findTestObject('Web Mobile Tests/Job Scheduler/android.widget.TextView0 - Job Scheduler'), 'Job Scheduler')

MobileBuiltInKeywords.verifyElementText(findTestObject('Web Mobile Tests/Job Scheduler/android.widget.TextView1 - No jobs added'), 'No jobs added!')

Mobile.tap(findTestObject('Web Mobile Tests/Job Scheduler/android.widget.ImageButton1'), 0)

MobileBuiltInKeywords.verifyElementText(findTestObject('Web Mobile Tests/Job Scheduler/android.widget.TextView0 - Add job'), 'Add job')

Mobile.verifyElementVisible(findTestObject('Web Mobile Tests/Job Scheduler/android.widget.Button0 - NEXT'), 0)

Mobile.tap(findTestObject('Web Mobile Tests/Job Scheduler/android.widget.TextView1 - Date'), 0)

Mobile.tap(findTestObject('Web Mobile Tests/Job Scheduler/android.widget.Button1 - OK'), 0)

Mobile.tap(findTestObject('Web Mobile Tests/Job Scheduler/android.widget.Button0 - NEXT'), 0)

Mobile.tap(findTestObject('Web Mobile Tests/Job Scheduler/android.widget.Button0 - NEXT'), 0)

MobileBuiltInKeywords.verifyElementVisible(findTestObject('Web Mobile Tests/Job Scheduler/android.widget.Button0 - CLOSE'), 0)

Mobile.tap(findTestObject('Web Mobile Tests/Job Scheduler/android.widget.Button0 - CLOSE'), 0)

MobileBuiltInKeywords.verifyElementVisible(findTestObject('Web Mobile Tests/Job Scheduler/android.widget.TextView0 - Add job'), 0)

Mobile.tap(findTestObject('Web Mobile Tests/Job Scheduler/android.widget.Button0 - ADD JOB'), 0)

Date date = new Date()
DateFormat df = new SimpleDateFormat("EEEE");

def profile = RunConfiguration.getExecutionProfile()

if (profile == 'kobiton') {
	df.setTimeZone(TimeZone.getTimeZone(GlobalVariable.time_zone));
}

Mobile.verifyElementText(findTestObject('Web Mobile Tests/Job Scheduler/android.widget.TextView1 - Created Date'), df.format(date))

Mobile.closeApplication()

