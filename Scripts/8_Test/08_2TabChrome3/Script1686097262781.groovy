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

//Originally posted by Rajitha_Kithuldeniya
//http://forum.katalon.com/t/webui-how-can-i-open-a-new-tab-on-chrome/5969/10
//Add to the body of any test case
WebUI.openBrowser('https://www.katalon.com/')

WebUI.executeJavaScript('window.open();', [])

currentWindow = WebUI.getWindowIndex()

//Switches tab #1
WebUI.switchToWindowIndex(currentWindow + 1)

WebUI.navigateToUrl('https://www.google.lk')

WebUI.executeJavaScript('window.open();', [])

currentWindow2 = WebUI.getWindowIndex()

//Switches tab #2
WebUI.switchToWindowIndex(currentWindow2 + 1)

WebUI.navigateToUrl('https://elogistik.azlogistik.id/')

WebUI.switchToWindowIndex(currentWindow)

WebUI.delay(5)

WebUI.switchToWindowIndex(currentWindow2)

WebUI.delay(5)

WebUI.switchToWindowIndex(currentWindow2 + 1)

