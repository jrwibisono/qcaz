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

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI05_IT06_35PL/Page_Seller/span_Layanan Iklan (1)'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI05_IT06_35PL/Page_Seller/div_Transportasi Intermoda'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI05_IT06_35PL/Page_Seller/a_3 - 5 PL Company0 Aktif0 Moderasi'))

for (def row = 1; row <= findTestData('transportasi_intermoda_3-5PL').getRowNumbers(); row++) {
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI05_IT06_35PL/Page_LayananIklan/button_Pasang Iklan'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI05_IT06_35PL/Page_LayananIklan/input_Sisa Kuota_radio_pasang_ku'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI05_IT06_35PL/Page_LayananIklan/button_Gunakan'))
	
	WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI05_IT06_35PL/Page_LayananIklan/button_Upload'),
		findTestData('transportasi_intermoda_3-5PL').getValue(1, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI05_IT06_35PL/Page_LayananIklan/button_Crop'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI05_IT06_35PL/Page_LayananIklan/input__ff-medium fs-12'),
		findTestData('transportasi_intermoda_3-5PL').getValue(2, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI05_IT06_35PL/Page_LayananIklan/input_Website_ff-medium fs-12'),
		findTestData('transportasi_intermoda_3-5PL').getValue(3, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI05_IT06_35PL/Page_LayananIklan/span_Masukkan Tahun Berdiri'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI05_IT06_35PL/Page_LayananIklan/input_Crop_select2-search__field no-border'),
		findTestData('transportasi_intermoda_3-5PL').getValue(4, row))
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI05_IT06_35PL/Page_LayananIklan/li_tahun-dipilih'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI05_IT06_35PL/Page_LayananIklan/span_Masukkan Tingkat Layanan'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI05_IT06_35PL/Page_LayananIklan/input_Crop_select2-search__field no-border'),
		findTestData('transportasi_intermoda_3-5PL').getValue(5, row))
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI05_IT06_35PL/Page_LayananIklan/li_tingkat-dipilih'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI05_IT06_35PL/Page_LayananIklan/div_Layanan_trucking-service'))
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI05_IT06_35PL/Page_LayananIklan/div_Layanan_international'))
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI05_IT06_35PL/Page_LayananIklan/div_Layanan_docks-service'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI05_IT06_35PL/Page_LayananIklan/div_Docks Service_unchecked-icon'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI05_IT06_35PL/Page_LayananIklan/textarea_Lainnya_CBLainnyaField component-i_347356'),
		findTestData('transportasi_intermoda_3-5PL').getValue(6, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI05_IT06_35PL/Page_LayananIklan/textarea_text'),
		findTestData('transportasi_intermoda_3-5PL').getValue(7, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI05_IT06_35PL/Page_LayananIklan/textarea_text_1'),
		findTestData('transportasi_intermoda_3-5PL').getValue(8, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI05_IT06_35PL/Page_LayananIklan/input__no-border form-control dropdownGoogl_af628b'),
		findTestData('transportasi_intermoda_3-5PL').getValue(9, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI05_IT06_35PL/Page_LayananIklan/div_Kec. Kenjeran, Kota Surabaya'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI05_IT06_35PL/Page_LayananIklan/button_Atur Pin Lokasi'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI05_IT06_35PL/Page_LayananIklan/input_Alamat_searchBoxModalAddress0'),
		findTestData('transportasi_intermoda_3-5PL').getValue(10, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI05_IT06_35PL/Page_LayananIklan/div_Kenjeran Permai, Kalijudan, Surabaya, J_af05e8'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI05_IT06_35PL/Page_LayananIklan/img'))
	
	WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI05_IT06_35PL/Page_LayananIklan/div_Upload File Sertifikat'),
		findTestData('transportasi_intermoda_3-5PL').getValue(11, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI05_IT06_35PL/Page_LayananIklan/button_Crop'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI05_IT06_35PL/Page_LayananIklan/input_Nama Pencapaian, Penghargaan, dan Ser_d3ca56'),
		findTestData('transportasi_intermoda_3-5PL').getValue(12, row))
	
	WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI05_IT06_35PL/Page_LayananIklan/div_Upload File Foto'),
		findTestData('transportasi_intermoda_3-5PL').getValue(13, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI05_IT06_35PL/Page_LayananIklan/button_Crop'))
	
	WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI05_IT06_35PL/Page_LayananIklan/input_caption-foto'),
		findTestData('transportasi_intermoda_3-5PL').getValue(14, row))
	
	WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI05_IT06_35PL/Page_LayananIklan/div_Upload File Video'),
		findTestData('transportasi_intermoda_3-5PL').getValue(15, row))
	
	WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI05_IT06_35PL/Page_LayananIklan/input_caption-video'),
		findTestData('transportasi_intermoda_3-5PL').getValue(16, row))
	
	WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI05_IT06_35PL/Page_LayananIklan/div_Upload File Promo'),
		findTestData('transportasi_intermoda_3-5PL').getValue(17, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI05_IT06_35PL/Page_LayananIklan/button_Crop'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI05_IT06_35PL/Page_LayananIklan/input_Judul Promo_no-border fs-12'),
		findTestData('transportasi_intermoda_3-5PL').getValue(18, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI05_IT06_35PL/Page_LayananIklan/textarea_Deskripsi_component-input-border l_97f996'),
		findTestData('transportasi_intermoda_3-5PL').getValue(19, row))
	
	WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI05_IT06_35PL/Page_LayananIklan/div_Upload File Katalog Brosur'),
		findTestData('transportasi_intermoda_3-5PL').getValue(20, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI05_IT06_35PL/Page_LayananIklan/button_Crop'))
	
	WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI05_IT06_35PL/Page_LayananIklan/input_caption-brosur'),
		findTestData('transportasi_intermoda_3-5PL').getValue(21, row))
	
	WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI05_IT06_35PL/Page_LayananIklan/div_Upload File Testimoni'),
		findTestData('transportasi_intermoda_3-5PL').getValue(22, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI05_IT06_35PL/Page_LayananIklan/button_Crop'))
	
	WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI05_IT06_35PL/Page_LayananIklan/input_caption-testimoni'),
		findTestData('transportasi_intermoda_3-5PL').getValue(23, row))
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI05_IT06_35PL/Page_LayananIklan/btn_unggah-iklan'))
	
	WebUI.waitForJQueryLoad(60)
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI05_IT06_35PL/Page_LayananIklan/btn_kembali-halaman-awal'))
	
	
}

