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

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_Seller/div_Transportation Store'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_Seller/span_Toko Suku Cadang'))

for (def row = 1; row <= findTestData('transportation_store_toko_suku_cadang').getRowNumbers(); row++) {
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/button_Pasang Iklan'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/input_Sisa Kuota_radio_pasang_ku'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/button_Gunakan'))
	
	WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/UploadFotoPerusahaanTSC'),
		findTestData('transportation_store_toko_suku_cadang').getValue(1, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/button_Crop'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/input__ff-medium fs-12'),
		findTestData('transportation_store_toko_suku_cadang').getValue(2, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/input__ff-medium fs-12_1'),
		findTestData('transportation_store_toko_suku_cadang').getValue(3, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/span_Masukan TahunBerdiri'))
	
	WebUI.delay(1)
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/OpsiTahunTokoSukuCadang1'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/textarea_text'),
		findTestData('transportation_store_toko_suku_cadang').getValue(4, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/div__unchecked-icon'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/textarea_text_1'),
		findTestData('transportation_store_toko_suku_cadang').getValue(5, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/textarea_text_1_2'),
		findTestData('transportation_store_toko_suku_cadang').getValue(6, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/input__no-border form-control dropdownGoogl_af628b'),
		findTestData('transportation_store_toko_suku_cadang').getValue(7, row))
	
	WebUI.delay(1)
	
	WebUI.waitForJQueryLoad(60)
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/div_Kec. Seputih Surabaya, Kab. Lampung Tengah'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/button_Atur Pin Lokasi'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/input_Alamat_searchBoxModalAddress0'),
		findTestData('transportation_store_toko_suku_cadang').getValue(8, row))
	
	WebUI.delay(1)
	
	WebUI.waitForJQueryLoad(60)
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/div_Surabaya - Gempol Toll Road, Ketapang, _d147b5'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/img'))
	
	WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/UploadFileSertifikatTSC'),
		findTestData('transportation_store_toko_suku_cadang').getValue(9, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/button_Crop'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/input_Nama Pencapaian, Penghargaan, dan Ser_d3ca56'),
		findTestData('transportation_store_toko_suku_cadang').getValue(10, row))
	
	WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/UploadFotoTSC'),
		findTestData('transportation_store_toko_suku_cadang').getValue(11, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/button_Crop'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/input_Masukkan Caption_no-border fs-12 h-30 w-100'),
		findTestData('transportation_store_toko_suku_cadang').getValue(12, row))
	
	WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/UploadVideoTSC'),
		findTestData('transportation_store_toko_suku_cadang').getValue(13, row))
	
	WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/InputCaptionVideoTSC'),
		findTestData('transportation_store_toko_suku_cadang').getValue(14, row))
	
	WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/UploadFilePromoTSC1'),
		findTestData('transportation_store_toko_suku_cadang').getValue(15, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/button_Crop'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/input_Judul Promo_no-border fs-12'),
		findTestData('transportation_store_toko_suku_cadang').getValue(16, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/textarea_Deskripsi_component-input-border l_97f996'),
		findTestData('transportation_store_toko_suku_cadang').getValue(17, row))
	
	WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/UploadKatalogBrosur1'),
		findTestData('transportation_store_toko_suku_cadang').getValue(18, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/button_Crop'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/input_Judul Katalog  Brosur_no-border fs-12'),
		findTestData('transportation_store_toko_suku_cadang').getValue(19, row))
	
	WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/UploadFileTestimoniTSC1'),
		findTestData('transportation_store_toko_suku_cadang').getValue(20, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/button_Crop'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/input_Nama File_no-border fs-12 ff-medium'),
		findTestData('transportation_store_toko_suku_cadang').getValue(21, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/button_Unggah Iklan'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/a_Kembali Ke Halaman Awal'))
}
