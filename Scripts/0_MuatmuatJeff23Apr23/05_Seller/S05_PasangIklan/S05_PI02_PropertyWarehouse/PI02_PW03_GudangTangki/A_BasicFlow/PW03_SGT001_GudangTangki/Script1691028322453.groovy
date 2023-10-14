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

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_Seller/span_Layanan Iklan (1)'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_Seller/div_Property  Warehouse (1)'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_Seller/span_Gudang Barang Cair'))

for (def row = 1; row <= findTestData('property_warehouse_gudang_barang_cair').getRowNumbers(); row++) {
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/button_Pasang Iklan'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/input_Sisa Kuota_radio_pasang_ku'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/button_Gunakan'))
	
	WebUI.delay(2)
	
	WebUI.waitForPageLoad(60)
	
	WebUI.waitForJQueryLoad(60)
	
	WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/UploadFotoPerusahaanGudangCair'),
		findTestData('property_warehouse_gudang_barang_cair').getValue(1, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/button_Crop'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/input__ff-medium fs-12'),
		findTestData('property_warehouse_gudang_barang_cair').getValue(2, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/input_Website_ff-medium fs-12'),
		findTestData('property_warehouse_gudang_barang_cair').getValue(3, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/span_Tahun Berdiri'))
	
	WebUI.waitForJQueryLoad(60)
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/OpsiTahunBerdiri1970GudangCair'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/input__no-border form-control dropdownGoogl_af628b'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/input__no-border form-control dropdownGoogl_af628b'),
		findTestData('property_warehouse_gudang_barang_cair').getValue(4, row))
	
	WebUI.waitForJQueryLoad(60)
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/div_Kota Surabaya'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/textarea_text'),
		findTestData('property_warehouse_gudang_barang_cair').getValue(5, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/input__ff-medium fs-12_1'),
		findTestData('property_warehouse_gudang_barang_cair').getValue(6, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/div__unchecked-icon'))
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/ChkBoxBahanKimiaGudCair'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/span_Tipe Tangki'))
	
	WebUI.waitForJQueryLoad(60)
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/OpsiCoatedMildSteelGudCair'))
	
	WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/InputJumlahTangkiGudCair'),
		findTestData('property_warehouse_gudang_barang_cair').getValue(7, row))
	
	WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/InputCbmGudCair'),
		findTestData('property_warehouse_gudang_barang_cair').getValue(8, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/textarea_text_1'),
		findTestData('property_warehouse_gudang_barang_cair').getValue(9, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/textarea_text_1_2'),
		findTestData('property_warehouse_gudang_barang_cair').getValue(10, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/input__no-border form-control dropdownGoogl_af628b_1'),
		findTestData('property_warehouse_gudang_barang_cair').getValue(11, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/div_Kec. Seputih Surabaya, Kab. Lampung Tengah'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/button_Atur Pin Lokasi'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/input_Alamat_searchBoxModalAddress0'),
		findTestData('property_warehouse_gudang_barang_cair').getValue(12, row))
	
	WebUI.waitForJQueryLoad(60)
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/div_Surabaya - Gempol Toll Road, Ketapang, _d147b5'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/img'))
	
	WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/UploadFileSertifikatGudangCair'),
		findTestData('property_warehouse_gudang_barang_cair').getValue(13, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/button_Crop'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/input__no-border fs-12'),
		findTestData('property_warehouse_gudang_barang_cair').getValue(14, row))
	
	WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/UploadGaleriFotoGudangCair'),
		findTestData('property_warehouse_gudang_barang_cair').getValue(15, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/button_Crop'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/input__no-border fs-12 h-30 w-100'),
		findTestData('property_warehouse_gudang_barang_cair').getValue(16, row))
	
	WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/UploadVideoGudangCair'),
		findTestData('property_warehouse_gudang_barang_cair').getValue(17, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/input__no-border fs-12 h-30 w-100'),
		findTestData('property_warehouse_gudang_barang_cair').getValue(18, row))
	
	WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/InputTextKeteranganVideo1'),
		findTestData('property_warehouse_gudang_barang_cair').getValue(19, row))
	
	WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/UploadFilePromoGudangCair'),
		findTestData('property_warehouse_gudang_barang_cair').getValue(20, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/button_Crop'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/input__no-border fs-12_1'),
		findTestData('property_warehouse_gudang_barang_cair').getValue(21, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/textarea__component-input-border lh-normal _d99f6c'),
		findTestData('property_warehouse_gudang_barang_cair').getValue(22, row))
	
	WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/UploadFileKatalogBrosurGudangCair'),
		findTestData('property_warehouse_gudang_barang_cair').getValue(23, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/button_Crop'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/input__no-border fs-12_1_2'),
		findTestData('property_warehouse_gudang_barang_cair').getValue(24, row))
	
	WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/UploadFileTestimoniGudangCair'),
		findTestData('property_warehouse_gudang_barang_cair').getValue(25, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/button_Crop'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/input_Nama File_no-border fs-12 ff-medium'),
		findTestData('property_warehouse_gudang_barang_cair').getValue(26, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/button_Unggah Iklan'))
	
	WebUI.waitForJQueryLoad(60)
	
	WebUI.delay(2)
	
	WebUI.waitForPageLoad(60)
	
	WebUI.waitForJQueryLoad(60)
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/a_Kembali Ke Halaman Awal'))
	
	
}

