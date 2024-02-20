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
String username = 'Funf Kal Tsit Vier'

String noTelp = '77705004'

String email = 'rckaltsit05004@yopmail.com'

String password = 'Az12345678'

String namaPerusahaan = 'PT. Funf Kal Tsit Vier'

'Test Case Register'
WebUI.callTestCase(findTestCase('0_MuatmuatJeff23Apr23/00_RegisLogin/RL02_Register/RL02_A_BasicFlow/RL_02_R001_Register_User0'), 
    [('username') : username, ('noTelp') : noTelp, ('email') : email, ('password') : password], FailureHandling.CONTINUE_ON_FAILURE)

'Masuk TM dari After Login'
WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Shipper/TMS00_RegisterShipper/Page_Home  muatmuat/button_transport_market'))

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Shipper/TMS00_RegisterShipper/Page_Home  muatmuat/button_masuk_transport_promo'))

'Masuk Halaman Demo'
WebUI.waitForPageLoad(60)

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Shipper/TMS00_RegisterShipper/Page_DemoTM muatmuat/button_lanjutkan_transport_market'))

'Pilih Transporter'
WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Shipper/TMS00_RegisterShipper/Page_DemoTM muatmuat/button_saya_transporter_tm'))

WebUI.delay(1)

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Shipper/TMS00_RegisterShipper/Page_DemoTM muatmuat/button_daftar_tm_transporter'))

WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Shipper/TMS00_RegisterShipper/Page_DemoTM muatmuat/input_truk_transporter'), 
    '60')

'End Demo'
WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Shipper/TMS00_RegisterShipper/Page_DemoTM muatmuat/button_kirim_transporter_tm'))

WebUI.waitForPageLoad(60)

'Jenis Truk 1'
WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT00_RegisterTransporter/Page_Register Big Fleets Shipper/button_jenis_truk_1'))

WebUI.waitForJQueryLoad(60)

'Opsi Truk 1_1'
WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT00_RegisterTransporter/Page_Register Big Fleets Shipper/button_truk_1-1_CDE'))

WebUI.waitForJQueryLoad(60)

'Jenis Carrier 1'
WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT00_RegisterTransporter/Page_Register Big Fleets Shipper/button_jenis_carrier_1'))

WebUI.waitForJQueryLoad(60)

'Opsi Carrier 1_1'
WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT00_RegisterTransporter/Page_Register Big Fleets Shipper/button_carrier_1-1_Box'))

WebUI.delay(1)

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT00_RegisterTransporter/Page_Register Big Fleets Shipper/input_jumlah_truk_1'))

WebUI.sendKeys(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT00_RegisterTransporter/Page_Register Big Fleets Shipper/input_jumlah_truk_1'), 
    Keys.chord(Keys.BACK_SPACE))

'Jumlah Unit 1'
WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT00_RegisterTransporter/Page_Register Big Fleets Shipper/input_jumlah_truk_1'), 
    '20')

'Jenis Truk 2'
WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT00_RegisterTransporter/Page_Register Big Fleets Shipper/button_jenis_truk_2'))

WebUI.waitForJQueryLoad(60)

'Opsi Truk 2_1'
WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT00_RegisterTransporter/Page_Register Big Fleets Shipper/button_truk_2-1_CDE'))

WebUI.waitForJQueryLoad(60)

'Jenis Carrier 2'
WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT00_RegisterTransporter/Page_Register Big Fleets Shipper/button_jenis_carrier_2'))

WebUI.waitForJQueryLoad(60)

'Opsi Carrier 2_2'
WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT00_RegisterTransporter/Page_Register Big Fleets Shipper/button_carrier_2-2_bak-terbuka'))

WebUI.delay(1)

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT00_RegisterTransporter/Page_Register Big Fleets Shipper/input_jumlah_truk_2'))

WebUI.sendKeys(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT00_RegisterTransporter/Page_Register Big Fleets Shipper/input_jumlah_truk_2'), 
    Keys.chord(Keys.BACK_SPACE))

'Jumlah Unit 2'
WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT00_RegisterTransporter/Page_Register Big Fleets Shipper/input_jumlah_truk_2'), 
    '20')

'Jenis Truk 3'
WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT00_RegisterTransporter/Page_Register Big Fleets Shipper/button_jenis_truk_3'))

WebUI.waitForJQueryLoad(60)

'Opsi Truk 3_1'
WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT00_RegisterTransporter/Page_Register Big Fleets Shipper/button_truk_3-1_CDE'))

WebUI.waitForJQueryLoad(60)

'Jenis Carrier 3'
WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT00_RegisterTransporter/Page_Register Big Fleets Shipper/button_jenis_carrier_3'))

WebUI.waitForJQueryLoad(60)

'Opsi Carrier 3_3'
WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT00_RegisterTransporter/Page_Register Big Fleets Shipper/button_carrier_3-3_los-bak'))

WebUI.delay(1)

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT00_RegisterTransporter/Page_Register Big Fleets Shipper/input_jumlah_truk_3'))

WebUI.sendKeys(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT00_RegisterTransporter/Page_Register Big Fleets Shipper/input_jumlah_truk_3'), 
    Keys.chord(Keys.BACK_SPACE))

'Jumlah Unit 3'
WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT00_RegisterTransporter/Page_Register Big Fleets Shipper/input_jumlah_truk_3'), 
    '20')

'Upload Daftar Nopol'
WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT00_RegisterTransporter/Page_Register Big Fleets Shipper/upload_nopol'), 
    'C:\\Users\\Dandy\\Downloads\\Template Plate Truck 200.xlsx')

