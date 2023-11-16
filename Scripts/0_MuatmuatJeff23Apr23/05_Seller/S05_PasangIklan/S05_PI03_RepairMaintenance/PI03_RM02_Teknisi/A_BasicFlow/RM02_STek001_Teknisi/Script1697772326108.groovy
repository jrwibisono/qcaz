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

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM02_Teknisi/Page_Seller/span_Layanan Iklan'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM02_Teknisi/Page_Seller/div_Repair  Maintenance Services'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM02_Teknisi/Page_Seller/span_Teknisi'))

for (def row = 1; row <= findTestData('repair_maintenance_teknisi').getRowNumbers(); row++) {
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM02_Teknisi/Page_LayananIklan/button_Pasang Iklan'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM02_Teknisi/Page_LayananIklan/input_Sisa Kuota_radio_pasang_ku'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM02_Teknisi/Page_LayananIklan/button_Gunakan'))
	
	WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM02_Teknisi/Page_LayananIklan/button_Upload'),
		findTestData('repair_maintenance_teknisi').getValue(1, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM02_Teknisi/Page_LayananIklan/button_Crop'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM02_Teknisi/Page_LayananIklan/input__ff-medium fs-12'),
		findTestData('repair_maintenance_teknisi').getValue(2, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM02_Teknisi/Page_LayananIklan/input__FormatInteger'),
		findTestData('repair_maintenance_teknisi').getValue(3, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM02_Teknisi/Page_LayananIklan/textarea_text'),
		findTestData('repair_maintenance_teknisi').getValue(4, row))
	
//	Checkbox Jenis Servis
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM02_Teknisi/Page_LayananIklan/chkkbox_jenis_engine'))
	
//	Checkbox Merk Servis
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM02_Teknisi/Page_LayananIklan/chkkbox_merk_mitsubishi'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM02_Teknisi/Page_LayananIklan/input__no-border form-control dropdownGoogl_af628b'),
		findTestData('repair_maintenance_teknisi').getValue(5, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM02_Teknisi/Page_LayananIklan/div_Kec. Kenjeran, Kota Surabaya'))
	
	WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM02_Teknisi/Page_LayananIklan/div_Upload File Sertifikat'),
		findTestData('repair_maintenance_teknisi').getValue(6, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM02_Teknisi/Page_LayananIklan/button_Crop'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM02_Teknisi/Page_LayananIklan/input_Nama Pencapaian, Penghargaan, dan Ser_d3ca56'),
		findTestData('repair_maintenance_teknisi').getValue(7, row))
	
	WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM02_Teknisi/Page_LayananIklan/div_Upload File Foto'),
		findTestData('repair_maintenance_teknisi').getValue(8, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM02_Teknisi/Page_LayananIklan/button_Crop'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM02_Teknisi/Page_LayananIklan/input__no-border fs-12 h-30 w-100'),
		findTestData('repair_maintenance_teknisi').getValue(9, row))
	
	WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM02_Teknisi/Page_LayananIklan/div_Upload File Video'),
		findTestData('repair_maintenance_teknisi').getValue(10, row))
	
	WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM02_Teknisi/Page_LayananIklan/input_caption_video'),
		findTestData('repair_maintenance_teknisi').getValue(11, row))
	
	WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM02_Teknisi/Page_LayananIklan/div_Upload Gambar'),
		findTestData('repair_maintenance_teknisi').getValue(12, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM02_Teknisi/Page_LayananIklan/button_Crop'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM02_Teknisi/Page_LayananIklan/div_Harga dalam range_unchecked-icon'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM02_Teknisi/Page_LayananIklan/input_Rp_FormatInteger no-border w-100 pe-0'),
		findTestData('repair_maintenance_teknisi').getValue(13, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM02_Teknisi/Page_LayananIklan/input__no-border fs-12'),
		findTestData('repair_maintenance_teknisi').getValue(14, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM02_Teknisi/Page_LayananIklan/textarea__component-input-border lh-normal'),
		findTestData('repair_maintenance_teknisi').getValue(15, row))
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM02_Teknisi/Page_LayananIklan/btn_unggah_iklan'))
	
	WebUI.waitForJQueryLoad(60)
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI03_RepairMaintenance/PI03_RM02_Teknisi/Page_LayananIklan/btn_kembali_halaman_awal'))
	
	
}

