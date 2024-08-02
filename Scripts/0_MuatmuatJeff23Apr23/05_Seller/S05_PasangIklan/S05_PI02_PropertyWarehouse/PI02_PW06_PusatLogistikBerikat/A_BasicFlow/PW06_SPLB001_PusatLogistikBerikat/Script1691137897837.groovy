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

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW06_PusatLogistikBerikat/Page_Seller/span_Layanan Iklan (1)'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW06_PusatLogistikBerikat/Page_Seller/div_Property  Warehouse (1)'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW06_PusatLogistikBerikat/Page_Seller/span_Pusat Logistik Berikat'))

for (def row = 1; row <= findTestData('property_warehouse_pusat_logistik_berikat').getRowNumbers(); row++) {
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW06_PusatLogistikBerikat/Page_LayananIklan/button_Pasang Iklan'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW06_PusatLogistikBerikat/Page_LayananIklan/input_Sisa Kuota_radio_pasang_ku'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW06_PusatLogistikBerikat/Page_LayananIklan/button_Gunakan'))
	
	WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW06_PusatLogistikBerikat/Page_LayananIklan/button_Upload'),
		findTestData('property_warehouse_pusat_logistik_berikat').getValue(1, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW06_PusatLogistikBerikat/Page_LayananIklan/button_Crop'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW06_PusatLogistikBerikat/Page_LayananIklan/input__ff-medium fs-12'),
		findTestData('property_warehouse_pusat_logistik_berikat').getValue(2, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW06_PusatLogistikBerikat/Page_LayananIklan/input__ff-medium fs-12_1'),
		findTestData('property_warehouse_pusat_logistik_berikat').getValue(3, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW06_PusatLogistikBerikat/Page_LayananIklan/span_Masukkan Tahun Berdiri'))
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW06_PusatLogistikBerikat/Page_LayananIklan/tahun_berdiri_2017'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW06_PusatLogistikBerikat/Page_LayananIklan/input__no-border form-control dropdownGoogl_af628b'),
		findTestData('property_warehouse_pusat_logistik_berikat').getValue(4, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW06_PusatLogistikBerikat/Page_LayananIklan/div_Kec. Gambir, Kota Jakarta Pusat'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW06_PusatLogistikBerikat/Page_LayananIklan/textarea_text'),
		findTestData('property_warehouse_pusat_logistik_berikat').getValue(5, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW06_PusatLogistikBerikat/Page_LayananIklan/input__no-border form-control dropdownGoogl_af628b_1'),
		findTestData('property_warehouse_pusat_logistik_berikat').getValue(6, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW06_PusatLogistikBerikat/Page_LayananIklan/div_Kec. Gambir, Kota Jakarta Pusat'))
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW06_PusatLogistikBerikat/Page_LayananIklan/input_layanan_container-sales'))
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW06_PusatLogistikBerikat/Page_LayananIklan/input_mampu_busana'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW06_PusatLogistikBerikat/Page_LayananIklan/input__no-border form-control dropdownGoogl_af628b_1_2'),
		findTestData('property_warehouse_pusat_logistik_berikat').getValue(7, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW06_PusatLogistikBerikat/Page_LayananIklan/div_Kec. Gambir, Kota Jakarta Pusat'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW06_PusatLogistikBerikat/Page_LayananIklan/textarea_text_1'),
		findTestData('property_warehouse_pusat_logistik_berikat').getValue(8, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW06_PusatLogistikBerikat/Page_LayananIklan/input__no-border form-control dropdownGoogl_af628b_1_2_3'),
		findTestData('property_warehouse_pusat_logistik_berikat').getValue(9, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW06_PusatLogistikBerikat/Page_LayananIklan/div_Kec. Gambir, Kota Jakarta Pusat'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW06_PusatLogistikBerikat/Page_LayananIklan/button_Atur Pin Lokasi'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW06_PusatLogistikBerikat/Page_LayananIklan/input_Alamat_searchBoxModalAddress0'),
		findTestData('property_warehouse_pusat_logistik_berikat').getValue(10, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW06_PusatLogistikBerikat/Page_LayananIklan/div_Jalan K.H. Mas Mansyur No.121, RT.1RW.5_a28dd8'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW06_PusatLogistikBerikat/Page_LayananIklan/img'))
	
	WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW06_PusatLogistikBerikat/Page_LayananIklan/div_Upload File Sertifikat'),
		findTestData('property_warehouse_pusat_logistik_berikat').getValue(11, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW06_PusatLogistikBerikat/Page_LayananIklan/button_Crop'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW06_PusatLogistikBerikat/Page_LayananIklan/input_Nama Pencapaian, Penghargaan, dan Ser_d3ca56'),
		findTestData('property_warehouse_pusat_logistik_berikat').getValue(12, row))
	
	WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW06_PusatLogistikBerikat/Page_LayananIklan/div_Upload File Foto'),
		findTestData('property_warehouse_pusat_logistik_berikat').getValue(13, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW06_PusatLogistikBerikat/Page_LayananIklan/button_Crop'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW06_PusatLogistikBerikat/Page_LayananIklan/input__no-border fs-12 h-30 w-100'),
		findTestData('property_warehouse_pusat_logistik_berikat').getValue(14, row))
	
	WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW06_PusatLogistikBerikat/Page_LayananIklan/div_Upload File Video'),
		findTestData('property_warehouse_pusat_logistik_berikat').getValue(15, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW06_PusatLogistikBerikat/Page_LayananIklan/input__no-border fs-12 h-30 w-100'),
		findTestData('property_warehouse_pusat_logistik_berikat').getValue(16, row))
	
	WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW06_PusatLogistikBerikat/Page_LayananIklan/div_Upload File Promo'),
		findTestData('property_warehouse_pusat_logistik_berikat').getValue(17, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW06_PusatLogistikBerikat/Page_LayananIklan/button_Crop'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW06_PusatLogistikBerikat/Page_LayananIklan/input_Judul Promo_no-border fs-12'),
		findTestData('property_warehouse_pusat_logistik_berikat').getValue(18, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW06_PusatLogistikBerikat/Page_LayananIklan/textarea_Deskripsi_component-input-border l_97f996'),
		findTestData('property_warehouse_pusat_logistik_berikat').getValue(19, row))
	
	WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW06_PusatLogistikBerikat/Page_LayananIklan/div_Upload File Katalog Brosur'),
		findTestData('property_warehouse_pusat_logistik_berikat').getValue(20, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW06_PusatLogistikBerikat/Page_LayananIklan/button_Crop'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW06_PusatLogistikBerikat/Page_LayananIklan/input_Judul Katalog  Brosur_no-border fs-12'),
		findTestData('property_warehouse_pusat_logistik_berikat').getValue(21, row))
	
	WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW06_PusatLogistikBerikat/Page_LayananIklan/div_Upload File Testimoni'),
		findTestData('property_warehouse_pusat_logistik_berikat').getValue(22, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW06_PusatLogistikBerikat/Page_LayananIklan/button_Crop'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW06_PusatLogistikBerikat/Page_LayananIklan/input_Nama File_no-border fs-12 ff-medium'),
		findTestData('property_warehouse_pusat_logistik_berikat').getValue(23, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW06_PusatLogistikBerikat/Page_LayananIklan/button_Unggah Iklan'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW06_PusatLogistikBerikat/Page_LayananIklan/a_Kembali Ke Halaman Awal'))
	
	
}

