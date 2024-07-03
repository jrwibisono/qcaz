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

WebUI.navigateToUrl(GlobalVariable.URLCMSBF)

'Akun CMS'
WebUI.setText(findTestObject('Object Repository/2_CMS/03_CMSAkunRonda/Page_muatmuat Log in/input_Email_Email'), GlobalVariable.UserCMSBF)

'Password'
WebUI.setText(findTestObject('Object Repository/2_CMS/03_CMSAkunRonda/Page_muatmuat Log in/input_Kata kunci_Password'), 
    GlobalVariable.PasswordCMSBF)

'Button Login'
WebUI.click(findTestObject('Object Repository/2_CMS/03_CMSAkunRonda/Page_muatmuat Log in/input_Keep me signed in_action_doLogin'))

WebUI.waitForPageLoad(60)

WebUI.waitForJQueryLoad(60)

WebUI.click(findTestObject('Object Repository/2_CMS/03_CMSAkunRonda/Page_SilverStripe - Pages/span_Admin Users Checking'))

WebUI.waitForPageLoad(60)

WebUI.waitForJQueryLoad(60)

'Start Loop'
WebUI.click(findTestObject('Object Repository/2_CMS/03_CMSAkunRonda/Page_SilverStripe - Admin Users Checking/span_Add Dbt_users_checking'))

'Nomor Daftar Whitelist'
WebUI.setText(findTestObject('Object Repository/2_CMS/03_CMSAkunRonda/Page_SilverStripe - Admin Users Checking/input_Nomor Hp Checkig_Phone'), 
    '77707006')

WebUI.click(findTestObject('Object Repository/2_CMS/03_CMSAkunRonda/Page_SilverStripe - Admin Users Checking/span_Create'))

WebUI.click(findTestObject('Object Repository/2_CMS/03_CMSAkunRonda/Page_SilverStripe - Admin Users Checking/a_Navigate up a folder'))

WebUI.waitForPageLoad(60)

'End Loop'
WebUI.waitForJQueryLoad(60)

