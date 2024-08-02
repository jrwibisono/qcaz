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

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_Seller/span_Layanan Iklan (1)'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_Seller/div_Transportasi Intermoda'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_Seller/span_Sea Freight'))

for (def row = 1; row <= findTestData('transportasi_intermoda_sea_freight').getRowNumbers(); row++) {
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/button_Pasang Iklan'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/input_Sisa Kuota_radio_pasang_ku'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/button_Gunakan'))
	
	WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/button_Upload'),
		findTestData('transportasi_intermoda_sea_freight').getValue(1, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/button_Crop'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/input__ff-medium fs-12'),
		findTestData('transportasi_intermoda_sea_freight').getValue(2, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/input_Website_ff-medium fs-12'),
		findTestData('transportasi_intermoda_sea_freight').getValue(3, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/span_Masukkan Tahun Berdiri'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/input_Crop_select2-search__field no-border'),
		findTestData('transportasi_intermoda_sea_freight').getValue(4, row))
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/selcted-year'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/input__FormatInteger'),
		findTestData('transportasi_intermoda_sea_freight').getValue(5, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/input__FormatInteger_1'),
		findTestData('transportasi_intermoda_sea_freight').getValue(6, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/div__unchecked-icon'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/div__unchecked-icon'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/textarea_text'),
		findTestData('transportasi_intermoda_sea_freight').getValue(7, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/textarea_text_1'),
		findTestData('transportasi_intermoda_sea_freight').getValue(8, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/textarea_text_1_2'),
		findTestData('transportasi_intermoda_sea_freight').getValue(9, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/input__no-border form-control dropdownGoogl_af628b'),
		findTestData('transportasi_intermoda_sea_freight').getValue(10, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/div_Kec. Gambir, Kota Jakarta Pusat'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/button_Atur Pin Lokasi'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/input_Alamat_searchBoxModalAddress0'),
		findTestData('transportasi_intermoda_sea_freight').getValue(11, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/div_Jakarta Pusat, Paya Bakung, Kabupaten D_8694f7'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/img'))
	
	WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/div_Upload File Sertifikat'),
		findTestData('transportasi_intermoda_sea_freight').getValue(12, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/button_Crop'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/input_Nama Pencapaian, Penghargaan, dan Ser_d3ca56'),
		findTestData('transportasi_intermoda_sea_freight').getValue(13, row))
	
	WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/div_Upload File Foto'),
		findTestData('transportasi_intermoda_sea_freight').getValue(14, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/button_Crop'))
	
	WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/input_caption-foto'),
		findTestData('transportasi_intermoda_sea_freight').getValue(15, row))
	
	WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/div_Upload File Video'),
		findTestData('transportasi_intermoda_sea_freight').getValue(16, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/input_Masukkan Caption_no-border fs-12 h-30 w-100'),
		findTestData('transportasi_intermoda_sea_freight').getValue(17, row))
	
	WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/div_Upload File Promo'),
		findTestData('transportasi_intermoda_sea_freight').getValue(18, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/button_Crop'))
	
	WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/input_judul-promo'),
		findTestData('transportasi_intermoda_sea_freight').getValue(19, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/textarea_Deskripsi_component-input-border l_97f996'),
		findTestData('transportasi_intermoda_sea_freight').getValue(20, row))
	
	WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/div_Upload File Katalog Brosur'),
		findTestData('transportasi_intermoda_sea_freight').getValue(21, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/button_Crop'))
	
	WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/input_caption-brosur'),
		findTestData('transportasi_intermoda_sea_freight').getValue(22, row))
	
	WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/div_Upload File Testimoni'),
		findTestData('transportasi_intermoda_sea_freight').getValue(23, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/button_Crop'))
	
	WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/input_testimoni-caption'),
		findTestData('transportasi_intermoda_sea_freight').getValue(24, row))
	
	not_run: WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/btn_unggah-iklan'))
	
	
}

