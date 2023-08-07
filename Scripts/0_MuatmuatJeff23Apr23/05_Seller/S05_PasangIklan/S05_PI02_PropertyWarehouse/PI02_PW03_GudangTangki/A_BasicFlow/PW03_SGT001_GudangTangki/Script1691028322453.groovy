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

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_Seller/span_Layanan Iklan (1)'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_Seller/div_Property  Warehouse (1)'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_Seller/span_Gudang Barang Cair'))

not_run: WebUI.navigateToUrl('https://iklanqc.assetlogistik.com/layananiklan/iklanDashboard?SubKategoriID=17&KategoriID=28&sub_text=Gudang%20Barang%20Cair&layanan_text=Property%20%26%20Warehouse&no')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/button_Pasang Iklan'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/input_Sisa Kuota_radio_pasang_ku'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/button_Gunakan'))

WebUI.delay(2)

WebUI.waitForPageLoad(60)

WebUI.waitForJQueryLoad(60)

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/button_Upload'))

WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/UploadFotoPerusahaanGudangCair'), 
    'C://Users/USER/Downloads/ContohBan.jpg')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/button_Crop'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/input__ff-medium fs-12'), 
    'Kedungdoro 101, Surabaya, Jawa Timur')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/input_Website_ff-medium fs-12'), 
    'www.barangcaircoba.com')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/span_Tahun Berdiri'))

WebUI.waitForJQueryLoad(60)

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/OpsiTahunBerdiri1970GudangCair'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/input__no-border form-control dropdownGoogl_af628b'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/input__no-border form-control dropdownGoogl_af628b'), 
    'Surabaya')

WebUI.waitForJQueryLoad(60)

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/div_Kota Surabaya'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/textarea_text'), 
    'Perusahaan coba gudang cair')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/input__ff-medium fs-12_1'), 
    'Surabaya, Sidoarjo')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/div__unchecked-icon'))

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/ChkBoxBahanKimiaGudCair'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/span_Tipe Tangki'))

WebUI.waitForJQueryLoad(60)

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/OpsiCoatedMildSteelGudCair'))

WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/InputJumlahTangkiGudCair'), 
    '20')

WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/InputCbmGudCair'), 
    '20')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/textarea_text_1'), 
    'Kelebihan Gudang Cai Coba')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/textarea_text_1_2'), 
    'Senin - Sabtu, 07:00 - 20:00')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/input__no-border form-control dropdownGoogl_af628b_1'), 
    'Surabaya')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/div_Kec. Seputih Surabaya, Kab. Lampung Tengah'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/button_Atur Pin Lokasi'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/input_Alamat_searchBoxModalAddress0'), 
    'surabaya')

WebUI.waitForJQueryLoad(60)

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/div_Surabaya - Gempol Toll Road, Ketapang, _d147b5'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/img'))

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/div_Upload File Sertifikat'))

WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/UploadFileSertifikatGudangCair'), 
    'C://Users/USER/Downloads/ContohBan.jpg')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/button_Crop'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/input__no-border fs-12'), 
    'Sertifikat Suka Coba')

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/div_Upload File Foto'))

WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/UploadGaleriFotoGudangCair'), 
    'C://Users/USER/Downloads/ContohBan.jpg')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/button_Crop'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/input__no-border fs-12 h-30 w-100'), 
    'Foto Pintu Masuk')

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/div_Upload File Video'))

WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/UploadVideoGudangCair'), 
    'C://Users/USER/Downloads/ContohVideo Bawah10mb.mp4')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/input__no-border fs-12 h-30 w-100'), 
    'Foto peliharaan lokal')

WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/InputTextKeteranganVideo1'), 
    'Video Loka')

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/div_Upload File Promo'))

WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/UploadFilePromoGudangCair'), 
    'C://Users/USER/Downloads/ContohBan.jpg')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/button_Crop'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/input__no-border fs-12_1'), 
    'Promo Jalan Jalan')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/textarea__component-input-border lh-normal _d99f6c'), 
    'Contoh Promo kami')

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/div_Upload File Katalog Brosur'))

WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/UploadFileKatalogBrosurGudangCair'), 
    'C://Users/USER/Downloads/ContohBan.jpg')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/button_Crop'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/input__no-border fs-12_1_2'), 
    'Katalog Terbaru 2023')

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/div_Upload File Testimoni'))

WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/UploadFileTestimoniGudangCair'), 
    'C://Users/USER/Downloads/ContohBan.jpg')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/button_Crop'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/input_Nama File_no-border fs-12 ff-medium'), 
    'Kumpulan Testimoni')

not_run: WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/input__no-border FormatInteger w-100_1'), 
    '')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/button_Unggah Iklan'))

WebUI.waitForJQueryLoad(60)

WebUI.delay(2)

WebUI.waitForPageLoad(60)

WebUI.waitForJQueryLoad(60)

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW03_GudangTangki/A_BasicFlow/Page_LayananIklan/a_Kembali Ke Halaman Awal'))

