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

WebUI.callTestCase(findTestCase('Pro - Big Fleets/Shipper/Tender/2 - Proses Tender/Sidebar Tender - Proses Tender/Tender - Proses Tender'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Pro - Big FLeets/Shipper/Tender/2 - Proses Tender/Buat/Btn Buat Proses Tender'))

WebUI.click(findTestObject('Pro - Big FLeets/Shipper/Tender/2 - Proses Tender/Buat/Btn Pilih Transporter Mitra'))

WebUI.click(findTestObject('Pro - Big FLeets/Shipper/Tender/2 - Proses Tender/Buat/Checkbox Semua Mitra'))

WebUI.click(findTestObject('Pro - Big FLeets/Shipper/Tender/2 - Proses Tender/Buat/Checkbox Semua Transporter'))

WebUI.click(findTestObject('Pro - Big FLeets/Shipper/Tender/2 - Proses Tender/Buat/Btn Terapkan'))

WebUI.setText(findTestObject('Pro - Big FLeets/Shipper/Tender/2 - Proses Tender/Buat/Field Judul'), 'Tender Proyek Patung Reog Ponorogo Terbesar')

WebUI.setText(findTestObject('Pro - Big FLeets/Shipper/Tender/2 - Proses Tender/Buat/Field Jumlah'), '5')

WebUI.click(findTestObject('Pro - Big FLeets/Shipper/Tender/2 - Proses Tender/Buat/Dropdown Jenis Truk'))

WebUI.delay(1)

WebUI.click(findTestObject('Pro - Big FLeets/Shipper/Tender/2 - Proses Tender/Buat/Dropdown Value Jenis Truk'))

WebUI.click(findTestObject('Pro - Big FLeets/Shipper/Tender/2 - Proses Tender/Buat/Dropdown Jenis Carrier'))

WebUI.delay(1)

WebUI.click(findTestObject('Pro - Big FLeets/Shipper/Tender/2 - Proses Tender/Buat/Dropdown Value Jenis Carrier'))

WebUI.setText(findTestObject('Pro - Big FLeets/Shipper/Tender/2 - Proses Tender/Buat/Field Muatan'), 'Golda')

WebUI.click(findTestObject('Pro - Big FLeets/Shipper/Tender/2 - Proses Tender/Buat/Dropdown Jenis Muatan'))

WebUI.delay(1)

WebUI.click(findTestObject('Pro - Big FLeets/Shipper/Tender/2 - Proses Tender/Buat/Dropdown Value Jenis Muatan'))

WebUI.setText(findTestObject('Pro - Big FLeets/Shipper/Tender/2 - Proses Tender/Buat/Field Berat'), '20')

WebUI.setText(findTestObject('Pro - Big FLeets/Shipper/Tender/2 - Proses Tender/Buat/Field Volume'), '10')

WebUI.setText(findTestObject('Pro - Big FLeets/Shipper/Tender/2 - Proses Tender/Buat/Field Dimensi Muatan - P'), '3')

WebUI.setText(findTestObject('Pro - Big FLeets/Shipper/Tender/2 - Proses Tender/Buat/Field Dimensi Muatan - L'), '4')

WebUI.setText(findTestObject('Pro - Big FLeets/Shipper/Tender/2 - Proses Tender/Buat/Field Dimensi Muatan - T'), '5')

WebUI.setText(findTestObject('Pro - Big FLeets/Shipper/Tender/2 - Proses Tender/Buat/Field Jumlah Koli'), '15')

WebUI.setText(findTestObject('Pro - Big FLeets/Shipper/Tender/2 - Proses Tender/Buat/Field Pickup'), 'Kota Surabaya')

WebUI.delay(1)

WebUI.setText(findTestObject('Pro - Big FLeets/Shipper/Tender/2 - Proses Tender/Buat/Field Destinasi'), 'Kota Jakarta Barat')

WebUI.click(findTestObject('Pro - Big FLeets/Shipper/Tender/2 - Proses Tender/Buat/Dropdown Rute - Jenis Truk'))

WebUI.delay(1)

WebUI.click(findTestObject('Pro - Big FLeets/Shipper/Tender/2 - Proses Tender/Buat/Dropdown Rute - Value Jenis Truk'))

WebUI.click(findTestObject('Pro - Big FLeets/Shipper/Tender/2 - Proses Tender/Buat/Dropdown Rute - Pilih Carrier'))

WebUI.delay(1)

WebUI.click(findTestObject('Pro - Big FLeets/Shipper/Tender/2 - Proses Tender/Buat/Dropdown Rute - Value Pilih Carrier'))

WebUI.setText(findTestObject('Pro - Big FLeets/Shipper/Tender/2 - Proses Tender/Buat/Field Unit Truk'), '5')

WebUI.setText(findTestObject('Pro - Big FLeets/Shipper/Tender/2 - Proses Tender/Buat/Field Persyaratan Kualifikasi Lampiran'), 
    'Ini adalah persyaratannya')

WebUI.setText(findTestObject('Pro - Big FLeets/Shipper/Tender/2 - Proses Tender/Buat/Field Peringatan Penting'), 'Ini adalah peringatan penting')

WebUI.click(findTestObject('Pro - Big FLeets/Shipper/Tender/2 - Proses Tender/Buat/Dropdown Format Dokumen Penawaran yang Diminta'))

WebUI.delay(1)

WebUI.click(findTestObject('Pro - Big FLeets/Shipper/Tender/2 - Proses Tender/Buat/Dropdown Value Format Dokumen Penawaran yang Diminta'))

WebUI.setText(findTestObject('Pro - Big FLeets/Shipper/Tender/2 - Proses Tender/Buat/Field Keterangan'), 'Ini adalah keterangan')

WebUI.click(findTestObject('Pro - Big FLeets/Shipper/Tender/2 - Proses Tender/Buat/Btn Buat'))

