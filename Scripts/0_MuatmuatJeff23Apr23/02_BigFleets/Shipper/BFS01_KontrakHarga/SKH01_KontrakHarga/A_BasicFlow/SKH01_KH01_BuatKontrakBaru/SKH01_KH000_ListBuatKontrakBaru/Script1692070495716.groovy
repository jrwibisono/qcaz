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

WebUI.callTestCase(findTestCase('0_MuatmuatJeff23Apr23/00_RegisLogin/RL01_Login/RL01_A_BasicFlow/RL01_L003_LoginBFShipper'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS01_KontrakHarga/SKH01_KontrakHarga/A_BasicFlow/SKH01_KH01_BuatKontrakBaru/Page_Subscription  muatmuat/a_Kontrak Harga'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS01_KontrakHarga/SKH01_KontrakHarga/A_BasicFlow/SKH01_KH01_BuatKontrakBaru/Page_Subscription  muatmuat/a_Kontrak dan Penawaran'))

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS01_KontrakHarga/SKH01_KontrakHarga/A_BasicFlow/SKH01_KH01_BuatKontrakBaru/Page_Kontrak Harga  muatmuat/button_Buat KontrakPenawaran'))

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS01_KontrakHarga/SKH01_KontrakHarga/A_BasicFlow/SKH01_KH01_BuatKontrakBaru/Page_Form Kontrak Harga  muatmuat/button_Pilih Transporter'))

not_run: WebUI.delay(2)

not_run: WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS01_KontrakHarga/SKH01_KontrakHarga/A_BasicFlow/SKH01_KH01_BuatKontrakBaru/Page_Form Kontrak Harga  muatmuat/PopUpPilihTransporter_Search_Fill'), 
    'ervin empat')

not_run: WebUI.delay(2)

not_run: WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS01_KontrakHarga/SKH01_KontrakHarga/A_BasicFlow/SKH01_KH01_BuatKontrakBaru/Page_Form Kontrak Harga  muatmuat/PupUpPilihTransporter_Pilih_RadioButton_JeffryMuncul'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS01_KontrakHarga/SKH01_KontrakHarga/A_BasicFlow/SKH01_KH01_BuatKontrakBaru/Page_Form Kontrak Harga  muatmuat/button_Terapkan'))

not_run: WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS01_KontrakHarga/SKH01_KontrakHarga/A_BasicFlow/SKH01_KH01_BuatKontrakBaru/Page_Form Kontrak Harga  muatmuat/input_Nomor Referensi_ff-medium-az'), 
    'KH-HENDORPHIN-3107230001')

not_run: WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS01_KontrakHarga/SKH01_KontrakHarga/A_BasicFlow/SKH01_KH01_BuatKontrakBaru/Page_Form Kontrak Harga  muatmuat/input_Periode Berlaku_date'), 
    '')

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS01_KontrakHarga/SKH01_KontrakHarga/A_BasicFlow/SKH01_KH01_BuatKontrakBaru/Page_Form Kontrak Harga  muatmuat/input_Periode Berlaku_date'))

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS01_KontrakHarga/SKH01_KontrakHarga/A_BasicFlow/SKH01_KH01_BuatKontrakBaru/Page_Form Kontrak Harga  muatmuat/th_Today'))

not_run: WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS01_KontrakHarga/SKH01_KontrakHarga/A_BasicFlow/SKH01_KH01_BuatKontrakBaru/Page_Form Kontrak Harga  muatmuat/TanggalBerakhir'), 
    '')

not_run: WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS01_KontrakHarga/SKH01_KontrakHarga/A_BasicFlow/SKH01_KH01_BuatKontrakBaru/Page_Form Kontrak Harga  muatmuat/TanggalBerakhir'))

not_run: WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS01_KontrakHarga/SKH01_KontrakHarga/A_BasicFlow/SKH01_KH01_BuatKontrakBaru/Page_Form Kontrak Harga  muatmuat/TanggalBerakhirToday'))

