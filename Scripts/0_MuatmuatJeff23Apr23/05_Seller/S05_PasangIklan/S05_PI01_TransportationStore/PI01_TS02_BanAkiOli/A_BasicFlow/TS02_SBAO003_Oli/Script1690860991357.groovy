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

WebUI.waitForJQueryLoad(60)

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS02_BanAkiOli/A_BasicFlow/Page_Seller/div_Transportation Store (1)'))

WebUI.delay(1)

WebUI.waitForJQueryLoad(60)

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS02_BanAkiOli/A_BasicFlow/Page_Seller/span_Ban, Aki, Oli (1)'))

for (def row = 1; row <= findTestData('transportation_store_oli').getRowNumbers(); row++) {
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS02_BanAkiOli/A_BasicFlow/Page_LayananIklan/button_Pasang Iklan (2)'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS02_BanAkiOli/A_BasicFlow/Page_LayananIklan/img (2)'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS02_BanAkiOli/A_BasicFlow/Page_LayananIklan/button_Pilih (2)'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS02_BanAkiOli/A_BasicFlow/Page_LayananIklan/input_Sisa Kuota_radio_pasang_ku (2)'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS02_BanAkiOli/A_BasicFlow/Page_LayananIklan/button_Gunakan (2)'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS02_BanAkiOli/A_BasicFlow/Page_LayananIklan/input__ff-medium fs-12 (2)'),
		findTestData('transportation_store_oli').getValue(1, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS02_BanAkiOli/A_BasicFlow/Page_LayananIklan/span_Masukkan Jenis Oli Anda_1'))
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS02_BanAkiOli/A_BasicFlow/Page_LayananIklan/OpsiJenisOli1'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS02_BanAkiOli/A_BasicFlow/Page_LayananIklan/input__ff-medium fs-12_1 (1)'),
		findTestData('transportation_store_oli').getValue(2, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS02_BanAkiOli/A_BasicFlow/Page_LayananIklan/input__ff-medium fs-12_1_2 (1)'),
		findTestData('transportation_store_oli').getValue(3, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS02_BanAkiOli/A_BasicFlow/Page_LayananIklan/input__FormatFloat (1)'),
		findTestData('transportation_store_oli').getValue(4, row))
	
	WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS02_BanAkiOli/A_BasicFlow/Page_LayananIklan/UploadImgOli1'),
		findTestData('transportation_store_oli').getValue(5, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS02_BanAkiOli/A_BasicFlow/Page_LayananIklan/button_Crop (2)'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS02_BanAkiOli/A_BasicFlow/Page_LayananIklan/input_Rp_FormatInteger (2)'),
		findTestData('transportation_store_oli').getValue(6, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS02_BanAkiOli/A_BasicFlow/Page_LayananIklan/textarea_text (2)'),
		findTestData('transportation_store_oli').getValue(7, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS02_BanAkiOli/A_BasicFlow/Page_LayananIklan/input__no-border form-control dropdownGoogl_af628b (2)'),
		findTestData('transportation_store_oli').getValue(8, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS02_BanAkiOli/A_BasicFlow/Page_LayananIklan/div_Kec. Seputih Surabaya, Kab. Lampung Tengah (2)'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS02_BanAkiOli/A_BasicFlow/Page_LayananIklan/button_Unggah Iklan (2)'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS02_BanAkiOli/A_BasicFlow/Page_LayananIklan/a_Kembali Ke Halaman Awal (2)'))
}

