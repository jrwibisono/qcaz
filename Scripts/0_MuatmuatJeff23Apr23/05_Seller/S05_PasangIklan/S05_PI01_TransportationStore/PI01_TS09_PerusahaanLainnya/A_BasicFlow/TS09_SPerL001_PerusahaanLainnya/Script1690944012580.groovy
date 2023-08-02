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

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS07_PerlengkapanAngkutan/A_BasicFlow/Page_LayananIklan/BtnSidebarLayananIklan'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS09_PerusahaanLainnya/A_BasicFlow/Page_Seller/div_Transportation Store'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS09_PerusahaanLainnya/A_BasicFlow/Page_Seller/span_Perusahaan Lainnya'))

not_run: WebUI.navigateToUrl('https://iklanqc.assetlogistik.com/layananiklan/iklanDashboard?SubKategoriID=48&KategoriID=52&sub_text=Perusahaan%20Lainnya&layanan_text=Transportation%20Store&no')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS09_PerusahaanLainnya/A_BasicFlow/Page_LayananIklan/button_Pasang Iklan'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS09_PerusahaanLainnya/A_BasicFlow/Page_LayananIklan/input_Sisa Kuota_radio_pasang_ku'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS09_PerusahaanLainnya/A_BasicFlow/Page_LayananIklan/button_Gunakan'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS09_PerusahaanLainnya/A_BasicFlow/Page_LayananIklan/button_Upload'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS09_PerusahaanLainnya/A_BasicFlow/Page_LayananIklan/button_Crop'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS09_PerusahaanLainnya/A_BasicFlow/Page_LayananIklan/input__ff-medium fs-12'), 
    'Kedungdoro 101, Surabaya, Jawa Timur')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS09_PerusahaanLainnya/A_BasicFlow/Page_LayananIklan/input__ff-medium fs-12_1'), 
    'www.perusahaanlainnyacoba.com')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS09_PerusahaanLainnya/A_BasicFlow/Page_LayananIklan/span_Masukan Tahun Berdiri'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS09_PerusahaanLainnya/A_BasicFlow/Page_LayananIklan/textarea_text'), 
    'Perusahaan Lainnya Coba Tentang')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS09_PerusahaanLainnya/A_BasicFlow/Page_LayananIklan/textarea_text_1'), 
    'Layanan Perusahaan Lainnya Coba')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS09_PerusahaanLainnya/A_BasicFlow/Page_LayananIklan/textarea_text_1_2'), 
    'Senin - Sabtu, 08:00 - 20:00')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS09_PerusahaanLainnya/A_BasicFlow/Page_LayananIklan/input__no-border form-control dropdownGoogl_af628b'), 
    'Kenjer')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS09_PerusahaanLainnya/A_BasicFlow/Page_LayananIklan/div_Kec. Kenjeran, Kota Surabaya'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS09_PerusahaanLainnya/A_BasicFlow/Page_LayananIklan/button_Atur Pin Lokasi'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS09_PerusahaanLainnya/A_BasicFlow/Page_LayananIklan/input_Alamat_searchBoxModalAddress0'), 
    'kenjeran')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS09_PerusahaanLainnya/A_BasicFlow/Page_LayananIklan/div_Kenjeran Permai, Kalijudan, Surabaya, J_af05e8'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS09_PerusahaanLainnya/A_BasicFlow/Page_LayananIklan/img'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS09_PerusahaanLainnya/A_BasicFlow/Page_LayananIklan/div_Upload File Sertifikat'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS09_PerusahaanLainnya/A_BasicFlow/Page_LayananIklan/button_Crop'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS09_PerusahaanLainnya/A_BasicFlow/Page_LayananIklan/input_Nama Pencapaian, Penghargaan, dan Ser_d3ca56'), 
    'Sertifikat Perusahaan Lain Coba')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS09_PerusahaanLainnya/A_BasicFlow/Page_LayananIklan/div_Upload File Foto'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS09_PerusahaanLainnya/A_BasicFlow/Page_LayananIklan/button_Crop'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS09_PerusahaanLainnya/A_BasicFlow/Page_LayananIklan/input__no-border fs-12 h-30 w-100'), 
    'Perusahaan Lai Coba Foto')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS09_PerusahaanLainnya/A_BasicFlow/Page_LayananIklan/div_Upload File Video'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS09_PerusahaanLainnya/A_BasicFlow/Page_LayananIklan/div_Upload File Promo'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS09_PerusahaanLainnya/A_BasicFlow/Page_LayananIklan/button_Crop'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS09_PerusahaanLainnya/A_BasicFlow/Page_LayananIklan/input_Judul Promo_no-border fs-12'), 
    'Judul Promo Per Lain Coba')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS09_PerusahaanLainnya/A_BasicFlow/Page_LayananIklan/textarea_Deskripsi_component-input-border l_97f996'), 
    'Deskripsi Promo Per Lain Coba')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS09_PerusahaanLainnya/A_BasicFlow/Page_LayananIklan/div_Upload File Katalog Brosur'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS09_PerusahaanLainnya/A_BasicFlow/Page_LayananIklan/button_Crop'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS09_PerusahaanLainnya/A_BasicFlow/Page_LayananIklan/input_Judul Katalog  Brosur_no-border fs-12'), 
    'Brosur Perusahaan Lain Coba')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS09_PerusahaanLainnya/A_BasicFlow/Page_LayananIklan/div_Upload File Testimoni'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS09_PerusahaanLainnya/A_BasicFlow/Page_LayananIklan/input_Nama File_no-border fs-12 ff-medium'), 
    'Terstimoni Perusahaan Lain Coba')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS09_PerusahaanLainnya/A_BasicFlow/Page_LayananIklan/button_Unggah Iklan'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS09_PerusahaanLainnya/A_BasicFlow/Page_LayananIklan/div_Upload File Video'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS09_PerusahaanLainnya/A_BasicFlow/Page_LayananIklan/div_Upload File Video'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS09_PerusahaanLainnya/A_BasicFlow/Page_LayananIklan/input__no-border fs-12 h-30 w-100_1'), 
    'Video Perusahaan Coba')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS09_PerusahaanLainnya/A_BasicFlow/Page_LayananIklan/button_Unggah Iklan'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS09_PerusahaanLainnya/A_BasicFlow/Page_LayananIklan/a_Kembali Ke Halaman Awal'))

