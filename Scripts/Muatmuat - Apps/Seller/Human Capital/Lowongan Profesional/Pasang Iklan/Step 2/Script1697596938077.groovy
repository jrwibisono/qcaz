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

Mobile.setText(findTestObject('Object Repository/Muatmuat - Apps/Seller/Form Pasang Iklan/Step 2/android.widget.EditText - Masukkan Judul Lowongan'), data.getValue(1, row), 60)

Mobile.tap(findTestObject('Object Repository/Muatmuat - Apps/Seller/Form Pasang Iklan/Step 2/Button Upload'), 0)

Mobile.callTestCase(findTestCase('Test Cases/Muatmuat - Apps/Seller/Global/Pasang Iklan/Step 2/Upload File'), [('filename'): data.getValue(2, row)])

Mobile.tap(findTestObject('Object Repository/Muatmuat - Apps/Seller/Form Pasang Iklan/Step 2/ScrollView'), 0)

Mobile.setText(findTestObject('Object Repository/Muatmuat - Apps/Seller/Form Pasang Iklan/Step 2/android.widget.EditText - Masukkan Kualifikasi'), data.getValue(3, row), 60)

Mobile.swipe(0, 1400, 0, 935)

Mobile.setText(findTestObject('Object Repository/Muatmuat - Apps/Seller/Form Pasang Iklan/Step 2/android.widget.EditText - Masukkan Ketrampilan Wajib'), data.getValue(4, row), 60)

Mobile.tap(findTestObject('Object Repository/Muatmuat - Apps/Seller/Form Pasang Iklan/Step 2/Dropdown Tingkat Pendidikan'), 0)

Mobile.tap(findTestObject('Object Repository/Muatmuat - Apps/Seller/Form Pasang Iklan/Step 2/ListItem Dropdown'), 0)

Mobile.setText(findTestObject('Object Repository/Muatmuat - Apps/Seller/Form Pasang Iklan/Step 2/android.widget.EditText - Masukkan Minimum Pengalaman'), data.getValue(6, row), 60)

Mobile.tap(findTestObject('Object Repository/Muatmuat - Apps/Seller/Form Pasang Iklan/Step 2/Dropdown Tingkat Jabatan'), 0)

Mobile.tap(findTestObject('Object Repository/Muatmuat - Apps/Seller/Form Pasang Iklan/Step 2/ListItem Dropdown'), 0)

Mobile.swipe(0, 1400, 0, 985)

Mobile.tap(findTestObject('Object Repository/Muatmuat - Apps/Seller/Form Pasang Iklan/Step 2/Chip Jenis Kelamin'), 0)

Mobile.setText(findTestObject('Object Repository/Muatmuat - Apps/Seller/Form Pasang Iklan/Step 2/android.widget.EditText - Dibuka untuk umur'), data.getValue(9, row), 60)

Mobile.setText(findTestObject('Object Repository/Muatmuat - Apps/Seller/Form Pasang Iklan/Step 2/android.widget.EditText - Dibuka untuk umur (1)'), data.getValue(10, row), 60)

Mobile.setText(findTestObject('Object Repository/Muatmuat - Apps/Seller/Form Pasang Iklan/Step 2/android.widget.EditText - Masukkan Tunjangan'), data.getValue(11, row), 60)

Mobile.tap(findTestObject('Object Repository/Muatmuat - Apps/Seller/Form Pasang Iklan/Step 2/Dropdown Tipe Pekerjaan'), 0)

Mobile.tap(findTestObject('Object Repository/Muatmuat - Apps/Seller/Form Pasang Iklan/Step 2/ListItem Dropdown'), 0)

Mobile.swipe(0, 1400, 0, 940)

Mobile.tap(findTestObject('Object Repository/Muatmuat - Apps/Seller/Form Pasang Iklan/Step 2/Dropdown Sistem Kerja'), 0)

