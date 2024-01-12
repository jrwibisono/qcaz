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
import bsh.Variable as Variable
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

String noTelp = 77701039

String strAlert = 'Ada field yang belum terisi'

String strGetAlert = ''

def hasilCekRegister = []

WebUI.openBrowser('')

'Panggil ketika butuh whitelist'
WebUI.callTestCase(findTestCase('0_MuatmuatJeff23Apr23/00_RegisLogin/RL01_Login/RL01_A_BasicFlow/RL01_L000-01_WhitelistLoginCustom'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.navigateToUrl(GlobalVariable.URLMuatmuat)

not_run: WebUI.navigateToUrl('https://rc.azlogistik.id/')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/00_RegisLogin/RL02_Register/RL02_01_RegisterUser1/A_BasicFlow/R01_RU01_RegisterUser/Page_muatmuat Website  muatmuat/a_Bergabung Bersama Kami'))

WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/00_RegisLogin/RL02_Register/RL02_01_RegisterUser1/A_BasicFlow/R01_RU01_RegisterUser/Page_MuatMuatRegister  muatmuat/inputRegisterUsername'), 
    'Dandy Acht und Dreizig 280')

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/00_RegisLogin/RL02_Register/RL02_01_RegisterUser1/A_BasicFlow/R01_RU01_RegisterUser/Page_MuatMuatRegister  muatmuat/input_Email sudah terdaftar_inpNomorTelepon'), 
    noTelp)

WebUI.delay(1)

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/00_RegisLogin/RL02_Register/RL02_01_RegisterUser1/A_BasicFlow/R01_RU01_RegisterUser/Page_MuatMuatRegister  muatmuat/input_Email sudah terdaftar_inpEmail'), 
    'dandy38@yopmail.com')

WebUI.delay(1)

WebUI.setEncryptedText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/00_RegisLogin/RL02_Register/RL02_01_RegisterUser1/A_BasicFlow/R01_RU01_RegisterUser/Page_MuatMuatRegister  muatmuat/input_Email sudah terdaftar_inpPassword'), 
    'NokjRRQ1061C/z540kKphA==')

WebUI.delay(1)

WebUI.setEncryptedText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/00_RegisLogin/RL02_Register/RL02_01_RegisterUser1/A_BasicFlow/R01_RU01_RegisterUser/Page_MuatMuatRegister  muatmuat/input_Email sudah terdaftar_inpKonfirmasiPassword'), 
    'NokjRRQ1061C/z540kKphA==')

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/00_RegisLogin/RL02_Register/RL02_01_RegisterUser1/A_BasicFlow/R01_RU01_RegisterUser/Page_MuatMuatRegister  muatmuat/div_Daftar'))

WebUI.delay(1)

strGetAlert = WebUI.getText(findTestObject('0_MuatmuatJeff23Apr23/00_RegisLogin/RL02_Register/RL02_01_RegisterUser1/A_BasicFlow/R01_RU01_RegisterUser/Page_MuatMuatRegister  muatmuat/div_register_alert'))

strAlert = 'Nama lengkap tidak valid!'

if (strGetAlert == strAlert) {
    hasilCekRegister.add('V Alert Nama Lengkap Tidak Valid Berhasil')
} else {
    hasilCekRegister.add('X Alert Nama Lengkap Tidak Valid Gagal')
}

WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/00_RegisLogin/RL02_Register/RL02_01_RegisterUser1/A_BasicFlow/R01_RU01_RegisterUser/Page_MuatMuatRegister  muatmuat/inputRegisterUsername'), 
    'Dandy Acht und Dreizig')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/00_RegisLogin/RL02_Register/RL02_01_RegisterUser1/A_BasicFlow/R01_RU01_RegisterUser/Page_MuatMuatRegister  muatmuat/input_Email sudah terdaftar_inpEmail'), 
    '852')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/00_RegisLogin/RL02_Register/RL02_01_RegisterUser1/A_BasicFlow/R01_RU01_RegisterUser/Page_MuatMuatRegister  muatmuat/div_Daftar'))

WebUI.delay(1)

strGetAlert = WebUI.getText(findTestObject('0_MuatmuatJeff23Apr23/00_RegisLogin/RL02_Register/RL02_01_RegisterUser1/A_BasicFlow/R01_RU01_RegisterUser/Page_MuatMuatRegister  muatmuat/div_register_alert'))

strAlert = 'Format email salah!'

if (strGetAlert == strAlert) {
	hasilCekRegister.add('V Alert Format Email Salah Berhasil')
} else {
	hasilCekRegister.add('X Alert Format Email Salah Gagal')
}

String strHasilCekRegister = 'Hasil Cek Register: \n' + hasilCekRegister.join('\n')

println(strHasilCekRegister)