import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Web UI Tests/AUT_Jira/Page Objects/Login Page/login(username, password)'), [('username') : GlobalVariable.username
	, ('password') : GlobalVariable.password], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Web UI Tests/AUT_Jira/Page Objects/Master Page/openSearchPage'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Web UI Tests/AUT_Jira/Page Objects/Search Issue Page/searchByJql(jql)'), [('jql') : 'project = KD AND priority = Medium AND created >= 2018-11-03 AND created <= 2018-11-05 order by created DESC'],
FailureHandling.STOP_ON_FAILURE)

WebUI.delay(5)

def data = findTestData("Data Files/AUT_Jira/jira_tickets_20181103_20181105")

def key = data.getObjectValue('Key', 1)

WebUI.click(findTestObject('Object Repository/Web UI Tests/AUT_Jira/Test Objects/Pages/Search Issue Page/Search Issue Result/elIssue/elIssueKey', ['issue_key' : key]))

WebUI.delay(10)



