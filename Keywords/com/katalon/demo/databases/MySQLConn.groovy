package com.katalon.demo.databases

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable
import groovy.sql.Sql

public class MySQLConn {

	@Keyword
	def getData() {
		def sql = Sql.newInstance('jdbc:mysql://localhost:3306/jira_test',
				'demouser', 'demouser@2018', 'com.mysql.jdbc.Driver')

		def sqlstr = "SELECT * FROM accounts"
		try {
			sql.execute(sqlstr)
			sql.commit()
			println("success")
		} catch (Exception e) {
			println("fail")
		}

		sql.close()
	}
}
