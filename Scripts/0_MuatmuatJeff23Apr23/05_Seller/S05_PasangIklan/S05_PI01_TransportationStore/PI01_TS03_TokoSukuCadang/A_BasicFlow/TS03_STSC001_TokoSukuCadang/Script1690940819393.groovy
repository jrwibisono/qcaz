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

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_Seller/div_Transportation Store'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_Seller/span_Toko Suku Cadang'))

not_run: WebUI.navigateToUrl('https://iklanqc.assetlogistik.com/layananiklan/iklanDashboard?SubKategoriID=46&KategoriID=49&sub_text=Toko%20Suku%20Cadang&layanan_text=Transportation%20Store&no')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/button_Pasang Iklan'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/input_Sisa Kuota_radio_pasang_ku'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/button_Gunakan'))

WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/UploadFotoPerusahaanTSC'), 
    'C://Users/USER/Downloads/ContohBan.jpg')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/button_Crop'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/input__ff-medium fs-12'), 
    'Kedungdoro 101, Surabaya, Jawa Timur')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/input__ff-medium fs-12_1'), 
    'www.tokosukucadangcoba.com')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/span_Masukan TahunBerdiri'))

WebUI.delay(1)

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/OpsiTahunTokoSukuCadang1'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/textarea_text'), 
    'Toko Suku Cadang Percobaan')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/div__unchecked-icon'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/textarea_text_1'), 
    'Sudah bepengalaman cukup lama')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/textarea_text_1_2'), 
    'Senin - Jumat, 08:00 - 21:00')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/input__no-border form-control dropdownGoogl_af628b'), 
    'Surabaya')

WebUI.delay(1)

WebUI.waitForJQueryLoad(60)

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/div_Kec. Seputih Surabaya, Kab. Lampung Tengah'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/button_Atur Pin Lokasi'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/input_Alamat_searchBoxModalAddress0'), 
    'surabaya')

WebUI.delay(1)

WebUI.waitForJQueryLoad(60)

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/div_Surabaya - Gempol Toll Road, Ketapang, _d147b5'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/img'))

WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/UploadFileSertifikatTSC'), 
    'C://Users/USER/Downloads/ContohBan.jpg')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/button_Crop'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/input_Nama Pencapaian, Penghargaan, dan Ser_d3ca56'), 
    'Sertifikat Pelayanan Terbaik 2021')

WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/UploadFotoTSC'), 
    'C://Users/USER/Downloads/ContohBan.jpg')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/button_Crop'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/input_Masukkan Caption_no-border fs-12 h-30 w-100'), 
    'Depan Toko')

WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/UploadVideoTSC'), 
    'C://Users/USER/Downloads/ContohVideo Bawah10mb.mp4')

WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/InputCaptionVideoTSC'), 
    'Video Toko')

WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/UploadFilePromoTSC1'), 
    'C://Users/USER/Downloads/ContohBan.jpg')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/button_Crop'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/input_Judul Promo_no-border fs-12'), 
    'Promo Beli Suku Cadang')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/textarea_Deskripsi_component-input-border l_97f996'), 
    'Dapatkan hadiah menarik setiap pembelian suku cadang di atas 1 Milyar')

WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/UploadKatalogBrosur1'), 
    'C://Users/USER/Downloads/ContohBan.jpg')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/button_Crop'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/input_Judul Katalog  Brosur_no-border fs-12'), 
    'Katalog Terbaru')

WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/UploadFileTestimoniTSC1'), 
    'C://Users/USER/Downloads/ContohBan.jpg')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/button_Crop'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/input_Nama File_no-border fs-12 ff-medium'), 
    'Terstimoni Dari Pelanggan kami')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/button_Unggah Iklan'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS03_TokoSukuCadang/A_BasicFlow/Page_LayananIklan/a_Kembali Ke Halaman Awal'))

