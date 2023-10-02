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

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST01_InfoPraTender/A_BasicFlow/ST01_T01_BuatInfoPraTender/Page_Subscription  muatmuat/li_Tender'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST01_InfoPraTender/A_BasicFlow/ST01_T01_BuatInfoPraTender/Page_Subscription  muatmuat/a_Info Pra Tender'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST01_InfoPraTender/A_BasicFlow/ST01_T01_BuatInfoPraTender/Page_Users  muatmuat/a_Buat Info Pra Tender'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST01_InfoPraTender/A_BasicFlow/ST01_T01_BuatInfoPraTender/Page_Users  muatmuat/button_Pilih TransporterMitra'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST01_InfoPraTender/A_BasicFlow/ST01_T01_BuatInfoPraTender/Page_Users  muatmuat/input_Pilih_pilihSemua'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST01_InfoPraTender/A_BasicFlow/ST01_T01_BuatInfoPraTender/Page_Users  muatmuat/button_Terapkan'))

WebUI.waitForJQueryLoad(60)

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST01_InfoPraTender/A_BasicFlow/ST01_T01_BuatInfoPraTender/Page_Users  muatmuat/input_Judul_namaPratender'), 
    'Hantar Kayu Jati')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST01_InfoPraTender/A_BasicFlow/ST01_T01_BuatInfoPraTender/Page_Users  muatmuat/input_Periode_tahap_tender0min_date'))

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST01_InfoPraTender/A_BasicFlow/ST01_T01_BuatInfoPraTender/Page_Users  muatmuat/BtnTodayTanggalMulai'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST01_InfoPraTender/A_BasicFlow/ST01_T01_BuatInfoPraTender/Page_Users  muatmuat/input_sd_tahap_tender0max_date'))

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST01_InfoPraTender/A_BasicFlow/ST01_T01_BuatInfoPraTender/Page_Users  muatmuat/BtnTodayTanggalAkhir'))

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST01_InfoPraTender/A_BasicFlow/ST01_T01_BuatInfoPraTender/Page_Users  muatmuat/RadBtnVolume'))

not_run: WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST01_InfoPraTender/A_BasicFlow/ST01_T01_BuatInfoPraTender/Page_Users  muatmuat/input_Jumlah_unit_truk0jumlah_truck'), 
    '20')

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST01_InfoPraTender/A_BasicFlow/ST01_T01_BuatInfoPraTender/Page_Users  muatmuat/span_Pilih Jenis Truk'))

not_run: WebUI.waitForJQueryLoad(60)

not_run: WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST01_InfoPraTender/A_BasicFlow/ST01_T01_BuatInfoPraTender/Page_Users  muatmuat/PilihanJenisTruk1'))

not_run: WebUI.waitForJQueryLoad(60)

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST01_InfoPraTender/A_BasicFlow/ST01_T01_BuatInfoPraTender/Page_Users  muatmuat/span_Pilih Jenis Carrier'))

not_run: WebUI.waitForJQueryLoad(60)

not_run: WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST01_InfoPraTender/A_BasicFlow/ST01_T01_BuatInfoPraTender/Page_Users  muatmuat/PilihanJenisCarrier1'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST01_InfoPraTender/A_BasicFlow/ST01_T01_BuatInfoPraTender/Page_Users  muatmuat/input_Muatan_nama_muatan'), 
    'Kayu Jati')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST01_InfoPraTender/A_BasicFlow/ST01_T01_BuatInfoPraTender/Page_Users  muatmuat/span_Pilih Jenis Muatan_1'))

WebUI.waitForJQueryLoad(60)

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST01_InfoPraTender/A_BasicFlow/ST01_T01_BuatInfoPraTender/Page_Users  muatmuat/PilihanJenisMuatan1'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST01_InfoPraTender/A_BasicFlow/ST01_T01_BuatInfoPraTender/Page_Users  muatmuat/input_(opsional)_berat_muatan'), 
    '20')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST01_InfoPraTender/A_BasicFlow/ST01_T01_BuatInfoPraTender/Page_Users  muatmuat/input_(opsional)_volume_muatan'), 
    '20')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST01_InfoPraTender/A_BasicFlow/ST01_T01_BuatInfoPraTender/Page_Users  muatmuat/input_(opsional)_panjang'), 
    '1')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST01_InfoPraTender/A_BasicFlow/ST01_T01_BuatInfoPraTender/Page_Users  muatmuat/input_x_lebar'), 
    '1')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST01_InfoPraTender/A_BasicFlow/ST01_T01_BuatInfoPraTender/Page_Users  muatmuat/input_x_tinggi'), 
    '6')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST01_InfoPraTender/A_BasicFlow/ST01_T01_BuatInfoPraTender/Page_Users  muatmuat/input_(opsional)_jumlah_koli'), 
    '20')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST01_InfoPraTender/A_BasicFlow/ST01_T01_BuatInfoPraTender/Page_Users  muatmuat/input_Rute_rute0pickup'), 
    'Kota Sidoarjo')

WebUI.waitForJQueryLoad(60)

WebUI.sendKeys(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST01_InfoPraTender/A_BasicFlow/ST01_T01_BuatInfoPraTender/Page_Users  muatmuat/input_Rute_rute0pickup'), 
    Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST01_InfoPraTender/A_BasicFlow/ST01_T01_BuatInfoPraTender/Page_Users  muatmuat/input_Kota Surakarta_rute0destinasi'), 
    'Kota Surabaya')

WebUI.waitForJQueryLoad(60)

WebUI.sendKeys(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST01_InfoPraTender/A_BasicFlow/ST01_T01_BuatInfoPraTender/Page_Users  muatmuat/input_Kota Surakarta_rute0destinasi'), 
    Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.delay(1)

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST01_InfoPraTender/A_BasicFlow/ST01_T01_BuatInfoPraTender/Page_Users  muatmuat/DropdownPilihRuteJenisTruk1'))

WebUI.delay(1)

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST01_InfoPraTender/A_BasicFlow/ST01_T01_BuatInfoPraTender/Page_Users  muatmuat/PilihanRuteJenisTruk1'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForJQueryLoad(60)

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST01_InfoPraTender/A_BasicFlow/ST01_T01_BuatInfoPraTender/Page_Users  muatmuat/DropdownPilihRuteJenisCarrier1'))

WebUI.delay(1)

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST01_InfoPraTender/A_BasicFlow/ST01_T01_BuatInfoPraTender/Page_Users  muatmuat/PilihanRuteJenisCarrier1'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST01_InfoPraTender/A_BasicFlow/ST01_T01_BuatInfoPraTender/Page_Users  muatmuat/input_Bak Terbuka_rute0data0nilai'), 
    '20')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST01_InfoPraTender/A_BasicFlow/ST01_T01_BuatInfoPraTender/Page_Users  muatmuat/textarea_(opsional)_kualifikasi_lampiran'), 
    '1. Transporter Bersyarat')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST01_InfoPraTender/A_BasicFlow/ST01_T01_BuatInfoPraTender/Page_Users  muatmuat/textarea_(opsional)_catatan_tambahan'), 
    '1. Catatan Tambahan')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST01_InfoPraTender/A_BasicFlow/ST01_T01_BuatInfoPraTender/Page_Users  muatmuat/button_Buat'))

WebUI.waitForJQueryLoad(240)

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST01_InfoPraTender/A_BasicFlow/ST01_T01_BuatInfoPraTender/Page_Users  muatmuat/ButtonBackFromForm'))

WebUI.delay(1)

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST02_ProsesTender/A_BasicFlow/ST02_T01_BuatProsesTender/Page_Users  muatmuat/ButtonConfirmPopUpBack'))

