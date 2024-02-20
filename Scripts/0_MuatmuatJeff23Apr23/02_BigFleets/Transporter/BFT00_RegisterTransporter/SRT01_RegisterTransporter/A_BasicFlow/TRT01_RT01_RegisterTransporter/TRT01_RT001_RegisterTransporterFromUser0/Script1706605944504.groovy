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
String username = 'Vier Kal Tsit Ein'

String noTelp = '77704001'

String email = 'kaltsit0401@yopmail.com'

String password = 'Az12345678'

'Test Case Register'
WebUI.callTestCase(findTestCase('0_MuatmuatJeff23Apr23/00_RegisLogin/RL02_Register/RL02_A_BasicFlow/RL_02_R001_Register_User0'), 
    [('username') : username, ('noTelp') : noTelp, ('email') : email, ('password') : password], FailureHandling.CONTINUE_ON_FAILURE)

'Masuk ke Seller'
WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S00_RegisterSeller/Page_Home  muatmuat/a_SellerPartner Center'))

WebUI.waitForPageLoad(60)

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S00_RegisterSeller/Page_muatmuat/button_Daftar Menjadi Seller  Partner'))

'Mulai Form Pg. 1'
WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S00_RegisterSeller/Page_muatmuat/button_Selanjutnya_pop-up-header-close-btn _b3cf67'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S00_RegisterSeller/Page_muatmuat/button_Perusahaan'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S00_RegisterSeller/Page_muatmuat/input_Transportation Store_ChkBoxPerusahaan925'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S00_RegisterSeller/Page_muatmuat/input_Dealer  Karoseri_ChkBoxPerusahaan96'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S00_RegisterSeller/Page_muatmuat/input_Repair  Maintenance Service_ChkBoxPer_86aca7'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S00_RegisterSeller/Page_muatmuat/input_Intermodal Transportation_ChkBoxPerus_b490f3'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S00_RegisterSeller/Page_muatmuat/input_Places  Promo_ChkBoxPerusahaan579'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S00_RegisterSeller/Page_muatmuat/input_Property  Warehouse_ChkBoxPerusahaan99'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S00_RegisterSeller/Page_muatmuat/input_Anda harus mengunggah Legalitas Perus_56df72'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S00_RegisterSeller/Page_muatmuat/button_Selanjutnya'))

'Upload Foto'
WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S00_RegisterSeller/Page_muatmuat/button_Upload'))

'Upload Foto?'
WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S00_RegisterSeller/Page_muatmuat/a_Browse File'), 
    '')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S00_RegisterSeller/Page_muatmuat/div_Pangkas Foto Profil                    _fce5ce'))

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S00_RegisterSeller/Page_muatmuat/span_Pangkas Foto Profil_cropper-face cropper-move'))

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S00_RegisterSeller/Page_muatmuat/div_Pangkas Foto Profil                    _fce5ce_1'))

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S00_RegisterSeller/Page_muatmuat/span_Pangkas Foto Profil_cropper-face cropper-move'))

'Simpan Foto'
WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S00_RegisterSeller/Page_muatmuat/button_Simpan'))

'Nama Perusahaan'
WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S00_RegisterSeller/Page_muatmuat/input_Nama Perusahaan_CompanyName'), 
    'PT. Empat Kal Tsit Satu')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S00_RegisterSeller/Page_muatmuat/span_Pilih badan usaha'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S00_RegisterSeller/Page_muatmuat/div_Pilih bidang Usaha'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S00_RegisterSeller/Page_muatmuat/a_Pertanian dan Perhutanan'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S00_RegisterSeller/Page_muatmuat/input_Alamat Perusahaan_ValueAddres'), 
    'kenjeran')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S00_RegisterSeller/Page_muatmuat/div_Jalan Kenjeran, Gading, Surabaya, Jawa _7e6936'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S00_RegisterSeller/Page_muatmuat/textarea_Detail Alamat_AddressDetail'), 
    'Kenjeran')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S00_RegisterSeller/Page_muatmuat/input_No. Telepon Perusahaan_CompanyPhone'), 
    '77704001')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S00_RegisterSeller/Page_muatmuat/input_Nama PIC Sales Marketing 1_Pic1Name'), 
    'Doni')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S00_RegisterSeller/Page_muatmuat/input_No. HP PIC Sales Marketing 1_Pic1Phone'), 
    '77704001')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S00_RegisterSeller/Page_muatmuat/input_Nama PIC Sales Marketing 2_Pic2Name'), 
    'Roni')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S00_RegisterSeller/Page_muatmuat/input_No. HP PIC Sales Marketing 2_Pic2Phone'), 
    '7770400101')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S00_RegisterSeller/Page_muatmuat/input_Nama PIC Sales Marketing 3_Pic3Name'), 
    'Boni')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S00_RegisterSeller/Page_muatmuat/input_No. HP PIC Sales Marketing 3_Pic3Phone'), 
    '7770400102')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S00_RegisterSeller/Page_muatmuat/button_Selanjutnya_1'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S00_RegisterSeller/Page_muatmuat/button_Selanjutnya_1_2'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S00_RegisterSeller/Page_muatmuat/button_Selanjutnya_1_2_3'))

