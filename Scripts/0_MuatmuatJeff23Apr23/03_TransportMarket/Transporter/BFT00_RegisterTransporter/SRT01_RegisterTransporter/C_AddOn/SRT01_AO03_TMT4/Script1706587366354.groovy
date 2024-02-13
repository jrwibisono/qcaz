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

'Upload Nopol'
WebUI.uploadFile(findTestObject(null), '')

'Upload STNK'
WebUI.uploadFile(findTestObject(null), '')

'Nama PIC 1'
WebUI.setText(findTestObject(null), '')

'Nomor HP PIC 1'
WebUI.setText(findTestObject(null), '')

'Nama PIC 2'
WebUI.setText(findTestObject(null), '')

'Nomor HP PIC 2'
WebUI.setText(findTestObject(null), '')

'Nama PIC 3'
WebUI.setText(findTestObject(null), '')

'Nomor HP PIC 3'
WebUI.setText(findTestObject(null), '')

'Button Selanjutnya'
WebUI.click(findTestObject(null))

'Upload NIB'
WebUI.uploadFile(findTestObject(null), '')

'Input NIB'
WebUI.setText(findTestObject(null), '')

'Upload NPWP'
WebUI.uploadFile(findTestObject(null), '')

'Input NPWP'
WebUI.setText(findTestObject(null), '')

'Upload KTP'
WebUI.uploadFile(findTestObject(null), '')

'Input KTP'
WebUI.setText(findTestObject(null), '')

'Upload Cover Akta Pendirian'
WebUI.uploadFile(findTestObject(null), '')

'Upload SK Kemenkumham dari Akta Pendirian'
WebUI.uploadFile(findTestObject(null), '')

'Upload Cover Akta Perubahan'
WebUI.uploadFile(findTestObject(null), '')

'Upload SK Kemenkumham dari Akta Perubahan'
WebUI.uploadFile(findTestObject(null), '')

'Upload Sertifikat Standar'
WebUI.uploadFile(findTestObject(null), '')

'Button Daftar'
WebUI.click(findTestObject(null))

