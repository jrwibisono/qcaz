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

String CheckText = 'Lowongan Test WA 3'

WebUI.callTestCase(findTestCase('0_MuatmuatJeff23Apr23/00_RegisLogin/RL01_Login/RL01_A_BasicFlow/RL01_L007_LoginSeller'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.waitForPageLoad(60)

WebUI.waitForJQueryLoad(60)

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC02_LowonganUmum/Page_Seller/span_Layanan Iklan (1)'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC02_LowonganUmum/Page_Seller/div_Human Capital'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC02_LowonganUmum/Page_Seller/span_Lowongan Umum'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC02_LowonganUmum/Page_LayananIklan/button_Pasang Iklan'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC02_LowonganUmum/Page_LayananIklan/input_Sisa Kuota_radio_pasang_ku'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC02_LowonganUmum/Page_LayananIklan/button_Gunakan'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC02_LowonganUmum/Page_LayananIklan/input__ff-medium fs-12'), 
    CheckText)

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC02_LowonganUmum/Page_LayananIklan/textarea_text'), 
    'Hello')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC02_LowonganUmum/Page_LayananIklan/input__no-border form-control dropdownGoogl_af628b'), 
    'Kenjeran')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC02_LowonganUmum/Page_LayananIklan/div_Kec. Kenjeran, Kota Surabaya'))

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC02_LowonganUmum/Page_LayananIklan/btn_unggah_iklan'))

WebUI.waitForJQueryLoad(60)

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC02_LowonganUmum/Page_LayananIklan/btn_kembali_halaman_awal'))

WebUI.waitForPageLoad(60)

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC02_LowonganUmum/Page_LayananIklan/btn_sorting'))

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC02_LowonganUmum/Page_LayananIklan/sorting_tanggal_posting'))

WebUI.waitForJQueryLoad(60)

WebUI.delay(10)

not_run: String TargetText = WebUI.getText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC02_LowonganUmum/Page_LayananIklan/checked_first_object_title'))

Boolean Result = WebUI.verifyTextPresent(CheckText, false)

String TestResult = ''

if (Result == true) {
    TestResult = 'Test%20Berhasil!'
} else {
    TestResult = 'Test%20Gagal!'
}

Windows.startApplication('C:/Program Files/WindowsApps/Microsoft.WindowsNotepad_11.2307.27.0_x64__8wekyb3d8bbwe/Notepad/Notepad.exe')