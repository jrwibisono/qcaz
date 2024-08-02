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

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS06_SemiTrailerCarrier/A_BasicFlow/Page_Seller/div_Transportation Store'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS06_SemiTrailerCarrier/A_BasicFlow/Page_Seller/span_Semi Trailer Carrier'))

not_run: WebUI.navigateToUrl('https://iklanqc.assetlogistik.com/layananiklan/iklanDashboard?SubKategoriID=42&KategoriID=22&sub_text=Semi%20Trailer%20Carrier&layanan_text=Transportation%20Store&no')

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS06_SemiTrailerCarrier/A_BasicFlow/Page_LayananIklan/button_Pasang Iklan'))

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS06_SemiTrailerCarrier/A_BasicFlow/Page_LayananIklan/input_Sisa Kuota_radio_pasang_ku'))

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS06_SemiTrailerCarrier/A_BasicFlow/Page_LayananIklan/button_Gunakan'))

not_run: WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS06_SemiTrailerCarrier/A_BasicFlow/Page_LayananIklan/input__ff-medium fs-12'), 
    'Semi Trailer Coba')

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS06_SemiTrailerCarrier/A_BasicFlow/Page_LayananIklan/div__unchecked-icon'))

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS06_SemiTrailerCarrier/A_BasicFlow/Page_LayananIklan/span_Jenis Semi Trailer Carrier'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS06_SemiTrailerCarrier/A_BasicFlow/Page_LayananIklan/OpsiJenisSTC1'))

not_run: WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS06_SemiTrailerCarrier/A_BasicFlow/Page_LayananIklan/input__ff-medium fs-12_1'), 
    'Merk Coba')

not_run: WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS06_SemiTrailerCarrier/A_BasicFlow/Page_LayananIklan/input__FormatInteger'), 
    '20')

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS06_SemiTrailerCarrier/A_BasicFlow/Page_LayananIklan/input__FormatInteger'))

not_run: WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS06_SemiTrailerCarrier/A_BasicFlow/Page_LayananIklan/input__FormatInteger_1'), 
    '20')

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS06_SemiTrailerCarrier/A_BasicFlow/Page_LayananIklan/span_Warna'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS06_SemiTrailerCarrier/A_BasicFlow/Page_LayananIklan/OpsiPilihWarnaSTC1'))

not_run: WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS06_SemiTrailerCarrier/A_BasicFlow/Page_LayananIklan/UploadFotoSTC1'), 
    'C://Users/USER/Downloads/ContohBan.jpg')

not_run: WebUI.delay(1)

not_run: WebUI.waitForJQueryLoad(60)

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS06_SemiTrailerCarrier/A_BasicFlow/Page_LayananIklan/button_Crop'))

not_run: WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS06_SemiTrailerCarrier/A_BasicFlow/Page_LayananIklan/input_Rp_FormatInteger'), 
    '500000')

not_run: WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS06_SemiTrailerCarrier/A_BasicFlow/Page_LayananIklan/textarea_text'), 
    'Semi Trailer Carrier')

not_run: WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS06_SemiTrailerCarrier/A_BasicFlow/Page_LayananIklan/input__no-border form-control dropdownGoogl_af628b'), 
    'Surabaya')

not_run: WebUI.waitForJQueryLoad(60)

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS06_SemiTrailerCarrier/A_BasicFlow/Page_LayananIklan/div_Kec. Seputih Surabaya, Kab. Lampung Tengah'))

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS06_SemiTrailerCarrier/A_BasicFlow/Page_LayananIklan/button_Unggah Iklan'))

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS06_SemiTrailerCarrier/A_BasicFlow/Page_LayananIklan/a_Kembali Ke Halaman Awal'))

