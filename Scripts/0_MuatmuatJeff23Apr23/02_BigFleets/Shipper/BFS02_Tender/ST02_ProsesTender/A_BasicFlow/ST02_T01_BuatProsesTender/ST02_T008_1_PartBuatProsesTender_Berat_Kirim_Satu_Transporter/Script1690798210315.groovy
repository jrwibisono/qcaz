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

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST02_ProsesTender/A_BasicFlow/ST02_T01_BuatProsesTender/Page_Users  muatmuat/a_Buat Proses Tender'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST02_ProsesTender/A_BasicFlow/ST02_T01_BuatProsesTender/Page_Users  muatmuat/button_Pilih TransporterMitra'))

WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST02_ProsesTender/A_BasicFlow/ST02_T01_BuatProsesTender/Page_Users  muatmuat/InputSearchMitra'), 
    GlobalVariable.TransporterTujuan1)

WebUI.sendKeys(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST02_ProsesTender/A_BasicFlow/ST02_T01_BuatProsesTender/Page_Users  muatmuat/InputSearchMitra'), 
    Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

not_run: WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST02_ProsesTender/A_BasicFlow/ST02_T01_BuatProsesTender/Page_Users  muatmuat/ChkBoxMitra1'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST02_ProsesTender/A_BasicFlow/ST02_T01_BuatProsesTender/Page_Users  muatmuat/button_Terapkan'))

WebUI.waitForJQueryLoad(60)

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST02_ProsesTender/A_BasicFlow/ST02_T01_BuatProsesTender/Page_Users  muatmuat/input_Judul_namaPratender'), 
    GlobalVariable.ProsesTenderNama)

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST02_ProsesTender/A_BasicFlow/ST02_T01_BuatProsesTender/Page_Users  muatmuat/DateProsesTenderAwal'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST02_ProsesTender/A_BasicFlow/ST02_T01_BuatProsesTender/Page_Users  muatmuat/th_Today'))

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST02_ProsesTender/A_BasicFlow/ST02_T01_BuatProsesTender/Page_Users  muatmuat/DateProsesTenderAkhir'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST02_ProsesTender/A_BasicFlow/ST02_T01_BuatProsesTender/Page_Users  muatmuat/th_Today'))

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST02_ProsesTender/A_BasicFlow/ST02_T01_BuatProsesTender/Page_Users  muatmuat/DateSeleksiPemenangAwal'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST02_ProsesTender/A_BasicFlow/ST02_T01_BuatProsesTender/Page_Users  muatmuat/th_Today'))

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST02_ProsesTender/A_BasicFlow/ST02_T01_BuatProsesTender/Page_Users  muatmuat/DateSeleksiPemenangAkhir'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST02_ProsesTender/A_BasicFlow/ST02_T01_BuatProsesTender/Page_Users  muatmuat/th_Today'))

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST02_ProsesTender/A_BasicFlow/ST02_T01_BuatProsesTender/Page_Users  muatmuat/DatePengumumanPemenangAwal'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST02_ProsesTender/A_BasicFlow/ST02_T01_BuatProsesTender/Page_Users  muatmuat/th_Today'))

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST02_ProsesTender/A_BasicFlow/ST02_T01_BuatProsesTender/Page_Users  muatmuat/DatePengumumanPemenangAkhir'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST02_ProsesTender/A_BasicFlow/ST02_T01_BuatProsesTender/Page_Users  muatmuat/th_Today'))

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST02_ProsesTender/A_BasicFlow/ST02_T01_BuatProsesTender/Page_Users  muatmuat/DateEksekusiTenderAwal'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST02_ProsesTender/A_BasicFlow/ST02_T01_BuatProsesTender/Page_Users  muatmuat/th_Today'))

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST02_ProsesTender/A_BasicFlow/ST02_T01_BuatProsesTender/Page_Users  muatmuat/DateEksekusiTenderAkhir'))

not_run: WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST02_ProsesTender/A_BasicFlow/ST02_T01_BuatProsesTender/Page_Users  muatmuat/BtnNextMonth'))

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST02_ProsesTender/A_BasicFlow/ST02_T01_BuatProsesTender/Page_Users  muatmuat/BtnTgl31Agustus'))

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST02_ProsesTender/A_BasicFlow/ST02_T01_BuatProsesTender/Page_Users  muatmuat/th_Today'))

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST02_ProsesTender/A_BasicFlow/ST02_T01_BuatProsesTender/Page_Users  muatmuat/RadioBtnSatuanBerat'))

not_run: WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST02_ProsesTender/A_BasicFlow/ST02_T01_BuatProsesTender/Page_Users  muatmuat/input_Jumlah_unit_truk0jumlah_truck'), 
    '20')

not_run: WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST02_ProsesTender/A_BasicFlow/ST02_T01_BuatProsesTender/Page_Users  muatmuat/DropdownPilihJenisTruk1'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST02_ProsesTender/A_BasicFlow/ST02_T01_BuatProsesTender/Page_Users  muatmuat/PilihanJenisTruk1'), 
    FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.waitForJQueryLoad(60)

