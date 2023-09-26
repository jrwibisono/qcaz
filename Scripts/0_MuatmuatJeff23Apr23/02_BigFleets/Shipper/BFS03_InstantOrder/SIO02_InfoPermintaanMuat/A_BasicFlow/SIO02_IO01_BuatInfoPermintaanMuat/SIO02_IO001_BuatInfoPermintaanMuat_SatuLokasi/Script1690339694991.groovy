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

not_run: WebUI.navigateToUrl(GlobalVariable.URLPermintaanMuatAktif)

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS03_InstantOrder/SIO02_InfoPermintaanMuat/A_BasicFlow/SIO02_IO01_BuatInfoPermintaanMuat/Page_Users  muatmuat/a_Buat Info Permintaan Muat'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS03_InstantOrder/SIO02_InfoPermintaanMuat/A_BasicFlow/SIO02_IO01_BuatInfoPermintaanMuat/Page_Users  muatmuat/input__pickUpAddress0'), 
    'Kenjeran')

WebUI.delay(1)

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS03_InstantOrder/SIO02_InfoPermintaanMuat/A_BasicFlow/SIO02_IO01_BuatInfoPermintaanMuat/Page_Users  muatmuat/SelectPickupAddress0'))

not_run: WebUI.sendKeys(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS03_InstantOrder/SIO02_InfoPermintaanMuat/A_BasicFlow/SIO02_IO01_BuatInfoPermintaanMuat/Page_Users  muatmuat/input__pickUpAddress0'), 
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

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS03_InstantOrder/SIO02_InfoPermintaanMuat/A_BasicFlow/SIO02_IO01_BuatInfoPermintaanMuat/Page_Users  muatmuat/InputWaktuPickupContainer'))

WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS03_InstantOrder/SIO02_InfoPermintaanMuat/A_BasicFlow/SIO02_IO01_BuatInfoPermintaanMuat/Page_Users  muatmuat/InputWaktuPickup'), 
    '2000')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS03_InstantOrder/SIO02_InfoPermintaanMuat/A_BasicFlow/SIO02_IO01_BuatInfoPermintaanMuat/Page_Users  muatmuat/input__addressBongkar0'), 
    'alun contong')

WebUI.delay(1)

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS03_InstantOrder/SIO02_InfoPermintaanMuat/A_BasicFlow/SIO02_IO01_BuatInfoPermintaanMuat/Page_Users  muatmuat/SelectPickupAddress0'))

not_run: WebUI.sendKeys(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS03_InstantOrder/SIO02_InfoPermintaanMuat/A_BasicFlow/SIO02_IO01_BuatInfoPermintaanMuat/Page_Users  muatmuat/input__addressBongkar0'), 
    Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS03_InstantOrder/SIO02_InfoPermintaanMuat/A_BasicFlow/SIO02_IO01_BuatInfoPermintaanMuat/Page_Users  muatmuat/div_Alun-alun Contong, Surabaya, Jawa Timur'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS03_InstantOrder/SIO02_InfoPermintaanMuat/A_BasicFlow/SIO02_IO01_BuatInfoPermintaanMuat/Page_Users  muatmuat/textarea__detailBongkar0'), 
    'Alun contong')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS03_InstantOrder/SIO02_InfoPermintaanMuat/A_BasicFlow/SIO02_IO01_BuatInfoPermintaanMuat/Page_Users  muatmuat/input_(opsional)_bongkar_nama_pic0'), 
    'Santoso')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS03_InstantOrder/SIO02_InfoPermintaanMuat/A_BasicFlow/SIO02_IO01_BuatInfoPermintaanMuat/Page_Users  muatmuat/input_(opsional)_bongkar_no_pic0'), 
    '888999777')

not_run: WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS03_InstantOrder/SIO02_InfoPermintaanMuat/A_BasicFlow/SIO02_IO01_BuatInfoPermintaanMuat/Page_Users  muatmuat/input__tgl_akan_siap_muat_1'), 
    '')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS03_InstantOrder/SIO02_InfoPermintaanMuat/A_BasicFlow/SIO02_IO01_BuatInfoPermintaanMuat/Page_Users  muatmuat/input__tgl_akan_siap_muat_1'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS03_InstantOrder/SIO02_InfoPermintaanMuat/A_BasicFlow/SIO02_IO01_BuatInfoPermintaanMuat/Page_Users  muatmuat/th_Today'))

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS03_InstantOrder/SIO02_InfoPermintaanMuat/A_BasicFlow/SIO02_IO01_BuatInfoPermintaanMuat/Page_Users  muatmuat/InputWaktuBongkarContainer'))

WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS03_InstantOrder/SIO02_InfoPermintaanMuat/A_BasicFlow/SIO02_IO01_BuatInfoPermintaanMuat/Page_Users  muatmuat/InputWaktuBongkar'), 
    '2359')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS03_InstantOrder/SIO02_InfoPermintaanMuat/A_BasicFlow/SIO02_IO01_BuatInfoPermintaanMuat/Page_Users  muatmuat/span_Jenis Truk'))

WebUI.sendKeys(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS03_InstantOrder/SIO02_InfoPermintaanMuat/A_BasicFlow/SIO02_IO01_BuatInfoPermintaanMuat/Page_Users  muatmuat/InputJenisTruk'), 
    Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS03_InstantOrder/SIO02_InfoPermintaanMuat/A_BasicFlow/SIO02_IO01_BuatInfoPermintaanMuat/Page_Users  muatmuat/span_Jenis Carrier'))

WebUI.sendKeys(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS03_InstantOrder/SIO02_InfoPermintaanMuat/A_BasicFlow/SIO02_IO01_BuatInfoPermintaanMuat/Page_Users  muatmuat/InputJenisCarrier'), 
    Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS03_InstantOrder/SIO02_InfoPermintaanMuat/A_BasicFlow/SIO02_IO01_BuatInfoPermintaanMuat/Page_Users  muatmuat/input__jumlah_truck'), 
    '20')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS03_InstantOrder/SIO02_InfoPermintaanMuat/A_BasicFlow/SIO02_IO01_BuatInfoPermintaanMuat/Page_Users  muatmuat/textarea__deskripsimuatan'), 
    'Katalon')

WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS03_InstantOrder/SIO02_InfoPermintaanMuat/A_BasicFlow/SIO02_IO01_BuatInfoPermintaanMuat/Page_Users  muatmuat/InputBeratOpsional'), 
    '20')

WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS03_InstantOrder/SIO02_InfoPermintaanMuat/A_BasicFlow/SIO02_IO01_BuatInfoPermintaanMuat/Page_Users  muatmuat/InputVolumeOpsional'), 
    '20')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS03_InstantOrder/SIO02_InfoPermintaanMuat/A_BasicFlow/SIO02_IO01_BuatInfoPermintaanMuat/Page_Users  muatmuat/input_(opsional)_dimensi'), 
    '20x20x20')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS03_InstantOrder/SIO02_InfoPermintaanMuat/A_BasicFlow/SIO02_IO01_BuatInfoPermintaanMuat/Page_Users  muatmuat/input_(opsional)_jumlah_koli'), 
    '20')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS03_InstantOrder/SIO02_InfoPermintaanMuat/A_BasicFlow/SIO02_IO01_BuatInfoPermintaanMuat/Page_Users  muatmuat/textarea_(opsional)_deskripsi'), 
    'Catatan tambahan Transporter')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS03_InstantOrder/SIO02_InfoPermintaanMuat/A_BasicFlow/SIO02_IO01_BuatInfoPermintaanMuat/Page_Users  muatmuat/button_Pilih TransporterMitra'))

WebUI.delay(1)

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS03_InstantOrder/SIO02_InfoPermintaanMuat/A_BasicFlow/SIO02_IO01_BuatInfoPermintaanMuat/Page_Users  muatmuat/input_Pilih_pilihSemua'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS03_InstantOrder/SIO02_InfoPermintaanMuat/A_BasicFlow/SIO02_IO01_BuatInfoPermintaanMuat/Page_Users  muatmuat/input_Pilih_pilihSemua'), 
    '')

WebUI.waitForJQueryLoad(60, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS03_InstantOrder/SIO02_InfoPermintaanMuat/A_BasicFlow/SIO02_IO01_BuatInfoPermintaanMuat/Page_Users  muatmuat/input_Pilih_pilihSemua'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS03_InstantOrder/SIO02_InfoPermintaanMuat/A_BasicFlow/SIO02_IO01_BuatInfoPermintaanMuat/Page_Users  muatmuat/button_Terapkan'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS03_InstantOrder/SIO02_InfoPermintaanMuat/A_BasicFlow/SIO02_IO01_BuatInfoPermintaanMuat/Page_Users  muatmuat/button_Buat Info Permintaan Muat'))

not_run: WebUI.waitForJQueryLoad(240)

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS03_InstantOrder/SIO02_InfoPermintaanMuat/A_BasicFlow/SIO02_IO01_BuatInfoPermintaanMuat/Page_Users  muatmuat/img'))

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS03_InstantOrder/SIO02_InfoPermintaanMuat/A_BasicFlow/SIO02_IO01_BuatInfoPermintaanMuat/Page_Users  muatmuat/i_Trial 7 Days_fa fa-arrow-left'))

