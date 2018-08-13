import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

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

def profile = RunConfiguration.getExecutionProfile()

if (profile == 'desktop') {
    WebUI.waitForElementPresent(findTestObject('Object Repository/Page_System dashboard - Jira/h1_System dashboard (1)'), 
        0)

    WebUI.verifyElementText(findTestObject('Object Repository/Page_System dashboard - Jira/h1_System dashboard (1)'), 'System dashboard')
} else {
    WebUI.waitForElementClickable(findTestObject('mobile/el_continue_mobile_site'), 0)

    WebUI.click(findTestObject('mobile/el_continue_mobile_site'))

    WebUI.waitForElementClickable(findTestObject('mobile/el_menu'), 0)

    WebUI.click(findTestObject('mobile/el_menu'))

    WebUI.waitForElementClickable(findTestObject('mobile/el_switch_desktop_version'), 0)

    WebUI.click(findTestObject('mobile/el_switch_desktop_version'))
}

WebUI.waitForElementClickable(findTestObject('Page_System dashboard - Jira/elCreate'), 0)

WebUI.click(findTestObject('Page_System dashboard - Jira/elCreate'))

WebUI.setText(findTestObject('Object Repository/Page_Create issue - Jira/input_summary'), 'Setup demo project for Katalon-Kobiton webinar')

WebUI.setText(findTestObject('Object Repository/Page_Create issue - Jira/textarea_description'), 'As a presenter, I want to have a demo on using Katalon-Kobiton integration project, so that I could present it at the webinar')

WebUI.sendKeys(findTestObject('Object Repository/Page_Create issue - Jira/textarea_description'), Keys.chord(Keys.TAB))

WebUI.waitForElementClickable(findTestObject('Object Repository/Page_Create issue - Jira/input_Edit'), 0)

WebUI.mouseOver(findTestObject('Object Repository/Page_Create issue - Jira/input_Edit'))

WebUI.click(findTestObject('Object Repository/Page_Create issue - Jira/input_Edit'))

WebUI.click(findTestObject('Page_System dashboard - Jira/a_KD-3174 - Setup demo project'))

WebUI.verifyElementText(findTestObject('Page_KD-3174 Setup demo project for/h1_Setup demo project for Kata'), 'Setup demo project for Katalon-Kobiton webinar')

return WebUI.getText(findTestObject('Page_Create issue - Jira/el_key_val'))