not_run: WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST02_ProsesTender/A_BasicFlow/ST02_T01_BuatProsesTender/Page_Users  muatmuat/DropdownPilihJenisCarrier1'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST02_ProsesTender/A_BasicFlow/ST02_T01_BuatProsesTender/Page_Users  muatmuat/PilihanJenisCarrier1'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST02_ProsesTender/A_BasicFlow/ST02_T01_BuatProsesTender/Page_Users  muatmuat/input_Muatan_nama_muatan'), 
    'Jati')

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST02_ProsesTender/A_BasicFlow/ST02_T01_BuatProsesTender/Page_Users  muatmuat/DropdownPilihJenisMuatan'))

WebUI.delay(1)

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST02_ProsesTender/A_BasicFlow/ST02_T01_BuatProsesTender/Page_Users  muatmuat/PilihanJenisMuatan'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST02_ProsesTender/A_BasicFlow/ST02_T01_BuatProsesTender/Page_Users  muatmuat/input_(opsional)_berat_muatan'), 
    GlobalVariable.JumlahSatuan)

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST02_ProsesTender/A_BasicFlow/ST02_T01_BuatProsesTender/Page_Users  muatmuat/input_(opsional)_volume_muatan'), 
    '20')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST02_ProsesTender/A_BasicFlow/ST02_T01_BuatProsesTender/Page_Users  muatmuat/input_(opsional)_panjang'), 
    '1')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST02_ProsesTender/A_BasicFlow/ST02_T01_BuatProsesTender/Page_Users  muatmuat/input_x_lebar'), 
    '1')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST02_ProsesTender/A_BasicFlow/ST02_T01_BuatProsesTender/Page_Users  muatmuat/input_x_tinggi'), 
    '1')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST02_ProsesTender/A_BasicFlow/ST02_T01_BuatProsesTender/Page_Users  muatmuat/input_(opsional)_jumlah_koli'), 
    '20')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST02_ProsesTender/A_BasicFlow/ST02_T01_BuatProsesTender/Page_Users  muatmuat/input_Rute_rute0pickup'), 
    GlobalVariable.LokasiPickupTender)

WebUI.waitForJQueryLoad(60)

WebUI.sendKeys(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST02_ProsesTender/A_BasicFlow/ST02_T01_BuatProsesTender/Page_Users  muatmuat/input_Rute_rute0pickup'), 
    Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST02_ProsesTender/A_BasicFlow/ST02_T01_BuatProsesTender/Page_Users  muatmuat/input_Kota Surakarta_rute0destinasi'), 
    GlobalVariable.LokasiDestinasiTender)

WebUI.waitForJQueryLoad(60)

WebUI.sendKeys(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST02_ProsesTender/A_BasicFlow/ST02_T01_BuatProsesTender/Page_Users  muatmuat/input_Kota Surakarta_rute0destinasi'), 
    Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

not_run: WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST02_ProsesTender/A_BasicFlow/ST02_T01_BuatProsesTender/Page_Users  muatmuat/DropdownRutePilihJenisTruk1'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST02_ProsesTender/A_BasicFlow/ST02_T01_BuatProsesTender/Page_Users  muatmuat/PilihanRuteJenisTruk1'))

not_run: WebUI.waitForJQueryLoad(60)

not_run: WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST02_ProsesTender/A_BasicFlow/ST02_T01_BuatProsesTender/Page_Users  muatmuat/DropdownRutePilihJenisCarrier1'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST02_ProsesTender/A_BasicFlow/ST02_T01_BuatProsesTender/Page_Users  muatmuat/PilihanRuteJenisCarrier1'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST02_ProsesTender/A_BasicFlow/ST02_T01_BuatProsesTender/Page_Users  muatmuat/input_Bak Terbuka_rute0data0nilai'), 
    GlobalVariable.JumlahSatuan)

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST02_ProsesTender/A_BasicFlow/ST02_T01_BuatProsesTender/Page_Users  muatmuat/textarea_(opsional)_kualifikasi_lampiran'), 
    '1. Transporter memiliki truk siap muat')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST02_ProsesTender/A_BasicFlow/ST02_T01_BuatProsesTender/Page_Users  muatmuat/textarea_(opsional)_catatan_tambahan'), 
    '1. Diutamakan kepada transporter terdekat')

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST02_ProsesTender/A_BasicFlow/ST02_T01_BuatProsesTender/Page_Users  muatmuat/DropdownFormatDokumen'))

WebUI.delay(1)

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST02_ProsesTender/A_BasicFlow/ST02_T01_BuatProsesTender/Page_Users  muatmuat/PilihanFormatDokumen'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST02_ProsesTender/A_BasicFlow/ST02_T01_BuatProsesTender/Page_Users  muatmuat/input_Keterangan_format_dokumen_desc'), 
    'Dokumen Penting')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST02_ProsesTender/A_BasicFlow/ST02_T01_BuatProsesTender/Page_Users  muatmuat/button_Buat'))

WebUI.delay(5)

WebUI.waitForJQueryLoad(240)

not_run: WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST02_ProsesTender/A_BasicFlow/ST02_T01_BuatProsesTender/Page_Users  muatmuat/ButtonBackFromForm'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST02_ProsesTender/A_BasicFlow/ST02_T01_BuatProsesTender/Page_Users  muatmuat/ButtonConfirmPopUpBack'))

