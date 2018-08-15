package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object app_url
     
    /**
     * <p></p>
     */
    public static Object time_zone
     

    static {
        def allVariables = [:]        
        allVariables.put('default', ['app_url' : '/Users/trongbui/katalon/sources/katalon-studio-samples/katalon-demo-project/Apps/android/Simple Job Scheduler_v2.2_apkpure.com.apk'])
        allVariables.put('android', allVariables['default'] + [:])
        allVariables.put('desktop', allVariables['default'] + [:])
        allVariables.put('kobiton', allVariables['default'] + ['app_url' : 'kobiton-store:13150', 'time_zone' : 'US/Eastern'])
        
        String profileName = RunConfiguration.getExecutionProfile()
        
        def selectedVariables = allVariables[profileName]
        app_url = selectedVariables['app_url']
        time_zone = selectedVariables['time_zone']
        
    }
}
