import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://elogistik.azlogistik.id/Security/login?BackURL=%2Fadmin%2Fpages%2F')

WebUI.setText(findTestObject('Object Repository/2_CMS/02_CMSApproveWhiteList/02_01_ApproveWhiteList/Page_muatmuat Log in/input_Email_Email'), 
    'qc.azlogistik@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/2_CMS/02_CMSApproveWhiteList/02_01_ApproveWhiteList/Page_muatmuat Log in/input_Kata kunci_Password'), 
    'qZoovpoGGphsc36T4xpFnA==')

WebUI.click(findTestObject('Object Repository/2_CMS/02_CMSApproveWhiteList/02_01_ApproveWhiteList/Page_muatmuat Log in/input_Keep me signed in_action_doLogin'))

WebUI.click(findTestObject('Object Repository/2_CMS/02_CMSApproveWhiteList/02_01_ApproveWhiteList/Page_SilverStripe - Pages/span_whitelist'))

WebUI.click(findTestObject('Object Repository/2_CMS/02_CMSApproveWhiteList/02_01_ApproveWhiteList/Page_SilverStripe - whitelist/button_Search_showFilter'))

WebUI.click(findTestObject('Object Repository/2_CMS/02_CMSApproveWhiteList/02_01_ApproveWhiteList/Page_SilverStripe - whitelist/button_Search_btn--icon btn--no-text font-i_19de8c'))

WebUI.setText(findTestObject('Object Repository/2_CMS/02_CMSApproveWhiteList/02_01_ApproveWhiteList/Page_SilverStripe - whitelist/input_Cookies_token_Search__cookies_token'), 
    'JeffryLaptopTesting2')

WebUI.click(findTestObject('Object Repository/2_CMS/02_CMSApproveWhiteList/02_01_ApproveWhiteList/Page_SilverStripe - whitelist/button_Search'))

