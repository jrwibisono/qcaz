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

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP02_PromoKabupatenKota/A_BasicFlow/Page_Seller/div_Places  Promo'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP02_PromoKabupatenKota/A_BasicFlow/Page_Seller/span_Promo KotaKabupaten'))

for (def row = 1; row <= findTestData('places_promo_promo_kota_kabupaten').getRowNumbers(); row++) {
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP02_PromoKabupatenKota/A_BasicFlow/Page_LayananIklan/button_Pasang Iklan'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP02_PromoKabupatenKota/A_BasicFlow/Page_LayananIklan/input_Sisa Kuota_radio_pasang_ku'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP02_PromoKabupatenKota/A_BasicFlow/Page_LayananIklan/button_Gunakan'))
	
	WebUI.waitForPageLoad(60)
	
	WebUI.waitForJQueryLoad(60)
	
	WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP02_PromoKabupatenKota/A_BasicFlow/Page_LayananIklan/InputJudulPromo'),
		findTestData('places_promo_promo_kota_kabupaten').getValue(1, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP02_PromoKabupatenKota/A_BasicFlow/Page_LayananIklan/span_Pilih Kategori'))
	
	WebUI.waitForJQueryLoad(60)
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP02_PromoKabupatenKota/A_BasicFlow/Page_LayananIklan/InputCariKategori'))
	
	WebUI.waitForJQueryLoad(60)
	
	WebUI.sendKeys(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP02_PromoKabupatenKota/A_BasicFlow/Page_LayananIklan/InputCariKategori'),
		Keys.chord(Keys.ENTER))
	
	WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP02_PromoKabupatenKota/A_BasicFlow/Page_LayananIklan/InputTanggalPeriodeMulai'),
		findTestData('places_promo_promo_kota_kabupaten').getValue(2, row))
	
	WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP02_PromoKabupatenKota/A_BasicFlow/Page_LayananIklan/InputTanggalPeriodeAkhir'),
		findTestData('places_promo_promo_kota_kabupaten').getValue(3, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP02_PromoKabupatenKota/A_BasicFlow/Page_LayananIklan/input__ff-medium fs-12_1'),
		findTestData('places_promo_promo_kota_kabupaten').getValue(4, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP02_PromoKabupatenKota/A_BasicFlow/Page_LayananIklan/input__ff-medium fs-12_1_2'),
		findTestData('places_promo_promo_kota_kabupaten').getValue(5, row))
	
	WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP02_PromoKabupatenKota/A_BasicFlow/Page_LayananIklan/UploadImg1'),
		findTestData('places_promo_promo_kota_kabupaten').getValue(6, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP02_PromoKabupatenKota/A_BasicFlow/Page_LayananIklan/button_Crop'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP02_PromoKabupatenKota/A_BasicFlow/Page_LayananIklan/input_Rp_FormatInteger'),
		findTestData('places_promo_promo_kota_kabupaten').getValue(7, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP02_PromoKabupatenKota/A_BasicFlow/Page_LayananIklan/input_Rp_FormatInteger_1'),
		findTestData('places_promo_promo_kota_kabupaten').getValue(8, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP02_PromoKabupatenKota/A_BasicFlow/Page_LayananIklan/div_Pasang IklanPlaces  Promo Promo KotaKab_0d2ca8'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP02_PromoKabupatenKota/A_BasicFlow/Page_LayananIklan/textarea_text'),
		findTestData('places_promo_promo_kota_kabupaten').getValue(9, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP02_PromoKabupatenKota/A_BasicFlow/Page_LayananIklan/input__no-border form-control dropdownGoogl_af628b'),
		findTestData('places_promo_promo_kota_kabupaten').getValue(10, row))
	
	WebUI.waitForJQueryLoad(60)
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP02_PromoKabupatenKota/A_BasicFlow/Page_LayananIklan/div_Kota Surabaya'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP02_PromoKabupatenKota/A_BasicFlow/Page_LayananIklan/button_Unggah Iklan'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP02_PromoKabupatenKota/A_BasicFlow/Page_LayananIklan/a_Kembali Ke Halaman Awal'))
	
	
}

