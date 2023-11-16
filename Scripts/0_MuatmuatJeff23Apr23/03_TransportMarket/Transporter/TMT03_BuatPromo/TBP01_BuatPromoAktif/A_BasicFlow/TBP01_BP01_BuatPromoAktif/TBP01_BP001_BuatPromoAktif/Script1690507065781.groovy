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

WebUI.callTestCase(findTestCase('0_MuatmuatJeff23Apr23/00_RegisLogin/RL01_Login/RL01_A_BasicFlow/RL01_L006_LoginTMTransporter'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT03_BuatPromo/A_BasicFlow/TBP01_BP01_BuatPromoAktif/Page_Subscription/a_Buat Promo'))

not_run: WebUI.navigateToUrl('https://zo3.assetlogistik.com/manajemen-promo/promoAktif')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT03_BuatPromo/A_BasicFlow/TBP01_BP01_BuatPromoAktif/Page_Promo Aktif  muatmuat/button_Buat Promo'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT03_BuatPromo/A_BasicFlow/TBP01_BP01_BuatPromoAktif/Page_Buat Promo  muatmuat/b'))

WebUI.waitForJQueryLoad(60)

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT03_BuatPromo/A_BasicFlow/TBP01_BP01_BuatPromoAktif/Page_Buat Promo  muatmuat/h6_Tambah Lokasi'))

WebUI.delay(2)

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT03_BuatPromo/A_BasicFlow/TBP01_BP01_BuatPromoAktif/Page_Buat Promo  muatmuat/input_Nama LokasiArea_input-location-name'), 
    'Surabaya010')

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT03_BuatPromo/A_BasicFlow/TBP01_BP01_BuatPromoAktif/Page_Buat Promo  muatmuat/input_Nama LokasiArea_input-location-name'))

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT03_BuatPromo/A_BasicFlow/TBP01_BP01_BuatPromoAktif/Page_Buat Promo  muatmuat/BtnSimpanNamaLokasiPickup'))

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT03_BuatPromo/A_BasicFlow/TBP01_BP01_BuatPromoAktif/Page_Buat Promo  muatmuat/DropdownSetKotaPickup'))

WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT03_BuatPromo/A_BasicFlow/TBP01_BP01_BuatPromoAktif/Page_Buat Promo  muatmuat/InputKotaPickup'), 
    'Surabaya')

WebUI.delay(5)

WebUI.waitForJQueryLoad(60)

not_run: WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT03_BuatPromo/A_BasicFlow/TBP01_BP01_BuatPromoAktif/Page_Buat Promo  muatmuat/OptionPilihKotaPickup'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.sendKeys(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT03_BuatPromo/A_BasicFlow/TBP01_BP01_BuatPromoAktif/Page_Buat Promo  muatmuat/InputKotaPickup'), 
    Keys.chord(Keys.ENTER))

WebUI.waitForJQueryLoad(60)

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT03_BuatPromo/A_BasicFlow/TBP01_BP01_BuatPromoAktif/Page_Buat Promo  muatmuat/BtnPilihKecamatanPickup'))

WebUI.waitForJQueryLoad(60)

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT03_BuatPromo/A_BasicFlow/TBP01_BP01_BuatPromoAktif/Page_Buat Promo  muatmuat/input_Kecamatan_custom-checkbox kecamatan-c_f2104f'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT03_BuatPromo/A_BasicFlow/TBP01_BP01_BuatPromoAktif/Page_Buat Promo  muatmuat/button_Terapkan'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT03_BuatPromo/A_BasicFlow/TBP01_BP01_BuatPromoAktif/Page_Buat Promo  muatmuat/button_Simpan'))

WebUI.waitForJQueryLoad(60)

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT03_BuatPromo/A_BasicFlow/TBP01_BP01_BuatPromoAktif/Page_Buat Promo  muatmuat/button_Ya'))

WebUI.waitForJQueryLoad(60)

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT03_BuatPromo/A_BasicFlow/TBP01_BP01_BuatPromoAktif/Page_Buat Promo  muatmuat/BtnCloseBerhasilSimpanLokasiPickup'))

WebUI.waitForJQueryLoad(60)

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT03_BuatPromo/A_BasicFlow/TBP01_BP01_BuatPromoAktif/Page_Buat Promo  muatmuat/DropdownSelectLokasiDestinasi'))

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT03_BuatPromo/A_BasicFlow/TBP01_BP01_BuatPromoAktif/Page_Buat Promo  muatmuat/BtnTambahLokasiDestinasi'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT03_BuatPromo/A_BasicFlow/TBP01_BP01_BuatPromoAktif/Page_Buat Promo  muatmuat/input_Nama LokasiArea_input-location-name'), 
    'Banjarmasin010')

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT03_BuatPromo/A_BasicFlow/TBP01_BP01_BuatPromoAktif/Page_Buat Promo  muatmuat/BtnSimpanNamaLokasiPickup'))