Mobile.tap(findTestObject('Object Repository/Muatmuat - Apps/Seller/Form Pasang Iklan/Step 2/ListItem Dropdown'), 0)

Mobile.tap(findTestObject('Object Repository/Muatmuat - Apps/Seller/Form Pasang Iklan/Step 2/DatePicker'), 0)

//Mobile.tap(findTestObject('Object Repository/Muatmuat - Apps/Seller/Form Pasang Iklan/Step 2/DateItem'), 0)

//Mobile.tap(findTestObject('Object Repository/Muatmuat - Apps/Seller/Form Pasang Iklan/Step 2/Button Popup Date OK'), 0)

Mobile.callTestCase(findTestCase('Test Cases/Muatmuat - Apps/Seller/Global/Pasang Iklan/Step 2/Section - Pick Date'), [('date'): data.getValue(14, row)])

Mobile.setText(findTestObject('Object Repository/Muatmuat - Apps/Seller/Form Pasang Iklan/Step 2/android.widget.EditText - Masukkan Tentang Perusahaan (1)'), data.getValue(15, row), 60)

Mobile.setText(findTestObject('Object Repository/Muatmuat - Apps/Seller/Form Pasang Iklan/Step 2/android.widget.EditText - Masukkan Alamat Perusahaan (2)'), data.getValue(16, row), 60)

Mobile.swipe(0, 1400, 0, 925)

Mobile.tap(findTestObject('Object Repository/Muatmuat - Apps/Seller/Form Pasang Iklan/Step 2/Dropdown Ukuran Perusahaan'), 0)

Mobile.tap(findTestObject('Object Repository/Muatmuat - Apps/Seller/Form Pasang Iklan/Step 2/ListItem Dropdown'), 0)

Mobile.callTestCase(findTestCase('Test Cases/Muatmuat - Apps/Seller/Global/Pasang Iklan/Step 2/Section - Upload Foto'), [('fileString'): data.getValue(18, row), ('captionString'): data.getValue(19, row)])

Mobile.swipe(0, 1400, 0, 1100)

Mobile.callTestCase(findTestCase('Test Cases/Muatmuat - Apps/Seller/Global/Pasang Iklan/Step 2/Section - Upload Video'), [('fileString'): data.getValue(20, row), ('captionString'): data.getValue(21, row)])

Mobile.swipe(0, 1400, 0, 1000)

Mobile.setText(findTestObject('Object Repository/Muatmuat - Apps/Seller/Form Pasang Iklan/Step 2/android.widget.EditText - Masukkan Estimasi Gaji'), data.getValue(22, row), 60)

Mobile.setText(findTestObject('Object Repository/Muatmuat - Apps/Seller/Form Pasang Iklan/Step 2/android.widget.EditText - Masukkan Estimasi Gaji (1)'), data.getValue(23, row), 60)

Mobile.setText(findTestObject('Object Repository/Muatmuat - Apps/Seller/Form Pasang Iklan/Step 2/android.widget.EditText - Masukkan Deskripsi (2)'), data.getValue(24, row), 60)

Mobile.tap(findTestObject('Object Repository/Muatmuat - Apps/Seller/Form Pasang Iklan/Step 2/Dropdown Lokasi Penempatan'), 0)

Mobile.setText(findTestObject('Object Repository/Muatmuat - Apps/Seller/Form Pasang Iklan/Step 2/android.widget.EditText - Masukkan Lokasi Penempatan'), data.getValue(25, row), 60)

Mobile.tap(findTestObject('Object Repository/Muatmuat - Apps/Seller/Form Pasang Iklan/Step 2/ListItem Lokasi Penempatan'), 0)

Mobile.tap(findTestObject('Object Repository/Muatmuat - Apps/Seller/Form Pasang Iklan/Step 2/Button Unggah Iklan'), 0)

Mobile.tap(findTestObject('Object Repository/Muatmuat - Apps/Seller/Form Pasang Iklan/Button Pasang Iklan Baru'), 0)