not_run: WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS01_KontrakHarga/SKH01_KontrakHarga/A_BasicFlow/SKH01_KH01_BuatKontrakBaru/Page_Form Kontrak Harga  muatmuat/input_Muatan_ff-medium-az'), 
    'Pasir')

not_run: WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS01_KontrakHarga/SKH01_KontrakHarga/A_BasicFlow/SKH01_KH01_BuatKontrakBaru/Page_Form Kontrak Harga  muatmuat/input_Rute 1_ff-medium-az fc-black-az'), 
    'Surabaya')

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS01_KontrakHarga/SKH01_KontrakHarga/A_BasicFlow/SKH01_KH01_BuatKontrakBaru/Page_Form Kontrak Harga  muatmuat/a_Kota Surabaya'))

not_run: WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS01_KontrakHarga/SKH01_KontrakHarga/A_BasicFlow/SKH01_KH01_BuatKontrakBaru/Page_Form Kontrak Harga  muatmuat/input_Rute 1_ff-medium-az fc-black-az_1'), 
    'Jakarta')

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS01_KontrakHarga/SKH01_KontrakHarga/A_BasicFlow/SKH01_KH01_BuatKontrakBaru/Page_Form Kontrak Harga  muatmuat/a_Kota Jakarta Barat'))

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS01_KontrakHarga/SKH01_KontrakHarga/A_BasicFlow/SKH01_KH01_BuatKontrakBaru/Page_Form Kontrak Harga  muatmuat/div_Pilih Truk'))

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS01_KontrakHarga/SKH01_KontrakHarga/A_BasicFlow/SKH01_KH01_BuatKontrakBaru/Page_Form Kontrak Harga  muatmuat/a_Colt Diesel Double'))

not_run: WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS01_KontrakHarga/SKH01_KontrakHarga/A_BasicFlow/SKH01_KH01_BuatKontrakBaru/Page_Form Kontrak Harga  muatmuat/JenisCarrier'))

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS01_KontrakHarga/SKH01_KontrakHarga/A_BasicFlow/SKH01_KH01_BuatKontrakBaru/Page_Form Kontrak Harga  muatmuat/img'))

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS01_KontrakHarga/SKH01_KontrakHarga/A_BasicFlow/SKH01_KH01_BuatKontrakBaru/Page_Form Kontrak Harga  muatmuat/a_Box'))

not_run: WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS01_KontrakHarga/SKH01_KontrakHarga/A_BasicFlow/SKH01_KH01_BuatKontrakBaru/Page_Form Kontrak Harga  muatmuat/input_Towing_ff-medium-az fc-black-az fspla_82b264'), 
    '600')

not_run: WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS01_KontrakHarga/SKH01_KontrakHarga/A_BasicFlow/SKH01_KH01_BuatKontrakBaru/Page_Form Kontrak Harga  muatmuat/textarea_SK Kontrak Harga_fs-12-az'), 
    '1. ABC')

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS01_KontrakHarga/SKH01_KontrakHarga/A_BasicFlow/SKH01_KH01_BuatKontrakBaru/Page_Form Kontrak Harga  muatmuat/span_concat(Saya telah membuat dan menandat_ec3fae'))

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS01_KontrakHarga/SKH01_KontrakHarga/A_BasicFlow/SKH01_KH01_BuatKontrakBaru/Page_Form Kontrak Harga  muatmuat/button_Buat'))

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS01_KontrakHarga/SKH01_KontrakHarga/A_BasicFlow/SKH01_KH01_BuatKontrakBaru/Page_Form Kontrak Harga  muatmuat/button_Buat_1'))

not_run: WebUI.getText(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS01_KontrakHarga/SKH01_KontrakHarga/A_BasicFlow/SKH01_KH01_BuatKontrakBaru/Page_Form Kontrak Harga  muatmuat/Validasi_GetText_PopUpBerhasil'))

not_run: WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS01_KontrakHarga/SKH01_KontrakHarga/A_BasicFlow/SKH01_KH01_BuatKontrakBaru/Page_Form Kontrak Harga  muatmuat/PopUpBerhasilTombolX'))

