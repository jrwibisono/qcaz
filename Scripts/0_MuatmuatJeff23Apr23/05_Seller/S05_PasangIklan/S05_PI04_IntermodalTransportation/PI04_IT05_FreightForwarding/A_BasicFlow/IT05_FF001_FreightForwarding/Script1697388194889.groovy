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

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT05_FreightForwarding/Page_Seller/span_Layanan Iklan (1)'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT05_FreightForwarding/Page_Seller/div_Transportasi Intermoda'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT05_FreightForwarding/Page_Seller/a_Freight Forwarding0 Aktif0 Moderasi'))

for (def row = 1; row <= findTestData('transportasi_intermoda_freight_forwarding').getRowNumbers(); row++) {
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT05_FreightForwarding/Page_LayananIklan/button_Pasang Iklan'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT05_FreightForwarding/Page_LayananIklan/input_Sisa Kuota_radio_pasang_ku'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT05_FreightForwarding/Page_LayananIklan/button_Gunakan'))
	
	WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT05_FreightForwarding/Page_LayananIklan/button_Upload'),
		findTestData('transportasi_intermoda_freight_forwarding').getValue(1, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT05_FreightForwarding/Page_LayananIklan/button_Crop'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT05_FreightForwarding/Page_LayananIklan/input__ff-medium fs-12'),
		findTestData('transportasi_intermoda_freight_forwarding').getValue(2, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT05_FreightForwarding/Page_LayananIklan/input_Website_ff-medium fs-12'),
		findTestData('transportasi_intermoda_freight_forwarding').getValue(3, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT05_FreightForwarding/Page_LayananIklan/span_Masukkan Tahun Berdiri'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT05_FreightForwarding/Page_LayananIklan/input_concat(id(, , PasangIklanForm, , ))_s_cdb279'),
		findTestData('transportasi_intermoda_freight_forwarding').getValue(4, row))
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT05_FreightForwarding/Page_LayananIklan/li_tahun-dipilih'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT05_FreightForwarding/Page_LayananIklan/input__FormatInteger'),
		findTestData('transportasi_intermoda_freight_forwarding').getValue(5, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT05_FreightForwarding/Page_LayananIklan/div__unchecked-icon'))
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT05_FreightForwarding/Page_LayananIklan/div_cakupan-internasional'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT05_FreightForwarding/Page_LayananIklan/input_Agen Dari Perusahaan_ff-medium fs-12'),
		findTestData('transportasi_intermoda_freight_forwarding').getValue(6, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT05_FreightForwarding/Page_LayananIklan/textarea_text'),
		findTestData('transportasi_intermoda_freight_forwarding').getValue(7, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT05_FreightForwarding/Page_LayananIklan/textarea_text_1'),
		findTestData('transportasi_intermoda_freight_forwarding').getValue(8, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT05_FreightForwarding/Page_LayananIklan/textarea_text_1_2'),
		findTestData('transportasi_intermoda_freight_forwarding').getValue(9, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT05_FreightForwarding/Page_LayananIklan/input__no-border form-control dropdownGoogl_af628b'),
		findTestData('transportasi_intermoda_freight_forwarding').getValue(10, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT05_FreightForwarding/Page_LayananIklan/div_Kec. Seputih Surabaya, Kab. Lampung Tengah'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT05_FreightForwarding/Page_LayananIklan/button_Atur Pin Lokasi'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT05_FreightForwarding/Page_LayananIklan/input_Alamat_searchBoxModalAddress0'),
		findTestData('transportasi_intermoda_freight_forwarding').getValue(11, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT05_FreightForwarding/Page_LayananIklan/div_Kenjeran Permai, Kalijudan, Surabaya, J_af05e8'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT05_FreightForwarding/Page_LayananIklan/img'))
	
	WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT05_FreightForwarding/Page_LayananIklan/div_Upload File Sertifikat'),
		findTestData('transportasi_intermoda_freight_forwarding').getValue(12, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT05_FreightForwarding/Page_LayananIklan/button_Crop'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT05_FreightForwarding/Page_LayananIklan/input_Nama Pencapaian, Penghargaan, dan Ser_d3ca56'),
		findTestData('transportasi_intermoda_freight_forwarding').getValue(13, row))
	
	WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT05_FreightForwarding/Page_LayananIklan/div_Upload File Foto'),
		findTestData('transportasi_intermoda_freight_forwarding').getValue(14, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT05_FreightForwarding/Page_LayananIklan/button_Crop'))
	
	WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT05_FreightForwarding/Page_LayananIklan/input_caption-foto'),
		findTestData('transportasi_intermoda_freight_forwarding').getValue(15, row))
	
	WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT05_FreightForwarding/Page_LayananIklan/div_Upload File Video'),
		findTestData('transportasi_intermoda_freight_forwarding').getValue(16, row))
	
	WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT05_FreightForwarding/Page_LayananIklan/input_caption-video'),
		findTestData('transportasi_intermoda_freight_forwarding').getValue(17, row))
	
	WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT05_FreightForwarding/Page_LayananIklan/div_Upload File Promo'),
		findTestData('transportasi_intermoda_freight_forwarding').getValue(18, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT05_FreightForwarding/Page_LayananIklan/button_Crop'))
	
	WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT05_FreightForwarding/Page_LayananIklan/input_judul-promo'),
		findTestData('transportasi_intermoda_freight_forwarding').getValue(19, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT05_FreightForwarding/Page_LayananIklan/textarea_Deskripsi_component-input-border l_97f996'),
		findTestData('transportasi_intermoda_freight_forwarding').getValue(20, row))
	
	WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT05_FreightForwarding/Page_LayananIklan/div_Upload File Katalog Brosur'),
		findTestData('transportasi_intermoda_freight_forwarding').getValue(21, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT05_FreightForwarding/Page_LayananIklan/button_Crop'))
	
	WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT05_FreightForwarding/Page_LayananIklan/input_caption-brosur'),
		findTestData('transportasi_intermoda_freight_forwarding').getValue(22, row))
	
	WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT05_FreightForwarding/Page_LayananIklan/div_Upload File Testimoni'),
		findTestData('transportasi_intermoda_freight_forwarding').getValue(23, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT05_FreightForwarding/Page_LayananIklan/button_Crop'))
	
	WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT05_FreightForwarding/Page_LayananIklan/input_caption-testimoni'),
		findTestData('transportasi_intermoda_freight_forwarding').getValue(24, row))
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT05_FreightForwarding/Page_LayananIklan/btn_unggah-file'))
	
	WebUI.waitForJQueryLoad(60)
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT05_FreightForwarding/Page_LayananIklan/btn_kembali-halaman-awal'))
	
	
}

