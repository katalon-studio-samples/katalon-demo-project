package com.jira.components

import org.openqa.selenium.By
import org.openqa.selenium.WebElement

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

public class IssueSearchResult {

	KeywordLogger log = new KeywordLogger();

	private WebElement elTable;


	IssueSearchResult() {}
	IssueSearchResult(TestObject table) {
		elTable = WebUiBuiltInKeywords.findWebElement(table)
	}

	def List<String> getHeaders() {
		def headers = new ArrayList();

		def elHeaders = elTable.findElements(By.xpath(".//thead/tr[@class='rowHeader']//th"));
		headers = elHeaders.collect{it.getText()}
	}

	def List<Map> getIssues() {
		def elIssues = []
		def elRows = elTable.findElements(By.xpath(".//tbody/tr[contains(@class, 'issuerow')]"));
		elRows.each {
			def issueInfo = [:]
			def elAttrbs = it.findElements(By.xpath(".//td"))
			elAttrbs.each {
				def cls = it.getAttribute('class');
				switch (cls) {
					case 'issuetype':
						issueInfo.put('Type', it.findElement(By.xpath(".//img")).getAttribute('alt').trim())
						break
					case 'issuekey':
						issueInfo.put('Key', it.getText().trim())
						break
					case 'summary':
						issueInfo.put('Summary', it.getText().trim())
						break
					case 'reporter':
						issueInfo.put('Reporter', it.getText().trim())
						break
					case 'priority':
						issueInfo.put('Priority', it.findElement(By.xpath(".//img")).getAttribute('alt').trim())
						break
					case 'created':
						issueInfo.put('Created', it.getText().trim())
						break
					case 'updated':
						issueInfo.put('Updated', it.getText().trim())
						break
					case 'duedate':
						issueInfo.put('Due Date', it.getText().trim())
						break
					case 'issue_actions':
						break
					default:
						break
				}
			}

			elIssues.add(issueInfo)
		}
		elIssues
	}

	@Keyword
	def List<Map> getIssues(TestObject table) {
		def result = new IssueSearchResult(table)
		result.getIssues()
	}
}
