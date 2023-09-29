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

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_PerusahaanLainnya/Page_Seller/span_Layanan Iklan (1)'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_PerusahaanLainnya/Page_Seller/div_Property  Warehouse (1)'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_PerusahaanLainnya/Page_Seller/span_Perusahaan Lainnya'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_PerusahaanLainnya/Page_LayananIklan/button_Pasang Iklan'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_PerusahaanLainnya/Page_LayananIklan/input_Sisa Kuota_radio_pasang_ku'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_PerusahaanLainnya/Page_LayananIklan/button_Gunakan'))

WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_PerusahaanLainnya/Page_LayananIklan/button_Upload'), 
    'C:\\Users\\Dandy\\Downloads\\Screenshot 2023-09-29 114211.jpg')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_PerusahaanLainnya/Page_LayananIklan/button_Crop'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_PerusahaanLainnya/Page_LayananIklan/input__ff-medium fs-12'), 
    'Citywalk Sudirman Lt. 3, JI. KH Mas Mansyur No. 121, RT 013/RW 011, Kel. Karet Tengsin, Kec. Tanah Abang, Central Jakarta, DKI Jakarta 10220')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_PerusahaanLainnya/Page_LayananIklan/input_Website_ff-medium fs-12'), 
    'https://shipper.id/')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_PerusahaanLainnya/Page_LayananIklan/span_Masukkan Tahun Berdiri'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_PerusahaanLainnya/Page_LayananIklan/input_Crop_select2-search__field no-border'), 
    '2017')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_PerusahaanLainnya/Page_LayananIklan/opt_tahun_cari'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_PerusahaanLainnya/Page_LayananIklan/textarea_text'), 
    'Shipper didirikan dengan ambisi yang tinggi: menyederhanakan sistem logistik yang kompleks di Indonesia. Upaya tersebut terus berlanjut hingga hari ini demi membentuk visi perusahaan menjadi penyedia solusi e-commerce no.1 dalam mendukung banyak bisnis di Indonesia dan kawasan lainnya.\nBerbekal ragam inovasi dan keahlian digital yang terdepan, kini kami semakin dekat dalam mewujudkan visi kami menjadi kenyataan. Melalui platform Shipper, kami membantu bisnis dalam mengelola pesanan dan mengoptimalkan rute pengiriman, sehingga membantu menyatukan infrastruktur logistik Indonesia yang terfragmentasi. Hal ini memudahkan pedagang untuk meningkatkan pertumbuhan mereka di era e-commerce.\nAtas komitmen kami terhadap inovasi, Shipper telah meraih penghargaan Most Innovative Asia-Pacific Companies by Fast Company di tahun 2022.')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_PerusahaanLainnya/Page_LayananIklan/textarea_text_1'), 
    '- Agregator Logistik Domestik\n- Agregator Logistik Internasional\n- Manajemen Pergudangan\n- Kelola Toko Online\n- Integrasi API')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_PerusahaanLainnya/Page_LayananIklan/textarea_text_1_2'), 
    '24 Jam')

not_run: WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_PerusahaanLainnya/Page_LayananIklan/input__no-border form-control dropdownGoogl_af628b'), 
    '')

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_PerusahaanLainnya/Page_LayananIklan/input__no-border form-control dropdownGoogl_af628b'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_PerusahaanLainnya/Page_LayananIklan/input__no-border form-control dropdownGoogl_af628b'), 
    'Jakarta')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_PerusahaanLainnya/Page_LayananIklan/div_Kec. Gambir, Kota Jakarta Pusat'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_PerusahaanLainnya/Page_LayananIklan/button_Atur Pin Lokasi'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_PerusahaanLainnya/Page_LayananIklan/input_Alamat_searchBoxModalAddress0'), 
    'Citywalk Sudirman Lt. 3, JI. KH Mas Mansyur No. 121')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_PerusahaanLainnya/Page_LayananIklan/div_Jalan K.H. Mas Mansyur No.121, RT.1RW.5_a28dd8'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_PerusahaanLainnya/Page_LayananIklan/img'))

WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_PerusahaanLainnya/Page_LayananIklan/div_Upload File Sertifikat'), 
    'C:\\Users\\Dandy\\Downloads\\awards-01.jpeg')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_PerusahaanLainnya/Page_LayananIklan/button_Crop'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_PerusahaanLainnya/Page_LayananIklan/input_Nama Pencapaian, Penghargaan, dan Ser_d3ca56'), 
    'Top 2021 Startups Indonesia')

WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_PerusahaanLainnya/Page_LayananIklan/div_Upload File Foto'), 
    'C:\\Users\\Dandy\\Downloads\\banner-1.jpeg')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_PerusahaanLainnya/Page_LayananIklan/button_Crop'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_PerusahaanLainnya/Page_LayananIklan/input__no-border fs-12 h-30 w-100'), 
    'Anggota Kami')

WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_PerusahaanLainnya/Page_LayananIklan/div_Upload File Video'), 
    'C:\\Users\\Dandy\\Downloads\\Shipper 4th Anniversary - Shipper Untuk Indonesia.mp4')

WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_PerusahaanLainnya/Page_LayananIklan/input_caption_video'), 
    'Shipper 4th Anniversary')

WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_PerusahaanLainnya/Page_LayananIklan/div_Upload File Promo'), 
    'C:\\Users\\Dandy\\Downloads\\Untitled.jpg')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_PerusahaanLainnya/Page_LayananIklan/button_Crop'))

WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_PerusahaanLainnya/Page_LayananIklan/input_judul_promo'), 
    'Kirim paket bisnis online lewat Shipper diskon 20%')

WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_PerusahaanLainnya/Page_LayananIklan/input_promo_deskripsi'), 
    'Maksimalkan cuan bisnis online dengan kirim paket lewat Shipper.\nJaminan harga termurah yang beragam dan dapatkan potongan harga 20%')

WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_PerusahaanLainnya/Page_LayananIklan/div_Upload File Katalog Brosur'), 
    'C:\\Users\\Dandy\\Downloads\\Screenshot 2023-09-29 105846.jpg')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_PerusahaanLainnya/Page_LayananIklan/button_Crop'))

WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_PerusahaanLainnya/Page_LayananIklan/input_brosur_judul'), 
    'Produk Kami')

WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_PerusahaanLainnya/Page_LayananIklan/div_Upload File Testimoni'), 
    'C:\\Users\\Dandy\\Downloads\\Screenshot 2023-09-29 110058.jpg')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_PerusahaanLainnya/Page_LayananIklan/button_Crop'))

WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_PerusahaanLainnya/Page_LayananIklan/input_testimoni_nama'), 
    'Testimoni Klien Kami')

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_PerusahaanLainnya/Page_LayananIklan/btn_unggah_iklan'))

WebUI.waitForJQueryLoad(120)

WebUI.waitForPageLoad(60)

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW04_PerusahaanLainnya/Page_LayananIklan/btn_kembali_halaman_awal'))

