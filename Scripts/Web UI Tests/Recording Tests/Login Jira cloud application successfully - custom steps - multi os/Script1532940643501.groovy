import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://id.atlassian.com/login?continue=https%3A%2F%2Fkatalon.atlassian.net%2Flogin%3FredirectCount%3D1')

WebUI.verifyElementText(findTestObject('Page_Log in to continue - Log in wi/h1_Log in to your account'), 'Log in to your account')

WebUI.verifyElementAttributeValue(findTestObject('Page_Log in to continue - Log in wi/input_username'), 'placeholder', 'Enter email', 
    0)

WebUI.setText(findTestObject('Page_Log in to continue - Log in wi/input_username'), 'demo@katalon.com')

WebUI.click(findTestObject('Page_Log in to continue - Log in wi/span_Continue'))

WebUI.verifyElementText(findTestObject('Page_Sign in to your account/div_Sign in'), 'Sign in')

WebUI.verifyElementAttributeValue(findTestObject('Page_Sign in to your account/input_loginfmt'), 'placeholder', 'Email, phone, or Skype', 
    0)

WebUI.setText(findTestObject('Page_Sign in to your account/input_loginfmt'), 'demo@katalon.com')

WebUI.click(findTestObject('Page_Sign in to your account/input_idSIButton9'))

WebUI.waitForElementPresent(findTestObject('Page_Sign in to your account/div_demokatalon.com'), 0)

WebUI.verifyElementText(findTestObject('Page_Sign in to your account/div_demokatalon.com'), 'demo@katalon.com')

WebUI.setEncryptedText(findTestObject('Page_Sign in to your account/input_passwd'), '3q63o6Jj3SJkOvMHtql0qi2TenXgkra+')

WebUI.click(findTestObject('Page_Sign in to your account/input_idSIButton9'))

WebUI.click(findTestObject('Page_Sign in to your account/span_Dont show this again'))

WebUI.click(findTestObject('Page_Sign in to your account/input_idSIButton9'))

def profile = RunConfiguration.getExecutionProfile();

if (profile == 'desktop') {
	WebUI.waitForElementPresent(findTestObject('Page_System dashboard - Jira/h1_System dashboard'), 0)
	
	WebUI.verifyElementText(findTestObject('Page_System dashboard - Jira/h1_System dashboard'), 'System dashboard')
}

