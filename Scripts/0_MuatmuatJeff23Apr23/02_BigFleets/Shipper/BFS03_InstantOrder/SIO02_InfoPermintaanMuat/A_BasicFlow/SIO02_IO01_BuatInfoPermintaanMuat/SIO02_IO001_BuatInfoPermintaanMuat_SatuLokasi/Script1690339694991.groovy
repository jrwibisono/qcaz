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

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS03_InstantOrder/SIO02_InfoPermintaanMuat/A_BasicFlow/SIO02_IO01_BuatInfoPermintaanMuat/Page_Big Fleets Main Dashboard  muatmuat/li_Instant Order'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS03_InstantOrder/SIO02_InfoPermintaanMuat/A_BasicFlow/SIO02_IO01_BuatInfoPermintaanMuat/Page_Big Fleets Main Dashboard  muatmuat/a_Info Permintaan Muat'))

WebUI.navigateToUrl('https://qc.assetlogistik.com/bigfleets/permintaanMuatAktifGrid')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS03_InstantOrder/SIO02_InfoPermintaanMuat/A_BasicFlow/SIO02_IO01_BuatInfoPermintaanMuat/Page_Users  muatmuat/a_Buat Info Permintaan Muat'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS03_InstantOrder/SIO02_InfoPermintaanMuat/A_BasicFlow/SIO02_IO01_BuatInfoPermintaanMuat/Page_Users  muatmuat/input__pickUpAddress0'), 
    'Kenjeran')

WebUI.waitForJQueryLoad(60)

WebUI.sendKeys(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS03_InstantOrder/SIO02_InfoPermintaanMuat/A_BasicFlow/SIO02_IO01_BuatInfoPermintaanMuat/Page_Users  muatmuat/input__pickUpAddress0'), 
    Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS03_InstantOrder/SIO02_InfoPermintaanMuat/A_BasicFlow/SIO02_IO01_BuatInfoPermintaanMuat/Page_Users  muatmuat/div_Kenjeran, Surabaya, Jawa Timur, Indonesia'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS03_InstantOrder/SIO02_InfoPermintaanMuat/A_BasicFlow/SIO02_IO01_BuatInfoPermintaanMuat/Page_Users  muatmuat/textarea__pickUpDetailAddress0'), 
    'Kenjeran')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS03_InstantOrder/SIO02_InfoPermintaanMuat/A_BasicFlow/SIO02_IO01_BuatInfoPermintaanMuat/Page_Users  muatmuat/input_(opsional)_pickup_nama_pic0'), 
    'Budi')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS03_InstantOrder/SIO02_InfoPermintaanMuat/A_BasicFlow/SIO02_IO01_BuatInfoPermintaanMuat/Page_Users  muatmuat/input_(opsional)_pickup_no_pic0'), 
    '777888999')

not_run: WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS03_InstantOrder/SIO02_InfoPermintaanMuat/A_BasicFlow/SIO02_IO01_BuatInfoPermintaanMuat/Page_Users  muatmuat/input__tgl_akan_siap_muat'), 
    '')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS03_InstantOrder/SIO02_InfoPermintaanMuat/A_BasicFlow/SIO02_IO01_BuatInfoPermintaanMuat/Page_Users  muatmuat/input__tgl_akan_siap_muat'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS03_InstantOrder/SIO02_InfoPermintaanMuat/A_BasicFlow/SIO02_IO01_BuatInfoPermintaanMuat/Page_Users  muatmuat/th_Today'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS03_InstantOrder/SIO02_InfoPermintaanMuat/A_BasicFlow/SIO02_IO01_BuatInfoPermintaanMuat/Page_Users  muatmuat/input__addressBongkar0'), 
    'alun contong')

WebUI.waitForJQueryLoad(60)

