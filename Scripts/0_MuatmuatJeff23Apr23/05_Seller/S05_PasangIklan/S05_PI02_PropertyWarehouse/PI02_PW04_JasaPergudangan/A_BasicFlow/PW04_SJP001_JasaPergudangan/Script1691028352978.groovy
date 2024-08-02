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

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_JasaPergudangan/Page_Seller/span_Layanan Iklan (1)'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_JasaPergudangan/Page_Seller/div_Property  Warehouse (1)'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_JasaPergudangan/Page_Seller/span_Jasa Pergudangan'))

for (def row = 1; row <= findTestData('property_warehouse_jasa_pergudangan').getRowNumbers(); row++) {
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_JasaPergudangan/Page_LayananIklan/button_Pasang Iklan'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_JasaPergudangan/Page_LayananIklan/input_Sisa Kuota_radio_pasang_ku'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_JasaPergudangan/Page_LayananIklan/button_Gunakan'))
	
	WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_JasaPergudangan/Page_LayananIklan/button_Upload'),
		findTestData('property_warehouse_jasa_pergudangan').getValue(1, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_JasaPergudangan/Page_LayananIklan/button_Crop'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_JasaPergudangan/Page_LayananIklan/input__ff-medium fs-12'),
		findTestData('property_warehouse_jasa_pergudangan').getValue(2, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_JasaPergudangan/Page_LayananIklan/input_Website_ff-medium fs-12'),
		findTestData('property_warehouse_jasa_pergudangan').getValue(3, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_JasaPergudangan/Page_LayananIklan/span_Masukkan Tahun Berdiri'))
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_JasaPergudangan/Page_LayananIklan/tahun_berdiri_2017'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_JasaPergudangan/Page_LayananIklan/input__no-border form-control dropdownGoogl_af628b'),
		findTestData('property_warehouse_jasa_pergudangan').getValue(4, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_JasaPergudangan/Page_LayananIklan/div_Kec. Gambir, Kota Jakarta Pusat'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_JasaPergudangan/Page_LayananIklan/textarea_text'),
		findTestData('property_warehouse_jasa_pergudangan').getValue(5, row))
	
	WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_JasaPergudangan/Page_LayananIklan/kota_layanan_input'),
		findTestData('property_warehouse_jasa_pergudangan').getValue(6, row))
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_JasaPergudangan/Page_LayananIklan/kota_layanan_opsi1'))
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_JasaPergudangan/Page_LayananIklan/checkbox_layanan_crane'))
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_JasaPergudangan/Page_LayananIklan/checkbox_layanan_cross-docking'))
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_JasaPergudangan/Page_LayananIklan/checkbox_layanan_dock-high-doors'))
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_JasaPergudangan/Page_LayananIklan/checkbox_layanan_e-commerce-fulfilment'))
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_JasaPergudangan/Page_LayananIklan/checkbox_layanan_forklift'))
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_JasaPergudangan/Page_LayananIklan/checkbox_layanan_level-ground'))
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_JasaPergudangan/Page_LayananIklan/checkbox_layanan_outsourcing-warehouse-management'))
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_JasaPergudangan/Page_LayananIklan/checkbox_layanan_pallet-handling'))
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_JasaPergudangan/Page_LayananIklan/checkbox_layanan_temperature-controlled'))
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_JasaPergudangan/Page_LayananIklan/checkbox_layanan_wms-software'))
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_JasaPergudangan/Page_LayananIklan/checkbox_special_food-grade'))
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_JasaPergudangan/Page_LayananIklan/checkbox_special_cold-storage'))
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_JasaPergudangan/Page_LayananIklan/checkbox_special_alcohol-certified'))
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_JasaPergudangan/Page_LayananIklan/checkbox_special_hazmat'))
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_JasaPergudangan/Page_LayananIklan/checkbox_special_organic-matter'))
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_JasaPergudangan/Page_LayananIklan/checkbox_special_lainnya'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_JasaPergudangan/Page_LayananIklan/textarea_Lainnya_CBLainnyaField component-i_347356'),
		findTestData('property_warehouse_jasa_pergudangan').getValue(7, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_JasaPergudangan/Page_LayananIklan/textarea_text_1'),
		findTestData('property_warehouse_jasa_pergudangan').getValue(8, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_JasaPergudangan/Page_LayananIklan/textarea_text_1_2'),
		findTestData('property_warehouse_jasa_pergudangan').getValue(9, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_JasaPergudangan/Page_LayananIklan/input__no-border form-control dropdownGoogl_af628b_1_2'),
		findTestData('property_warehouse_jasa_pergudangan').getValue(10, row))
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_JasaPergudangan/Page_LayananIklan/lokasi_iklan_opsi1'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_JasaPergudangan/Page_LayananIklan/button_Atur Pin Lokasi'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_JasaPergudangan/Page_LayananIklan/input_Alamat_searchBoxModalAddress0'),
		findTestData('property_warehouse_jasa_pergudangan').getValue(11, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_JasaPergudangan/Page_LayananIklan/div_Jalan K.H. Mas Mansyur No.121, RT.1RW.5_a28dd8'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_JasaPergudangan/Page_LayananIklan/img'))
	
	WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_JasaPergudangan/Page_LayananIklan/div_Upload File Sertifikat'),
		findTestData('property_warehouse_jasa_pergudangan').getValue(12, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_JasaPergudangan/Page_LayananIklan/button_Crop'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_JasaPergudangan/Page_LayananIklan/input_Nama Pencapaian, Penghargaan, dan Ser_d3ca56'),
		findTestData('property_warehouse_jasa_pergudangan').getValue(13, row))
	
	WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_JasaPergudangan/Page_LayananIklan/div_Upload File Foto'),
		findTestData('property_warehouse_jasa_pergudangan').getValue(14, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_JasaPergudangan/Page_LayananIklan/button_Crop'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_JasaPergudangan/Page_LayananIklan/input__no-border fs-12 h-30 w-100'),
		findTestData('property_warehouse_jasa_pergudangan').getValue(15, row))
	
	WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_JasaPergudangan/Page_LayananIklan/div_Upload File Video'),
		findTestData('property_warehouse_jasa_pergudangan').getValue(16, row))
	
	WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_JasaPergudangan/Page_LayananIklan/input_caption_video'),
		findTestData('property_warehouse_jasa_pergudangan').getValue(17, row))
	
	WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_JasaPergudangan/Page_LayananIklan/div_Upload File Promo'),
		findTestData('property_warehouse_jasa_pergudangan').getValue(18, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_JasaPergudangan/Page_LayananIklan/button_Crop'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_JasaPergudangan/Page_LayananIklan/input_Judul Promo_no-border fs-12'),
		findTestData('property_warehouse_jasa_pergudangan').getValue(19, row))
	
	WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_JasaPergudangan/Page_LayananIklan/input_promo_deskripsi'),
		findTestData('property_warehouse_jasa_pergudangan').getValue(20, row))
	
	WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_JasaPergudangan/Page_LayananIklan/div_Upload File Katalog Brosur'),
		findTestData('property_warehouse_jasa_pergudangan').getValue(21, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_JasaPergudangan/Page_LayananIklan/button_Crop'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_JasaPergudangan/Page_LayananIklan/input_Judul Katalog  Brosur_no-border fs-12'),
		findTestData('property_warehouse_jasa_pergudangan').getValue(22, row))
	
	WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_JasaPergudangan/Page_LayananIklan/div_Upload File Testimoni'),
		findTestData('property_warehouse_jasa_pergudangan').getValue(23, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_JasaPergudangan/Page_LayananIklan/button_Crop'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_JasaPergudangan/Page_LayananIklan/input_Nama File_no-border fs-12 ff-medium'),
		findTestData('property_warehouse_jasa_pergudangan').getValue(24, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_JasaPergudangan/Page_LayananIklan/button_Unggah Iklan'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_JasaPergudangan/Page_LayananIklan/a_Kembali Ke Halaman Awal'))
	
	
}

