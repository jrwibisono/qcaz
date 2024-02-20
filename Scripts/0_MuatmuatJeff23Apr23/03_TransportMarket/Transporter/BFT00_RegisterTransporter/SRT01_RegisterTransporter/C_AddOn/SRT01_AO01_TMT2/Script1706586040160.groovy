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

WebUI.waitForPageLoad(60)

'Jenis Truk 1'
WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT00_RegisterTransporter/Page_Register Big Fleets Shipper/button_jenis_truk_1'))

WebUI.waitForJQueryLoad(60)

'Opsi Truk 1_1'
WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT00_RegisterTransporter/Page_Register Big Fleets Shipper/button_truk_1-1_CDE'))

WebUI.waitForJQueryLoad(60)

'Jenis Carrier 1'
WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT00_RegisterTransporter/Page_Register Big Fleets Shipper/button_jenis_carrier_1'))

WebUI.waitForJQueryLoad(60)

'Opsi Carrier 1_1'
WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT00_RegisterTransporter/Page_Register Big Fleets Shipper/button_carrier_1-1_Box'))

WebUI.delay(1)

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT00_RegisterTransporter/Page_Register Big Fleets Shipper/input_jumlah_truk_1'))

WebUI.sendKeys(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT00_RegisterTransporter/Page_Register Big Fleets Shipper/input_jumlah_truk_1'), 
    Keys.chord(Keys.BACK_SPACE))

'Jumlah Unit 1'
WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT00_RegisterTransporter/Page_Register Big Fleets Shipper/input_jumlah_truk_1'), 
    '20')

'Jenis Truk 2'
WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT00_RegisterTransporter/Page_Register Big Fleets Shipper/button_jenis_truk_2'))

WebUI.waitForJQueryLoad(60)

'Opsi Truk 2_1'
WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT00_RegisterTransporter/Page_Register Big Fleets Shipper/button_truk_2-1_CDE'))

WebUI.waitForJQueryLoad(60)

'Jenis Carrier 2'
WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT00_RegisterTransporter/Page_Register Big Fleets Shipper/button_jenis_carrier_2'))

WebUI.waitForJQueryLoad(60)

'Opsi Carrier 2_2'
WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT00_RegisterTransporter/Page_Register Big Fleets Shipper/button_carrier_2-2_bak-terbuka'))

WebUI.delay(1)

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT00_RegisterTransporter/Page_Register Big Fleets Shipper/input_jumlah_truk_2'))

WebUI.sendKeys(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT00_RegisterTransporter/Page_Register Big Fleets Shipper/input_jumlah_truk_2'), 
    Keys.chord(Keys.BACK_SPACE))

'Jumlah Unit 2'
WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT00_RegisterTransporter/Page_Register Big Fleets Shipper/input_jumlah_truk_2'), 
    '20')

'Jenis Truk 3'
WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT00_RegisterTransporter/Page_Register Big Fleets Shipper/button_jenis_truk_3'))

WebUI.waitForJQueryLoad(60)

'Opsi Truk 3_1'
WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT00_RegisterTransporter/Page_Register Big Fleets Shipper/button_truk_3-1_CDE'))

WebUI.waitForJQueryLoad(60)

'Jenis Carrier 3'
WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT00_RegisterTransporter/Page_Register Big Fleets Shipper/button_jenis_carrier_3'))

WebUI.waitForJQueryLoad(60)

'Opsi Carrier 3_3'
WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT00_RegisterTransporter/Page_Register Big Fleets Shipper/button_carrier_3-3_los-bak'))

WebUI.delay(1)

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT00_RegisterTransporter/Page_Register Big Fleets Shipper/input_jumlah_truk_3'))

WebUI.sendKeys(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT00_RegisterTransporter/Page_Register Big Fleets Shipper/input_jumlah_truk_3'), 
    Keys.chord(Keys.BACK_SPACE))

'Jumlah Unit 3'
WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT00_RegisterTransporter/Page_Register Big Fleets Shipper/input_jumlah_truk_3'), 
    '20')

'Upload Daftar Nopol'
WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT00_RegisterTransporter/Page_Register Big Fleets Shipper/upload_nopol'), 
    'C:\\Users\\Dandy\\Downloads\\Template Plate Truck 200.xlsx')

'Upload STNK'
WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT00_RegisterTransporter/Page_Register Big Fleets Shipper/upload_stnk'), 
    'C:\\Users\\Dandy\\Downloads\\data (28).pdf')

'Nama PIC 1'
WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT00_RegisterTransporter/Page_Register Big Fleets Shipper/input_cross_ pic1_nama_transporter'), 
    'Doni')

'Nomor HP PIC 1'
WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT00_RegisterTransporter/Page_Register Big Fleets Shipper/input_cross_ pic1_nohp_transporter'), 
    '7770401701')

'Nama PIC 2'
WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT00_RegisterTransporter/Page_Register Big Fleets Shipper/input_cross_ pic2_nama_transporter'), 
    'Roni')

'Nomor HP PIC 2'
WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT00_RegisterTransporter/Page_Register Big Fleets Shipper/input_cross_ pic2_nohp_transporter'), 
    '7770401702')

'Nama PIC 3'
WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT00_RegisterTransporter/Page_Register Big Fleets Shipper/input_cross_ pic3_nama_transporter'), 
    'Joni')

'Nomor HP PIC 3'
WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT00_RegisterTransporter/Page_Register Big Fleets Shipper/input_cross_ pic3_nohp_transporter'), 
    '7770401703')

'Button Daftar'
WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT00_RegisterTransporter/Page_Register Big Fleets Shipper/button_selanjutnya_crossing_transporter'))

WebUI.waitForPageLoad(60)

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS00_RegisterShipper/Page_Register Big Fleet Syarat Ketentuan  muatmuat/div_Jelajahi Produk Menarik Lainnya'))

WebUI.waitForPageLoad(60)