WebUI.sendKeys(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS03_InstantOrder/SIO02_InfoPermintaanMuat/A_BasicFlow/SIO02_IO01_BuatInfoPermintaanMuat/Page_Users  muatmuat/input__addressBongkar0'), 
    Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS03_InstantOrder/SIO02_InfoPermintaanMuat/A_BasicFlow/SIO02_IO01_BuatInfoPermintaanMuat/Page_Users  muatmuat/div_Alun-alun Contong, Surabaya, Jawa Timur_d59d33'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS03_InstantOrder/SIO02_InfoPermintaanMuat/A_BasicFlow/SIO02_IO01_BuatInfoPermintaanMuat/Page_Users  muatmuat/textarea__detailBongkar0'), 
    'Alun contong')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS03_InstantOrder/SIO02_InfoPermintaanMuat/A_BasicFlow/SIO02_IO01_BuatInfoPermintaanMuat/Page_Users  muatmuat/input_(opsional)_bongkar_nama_pic0'), 
    'Santoso')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS03_InstantOrder/SIO02_InfoPermintaanMuat/A_BasicFlow/SIO02_IO01_BuatInfoPermintaanMuat/Page_Users  muatmuat/input_(opsional)_bongkar_no_pic0'), 
    '888999777')

not_run: WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS03_InstantOrder/SIO02_InfoPermintaanMuat/A_BasicFlow/SIO02_IO01_BuatInfoPermintaanMuat/Page_Users  muatmuat/input__tgl_akan_siap_muat_1'), 
    '')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS03_InstantOrder/SIO02_InfoPermintaanMuat/A_BasicFlow/SIO02_IO01_BuatInfoPermintaanMuat/Page_Users  muatmuat/input__tgl_akan_siap_muat_1'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS03_InstantOrder/SIO02_InfoPermintaanMuat/A_BasicFlow/SIO02_IO01_BuatInfoPermintaanMuat/Page_Users  muatmuat/span_Jenis Truk'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS03_InstantOrder/SIO02_InfoPermintaanMuat/A_BasicFlow/SIO02_IO01_BuatInfoPermintaanMuat/Page_Users  muatmuat/span_Jenis Carrier'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS03_InstantOrder/SIO02_InfoPermintaanMuat/A_BasicFlow/SIO02_IO01_BuatInfoPermintaanMuat/Page_Users  muatmuat/input__jumlah_truck'), 
    '20')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS03_InstantOrder/SIO02_InfoPermintaanMuat/A_BasicFlow/SIO02_IO01_BuatInfoPermintaanMuat/Page_Users  muatmuat/textarea__deskripsimuatan'), 
    'Kayu Jati')

WebUI.setText(findTestObject('Page_Users  muatmuat/input_(opsional)_berat'), '20')

WebUI.setText(findTestObject('Page_Users  muatmuat/input_(opsional)_volume'), '20')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS03_InstantOrder/SIO02_InfoPermintaanMuat/A_BasicFlow/SIO02_IO01_BuatInfoPermintaanMuat/Page_Users  muatmuat/input_(opsional)_dimensi'), 
    '20x20x20')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS03_InstantOrder/SIO02_InfoPermintaanMuat/A_BasicFlow/SIO02_IO01_BuatInfoPermintaanMuat/Page_Users  muatmuat/input_(opsional)_jumlah_koli'), 
    '20')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS03_InstantOrder/SIO02_InfoPermintaanMuat/A_BasicFlow/SIO02_IO01_BuatInfoPermintaanMuat/Page_Users  muatmuat/textarea_(opsional)_deskripsi'), 
    'Catatan tambahan Transporter')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS03_InstantOrder/SIO02_InfoPermintaanMuat/A_BasicFlow/SIO02_IO01_BuatInfoPermintaanMuat/Page_Users  muatmuat/button_Pilih TransporterMitra'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS03_InstantOrder/SIO02_InfoPermintaanMuat/A_BasicFlow/SIO02_IO01_BuatInfoPermintaanMuat/Page_Users  muatmuat/input_Pilih_pilihSemua'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS03_InstantOrder/SIO02_InfoPermintaanMuat/A_BasicFlow/SIO02_IO01_BuatInfoPermintaanMuat/Page_Users  muatmuat/button_Terapkan'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS03_InstantOrder/SIO02_InfoPermintaanMuat/A_BasicFlow/SIO02_IO01_BuatInfoPermintaanMuat/Page_Users  muatmuat/button_Buat Info Permintaan Muat'))

WebUI.waitForJQueryLoad(240)

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS03_InstantOrder/SIO02_InfoPermintaanMuat/A_BasicFlow/SIO02_IO01_BuatInfoPermintaanMuat/Page_Users  muatmuat/img'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS03_InstantOrder/SIO02_InfoPermintaanMuat/A_BasicFlow/SIO02_IO01_BuatInfoPermintaanMuat/Page_Users  muatmuat/i_Trial 7 Days_fa fa-arrow-left'))

