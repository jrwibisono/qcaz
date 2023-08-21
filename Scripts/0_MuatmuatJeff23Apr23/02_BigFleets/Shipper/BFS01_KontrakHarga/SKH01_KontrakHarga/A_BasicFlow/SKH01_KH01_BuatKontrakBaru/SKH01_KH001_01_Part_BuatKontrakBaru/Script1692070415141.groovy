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

not_run: WebUI.callTestCase(findTestCase('0_MuatmuatJeff23Apr23/00_RegisLogin/RL01_Login/RL01_A_BasicFlow/RL01_L003_LoginBFShipper'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS01_KontrakHarga/SKH01_KontrakHarga/A_BasicFlow/SKH01_KH01_BuatKontrakBaru/Page_Subscription  muatmuat/a_Kontrak Harga'))

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS01_KontrakHarga/SKH01_KontrakHarga/A_BasicFlow/SKH01_KH01_BuatKontrakBaru/Page_Subscription  muatmuat/a_Kontrak dan Penawaran'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS01_KontrakHarga/SKH01_KontrakHarga/A_BasicFlow/SKH01_KH01_BuatKontrakBaru/Page_Kontrak Harga  muatmuat/button_Buat KontrakPenawaran'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS01_KontrakHarga/SKH01_KontrakHarga/A_BasicFlow/SKH01_KH01_BuatKontrakBaru/Page_Form Kontrak Harga  muatmuat/button_Pilih Transporter'))

WebUI.delay(2)

WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS01_KontrakHarga/SKH01_KontrakHarga/A_BasicFlow/SKH01_KH01_BuatKontrakBaru/Page_Form Kontrak Harga  muatmuat/PopUpPilihTransporter_Search_Fill'), 
    'ervin empat')

WebUI.delay(2)

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS01_KontrakHarga/SKH01_KontrakHarga/A_BasicFlow/SKH01_KH01_BuatKontrakBaru/Page_Form Kontrak Harga  muatmuat/PupUpPilihTransporter_Pilih_RadioButton_JeffryMuncul'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS01_KontrakHarga/SKH01_KontrakHarga/A_BasicFlow/SKH01_KH01_BuatKontrakBaru/Page_Form Kontrak Harga  muatmuat/button_Terapkan'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS01_KontrakHarga/SKH01_KontrakHarga/A_BasicFlow/SKH01_KH01_BuatKontrakBaru/Page_Form Kontrak Harga  muatmuat/input_Nomor Referensi_ff-medium-az'), 
    GlobalVariable.NomorReferensiKH)

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS01_KontrakHarga/SKH01_KontrakHarga/A_BasicFlow/SKH01_KH01_BuatKontrakBaru/Page_Form Kontrak Harga  muatmuat/input_Periode Berlaku_date'), 
    '')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS01_KontrakHarga/SKH01_KontrakHarga/A_BasicFlow/SKH01_KH01_BuatKontrakBaru/Page_Form Kontrak Harga  muatmuat/input_Periode Berlaku_date'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS01_KontrakHarga/SKH01_KontrakHarga/A_BasicFlow/SKH01_KH01_BuatKontrakBaru/Page_Form Kontrak Harga  muatmuat/th_Today'))

WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS01_KontrakHarga/SKH01_KontrakHarga/A_BasicFlow/SKH01_KH01_BuatKontrakBaru/Page_Form Kontrak Harga  muatmuat/TanggalBerakhir'), 
    '')

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS01_KontrakHarga/SKH01_KontrakHarga/A_BasicFlow/SKH01_KH01_BuatKontrakBaru/Page_Form Kontrak Harga  muatmuat/TanggalBerakhir'))

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS01_KontrakHarga/SKH01_KontrakHarga/A_BasicFlow/SKH01_KH01_BuatKontrakBaru/Page_Form Kontrak Harga  muatmuat/TanggalBerakhirToday'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS01_KontrakHarga/SKH01_KontrakHarga/A_BasicFlow/SKH01_KH01_BuatKontrakBaru/Page_Form Kontrak Harga  muatmuat/input_Muatan_ff-medium-az'), 
    'Pasir')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS01_KontrakHarga/SKH01_KontrakHarga/A_BasicFlow/SKH01_KH01_BuatKontrakBaru/Page_Form Kontrak Harga  muatmuat/input_Rute 1_ff-medium-az fc-black-az'), 
    'Surabaya')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS01_KontrakHarga/SKH01_KontrakHarga/A_BasicFlow/SKH01_KH01_BuatKontrakBaru/Page_Form Kontrak Harga  muatmuat/a_Kota Surabaya'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS01_KontrakHarga/SKH01_KontrakHarga/A_BasicFlow/SKH01_KH01_BuatKontrakBaru/Page_Form Kontrak Harga  muatmuat/input_Rute 1_ff-medium-az fc-black-az_1'), 
    'Jakarta')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS01_KontrakHarga/SKH01_KontrakHarga/A_BasicFlow/SKH01_KH01_BuatKontrakBaru/Page_Form Kontrak Harga  muatmuat/a_Kota Jakarta Barat'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS01_KontrakHarga/SKH01_KontrakHarga/A_BasicFlow/SKH01_KH01_BuatKontrakBaru/Page_Form Kontrak Harga  muatmuat/div_Pilih Truk'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS01_KontrakHarga/SKH01_KontrakHarga/A_BasicFlow/SKH01_KH01_BuatKontrakBaru/Page_Form Kontrak Harga  muatmuat/a_Colt Diesel Double'))

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS01_KontrakHarga/SKH01_KontrakHarga/A_BasicFlow/SKH01_KH01_BuatKontrakBaru/Page_Form Kontrak Harga  muatmuat/JenisCarrier'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS01_KontrakHarga/SKH01_KontrakHarga/A_BasicFlow/SKH01_KH01_BuatKontrakBaru/Page_Form Kontrak Harga  muatmuat/img'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS01_KontrakHarga/SKH01_KontrakHarga/A_BasicFlow/SKH01_KH01_BuatKontrakBaru/Page_Form Kontrak Harga  muatmuat/a_Box'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS01_KontrakHarga/SKH01_KontrakHarga/A_BasicFlow/SKH01_KH01_BuatKontrakBaru/Page_Form Kontrak Harga  muatmuat/input_Towing_ff-medium-az fc-black-az fspla_82b264'), 
    '600')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS01_KontrakHarga/SKH01_KontrakHarga/A_BasicFlow/SKH01_KH01_BuatKontrakBaru/Page_Form Kontrak Harga  muatmuat/textarea_SK Kontrak Harga_fs-12-az'), 
    '1. ABC')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS01_KontrakHarga/SKH01_KontrakHarga/A_BasicFlow/SKH01_KH01_BuatKontrakBaru/Page_Form Kontrak Harga  muatmuat/span_concat(Saya telah membuat dan menandat_ec3fae'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS01_KontrakHarga/SKH01_KontrakHarga/A_BasicFlow/SKH01_KH01_BuatKontrakBaru/Page_Form Kontrak Harga  muatmuat/button_Buat'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS01_KontrakHarga/SKH01_KontrakHarga/A_BasicFlow/SKH01_KH01_BuatKontrakBaru/Page_Form Kontrak Harga  muatmuat/button_Buat_1'))

WebUI.getText(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS01_KontrakHarga/SKH01_KontrakHarga/A_BasicFlow/SKH01_KH01_BuatKontrakBaru/Page_Form Kontrak Harga  muatmuat/Validasi_GetText_PopUpBerhasil'))

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS01_KontrakHarga/SKH01_KontrakHarga/A_BasicFlow/SKH01_KH01_BuatKontrakBaru/Page_Form Kontrak Harga  muatmuat/PopUpBerhasilTombolX'))

