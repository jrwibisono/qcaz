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

WebUI.click(findTestObject('Object Repository/2_CMS/03_CMSAkunRonda/Page_SilverStripe - Pages/span_Akun Ronda'))

for (def row = 1; row <= findTestData('list_akun_rc').getRowNumbers(); row++) {
    'Start Looping'
    WebUI.click(findTestObject('Object Repository/2_CMS/03_CMSAkunRonda/Page_SilverStripe - Akun Ronda/button_Search_showFilter'))

    WebUI.click(findTestObject('Object Repository/2_CMS/03_CMSAkunRonda/Page_SilverStripe - Akun Ronda/button_Search_btn--icon btn--no-text font-i_19de8c'))

    'Nomor Akun Yang Akan Non Aktif'
    WebUI.setText(findTestObject('Object Repository/2_CMS/03_CMSAkunRonda/Page_SilverStripe - Akun Ronda/input_Phone_Search__Phone'), 
        findTestData('list_akun_rc').getValue(1, row))

    WebUI.delay(2)

    WebUI.click(findTestObject('Object Repository/2_CMS/03_CMSAkunRonda/Page_SilverStripe - Akun Ronda/button_Search'))

    WebUI.waitForJQueryLoad(60)

    'End Looping'
    WebUI.click(findTestObject('Object Repository/2_CMS/03_CMSAkunRonda/Page_SilverStripe - Akun Ronda/a_Non Aktif'))

    WebUI.waitForJQueryLoad(60)
}

