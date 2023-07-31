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

WebUI.callTestCase(findTestCase('0_MuatmuatJeff23Apr23/00_RegisLogin/RL01_Login/RL01_A_BasicFlow/RL01_L007_LoginSeller'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForJQueryLoad(60)

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP03_PromoNasional/A_BasicFlow/Page_Seller/div_Places  Promo'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP03_PromoNasional/A_BasicFlow/Page_Seller/span_Promo Nasional'))

not_run: WebUI.navigateToUrl('https://iklanqc.assetlogistik.com/layananiklan/iklanDashboard?SubKategoriID=51&KategoriID=55&sub_text=Promo%20Nasional&layanan_text=Places%20%26%20Promo')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP03_PromoNasional/A_BasicFlow/Page_LayananIklan/button_Pasang Iklan'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP03_PromoNasional/A_BasicFlow/Page_LayananIklan/input_Sisa Kuota_radio_pasang_ku'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP03_PromoNasional/A_BasicFlow/Page_LayananIklan/button_Gunakan'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP03_PromoNasional/A_BasicFlow/Page_LayananIklan/input__ff-medium fs-12'), 
    'Promo Nasional Akhir Juli 3')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP03_PromoNasional/A_BasicFlow/Page_LayananIklan/span_Pilih Kategori'))

WebUI.delay(1)

WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP03_PromoNasional/A_BasicFlow/Page_LayananIklan/InputSearchKategoriPromo'), 
    '')

WebUI.waitForJQueryLoad(60)

WebUI.sendKeys(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP03_PromoNasional/A_BasicFlow/Page_LayananIklan/InputSearchKategoriPromo'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP03_PromoNasional/A_BasicFlow/Page_LayananIklan/InputPeriodeMulai'), 
    '07312023')

WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP03_PromoNasional/A_BasicFlow/Page_LayananIklan/InputPeriodeBerakhir'), 
    '08312023')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP03_PromoNasional/A_BasicFlow/Page_LayananIklan/input__ff-medium fs-12_1'), 
    'Kedungdoro 101, Surabaya, Jawa Timur')

WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP03_PromoNasional/A_BasicFlow/Page_LayananIklan/UploadImg1'), 
    'C://Users/USER/Downloads/RestAreaNgawi.jpeg')

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP03_PromoNasional/A_BasicFlow/Page_LayananIklan/div_Unggah File Foto Promo'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP03_PromoNasional/A_BasicFlow/Page_LayananIklan/button_Crop'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP03_PromoNasional/A_BasicFlow/Page_LayananIklan/input_Rp_FormatInteger'), 
    '5000000')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP03_PromoNasional/A_BasicFlow/Page_LayananIklan/input_Rp_FormatInteger_1'), 
    '2000000')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP03_PromoNasional/A_BasicFlow/Page_LayananIklan/textarea_text'), 
    'Diskon besar akhir bulan Juli!')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP03_PromoNasional/A_BasicFlow/Page_LayananIklan/input__no-border form-control dropdownGoogl_af628b'), 
    'Surabaya')

WebUI.waitForJQueryLoad(60)

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP03_PromoNasional/A_BasicFlow/Page_LayananIklan/OpsiArea1'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP03_PromoNasional/A_BasicFlow/Page_LayananIklan/button_Unggah Iklan'))

WebUI.waitForJQueryLoad(60)

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP03_PromoNasional/A_BasicFlow/Page_LayananIklan/a_Kembali Ke Halaman Awal'))