WebUI.waitForJQueryLoad(60)

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT03_BuatPromo/A_BasicFlow/TBP01_BP01_BuatPromoAktif/Page_Buat Promo  muatmuat/DropdownSetKotaDestinasi'))

WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT03_BuatPromo/A_BasicFlow/TBP01_BP01_BuatPromoAktif/Page_Buat Promo  muatmuat/InputKotaDestinasi'), 
    'Banjarmasin')

WebUI.delay(5)

WebUI.waitForJQueryLoad(60)

WebUI.sendKeys(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT03_BuatPromo/A_BasicFlow/TBP01_BP01_BuatPromoAktif/Page_Buat Promo  muatmuat/InputKotaDestinasi'), 
    Keys.chord(Keys.ENTER))

WebUI.waitForJQueryLoad(60)

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT03_BuatPromo/A_BasicFlow/TBP01_BP01_BuatPromoAktif/Page_Buat Promo  muatmuat/BtnPilihKecamatanDestinasi'))

WebUI.waitForJQueryLoad(60)

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT03_BuatPromo/A_BasicFlow/TBP01_BP01_BuatPromoAktif/Page_Buat Promo  muatmuat/ChkBoxAllKecamatanDestinasi'))

WebUI.delay(1)

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT03_BuatPromo/A_BasicFlow/TBP01_BP01_BuatPromoAktif/Page_Buat Promo  muatmuat/BtnTerapkanKecamatanDestinasi'))

WebUI.delay(1)

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT03_BuatPromo/A_BasicFlow/TBP01_BP01_BuatPromoAktif/Page_Buat Promo  muatmuat/BtnSimpanLokasiDestinasi'))

WebUI.waitForJQueryLoad(60)

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT03_BuatPromo/A_BasicFlow/TBP01_BP01_BuatPromoAktif/Page_Buat Promo  muatmuat/BtnYaSimpanLokasiDestinasi'))

WebUI.waitForJQueryLoad(60)

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT03_BuatPromo/A_BasicFlow/TBP01_BP01_BuatPromoAktif/Page_Buat Promo  muatmuat/BtnCloseBerhasilSimpanLokasiDestinasi'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT03_BuatPromo/A_BasicFlow/TBP01_BP01_BuatPromoAktif/Page_Buat Promo  muatmuat/input_Harga Promo (Rp)_custom-input-form ju_7b75c9'), 
    '500.0000')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT03_BuatPromo/A_BasicFlow/TBP01_BP01_BuatPromoAktif/Page_Buat Promo  muatmuat/img_Periode Promo_datepicker1'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT03_BuatPromo/A_BasicFlow/TBP01_BP01_BuatPromoAktif/Page_Buat Promo  muatmuat/td_31'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT03_BuatPromo/A_BasicFlow/TBP01_BP01_BuatPromoAktif/Page_Buat Promo  muatmuat/img_sd_datepicker2'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT03_BuatPromo/A_BasicFlow/TBP01_BP01_BuatPromoAktif/Page_Buat Promo  muatmuat/td_31'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT03_BuatPromo/A_BasicFlow/TBP01_BP01_BuatPromoAktif/Page_Buat Promo  muatmuat/b_1_2'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT03_BuatPromo/A_BasicFlow/TBP01_BP01_BuatPromoAktif/Page_Buat Promo  muatmuat/textarea_(Opsional)_tarif'), 
    'Sudah termasuk PPN')

not_run: WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT03_BuatPromo/A_BasicFlow/TBP01_BP01_BuatPromoAktif/Page_Buat Promo  muatmuat/UploadFilePromo'))

WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT03_BuatPromo/A_BasicFlow/TBP01_BP01_BuatPromoAktif/Page_Buat Promo  muatmuat/UploadFilePromo'),
	'C://Users/USER/Downloads/12.jpg')

WebUI.delay(5)

WebUI.waitForJQueryLoad(60)

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT03_BuatPromo/A_BasicFlow/TBP01_BP01_BuatPromoAktif/Page_Buat Promo  muatmuat/button_Simpan_1_2'))

WebUI.waitForJQueryLoad(60)

