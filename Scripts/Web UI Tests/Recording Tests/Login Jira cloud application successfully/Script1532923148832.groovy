import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
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

WebUI.setText(findTestObject('Object Repository/Page_Log in to continue - Log in wi/input_username'), 'demo@katalon.com')

WebUI.click(findTestObject('Object Repository/Page_Log in to continue - Log in wi/span_Continue'))

WebUI.setText(findTestObject('Object Repository/Page_Sign in to your account/input_loginfmt'), 'demo@katalon.com')

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/input_idSIButton9'))

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign in to your account/input_passwd'), '3q63o6Jj3SJkOvMHtql0qi2TenXgkra+')

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/input_idSIButton9'))

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/span_Dont show this again'))

WebUI.click(findTestObject('Object Repository/Page_Sign in to your account/input_idSIButton9'))

WebUI.delay(5)

WebUI.verifyTextPresent('System dashboard', false)

