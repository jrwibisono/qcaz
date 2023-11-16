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

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://golektruk.com/')

WebUI.click(findTestObject('Object Repository/GolekTruk/Page_GolekTruk/button_Daftar'))

WebUI.setText(findTestObject('Object Repository/GolekTruk/Page_GolekTruk/input_Nama_name'), 'Jeffry')

WebUI.setText(findTestObject('Object Repository/GolekTruk/Page_GolekTruk/input_Email_email'), 'jeffry@gmail.com')

WebUI.setText(findTestObject('Object Repository/GolekTruk/Page_GolekTruk/input_No Telp_phone'), '896 7181 81881')

WebUI.setEncryptedText(findTestObject('Object Repository/GolekTruk/Page_GolekTruk/input_Password_password'), 'aMZyLnvdhpeKlXRV7cuVFQ==')

WebUI.setEncryptedText(findTestObject('Object Repository/GolekTruk/Page_GolekTruk/input_Konfirmasi Password_konfirm_password'), 
    '9NLz+4tGZcQ=')

WebUI.click(findTestObject('Object Repository/GolekTruk/Page_GolekTruk/label_Konfirmasi Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/GolekTruk/Page_GolekTruk/input_Konfirmasi Password_konfirm_password'), 
    'aMZyLnvdhpeKlXRV7cuVFQ==')

WebUI.click(findTestObject('Object Repository/GolekTruk/Page_GolekTruk/p_Google'))

WebUI.click(findTestObject('Object Repository/GolekTruk/Page_GolekTruk/li_Radio'))

WebUI.click(findTestObject('Object Repository/GolekTruk/Page_GolekTruk/button_Lanjut'))

WebUI.setText(findTestObject('Object Repository/GolekTruk/Page_GolekTruk/input_Nama Radio  Frekuensi_radio_info'), 'Suara Surabaya')

WebUI.click(findTestObject('Object Repository/GolekTruk/Page_GolekTruk/button_Lanjut'))

