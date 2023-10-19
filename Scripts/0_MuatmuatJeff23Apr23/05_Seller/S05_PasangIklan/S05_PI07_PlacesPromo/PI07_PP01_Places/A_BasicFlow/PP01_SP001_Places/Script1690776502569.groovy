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

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_Seller/div_Places  Promo'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_Seller/span_Places'))

for (def row = 1; row <= findTestData('places_promo_places').getRowNumbers(); row++) {
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/button_Pasang Iklan'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/input_Sisa Kuota_radio_pasang_ku'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/button_Gunakan'))
	
	WebUI.waitForPageLoad(120)
	
	WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/UploadFotoLogoPerusahaan'),
		findTestData('places_promo_places').getValue(1, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/button_Crop'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/span_Pilih Kategori Iklan Anda'))
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/KategoriPlaces1'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/input_Alamat_ff-medium fs-12'),
		findTestData('places_promo_places').getValue(2, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/input_Website_ff-medium fs-12'),
		findTestData('places_promo_places').getValue(3, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/span_Masukkan Tahun Berdiri'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/input_Website_ff-medium fs-12'),
		findTestData('places_promo_places').getValue(4, row))
	
	WebUI.sendKeys(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/input_Crop_select2-search__field no-border'),
		Keys.chord(Keys.ENTER))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/textarea_text'),
		findTestData('places_promo_places').getValue(5, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/textarea_text_1'),
		findTestData('places_promo_places').getValue(6, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/textarea_text_1_2'),
		findTestData('places_promo_places').getValue(7, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/input__no-border form-control dropdownGoogl_af628b'),
		findTestData('places_promo_places').getValue(8, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/div_Kec. Seputih Surabaya, Kab. Lampung Tengah'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/button_Atur Pin Lokasi'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/input_Alamat_searchBoxModalAddress0'),
		findTestData('places_promo_places').getValue(9, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/div_Surabaya - Gempol Toll Road, Ketapang, _d147b5'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/img'))
	
	WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/UploadFileSertifikat'),
		findTestData('places_promo_places').getValue(10, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/button_Crop'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/input_Nama Pencapaian, Penghargaan, dan Ser_d3ca56'),
		findTestData('places_promo_places').getValue(11, row))
	
	WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/UploadFotoPlaces'),
		findTestData('places_promo_places').getValue(12, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/button_Crop'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/input_Masukkan Caption_no-border fs-12 h-30 w-100'),
		findTestData('places_promo_places').getValue(13, row))
	
	WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/UploadFileVideo'),
		findTestData('places_promo_places').getValue(14, row))
	
	WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/InputTextVideoPlaces'),
		findTestData('places_promo_places').getValue(15, row))
	
	WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/UploadFilePromo'),
		findTestData('places_promo_places').getValue(16, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/button_Crop'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/input__no-border fs-12'),
		findTestData('places_promo_places').getValue(17, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/textarea_Deskripsi_component-input-border l_97f996'),
		findTestData('places_promo_places').getValue(18, row))
	
	WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/UploadFileBrosur'),
		findTestData('places_promo_places').getValue(19, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/button_Crop'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/input__no-border fs-12_1'),
		findTestData('places_promo_places').getValue(20, row))
	
	WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/UploadFileTestimoni'),
		findTestData('places_promo_places').getValue(21, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/button_Crop'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/input_Nama File_no-border fs-12 ff-medium'),
		findTestData('places_promo_places').getValue(22, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/button_Unggah Iklan'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/a_Kembali Ke Halaman Awal'))
	
	
}

