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

WebUI.callTestCase(findTestCase('0_MuatmuatJeff23Apr23/00_RegisLogin/RL01_Login/RL01_A_BasicFlow/RL01_L004_LoginBFTransporter'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT03_InstantOrder/TIO01_IO01_TambahLokasiTrukSiapMuat/Page_Big Fleets Main Dashboard  muatmuat/li_Instant Order'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT03_InstantOrder/TIO01_IO01_TambahLokasiTrukSiapMuat/Page_Big Fleets Main Dashboard  muatmuat/a_Lokasi Truk Siap Muat'))

not_run: WebUI.navigateToUrl('https://qc.assetlogistik.com/bigfleets/location_ready')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT03_InstantOrder/TIO01_IO01_TambahLokasiTrukSiapMuat/Page_Lokasi Truk Siap Muat  muatmuat/a_Tambah Lokasi'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT03_InstantOrder/TIO01_IO01_TambahLokasiTrukSiapMuat/Page_Lokasi Truk Siap Muat  muatmuat/input_Kecamatan_address'), 
    'Kota Surabaya')

WebUI.waitForJQueryLoad(60)

WebUI.sendKeys(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT03_InstantOrder/TIO01_IO01_TambahLokasiTrukSiapMuat/Page_Lokasi Truk Siap Muat  muatmuat/input_Kecamatan_address'), 
    Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT03_InstantOrder/TIO01_IO01_TambahLokasiTrukSiapMuat/Page_Lokasi Truk Siap Muat  muatmuat/DropdownEkspetasiDestinasi'))

WebUI.waitForJQueryLoad(60)

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT03_InstantOrder/TIO01_IO01_TambahLokasiTrukSiapMuat/Page_Lokasi Truk Siap Muat  muatmuat/CheckboxSiapKemanaSajaEkspetasiDestinasi'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT03_InstantOrder/TIO01_IO01_TambahLokasiTrukSiapMuat/Page_Lokasi Truk Siap Muat  muatmuat/input_Posisi Truk_address_truk'), 
    'Kenjeran, Surabaya, Jawa Timur, Indonesia')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT03_InstantOrder/TIO01_IO01_TambahLokasiTrukSiapMuat/Page_Lokasi Truk Siap Muat  muatmuat/div_Kenjeran, Surabaya, Jawa Timur, Indonesia'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT03_InstantOrder/TIO01_IO01_TambahLokasiTrukSiapMuat/Page_Lokasi Truk Siap Muat  muatmuat/input_Akan Siap MuatSiap Muat_tgl_akan_siap_muat'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT03_InstantOrder/TIO01_IO01_TambahLokasiTrukSiapMuat/Page_Lokasi Truk Siap Muat  muatmuat/th_Today'))

WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT03_InstantOrder/TIO01_IO01_TambahLokasiTrukSiapMuat/Page_Lokasi Truk Siap Muat  muatmuat/InputWaktuBatasMaksimalPengisian'), 
    '2359')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT03_InstantOrder/TIO01_IO01_TambahLokasiTrukSiapMuat/Page_Lokasi Truk Siap Muat  muatmuat/div_Pilih Jenis Truk'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT03_InstantOrder/TIO01_IO01_TambahLokasiTrukSiapMuat/Page_Lokasi Truk Siap Muat  muatmuat/span_Colt Diesel Engkel'))

WebUI.waitForJQueryLoad(60)

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT03_InstantOrder/TIO01_IO01_TambahLokasiTrukSiapMuat/Page_Lokasi Truk Siap Muat  muatmuat/div_Pilih jenis Carrier'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT03_InstantOrder/TIO01_IO01_TambahLokasiTrukSiapMuat/Page_Lokasi Truk Siap Muat  muatmuat/span_Bak Terbuka'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT03_InstantOrder/TIO01_IO01_TambahLokasiTrukSiapMuat/Page_Lokasi Truk Siap Muat  muatmuat/input_ton_panjang'), 
    '2')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT03_InstantOrder/TIO01_IO01_TambahLokasiTrukSiapMuat/Page_Lokasi Truk Siap Muat  muatmuat/input_x_lebar'), 
    '2')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT03_InstantOrder/TIO01_IO01_TambahLokasiTrukSiapMuat/Page_Lokasi Truk Siap Muat  muatmuat/input_x_tinggi'), 
    '2')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT03_InstantOrder/TIO01_IO01_TambahLokasiTrukSiapMuat/Page_Lokasi Truk Siap Muat  muatmuat/input_x_tinggi'), 
    '2')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT03_InstantOrder/TIO01_IO01_TambahLokasiTrukSiapMuat/Page_Lokasi Truk Siap Muat  muatmuat/span_Jumlah Truk_btn-jumlah text-center d-f_58718a'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT03_InstantOrder/TIO01_IO01_TambahLokasiTrukSiapMuat/Page_Lokasi Truk Siap Muat  muatmuat/textarea_Catatan untuk Shipper_catatan'), 
    'Siap muat')

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT03_InstantOrder/TIO01_IO01_TambahLokasiTrukSiapMuat/Page_Lokasi Truk Siap Muat  muatmuat/button_Tambah'))

not_run: WebUI.waitForJQueryLoad(60)

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT03_InstantOrder/TIO01_IO01_TambahLokasiTrukSiapMuat/Page_Lokasi Truk Siap Muat  muatmuat/img'))

