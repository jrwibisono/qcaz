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

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI06_DealerKaroseri/PI06_DK02_KatalogDealer/Page_Seller/span_Layanan Iklan (1)'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI06_DealerKaroseri/PI06_DK02_KatalogDealer/Page_Seller/div_Dealer Truk  Karoseri'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI06_DealerKaroseri/PI06_DK02_KatalogDealer/Page_Seller/span_Dealer Truk'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI06_DealerKaroseri/PI06_DK02_KatalogDealer/Page_LayananIklan/a_Kelola Katalog'))

for (def row = 1; row <= findTestData('dealerk_karoseri_katalog_dealer').getRowNumbers(); row++) {
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI06_DealerKaroseri/PI06_DK02_KatalogDealer/Page_LayananIklan/button_Pasang Katalog Unit'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI06_DealerKaroseri/PI06_DK02_KatalogDealer/Page_LayananIklan/input_Sisa Kuota_radio_pasang_ku'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI06_DealerKaroseri/PI06_DK02_KatalogDealer/Page_LayananIklan/button_Gunakan'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI06_DealerKaroseri/PI06_DK02_KatalogDealer/Page_LayananIklan/button_Ya'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI06_DealerKaroseri/PI06_DK02_KatalogDealer/Page_LayananIklan/span_Masukkan Jenis Truk'))
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI06_DealerKaroseri/PI06_DK02_KatalogDealer/Page_LayananIklan/li_jenis_truk_CDD'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI06_DealerKaroseri/PI06_DK02_KatalogDealer/Page_LayananIklan/span_Masukkan Tahun Pembuatan'))
	
	WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI06_DealerKaroseri/PI06_DK02_KatalogDealer/Page_LayananIklan/input_tahun_pembuatan'),
		findTestData('dealerk_karoseri_katalog_dealer').getValue(1, row))
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI06_DealerKaroseri/PI06_DK02_KatalogDealer/Page_LayananIklan/li_tahun_pembuatan_dipilih'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI06_DealerKaroseri/PI06_DK02_KatalogDealer/Page_LayananIklan/input__ff-medium fs-12'),
		findTestData('dealerk_karoseri_katalog_dealer').getValue(2, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI06_DealerKaroseri/PI06_DK02_KatalogDealer/Page_LayananIklan/div__unchecked-icon'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI06_DealerKaroseri/PI06_DK02_KatalogDealer/Page_LayananIklan/input__FormatInteger'),
		findTestData('dealerk_karoseri_katalog_dealer').getValue(3, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI06_DealerKaroseri/PI06_DK02_KatalogDealer/Page_LayananIklan/input__FormatFloat'),
		findTestData('dealerk_karoseri_katalog_dealer').getValue(4, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI06_DealerKaroseri/PI06_DK02_KatalogDealer/Page_LayananIklan/input__FormatFloat_1'),
		findTestData('dealerk_karoseri_katalog_dealer').getValue(5, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI06_DealerKaroseri/PI06_DK02_KatalogDealer/Page_LayananIklan/input__FormatFloat_1_2'),
		findTestData('dealerk_karoseri_katalog_dealer').getValue(6, row))
	
	WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI06_DealerKaroseri/PI06_DK02_KatalogDealer/Page_LayananIklan/button_Pilih File'),
		findTestData('dealerk_karoseri_katalog_dealer').getValue(7, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI06_DealerKaroseri/PI06_DK02_KatalogDealer/Page_LayananIklan/textarea_text'),
		findTestData('dealerk_karoseri_katalog_dealer').getValue(8, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI06_DealerKaroseri/PI06_DK02_KatalogDealer/Page_LayananIklan/input_Rp_FormatInteger'),
		findTestData('dealerk_karoseri_katalog_dealer').getValue(9, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI06_DealerKaroseri/PI06_DK02_KatalogDealer/Page_LayananIklan/textarea__component-input-border lh-normal _d99f6c'),
		findTestData('dealerk_karoseri_katalog_dealer').getValue(10, row))
	
	WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI06_DealerKaroseri/PI06_DK02_KatalogDealer/Page_LayananIklan/div_Masukkan Foto'),
		findTestData('dealerk_karoseri_katalog_dealer').getValue(11, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI06_DealerKaroseri/PI06_DK02_KatalogDealer/Page_LayananIklan/button_Crop'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI06_DealerKaroseri/PI06_DK02_KatalogDealer/Page_LayananIklan/input__no-border form-control dropdownGoogl_af628b'),
		findTestData('dealerk_karoseri_katalog_dealer').getValue(12, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI06_DealerKaroseri/PI06_DK02_KatalogDealer/Page_LayananIklan/div_Kec. Kenjeran, Kota Surabaya'))
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI06_DealerKaroseri/PI06_DK02_KatalogDealer/Page_LayananIklan/btn_unggah_iklan'))
	
	WebUI.waitForJQueryLoad(60)
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI06_DealerKaroseri/PI06_DK02_KatalogDealer/Page_LayananIklan/btn_kembali_halaman_awal'))
	
	
}

