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

WebUI.callTestCase(findTestCase('0_MuatmuatJeff23Apr23/00_RegisLogin/RL01_Login/RL01_A_BasicFlow/RL01_L000-01_WhitelistLoginCustom'), 
    [:], FailureHandling.OPTIONAL)

// New Window ------------------------ JEF 7 Juni 2023
WebUI.executeJavaScript('window.open();', [])

currentWindow2 = WebUI.getWindowIndex()

//Switches tab #1
WebUI.switchToWindowIndex(currentWindow2 + 1)

WebUI.navigateToUrl(GlobalVariable.URLMuatmuat)

WebUI.click(findTestObject('8_Test/02_CobaLoginMuatmuatDenganWhiteList/Page_Request Whitelist  muatmuat/Login'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/00_RegisLogin/RL01_Login/A_BasicFlow/RL01_L01_Login/Page_MuatMuatLogin  muatmuat/input_Email sudah terdaftar_inpEmail'), 
    noTelp)

WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/00_RegisLogin/RL01_Login/A_BasicFlow/RL01_L01_Login/Page_MuatMuatLogin  muatmuat/Password'), 
    password)

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/00_RegisLogin/RL01_Login/A_BasicFlow/RL01_L01_Login/Page_MuatMuatLogin  muatmuat/Checkbox'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/00_RegisLogin/RL01_Login/A_BasicFlow/RL01_L01_Login/Page_MuatMuatLogin  muatmuat/span_Masuk'))

WebUI.waitForJQueryLoad(60)

WebUI.waitForPageLoad(60)

