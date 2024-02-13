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

'Upload File Surat Jalan'
WebUI.uploadFile(findTestObject(null), '')

'Tombol Selanjutnya'
WebUI.click(findTestObject(null))

'Upload NIB'
WebUI.uploadFile(findTestObject(null), '')

'Input NIB'
WebUI.setText(findTestObject(null), '')

'Upload NPWP'
WebUI.uploadFile(findTestObject(null), '')

'No NPWP'
WebUI.setText(findTestObject(null), '')

'Upload KTP'
WebUI.uploadFile(findTestObject(null), '')

'Input KTP'
WebUI.setText(findTestObject(null), '')

'Upload SK'
WebUI.uploadFile(findTestObject(null), '')

'Upload Sertifikat'
WebUI.uploadFile(findTestObject(null), '')

'Tombol Daftar'
WebUI.click(findTestObject(null))

WebUI.waitForPageLoad(0)

'Tombol Jelajahi Produk Lainnya'
WebUI.click(findTestObject(null))

