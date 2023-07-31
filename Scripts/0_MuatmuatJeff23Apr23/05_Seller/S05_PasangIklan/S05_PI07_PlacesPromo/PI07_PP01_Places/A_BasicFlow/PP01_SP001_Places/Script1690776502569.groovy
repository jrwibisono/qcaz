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

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_Seller/div_Places  Promo'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_Seller/span_Places'))

not_run: WebUI.navigateToUrl('https://iklanqc.assetlogistik.com/layananiklan/iklanDashboard?SubKategoriID=49&KategoriID=53&sub_text=Places&layanan_text=Places%20%26%20Promo')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/button_Pasang Iklan'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/input_Sisa Kuota_radio_pasang_ku'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/button_Gunakan'))

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/button_Upload'))

WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/UploadFotoLogoPerusahaan'), 
    'C://Users/USER/Downloads/RestAreaNgawi.jpeg')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/button_Crop'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/span_Pilih Kategori Iklan Anda'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/input_Alamat_ff-medium fs-12'), 
    'Kedungdoro 102, Surabaya, Jawa Timur')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/input_Website_ff-medium fs-12'), 
    'www.ryusejahterah.com')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/span_Masukkan Tahun Berdiri'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/input_Website_ff-medium fs-12'), 
    'www.ryusejahterah.com')

WebUI.sendKeys(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/input_Crop_select2-search__field no-border'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/textarea_text'), 
    'Kami adalah perusahaan percobaan dalam Rest Area.')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/textarea_text_1'), 
    'Setiap Hari, 00:00 - 24:00')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/textarea_text_1_2'), 
    'Pelayan yang ramah dan penunjuk jalan yang jelas.')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/input__no-border form-control dropdownGoogl_af628b'), 
    'Surabaya')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/div_Kec. Seputih Surabaya, Kab. Lampung Tengah'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/button_Atur Pin Lokasi'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/input_Alamat_searchBoxModalAddress0'), 
    'Surabaya')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/div_Surabaya - Gempol Toll Road, Ketapang, _d147b5'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/img'))

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/div_Upload File Sertifikat_1'))

WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/UploadFileSertifikat'), 
    'C://Users/USER/Downloads/RestAreaNgawi.jpeg')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/button_Crop'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/input_Nama Pencapaian, Penghargaan, dan Ser_d3ca56'), 
    'Sertifikat Rest Area Terbaik se-Jawa Timur 2018')

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/div_Upload File Foto'))

WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/UploadFotoPlaces'), 
    'C://Users/USER/Downloads/RestAreaNgawi.jpeg')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/button_Crop'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/input_Masukkan Caption_no-border fs-12 h-30 w-100'), 
    'Food Court Rest Area')

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/div_Upload File Video'))

WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/UploadFileVideo'), 
    'C://Users/USER/Downloads/RestAreaNgawi.jpeg')

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/div_Upload File Promo'))

WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/UploadFilePromo'), 
    'C://Users/USER/Downloads/RestAreaNgawi.jpeg')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/button_Crop'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/input__no-border fs-12'), 
    'Promo Pembukaan Area Baru')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/textarea_Deskripsi_component-input-border l_97f996'), 
    'Promo terbaru, segera nikmati selama perayaan pembukaan area baru.')

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/div_Upload File Katalog Brosur'))

WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/UploadFileBrosur'), 
    'C://Users/USER/Downloads/RestAreaNgawi.jpeg')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/button_Crop'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/input__no-border fs-12_1'), 
    'Perkenalan Rest Area Kami')

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/div_Upload File Testimoni'))

WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/UploadFileTestimoni'), 
    'C://Users/USER/Downloads/RestAreaNgawi.jpeg')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/button_Crop'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/input_Nama File_no-border fs-12 ff-medium'), 
    'Testimoni Pelanggan Kami')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/button_Unggah Iklan'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI07_PlacesPromo/PI07_PP01_Places/A_BasicFlow/Page_LayananIklan/a_Kembali Ke Halaman Awal'))

