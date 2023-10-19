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

WebUI.delay(2)

WebUI.waitForPageLoad(60)

WebUI.waitForJQueryLoad(60)

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI06_DealerKaroseri/PI06_DK03_Karoseri/Page_Seller/span_Layanan Iklan (1)'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI06_DealerKaroseri/PI06_DK03_Karoseri/Page_Seller/div_Dealer Truk  Karoseri'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI06_DealerKaroseri/PI06_DK03_Karoseri/Page_Seller/span_Perusahaan Karoseri'))

for (def row = 1; row <= findTestData('dealer_karoseri_karoseri').getRowNumbers(); row++) {
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI06_DealerKaroseri/PI06_DK03_Karoseri/Page_LayananIklan/button_Pasang Iklan'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI06_DealerKaroseri/PI06_DK03_Karoseri/Page_LayananIklan/input_Sisa Kuota_radio_pasang_ku'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI06_DealerKaroseri/PI06_DK03_Karoseri/Page_LayananIklan/button_Gunakan'))
	
	WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI06_DealerKaroseri/PI06_DK03_Karoseri/Page_LayananIklan/button_Upload'),
		findTestData('dealer_karoseri_karoseri').getValue(1, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI06_DealerKaroseri/PI06_DK03_Karoseri/Page_LayananIklan/button_Crop'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI06_DealerKaroseri/PI06_DK03_Karoseri/Page_LayananIklan/input__ff-medium fs-12'),
		findTestData('dealer_karoseri_karoseri').getValue(2, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI06_DealerKaroseri/PI06_DK03_Karoseri/Page_LayananIklan/input_Website_ff-medium fs-12'),
		findTestData('dealer_karoseri_karoseri').getValue(3, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI06_DealerKaroseri/PI06_DK03_Karoseri/Page_LayananIklan/span_Masukkan Tahun Berdiri'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI06_DealerKaroseri/PI06_DK03_Karoseri/Page_LayananIklan/input_Crop_select2-search__field no-border'),
		findTestData('dealer_karoseri_karoseri').getValue(4, row))
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI06_DealerKaroseri/PI06_DK03_Karoseri/Page_LayananIklan/li_tahun-dipilih'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI06_DealerKaroseri/PI06_DK03_Karoseri/Page_LayananIklan/textarea_text'),
		findTestData('dealer_karoseri_karoseri').getValue(5, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI06_DealerKaroseri/PI06_DK03_Karoseri/Page_LayananIklan/div__unchecked-icon'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI06_DealerKaroseri/PI06_DK03_Karoseri/Page_LayananIklan/div__unchecked-icon'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI06_DealerKaroseri/PI06_DK03_Karoseri/Page_LayananIklan/div__unchecked-icon'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI06_DealerKaroseri/PI06_DK03_Karoseri/Page_LayananIklan/div__unchecked-icon'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI06_DealerKaroseri/PI06_DK03_Karoseri/Page_LayananIklan/div_Skeletal_unchecked-icon'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI06_DealerKaroseri/PI06_DK03_Karoseri/Page_LayananIklan/textarea_Lainnya_CBLainnyaField component-i_347356'),
		findTestData('dealer_karoseri_karoseri').getValue(6, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI06_DealerKaroseri/PI06_DK03_Karoseri/Page_LayananIklan/textarea_text_1'),
		findTestData('dealer_karoseri_karoseri').getValue(7, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI06_DealerKaroseri/PI06_DK03_Karoseri/Page_LayananIklan/textarea_text_1_2'),
		findTestData('dealer_karoseri_karoseri').getValue(8, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI06_DealerKaroseri/PI06_DK03_Karoseri/Page_LayananIklan/input__no-border form-control dropdownGoogl_af628b'),
		findTestData('dealer_karoseri_karoseri').getValue(9, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI06_DealerKaroseri/PI06_DK03_Karoseri/Page_LayananIklan/div_Kec. Kenjeran, Kota Surabaya'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI06_DealerKaroseri/PI06_DK03_Karoseri/Page_LayananIklan/button_Atur Pin Lokasi'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI06_DealerKaroseri/PI06_DK03_Karoseri/Page_LayananIklan/input_Alamat_searchBoxModalAddress0'),
		findTestData('dealer_karoseri_karoseri').getValue(10, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI06_DealerKaroseri/PI06_DK03_Karoseri/Page_LayananIklan/div_Kenjeran Permai, Kalijudan, Surabaya, J_af05e8'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI06_DealerKaroseri/PI06_DK03_Karoseri/Page_LayananIklan/img'))
	
	WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI06_DealerKaroseri/PI06_DK03_Karoseri/Page_LayananIklan/div_Upload File Sertifikat'),
		findTestData('dealer_karoseri_karoseri').getValue(11, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI06_DealerKaroseri/PI06_DK03_Karoseri/Page_LayananIklan/button_Crop'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI06_DealerKaroseri/PI06_DK03_Karoseri/Page_LayananIklan/input_Nama Pencapaian, Penghargaan, dan Ser_d3ca56'),
		findTestData('dealer_karoseri_karoseri').getValue(12, row))
	
	WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI06_DealerKaroseri/PI06_DK03_Karoseri/Page_LayananIklan/div_Upload File Foto'),
		findTestData('dealer_karoseri_karoseri').getValue(13, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI06_DealerKaroseri/PI06_DK03_Karoseri/Page_LayananIklan/button_Crop'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI06_DealerKaroseri/PI06_DK03_Karoseri/Page_LayananIklan/input__no-border fs-12 h-30 w-100'),
		findTestData('dealer_karoseri_karoseri').getValue(14, row))
	
	WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI06_DealerKaroseri/PI06_DK03_Karoseri/Page_LayananIklan/div_Upload File Video'),
		findTestData('dealer_karoseri_karoseri').getValue(15, row))
	
	WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI06_DealerKaroseri/PI06_DK03_Karoseri/Page_LayananIklan/input_caption-video'),
		findTestData('dealer_karoseri_karoseri').getValue(16, row))
	
	WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI06_DealerKaroseri/PI06_DK03_Karoseri/Page_LayananIklan/div_Upload File Promo'),
		findTestData('dealer_karoseri_karoseri').getValue(17, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI06_DealerKaroseri/PI06_DK03_Karoseri/Page_LayananIklan/button_Crop'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI06_DealerKaroseri/PI06_DK03_Karoseri/Page_LayananIklan/input_Judul Promo_no-border fs-12'),
		findTestData('dealer_karoseri_karoseri').getValue(18, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI06_DealerKaroseri/PI06_DK03_Karoseri/Page_LayananIklan/textarea_Deskripsi_component-input-border l_97f996'),
		findTestData('dealer_karoseri_karoseri').getValue(19, row))
	
	WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI06_DealerKaroseri/PI06_DK03_Karoseri/Page_LayananIklan/div_Upload File Katalog Brosur'),
		findTestData('dealer_karoseri_karoseri').getValue(20, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI06_DealerKaroseri/PI06_DK03_Karoseri/Page_LayananIklan/button_Crop'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI06_DealerKaroseri/PI06_DK03_Karoseri/Page_LayananIklan/input_Judul Katalog  Brosur_no-border fs-12'),
		findTestData('dealer_karoseri_karoseri').getValue(21, row))
	
	WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI06_DealerKaroseri/PI06_DK03_Karoseri/Page_LayananIklan/div_Upload File Testimoni'),
		findTestData('dealer_karoseri_karoseri').getValue(22, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI06_DealerKaroseri/PI06_DK03_Karoseri/Page_LayananIklan/button_Crop'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI06_DealerKaroseri/PI06_DK03_Karoseri/Page_LayananIklan/input_Nama File_no-border fs-12 ff-medium'),
		findTestData('dealer_karoseri_karoseri').getValue(23, row))
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI06_DealerKaroseri/PI06_DK03_Karoseri/Page_LayananIklan/btn_unggah_iklan'))
	
	WebUI.waitForJQueryLoad(60)
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI06_DealerKaroseri/PI06_DK03_Karoseri/Page_LayananIklan/btn_kembali_halaman_awal'))
	
	
}

