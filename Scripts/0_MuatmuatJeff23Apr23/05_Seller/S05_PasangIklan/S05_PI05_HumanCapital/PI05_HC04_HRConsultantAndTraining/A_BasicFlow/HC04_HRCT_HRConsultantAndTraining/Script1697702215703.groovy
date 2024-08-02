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

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC04_HRConsultantAndTraining/Page_Seller/span_Layanan Iklan (1)'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC04_HRConsultantAndTraining/Page_Seller/div_Human Capital'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC04_HRConsultantAndTraining/Page_Seller/span_HR Consultant and Training'))

for (def row = 1; row <= findTestData('human_capital_hr_consultant').getRowNumbers(); row++) {
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC04_HRConsultantAndTraining/Page_LayananIklan/button_Pasang Iklan'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC04_HRConsultantAndTraining/Page_LayananIklan/input_Sisa Kuota_radio_pasang_ku'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC04_HRConsultantAndTraining/Page_LayananIklan/button_Gunakan'))
	
	WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC04_HRConsultantAndTraining/Page_LayananIklan/button_Upload'),
		findTestData('human_capital_hr_consultant').getValue(1, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC04_HRConsultantAndTraining/Page_LayananIklan/button_Crop'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC04_HRConsultantAndTraining/Page_LayananIklan/input__ff-medium fs-12'),
		findTestData('human_capital_hr_consultant').getValue(2, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC04_HRConsultantAndTraining/Page_LayananIklan/span_Masukkan Tahun Berdiri'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC04_HRConsultantAndTraining/Page_LayananIklan/input_Crop_select2-search__field no-border'),
		findTestData('human_capital_hr_consultant').getValue(3, row))
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC04_HRConsultantAndTraining/Page_LayananIklan/li_tahun_dipilih'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC04_HRConsultantAndTraining/Page_LayananIklan/input_Website_ff-medium fs-12'),
		findTestData('human_capital_hr_consultant').getValue(4, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC04_HRConsultantAndTraining/Page_LayananIklan/div__unchecked-icon'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC04_HRConsultantAndTraining/Page_LayananIklan/textarea_text'),
		findTestData('human_capital_hr_consultant').getValue(5, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC04_HRConsultantAndTraining/Page_LayananIklan/textarea_text_1'),
		findTestData('human_capital_hr_consultant').getValue(6, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC04_HRConsultantAndTraining/Page_LayananIklan/textarea_text_1_2'),
		findTestData('human_capital_hr_consultant').getValue(7, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC04_HRConsultantAndTraining/Page_LayananIklan/textarea_text_1_2_3'),
		findTestData('human_capital_hr_consultant').getValue(8, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC04_HRConsultantAndTraining/Page_LayananIklan/input__no-border form-control dropdownGoogl_af628b'),
		findTestData('human_capital_hr_consultant').getValue(9, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC04_HRConsultantAndTraining/Page_LayananIklan/div_Kec. Kenjeran, Kota Surabaya'))
	
	WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC04_HRConsultantAndTraining/Page_LayananIklan/div_Upload File Sertifikat'),
		findTestData('human_capital_hr_consultant').getValue(10, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC04_HRConsultantAndTraining/Page_LayananIklan/button_Crop'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC04_HRConsultantAndTraining/Page_LayananIklan/input_Nama Pencapaian, Penghargaan, dan Ser_d3ca56'),
		findTestData('human_capital_hr_consultant').getValue(11, row))
	
	WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC04_HRConsultantAndTraining/Page_LayananIklan/div_Upload File Foto'),
		findTestData('human_capital_hr_consultant').getValue(12, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC04_HRConsultantAndTraining/Page_LayananIklan/button_Crop'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC04_HRConsultantAndTraining/Page_LayananIklan/input__no-border fs-12 h-30 w-100'),
		findTestData('human_capital_hr_consultant').getValue(13, row))
	
	WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC04_HRConsultantAndTraining/Page_LayananIklan/div_Upload File Video'),
		findTestData('human_capital_hr_consultant').getValue(14, row))
	
	WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC04_HRConsultantAndTraining/Page_LayananIklan/input_caption_video'),
		findTestData('human_capital_hr_consultant').getValue(15, row))
	
	WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC04_HRConsultantAndTraining/Page_LayananIklan/div_Upload File Promo'),
		findTestData('human_capital_hr_consultant').getValue(16, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC04_HRConsultantAndTraining/Page_LayananIklan/button_Crop'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC04_HRConsultantAndTraining/Page_LayananIklan/input_Judul Promo_no-border fs-12'),
		findTestData('human_capital_hr_consultant').getValue(17, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC04_HRConsultantAndTraining/Page_LayananIklan/textarea_Deskripsi_component-input-border l_97f996'),
		findTestData('human_capital_hr_consultant').getValue(18, row))
	
	WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC04_HRConsultantAndTraining/Page_LayananIklan/div_Upload File Testimoni'),
		findTestData('human_capital_hr_consultant').getValue(19, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC04_HRConsultantAndTraining/Page_LayananIklan/button_Crop'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC04_HRConsultantAndTraining/Page_LayananIklan/input_Nama File_no-border fs-12 ff-medium'),
		findTestData('human_capital_hr_consultant').getValue(20, row))
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC04_HRConsultantAndTraining/Page_LayananIklan/btn_unggah_iklan'))
	
	WebUI.waitForJQueryLoad(60)
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC04_HRConsultantAndTraining/Page_LayananIklan/btn_kembali_halaman_awal'))
	
	
}