'Upload STNK'
WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT00_RegisterTransporter/Page_Register Big Fleets Shipper/upload_stnk'), 
    'C:\\Users\\Dandy\\Downloads\\data (28).pdf')

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Shipper/TMS00_RegisterShipper/Page_Register Big Fleets Shipper/button_Selanjutnya_transporter_tm'))

'Button Upload Logo'
WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS00_RegisterShipper/Page_Register Big Fleets Shipper/button_Upload'))

WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS00_RegisterShipper/Page_Register Big Fleets Shipper/upload_foto_profil'), 
    'C:\\Users\\Dandy\\Downloads\\53150.jpg')

'Selesai Crop'
WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS00_RegisterShipper/Page_Register Big Fleets Shipper/button_Simpan'))

'Nama Perusahaan'
WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS00_RegisterShipper/Page_Register Big Fleets Shipper/input_Nama Perusahaan_CompanyName'), 
    namaPerusahaan)

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

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT00_RegisterTransporter/Page_Register Big Fleets Shipper/button_Selanjutnya_transport_2'))

WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT00_RegisterTransporter/Page_Register Big Fleets Shipper/upload_nib_transporter'), 
    'C:\\Users\\Dandy\\Downloads\\Data (31).pdf')

WebUI.delay(2)

WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT00_RegisterTransporter/Page_Register Big Fleets Shipper/input_No. NIB_TxtNoNIB_transporter'), 
    '1234567891234')

WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT00_RegisterTransporter/Page_Register Big Fleets Shipper/input_No. NPWP Perusahaan_TxtNoNPWPPTCV_transporter'), 
    '1234567891234567')

WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS00_RegisterShipper/Page_Register Big Fleets Shipper/upload_npwp'), 
    'C:\\Users\\Dandy\\Downloads\\Data (31).pdf')

WebUI.delay(2)

WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Shipper/TMS00_RegisterShipper/Page_Register Big Fleets Shipper/input_No. KTP Pendaftar_tm_transporter'), 
    '1234567891234567')

'Upload KTP Pendaftar Akun'
WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT00_RegisterTransporter/Page_Register Big Fleets Shipper/upload_ktp_pemegang_akun_transporter_pt'), 
    'C:\\Users\\Dandy\\Downloads\\53152.jpg')

WebUI.delay(2)

'Upload Cover Akta Pendirian'
WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT00_RegisterTransporter/Page_Register Big Fleets Shipper/upload_akta_pendirian_transporter_pt'), 
    'C:\\Users\\Dandy\\Downloads\\Data (31).pdf')

WebUI.delay(2)

'Upload SK Kemenkumham dari akta pendirian'
WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS00_RegisterShipper/Page_Register Big Fleets Shipper/upload_sk_kemnkumham_akta_pendirian'), 
    'C:\\Users\\Dandy\\Downloads\\Data (31).pdf')

WebUI.delay(2)

'Upload Cover Akta Perubahan'
WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT00_RegisterTransporter/Page_Register Big Fleets Shipper/upload_cover_akta_perubahan_pt'), 
    'C:\\Users\\Dandy\\Downloads\\data (28).pdf')

WebUI.delay(2)

'Upload SK Kemenkumham dari Akta Perubahan'
WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT00_RegisterTransporter/Page_Register Big Fleets Shipper/upload_sk_kemenkumham_akta_perubahan_pt'), 
    'C:\\Users\\Dandy\\Downloads\\data (28).pdf')

WebUI.delay(2)

'Upload Sertifikat Standar'
WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT00_RegisterTransporter/Page_Register Big Fleets Shipper/upload_sertifikat_standar'), 
    'C:\\Users\\Dandy\\Downloads\\data (28).pdf')

WebUI.delay(2)

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Transporter/BFT00_RegisterTransporter/Page_Register Big Fleets Shipper/button_Daftar_transporter'))

'Selesai Form'
WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Shipper/TMS00_RegisterShipper/Page_Register Big Fleets Shipper/div_Yakin_transporter_tm'))

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
WebUI.switchToWindowTitle('Register Transport Market OTP | muatmuat')

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

WebUI.callTestCase(findTestCase('1_CSTicketingJeff01Jun23/02_Approve/02_03_Approve_Register'), [('namaPerusahaan') : namaPerusahaan], 
    FailureHandling.CONTINUE_ON_FAILURE)

'Report WA'
not_run: WebUI.callTestCase(findTestCase('8_Test/ReportOtomasi'), [('reportText') : 'Berhasil Daftar TM Shipper'], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('0_MuatmuatJeff23Apr23/00_RegisLogin/RL01_Login/RL01_A_BasicFlow/RL01_L001_Login_WO_Report'), 
    [('noTelp') : noTelp, ('password') : password], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/00_RegisLogin/RL02_Register/RL02_01_RegisterUser1/A_BasicFlow/R01_RU01_RegisterUser/Page_Home  muatmuat/button_close'))

'Masuk TM dari After Login'
WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Shipper/TMS00_RegisterShipper/Page_Home  muatmuat/button_transport_market'))

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Shipper/TMS00_RegisterShipper/Page_Home  muatmuat/button_masuk_transport_promo'))

'Masuk Halaman Demo'
WebUI.waitForPageLoad(60)

WebUI.callTestCase(findTestCase('0_MuatmuatJeff23Apr23/03_TransportMarket/Shipper/TMS00_RegisterShipper/SRS01_RegisterShipper/C_AddOn/SRS01_AO01_TMS2'), 
    [('username') : username, ('noTelp') : noTelp, ('email') : email, ('password') : password], FailureHandling.CONTINUE_ON_FAILURE)

'Report WA'
not_run: WebUI.callTestCase(findTestCase('8_Test/ReportOtomasi'), [('reportText') : 'Berhasil Daftar TM Transporter'], FailureHandling.CONTINUE_ON_FAILURE)

