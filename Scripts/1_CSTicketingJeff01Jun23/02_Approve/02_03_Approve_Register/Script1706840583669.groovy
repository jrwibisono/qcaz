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

WebUI.callTestCase(findTestCase('1_CSTicketingJeff01Jun23/01_Login/01_02_MasukTicketManagement'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('1_CSTicketingJeff01Jun23/02_Approve/02_01_Approve/input_search'), namaPerusahaan)

WebUI.sendKeys(findTestObject('1_CSTicketingJeff01Jun23/02_Approve/02_01_Approve/input_search'), Keys.chord(Keys.ENTER))

WebUI.waitForJQueryLoad(60)

WebUI.click(findTestObject('1_CSTicketingJeff01Jun23/02_Approve/02_01_Approve/button_Ambil_v2'))

WebUI.click(findTestObject('Object Repository/1_CSTicketingJeff01Jun23/02_Approve/02_01_Approve/button_Ya'))

WebUI.click(findTestObject('Object Repository/1_CSTicketingJeff01Jun23/02_Approve/02_01_Approve/label_Di Setujui'))

WebUI.click(findTestObject('Object Repository/1_CSTicketingJeff01Jun23/02_Approve/02_01_Approve/button_Submit'))

WebUI.click(findTestObject('Object Repository/1_CSTicketingJeff01Jun23/02_Approve/02_01_Approve/button_Ya_1'))

