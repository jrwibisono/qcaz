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
String username = 'Secht Kal Tsit Elf'

String noTelp = '77706011'

String email = 'kaltsit0611@yopmail.com'

String password = 'Az12345678'

String namaPerusahaan = 'PT. Secht Kal Tsit Elf'

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
    'C:\\Users\\Dandy\\Downloads\\1704329650988.jpeg')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S00_RegisterSeller/Page_muatmuat/div_Pangkas Foto Profil                    _fce5ce'))

'Simpan Foto'
WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S00_RegisterSeller/Page_muatmuat/button_Simpan'))

'Nama Perusahaan'
WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S00_RegisterSeller/Page_muatmuat/input_Nama Perusahaan_CompanyName'), 
    namaPerusahaan)

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S00_RegisterSeller/Page_muatmuat/span_Pilih badan usaha'))

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S00_RegisterSeller/Page_muatmuat/div_pt'))

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

'Unggah Nanti'
WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S00_RegisterSeller/Page_muatmuat/button_unggah_nanti'))

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S00_RegisterSeller/Page_muatmuat/button_ya_unggah_nanti'))

'Selesai, Pergi Ke Halaman Seller'
WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S00_RegisterSeller/Page_muatmuat/div_Lanjutkan'))

WebUI.waitForPageLoad(60)

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S00_RegisterSeller/Page_Home  muatmuat/a_kembali_ke_halaman_utama'))

'Report WA'
not_run: WebUI.callTestCase(findTestCase('8_Test/ReportOtomasi'), [('reportText') : 'Berhasil Daftar Seller Perusahaan'], 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/00_RegisLogin/RL02_Register/RL02_01_RegisterUser1/A_BasicFlow/R01_RU01_RegisterUser/Page_Home  muatmuat/button_close'))

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

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS00_RegisterShipper/Page_DemoBigFleet  muatmuat/button_kirim_shipper_s3'))

WebUI.waitForPageLoad(60)

WebUI.callTestCase(findTestCase('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS00_RegisterShipper/SRS01_RegisterShipper/C_AddOn/SRS01_AO03_BFS4'), 
    [('username') : username, ('noTelp') : noTelp, ('email') : email, ('password') : password, ('fromSeller') : true], FailureHandling.CONTINUE_ON_FAILURE)

