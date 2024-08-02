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

'Pilih Shipper di Pilihan Role TM'
WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/00_RegisLogin/RL01_Login/A_BasicFlow/RL01_L05_LoginTMShipper/Page_Dashboard  muatmuat/div_Shipper'))

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT00_RegisterTransporter/Page_Register Big Fleets Shipper/button_bergabung_sekarang_cross_shipper'))

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT00_RegisterTransporter/Page_Register Big Fleets Shipper/button_yakin_bergabung_sekarang_shipper_cross'))

WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT00_RegisterTransporter/Page_Register Big Fleets Shipper/input_kirim_shipper_cross'), 
    '1')

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT00_RegisterTransporter/Page_Register Big Fleets Shipper/button_kirim_pengiriman_shipper_cross'))

WebUI.waitForPageLoad(60)

'Form Awal'
WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Shipper/TMS00_RegisterShipper/Page_Register Big Fleets Shipper/upload_file_surat_jalan_shipper_tm'), 
    'C:\\Users\\Dandy\\Downloads\\Data (31).pdf')

WebUI.delay(2)

'Transporter Terakhir'
WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Shipper/TMS00_RegisterShipper/Page_Register Big Fleets Shipper/input_nama_perusahaan_transporter'), 
    'PT. Buang Sejahterah')

'Transporter Terakhir'
WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Shipper/TMS00_RegisterShipper/Page_Register Big Fleets Shipper/input_nama_pic_perusahaan_transporter'), 
    'Joni Sujoni')

'Transporter Terakhir'
WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Shipper/TMS00_RegisterShipper/Page_Register Big Fleets Shipper/input_no_hp_perusahaan_transporter'), 
    '77701080')

'Nama PIC 1'
WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT00_RegisterTransporter/Page_Register Big Fleets Shipper/input_pic1_nama_cross'), 
    'Doni')

'Nomor HP PIC 1'
WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT00_RegisterTransporter/Page_Register Big Fleets Shipper/input_pic1_nohp_cross'), 
    '77701008')

'Nama PIC 2'
WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT00_RegisterTransporter/Page_Register Big Fleets Shipper/input_pic2_nama_cross'), 
    'Roni')

'Nomor HP PIC 2'
WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT00_RegisterTransporter/Page_Register Big Fleets Shipper/input_pic2_nohp_cross'), 
    '77701009')

'Nama PIC 3'
WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT00_RegisterTransporter/Page_Register Big Fleets Shipper/input_pic3_nama_cross'), 
    'Joni')

'Nomor HP PIC 3'
WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT00_RegisterTransporter/Page_Register Big Fleets Shipper/input_pic3_nohp_cross'), 
    '77701007')

'Button Daftar'
WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT00_RegisterTransporter/Page_Register Big Fleets Shipper/button_selanjutnya_cross'))

WebUI.waitForPageLoad(60)

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS00_RegisterShipper/Page_Register Big Fleet Syarat Ketentuan  muatmuat/div_Jelajahi Produk Menarik Lainnya'))

WebUI.waitForPageLoad(60)

