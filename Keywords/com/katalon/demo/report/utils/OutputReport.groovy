//
//
//import com.google.gson.Gson
//import com.google.gson.JsonObject
//import com.kms.katalon.core.logging.KeywordLogger
//import com.kms.katalon.core.webui.driver.DriverFactory
//import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords
//import gw.SidSystemUtils
//import org.apache.commons.lang3.reflect.FieldUtils
//import org.junit.After
//
//import java.lang.reflect.Field
//import java.sql.Driver
//import java.time.LocalDateTime
//import java.time.format.DateTimeFormatter
//import java.util.logging.Level
//
//import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
//import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
//import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
//import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
//
//import com.kms.katalon.core.checkpoint.Checkpoint
//import com.kms.katalon.core.model.FailureHandling
//import com.kms.katalon.core.testcase.TestCase
//import com.kms.katalon.core.testdata.TestData
//import com.kms.katalon.core.testobject.TestObject
//
//import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
//import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
//import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
//
//import internal.GlobalVariable
//import tomlonghurst.katalonpausetool.KatalonPause
//
//import com.kms.katalon.core.annotation.BeforeTestCase
//import com.kms.katalon.core.annotation.BeforeTestSuite
//import com.kms.katalon.core.annotation.AfterTestCase
//import com.kms.katalon.core.annotation.AfterTestSuite
//import com.kms.katalon.core.context.TestCaseContext
//import com.kms.katalon.core.context.TestSuiteContext
//
//class OutputReport {
//	/**
//	 * Executes after every test case ends.
//	 * @param testCaseContext related information of the executed test case.
//	 */
//
//	@BeforeTestCase
//	def runBeforeTestCase(TestCaseContext testCaseContext) {
//		KeywordLogger.getInstance().logger.level = Level.OFF
//		GlobalVariable.testCaseId = testCaseContext.getTestCaseId()
//		GlobalVariable.testStartTime = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS"))
//		SidSystemUtils.checkNotRunningTestsInLive()
//		println "Test Case Status is: " + testCaseContext.testCaseStatus
//		KeywordLogger.getInstance().logger.level = Level.INFO
//	}
//
//	@AfterTestCase
//	def runAfterTestCase(TestCaseContext testCaseContext) {
//
//		if(GlobalVariable.showResults) {
//
//			KeywordLogger.getInstance().logger.level = Level.OFF
//
//					String testCaseName = testCaseContext.getTestCaseId()
//					String directory = KeywordLogger.getInstance().getLogFolderPath()
//					String reportLocation = ""
//					if(new File("C:\\git\\qa-katalon").exists()) {
//						reportLocation = "C:\\git\\qa-katalon\\IntelliJ Projects\\KatalonReportGenerator\\out\\artifacts\\KatalonReportGenerator_jar\\KatalonReportGenerator.jar"
//					} else {
//						reportLocation = "C:\\git\\qa-poc\\IntelliJ Projects\\KatalonReportGenerator\\out\\artifacts\\KatalonReportGenerator_jar\\KatalonReportGenerator.jar"
//					}
//
//
//			HashMap<String, String> hashMap = new HashMap<>()
//
//			for(field in GlobalVariable.getDeclaredFields().findAll { !it.name.contains('$') && it.type.isAssignableFrom(String.class) && FieldUtils.readField(it, "", true) != null && FieldUtils.readField(it, "", true) != "" }) {
//						def string = FieldUtils.readField(field, "", true) as String
//						hashMap.put(field.name, string)
//			}
//
//			String hashmapAsString = new Gson().toJson(hashMap).replace("\"","\\\"")
//
//			KeywordLogger.getInstance().logger.level = Level.INFO
//
//			println "java -jar \"$reportLocation\" \"$directory\" \"$testCaseName\" \"$hashmapAsString\" \"$GlobalVariable.testStartTime\" \"$GlobalVariable.RunConfig\""
//			Runtime.getRuntime().exec("java -jar \"$reportLocation\" \"$directory\" \"$testCaseName\" \"$hashmapAsString\" \"$GlobalVariable.testStartTime\" \"$GlobalVariable.RunConfig\"");
//
//            //Runtime.getRuntime().exec("cmd /c start /min \"Katalon Report Generator\" call \"${batchFile}\" \"${reportLocation}\" \"${directory}\" \"${testCaseName}\" ")
//
//			}
//
//		if (GlobalVariable.showPauseTool) {
//			KatalonPause.close()
//		}
//	}
//
//	/**
//	 * Executes after every test suite ends.
//	 * @param testSuiteContext: related information of the executed test suite.
//	 */
//	@AfterTestSuite
//	def sampleAfterTestSuite(TestSuiteContext testSuiteContext) {
//		if (GlobalVariable.showPauseTool) {
//			KatalonPause.close()
//		}
//	}
//}