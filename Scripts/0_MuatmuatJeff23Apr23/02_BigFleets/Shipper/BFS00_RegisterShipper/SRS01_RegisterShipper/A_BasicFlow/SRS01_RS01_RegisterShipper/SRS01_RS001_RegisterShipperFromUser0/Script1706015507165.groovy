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

'Var Register'
String username = 'Kal Tsit Nuen und Funfzig'

String noTelp = '777010059'

String email = 'kaltsit59@yopmail.com'

String password = 'Az12345678'

'Test Case Register'
WebUI.callTestCase(findTestCase('0_MuatmuatJeff23Apr23/00_RegisLogin/RL02_Register/RL02_A_BasicFlow/RL_02_R001_Register_User0'), 
    [('username') : username, ('noTelp') : noTelp, ('email') : email, ('password') : password], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS00_RegisterShipper/Page_Home  muatmuat/div_Big FleetsKomunitas eksklusif Shipper d_58c606'))

'Masuk BF dari After Login'
WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS00_RegisterShipper/Page_Home  muatmuat/button_Masuk Bigfleets'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS00_RegisterShipper/Page_DemoBigFleet  muatmuat/button_Lanjutkan ke Big Fleets'))

WebUI.waitForPageLoad(60)

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS00_RegisterShipper/Page_DemoBigFleet  muatmuat/button_Saya Shipper'))

WebUI.delay(1)

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS00_RegisterShipper/Page_DemoBigFleet  muatmuat/button_Daftar Menjadi Shipper'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS00_RegisterShipper/Page_DemoBigFleet  muatmuat/input_Anda belum mengisi jumlah pengiriman__d2eb24'), 
    '200')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS00_RegisterShipper/Page_DemoBigFleet  muatmuat/button_Kirim'))

WebUI.waitForPageLoad(60)

'Form Awal'
WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS00_RegisterShipper/Page_Register Big Fleets Shipper/upload_file_surat_jalan'), 
    'C:\\Users\\Dandy\\Downloads\\Data (31).pdf')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS00_RegisterShipper/Page_Register Big Fleets Shipper/button_Selanjutnya'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS00_RegisterShipper/Page_Register Big Fleets Shipper/button_Upload'))

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS00_RegisterShipper/Page_Register Big Fleets Shipper/a_Browse File'))

WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS00_RegisterShipper/Page_Register Big Fleets Shipper/upload_foto_profil'), 
    'C:\\Users\\Dandy\\Downloads\\53150.jpg')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS00_RegisterShipper/Page_Register Big Fleets Shipper/button_Simpan'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS00_RegisterShipper/Page_Register Big Fleets Shipper/input_Nama Perusahaan_CompanyName'), 
    'PT Kal Tsit Lima Sembilan')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS00_RegisterShipper/Page_Register Big Fleets Shipper/span_Pilih badan usaha'))

WebUI.waitForJQueryLoad(60)

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS00_RegisterShipper/Page_Register Big Fleets Shipper/li_badan_usaha_1_pt'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS00_RegisterShipper/Page_Register Big Fleets Shipper/div_Pilih Bidang Usaha'))

WebUI.waitForJQueryLoad(60)

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS00_RegisterShipper/Page_Register Big Fleets Shipper/a_Pertanian dan Perhutanan'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS00_RegisterShipper/Page_Register Big Fleets Shipper/input_Alamat Perusahaan_ValueAddres'), 
    'Sirie sidoarjo')

WebUI.waitForJQueryLoad(60)

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS00_RegisterShipper/Page_Register Big Fleets Shipper/div_Pergudangan SIRIE D 18 Sidoarjo, Rangka_b4c6a5'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS00_RegisterShipper/Page_Register Big Fleets Shipper/textarea_Detail Alamat_AddressDetail'), 
    'Sirie sidoarjo')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS00_RegisterShipper/Page_Register Big Fleets Shipper/input_No. Telepon Perusahaan_CompanyPhone'), 
    noTelp)

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS00_RegisterShipper/Page_Register Big Fleets Shipper/input_Nama PIC 1_Pic1Name'), 
    'Budi')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS00_RegisterShipper/Page_Register Big Fleets Shipper/input_No. HP PIC 1_Pic1Phone'), 
    noTelp)

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS00_RegisterShipper/Page_Register Big Fleets Shipper/button_Selanjutnya_1'))

WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS00_RegisterShipper/Page_Register Big Fleets Shipper/upload_nib'), 
    'C:\\Users\\Dandy\\Downloads\\Data (31).pdf')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS00_RegisterShipper/Page_Register Big Fleets Shipper/input_No. NIB_TxtNoNIB'), 
    '1234567891234')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS00_RegisterShipper/Page_Register Big Fleets Shipper/input_No. NPWP Perusahaan_TxtNoNPWPPTCV'), 
    '1234567891234567')

WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS00_RegisterShipper/Page_Register Big Fleets Shipper/upload_npwp'), 
    'C:\\Users\\Dandy\\Downloads\\Data (31).pdf')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS00_RegisterShipper/Page_Register Big Fleets Shipper/input_No. KTP PendaftarPemegang Akun_TxtNoK_ce3107'), 
    '1234567891234567')

WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS00_RegisterShipper/Page_Register Big Fleets Shipper/upload_ktp_pemegang_akun'), 
    'C:\\Users\\Dandy\\Downloads\\Data (31).pdf')

WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS00_RegisterShipper/Page_Register Big Fleets Shipper/upload_akta_pendirian'), 
    'C:\\Users\\Dandy\\Downloads\\Data (31).pdf')

WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS00_RegisterShipper/Page_Register Big Fleets Shipper/upload_sk_kemnkumham_akta_pendirian'), 
    'C:\\Users\\Dandy\\Downloads\\Data (31).pdf')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS00_RegisterShipper/Page_Register Big Fleets Shipper/button_Daftar'))

'Selesai Form'
WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS00_RegisterShipper/Page_Register Big Fleets Shipper/div_Yakin'))

'Awal Check SK'
WebUI.waitForPageLoad(60)

WebUI.scrollToElement(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS00_RegisterShipper/Page_Register Big Fleets Shipper/li_terms_sk_register_shipper'), 
    1)

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS00_RegisterShipper/Page_Register Big Fleet Syarat Ketentuan  muatmuat/input_Biaya Transporter_terms0'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS00_RegisterShipper/Page_Register Big Fleet Syarat Ketentuan  muatmuat/input_Anda belum checklist ketentuan ini_terms1'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS00_RegisterShipper/Page_Register Big Fleet Syarat Ketentuan  muatmuat/input_Anda belum checklist ketentuan ini_terms2'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS00_RegisterShipper/Page_Register Big Fleet Syarat Ketentuan  muatmuat/input_Anda belum checklist ketentuan ini_terms3'))

'Selesai Check SK'
WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS00_RegisterShipper/Page_Register Big Fleet Syarat Ketentuan  muatmuat/button_Selanjutnya'))

'Halaman OTP'
WebUI.waitForPageLoad(60)

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS00_RegisterShipper/Page_Register Big Fleet OTP  muatmuat/div_Email                                  _355dfe'))

'Back Door'
WebUI.executeJavaScript('window.open();', [])

currentWindow2 = WebUI.getWindowIndex()

//Switches tab #1
WebUI.switchToWindowIndex(currentWindow2 + 1)

//Cek URL CEK OTP NE
//GlobalVariable.UrlCekOTP = ('https://rc.azlogistik.id/tan/viewotp?data=' + noTelp)
String urlCekOtpOri = GlobalVariable.UrlCekOTP

GlobalVariable.UrlCekOTP = (GlobalVariable.UrlCekOTP + email)

WebUI.navigateToUrl(GlobalVariable.UrlCekOTP)

String stringOTP = WebUI.getText(findTestObject('Object Repository/8_Test/CobaAmbilText/Page_/body_MessageCode200,TextOK (uc131uacf5),Dat_598ef3'))

String[] OTP

OTP = stringOTP.split('"')

//for(String values : OTP) {
//	println(values);
//}
String realOTP = OTP[13]

println(realOTP)

String[] splitOTP = realOTP.split('')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/00_RegisLogin/RL02_Register/RL02_01_RegisterUser1/A_BasicFlow/R01_RU01_RegisterUser/Page_/body_MessageCode200,TextOK (uc131uacf5),Dat_559c02'))

'Balik OTP'
WebUI.switchToWindowTitle('Register Big Fleet OTP | muatmuat')

GlobalVariable.UrlCekOTP = urlCekOtpOri

'Isi OTP'
WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS00_RegisterShipper/Page_Register Big Fleet OTP  muatmuat/input_Masukkan OTP_OTPField1'), 
    splitOTP[0])

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS00_RegisterShipper/Page_Register Big Fleet OTP  muatmuat/input_Masukkan OTP_OTPField2'), 
    splitOTP[1])

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS00_RegisterShipper/Page_Register Big Fleet OTP  muatmuat/input_Masukkan OTP_OTPField3'), 
    splitOTP[2])

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS00_RegisterShipper/Page_Register Big Fleet OTP  muatmuat/input_Masukkan OTP_OTPField4'), 
    splitOTP[3])

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS00_RegisterShipper/Page_Register Big Fleet OTP  muatmuat/input_Masukkan OTP_OTPField5'), 
    splitOTP[4])

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS00_RegisterShipper/Page_Register Big Fleet OTP  muatmuat/input_Masukkan OTP_OTPField6'), 
    splitOTP[5])

WebUI.waitForJQueryLoad(60)

WebUI.waitForPageLoad(60)

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS00_RegisterShipper/Page_Register Big Fleet Syarat Ketentuan  muatmuat/div_Jelajahi Produk Menarik Lainnya'))

WebUI.waitForPageLoad(60)

'Report WA'
WebUI.callTestCase(findTestCase('8_Test/ReportOtomasi'), [('reportText') : 'Berhasil Daftar BF Shipper'], FailureHandling.CONTINUE_ON_FAILURE)

