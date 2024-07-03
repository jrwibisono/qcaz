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

'Panggil ketika butuh whitelist'
not_run: WebUI.callTestCase(findTestCase('0_MuatmuatJeff23Apr23/00_RegisLogin/RL01_Login/RL01_A_BasicFlow/RL01_L000_WhitelistLogin'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('0_MuatmuatJeff23Apr23/00_RegisLogin/RL01_Login/RL01_A_BasicFlow/RL01_L000-01_WhitelistLoginCustom'), 
    [:], FailureHandling.OPTIONAL)

not_run: WebUI.navigateToUrl(GlobalVariable.URLMuatmuat)

not_run: WebUI.setText(findTestObject('Object Repository/8_Test/02_CobaLoginMuatmuatDenganWhiteList/Page_Request Whitelist  muatmuat/input_Margo'), 
    GlobalVariable.UserDaftarWhitelist)

not_run: WebUI.click(findTestObject('Object Repository/8_Test/02_CobaLoginMuatmuatDenganWhiteList/Page_Request Whitelist  muatmuat/button_Minta Request'))

// New Window ------------------------ JEF 7 Juni 2023
not_run: WebUI.executeJavaScript('window.open();', [])

not_run: currentWindow = WebUI.getWindowIndex()

//Switches tab #1
not_run: WebUI.switchToWindowIndex(currentWindow + 1)

not_run: WebUI.navigateToUrl(GlobalVariable.URLCMS)

not_run: WebUI.setText(findTestObject('Object Repository/2_CMS/02_CMSApproveWhiteList/02_01_ApproveWhiteList/Page_muatmuat Log in/input_Email_Email'), 
    'qc.katalon01@gmail.com')

not_run: WebUI.setEncryptedText(findTestObject('Object Repository/2_CMS/02_CMSApproveWhiteList/02_01_ApproveWhiteList/Page_muatmuat Log in/input_Kata kunci_Password'), 
    'CxznB8Z9LyAJ+B7hPICjAQ==')

not_run: WebUI.click(findTestObject('2_CMS/01_LoginCMS/01_01_LoginCMS/Page_muatmuat Log in/CheckboxKeepMeSignedIn'))

not_run: WebUI.click(findTestObject('Object Repository/2_CMS/02_CMSApproveWhiteList/02_01_ApproveWhiteList/Page_muatmuat Log in/input_Keep me signed in_action_doLogin'))

not_run: WebUI.click(findTestObject('Object Repository/2_CMS/02_CMSApproveWhiteList/02_01_ApproveWhiteList/Page_SilverStripe - Pages/span_whitelist'))

not_run: WebUI.delay(5)

not_run: WebUI.click(findTestObject('Object Repository/2_CMS/02_CMSApproveWhiteList/02_01_ApproveWhiteList/Page_SilverStripe - whitelist/button_Search_showFilter'))

not_run: WebUI.delay(5)

not_run: WebUI.click(findTestObject('Object Repository/2_CMS/02_CMSApproveWhiteList/02_01_ApproveWhiteList/Page_SilverStripe - whitelist/button_Search_btn--icon btn--no-text font-i_19de8c'))

not_run: WebUI.delay(5)

not_run: WebUI.waitForJQueryLoad(60)

not_run: WebUI.setText(findTestObject('2_CMS/02_CMSApproveWhiteList/02_01_ApproveWhiteList/CariData'), GlobalVariable.UserDaftarWhitelist)

not_run: WebUI.click(findTestObject('Object Repository/2_CMS/02_CMSApproveWhiteList/02_01_ApproveWhiteList/Page_SilverStripe - whitelist/button_Search'))

not_run: WebUI.delay(10)

not_run: WebUI.waitForJQueryLoad(60)

not_run: WebUI.click(findTestObject('2_CMS/02_CMSApproveWhiteList/02_01_ApproveWhiteList/ApproveButton'))

// New Window ------------------------ JEF 7 Juni 2023
WebUI.executeJavaScript('window.open();', [])

currentWindow2 = WebUI.getWindowIndex()

//Switches tab #1
WebUI.switchToWindowIndex(currentWindow2 + 1)

WebUI.navigateToUrl(GlobalVariable.URLMuatmuat)

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B00_AllBuyer/Page_muatmuat Website  muatmuat/button_Temukan keperluan pengemasan produk _b2e74a'))

WebUI.click(findTestObject('8_Test/02_CobaLoginMuatmuatDenganWhiteList/Page_Request Whitelist  muatmuat/Login'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/00_RegisLogin/RL01_Login/A_BasicFlow/RL01_L01_Login/Page_MuatMuatLogin  muatmuat/input_Email sudah terdaftar_inpEmail'), 
    GlobalVariable.User)

WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/00_RegisLogin/RL01_Login/A_BasicFlow/RL01_L01_Login/Page_MuatMuatLogin  muatmuat/Password'), 
    GlobalVariable.User_Password)

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/00_RegisLogin/RL01_Login/A_BasicFlow/RL01_L01_Login/Page_MuatMuatLogin  muatmuat/Checkbox'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/00_RegisLogin/RL01_Login/A_BasicFlow/RL01_L01_Login/Page_MuatMuatLogin  muatmuat/span_Masuk'))

WebUI.waitForJQueryLoad(60)

WebUI.waitForPageLoad(60)

GlobalVariable.ReportText += (' ' + 'Test Login Berhasil')

not_run: WebUI.callTestCase(findTestCase('8_Test/ReportOtomasi'), [:], FailureHandling.CONTINUE_ON_FAILURE)

