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

WebUI.callTestCase(findTestCase('Pro - Big Fleets/Shipper/Tender/1 - Info Pra Tender/Side Bar Tender - Info Pra Tender/Tender - Info Pra Tender'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Pro - Big FLeets/Shipper/Tender/1 - Info Pra Tender/Buat/Btn Buat Info Pra Tender'))

WebUI.click(findTestObject('Pro - Big FLeets/Shipper/Tender/1 - Info Pra Tender/Buat/Btn Pilih Transporter Mitra'))

WebUI.click(findTestObject('Pro - Big FLeets/Shipper/Tender/1 - Info Pra Tender/Buat/Checkbox Mitra'))

WebUI.click(findTestObject('Pro - Big FLeets/Shipper/Tender/1 - Info Pra Tender/Buat/Btn Terapkan'))

WebUI.setText(findTestObject('Pro - Big FLeets/Shipper/Tender/1 - Info Pra Tender/Buat/Field Judul Pra Tender'), 'End Year Tender')

WebUI.click(findTestObject('Pro - Big FLeets/Shipper/Tender/1 - Info Pra Tender/Buat/Radio Btn Satuan Tender Unit Truk'))

WebUI.setText(findTestObject('Pro - Big FLeets/Shipper/Tender/1 - Info Pra Tender/Buat/Field Jumlah Truk'), '5')

WebUI.click(findTestObject('Pro - Big FLeets/Shipper/Tender/1 - Info Pra Tender/Buat/Dropdown Jenis Truk'))

WebUI.delay(1)

WebUI.click(findTestObject('Pro - Big FLeets/Shipper/Tender/1 - Info Pra Tender/Buat/Dropdown Value Jenis Truk'))

WebUI.setText(findTestObject('Pro - Big FLeets/Shipper/Tender/1 - Info Pra Tender/Buat/Field Muatan'), 'Wafer')

WebUI.click(findTestObject('Pro - Big FLeets/Shipper/Tender/1 - Info Pra Tender/Buat/Dropdown Jenis Muatan'))

WebUI.delay(1)

WebUI.click(findTestObject('Pro - Big FLeets/Shipper/Tender/1 - Info Pra Tender/Buat/Dropdown Value Jenis Muatan'))

WebUI.setText(findTestObject('Pro - Big FLeets/Shipper/Tender/1 - Info Pra Tender/Buat/Field Berat'), '10')

WebUI.setText(findTestObject('Pro - Big FLeets/Shipper/Tender/1 - Info Pra Tender/Buat/Field Volume'), '10')

WebUI.click(findTestObject('Pro - Big FLeets/Shipper/Tender/1 - Info Pra Tender/Buat/Dropdown Satuan Volume'))

WebUI.delay(1)

WebUI.click(findTestObject('Pro - Big FLeets/Shipper/Tender/1 - Info Pra Tender/Buat/Dropdown Value Satuan Volume'))

WebUI.setText(findTestObject('Pro - Big FLeets/Shipper/Tender/1 - Info Pra Tender/Buat/Field Dimensi Muatan Koli - Panjang'), 
    '5')

WebUI.setText(findTestObject('Pro - Big FLeets/Shipper/Tender/1 - Info Pra Tender/Buat/Field Dimensi Muatan Koli - Lebar'), 
    '5')

WebUI.setText(findTestObject('Pro - Big FLeets/Shipper/Tender/1 - Info Pra Tender/Buat/Field Dimensi Muatan Koli - Tinggi'), 
    '5')

WebUI.click(findTestObject('Pro - Big FLeets/Shipper/Tender/1 - Info Pra Tender/Buat/Dropdown Satuan Dimensi Muatan Koli'))

WebUI.delay(1)

WebUI.click(findTestObject('Pro - Big FLeets/Shipper/Tender/1 - Info Pra Tender/Buat/Dropdown Value Satuan Dimensi Muatan Koli'))

WebUI.setText(findTestObject('Pro - Big FLeets/Shipper/Tender/1 - Info Pra Tender/Buat/Field Jumlah Koli'), '10')

WebUI.click(findTestObject('Pro - Big FLeets/Shipper/Tender/1 - Info Pra Tender/Buat/Dropdown Jumlah Rute'))

WebUI.delay(1)

WebUI.click(findTestObject('Pro - Big FLeets/Shipper/Tender/1 - Info Pra Tender/Buat/Dropdown Value Jumlah Rute'))

