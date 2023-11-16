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

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM01_Bengkel/A_BasicFlow/Page_Seller/span_Layanan Iklan'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM01_Bengkel/A_BasicFlow/Page_Seller/div_Repair  Maintenance Services'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM01_Bengkel/A_BasicFlow/Page_Seller/span_Bengkel'))

for (def row = 1; row <= findTestData('repair_maintenance_bengkel').getRowNumbers(); row++) {
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM01_Bengkel/A_BasicFlow/Page_LayananIklan/button_Pasang Iklan'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM01_Bengkel/A_BasicFlow/Page_LayananIklan/input_Sisa Kuota_radio_pasang_ku'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM01_Bengkel/A_BasicFlow/Page_LayananIklan/button_Gunakan'))
	
	WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM01_Bengkel/A_BasicFlow/Page_LayananIklan/button_Upload'),
		findTestData('repair_maintenance_bengkel').getValue(1, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM01_Bengkel/A_BasicFlow/Page_LayananIklan/button_Crop'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM01_Bengkel/A_BasicFlow/Page_LayananIklan/input__ff-medium fs-12'),
		findTestData('repair_maintenance_bengkel').getValue(2, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM01_Bengkel/A_BasicFlow/Page_LayananIklan/input_Website_ff-medium fs-12'),
		findTestData('repair_maintenance_bengkel').getValue(3, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM01_Bengkel/A_BasicFlow/Page_LayananIklan/span_Masukkan Tahun Berdiri'))
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM01_Bengkel/A_BasicFlow/Page_LayananIklan/span_year_2010'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM01_Bengkel/A_BasicFlow/Page_LayananIklan/textarea_text'),
		findTestData('repair_maintenance_bengkel').getValue(4, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM01_Bengkel/A_BasicFlow/Page_LayananIklan/chkbox_layanan_layanan-umum'))
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM01_Bengkel/A_BasicFlow/Page_LayananIklan/chkbox_layanan_engine-repair'))
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM01_Bengkel/A_BasicFlow/Page_LayananIklan/chkbox_layanan_las-body-repair'))
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM01_Bengkel/A_BasicFlow/Page_LayananIklan/chkbox_layanan_mesin-bubut'))
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM01_Bengkel/A_BasicFlow/Page_LayananIklan/chkbox_layanan_kelistrikan'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM01_Bengkel/A_BasicFlow/Page_LayananIklan/div_Kelistrikan_unchecked-icon'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM01_Bengkel/A_BasicFlow/Page_LayananIklan/textarea_Lainnya_CBLainnyaField component-i_347356'),
		findTestData('repair_maintenance_bengkel').getValue(5, row))
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM01_Bengkel/A_BasicFlow/Page_LayananIklan/chkbox_service_on-road'))
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM01_Bengkel/A_BasicFlow/Page_LayananIklan/chkbox_service_home-service'))
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM01_Bengkel/A_BasicFlow/Page_LayananIklan/chkbox_merk_hino'))
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM01_Bengkel/A_BasicFlow/Page_LayananIklan/chkbox_merk_mitsubishi'))
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM01_Bengkel/A_BasicFlow/Page_LayananIklan/chkbox_merk_isuzu'))
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM01_Bengkel/A_BasicFlow/Page_LayananIklan/chkbox_merk_ud'))
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM01_Bengkel/A_BasicFlow/Page_LayananIklan/chkbox_merk_faw'))
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM01_Bengkel/A_BasicFlow/Page_LayananIklan/chkbox_merk_dongfeng'))
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM01_Bengkel/A_BasicFlow/Page_LayananIklan/chkbox_merk_scania'))
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM01_Bengkel/A_BasicFlow/Page_LayananIklan/chkbox_merk_volvo'))
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM01_Bengkel/A_BasicFlow/Page_LayananIklan/chkbox_merk_mercedes'))
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM01_Bengkel/A_BasicFlow/Page_LayananIklan/chkbox_merk_semua-merk'))
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM01_Bengkel/A_BasicFlow/Page_LayananIklan/chkbox_merk_lainnya'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM01_Bengkel/A_BasicFlow/Page_LayananIklan/textarea_Lainnya_CBLainnyaField component-i_347356_1'),
		findTestData('repair_maintenance_bengkel').getValue(6, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM01_Bengkel/A_BasicFlow/Page_LayananIklan/textarea_text_1'),
		findTestData('repair_maintenance_bengkel').getValue(7, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM01_Bengkel/A_BasicFlow/Page_LayananIklan/textarea_text_1_2'),
		findTestData('repair_maintenance_bengkel').getValue(8, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM01_Bengkel/A_BasicFlow/Page_LayananIklan/input__no-border form-control dropdownGoogl_af628b'),
		findTestData('repair_maintenance_bengkel').getValue(9, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM01_Bengkel/A_BasicFlow/Page_LayananIklan/div_Kec. Kenjeran, Kota Surabaya'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM01_Bengkel/A_BasicFlow/Page_LayananIklan/button_Atur Pin Lokasi'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM01_Bengkel/A_BasicFlow/Page_LayananIklan/input_Alamat_searchBoxModalAddress0'),
		findTestData('repair_maintenance_bengkel').getValue(10, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM01_Bengkel/A_BasicFlow/Page_LayananIklan/div_Kenjeran Permai, Kalijudan, Surabaya, J_af05e8'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM01_Bengkel/A_BasicFlow/Page_LayananIklan/img'))
	
	WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM01_Bengkel/A_BasicFlow/Page_LayananIklan/div_Upload File Sertifikat'),
		findTestData('repair_maintenance_bengkel').getValue(11, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM01_Bengkel/A_BasicFlow/Page_LayananIklan/button_Crop'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM01_Bengkel/A_BasicFlow/Page_LayananIklan/input_Nama Pencapaian, Penghargaan, dan Ser_d3ca56'),
		findTestData('repair_maintenance_bengkel').getValue(12, row))
	
	WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM01_Bengkel/A_BasicFlow/Page_LayananIklan/div_Upload File Foto'),
		findTestData('repair_maintenance_bengkel').getValue(13, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM01_Bengkel/A_BasicFlow/Page_LayananIklan/button_Crop'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM01_Bengkel/A_BasicFlow/Page_LayananIklan/input__no-border fs-12 h-30 w-100'),
		findTestData('repair_maintenance_bengkel').getValue(14, row))
	
	WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM01_Bengkel/A_BasicFlow/Page_LayananIklan/div_Upload File Video'),
		findTestData('repair_maintenance_bengkel').getValue(15, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM01_Bengkel/A_BasicFlow/Page_LayananIklan/input__no-border fs-12 h-30 w-100'),
		findTestData('repair_maintenance_bengkel').getValue(16, row))
	
	WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM01_Bengkel/A_BasicFlow/Page_LayananIklan/div_Upload File Promo'),
		findTestData('repair_maintenance_bengkel').getValue(17, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM01_Bengkel/A_BasicFlow/Page_LayananIklan/button_Crop'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM01_Bengkel/A_BasicFlow/Page_LayananIklan/input_Judul Promo_no-border fs-12'),
		findTestData('repair_maintenance_bengkel').getValue(18, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM01_Bengkel/A_BasicFlow/Page_LayananIklan/textarea_Deskripsi_component-input-border l_97f996'),
		findTestData('repair_maintenance_bengkel').getValue(19, row))
	
	WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM01_Bengkel/A_BasicFlow/Page_LayananIklan/div_Upload File Katalog Brosur'),
		findTestData('repair_maintenance_bengkel').getValue(20, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM01_Bengkel/A_BasicFlow/Page_LayananIklan/button_Crop'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM01_Bengkel/A_BasicFlow/Page_LayananIklan/input_Judul Katalog  Brosur_no-border fs-12'),
		findTestData('repair_maintenance_bengkel').getValue(21, row))
	
	WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM01_Bengkel/A_BasicFlow/Page_LayananIklan/div_Upload File Testimoni'),
		findTestData('repair_maintenance_bengkel').getValue(22, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM01_Bengkel/A_BasicFlow/Page_LayananIklan/button_Crop'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM01_Bengkel/A_BasicFlow/Page_LayananIklan/input_Nama File_no-border fs-12 ff-medium'),
		findTestData('repair_maintenance_bengkel').getValue(23, row))
	
	
}

