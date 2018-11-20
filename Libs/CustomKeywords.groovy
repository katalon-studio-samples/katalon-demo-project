
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import com.kms.katalon.core.testobject.TestObject

import java.lang.String

import org.openqa.selenium.WebElement

import com.kms.katalon.core.testdata.TestData


def static "com.jira.components.IssueSearchResult.getIssues"(
    	TestObject table	) {
    (new com.jira.components.IssueSearchResult()).getIssues(
        	table)
}

def static "com.jira.components.JSelect.selectByText"(
    	TestObject o	
     , 	String optionText	) {
    (new com.jira.components.JSelect()).selectByText(
        	o
         , 	optionText)
}

def static "com.jira.components.JSelect.selectByText"(
    	String labelSelect	
     , 	String optionText	) {
    (new com.jira.components.JSelect()).selectByText(
        	labelSelect
         , 	optionText)
}

def static "com.jira.components.JSelect.selectByText"(
    	WebElement el	
     , 	String optionText	) {
    (new com.jira.components.JSelect()).selectByText(
        	el
         , 	optionText)
}

def static "com.katalon.demo.testdata.utils.TestDataParser.toMapList"(
    	TestData tda	) {
    (new com.katalon.demo.testdata.utils.TestDataParser()).toMapList(
        	tda)
}

def static "com.katalon.demo.databases.MySQLConn.getData"() {
    (new com.katalon.demo.databases.MySQLConn()).getData()
}