'Form 3 - Legalitas'
WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S00_RegisterSeller/Page_muatmuat/button_Upload_1'), 
    '')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S00_RegisterSeller/Page_muatmuat/input_No. NIB_TxtNoNIBPTCV'), 
    '7894561237894')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S00_RegisterSeller/Page_muatmuat/input_No. NPWP Perusahaan_TxtNoNPWP'), 
    '7894561237894561')

WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S00_RegisterSeller/Page_muatmuat/button_Upload_1_2'), 
    '')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S00_RegisterSeller/Page_muatmuat/input_No. KTP PendaftarPemegang Akun_TxtNoK_ce3107'), 
    '7894561237894561')

WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S00_RegisterSeller/Page_muatmuat/button_Upload_1_2_3'), 
    '')

WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S00_RegisterSeller/Page_muatmuat/button_Upload_1_2_3_4'), 
    '')

WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S00_RegisterSeller/Page_muatmuat/button_Upload_1_2_3_4_5'), 
    '')

WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S00_RegisterSeller/Page_muatmuat/button_Upload_1_2_3_4_5_6'), 
    '')

WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S00_RegisterSeller/Page_muatmuat/button_Upload_1_2_3_4_5_6_7'), 
    '')

WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S00_RegisterSeller/Page_muatmuat/button_Upload_1_2_3_4_5_6_7_8'), 
    '')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S00_RegisterSeller/Page_muatmuat/button_Daftar'))

WebUI.waitForPageLoad(60)

WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S00_RegisterSeller/Page_muatmuat/button_Upload Sekarang'), 
    '')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S00_RegisterSeller/Page_muatmuat/input_Nama PIC Customer Invoice(bila ada)_t_b4660c'), 
    'Deni')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S00_RegisterSeller/Page_muatmuat/input_No. HP PIC Customer Invoice(bila ada)_f8f006'), 
    '78945612378945')

WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S00_RegisterSeller/Page_muatmuat/button_Upload Sekarang_1_2'), 
    '')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S00_RegisterSeller/Page_muatmuat/input_Nama PIC Customer Invoice(bila ada)_t_ee599a'), 
    'Reni')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S00_RegisterSeller/Page_muatmuat/input_No. HP PIC Customer Invoice(bila ada)_d3dbca'), 
    '78945612378945')

WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S00_RegisterSeller/Page_muatmuat/button_Upload Sekarang_1'), 
    '')

'Daftar Form Special Legality'
WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S00_RegisterSeller/Page_muatmuat/button_Daftar_1'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S00_RegisterSeller/Page_muatmuat/button_Lanjutkan'))

'OTP - Ganti Pakai TC OTP'
WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S00_RegisterSeller/Page_Register Seller OTP/input_Masukkan OTP_OTPField1'), 
    '6')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S00_RegisterSeller/Page_Register Seller OTP/input_Masukkan OTP_OTPField2'), 
    '0')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S00_RegisterSeller/Page_Register Seller OTP/input_Masukkan OTP_OTPField3'), 
    '5')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S00_RegisterSeller/Page_Register Seller OTP/input_Masukkan OTP_OTPField4'), 
    '3')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S00_RegisterSeller/Page_Register Seller OTP/input_Masukkan OTP_OTPField5'), 
    '7')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S00_RegisterSeller/Page_Register Seller OTP/input_Masukkan OTP_OTPField6'), 
    '7')

'Selesai, Pergi Ke Halaman Seller'
WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S00_RegisterSeller/Page_muatmuat/div_Lanjutkan'))

WebUI.waitForPageLoad(60)

'Report WA'
not_run: WebUI.callTestCase(findTestCase('8_Test/ReportOtomasi'), [('reportText') : 'Berhasil Daftar BF Transporter'], FailureHandling.CONTINUE_ON_FAILURE)

