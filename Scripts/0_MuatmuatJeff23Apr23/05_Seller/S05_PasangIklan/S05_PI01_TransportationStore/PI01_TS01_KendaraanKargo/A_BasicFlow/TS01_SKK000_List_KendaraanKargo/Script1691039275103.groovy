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

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_Seller/div_Transportation Store'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_Seller/span_Kendaraan Kargo'))

not_run: WebUI.navigateToUrl('https://iklanqc.assetlogistik.com/layananiklan/iklanDashboard?SubKategoriID=37&KategoriID=21&sub_text=Kendaraan%20Kargo&layanan_text=Transportation%20Store&no')

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/button_Pasang Iklan'))

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/input_Sisa Kuota_radio_pasang_ku'))

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/button_Gunakan'))

not_run: WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/input__ff-medium fs-12'), 
    'Mobil Box Contoh')

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/div_Masukkan Kondisi Barang_unchecked-icon'))

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/span_Tahun'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/OpsiPilihTahun1'))

not_run: WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/input__FormatInteger'), 
    '100000')

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/span_Jenis Truk - Carrier'))

not_run: WebUI.delay(1)

not_run: WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/InputSearchJenisTruk'), 
    '')

not_run: WebUI.delay(1)

not_run: WebUI.waitForJQueryLoad(60)

not_run: WebUI.sendKeys(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/InputSearchJenisTruk'), 
    Keys.chord(Keys.ENTER))

not_run: WebUI.waitForJQueryLoad(60)

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/span_Jenis Truk - Carrier'))

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/span_Jenis Truk - Carrier_1'))

not_run: WebUI.delay(1)

not_run: WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/InputSearchJenisCarrier'), 
    '')

not_run: WebUI.delay(1)

not_run: WebUI.waitForJQueryLoad(60)

not_run: WebUI.sendKeys(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/InputSearchJenisCarrier'), 
    Keys.chord(Keys.ENTER))

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/span_Merk Truk'))

not_run: WebUI.delay(1)

not_run: WebUI.waitForJQueryLoad(60)

not_run: WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/InputSearchMerkTruk'), 
    '')

not_run: WebUI.sendKeys(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/InputSearchMerkTruk'), 
    Keys.chord(Keys.ENTER))

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/span_Merk Truk'))

not_run: WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/input__ff-medium fs-12_1'), 
    'Mobil Box')

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/div__unchecked-icon'))

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/span_Pilih Warna'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/OpsiPilihWarnaKK1'))

not_run: WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/InputTanggalKK'), 
    '08022023')

not_run: WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/UploadFotoKK1'), 
    'C://Users/USER/Downloads/ContohBan.jpg')

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/button_Crop'))

not_run: WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/UploadVideoKK1'), 
    'C://Users/USER/Downloads/ContohVideo Bawah10mb.mp4')

not_run: WebUI.delay(2)

not_run: WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/InputCaptionVideoKK'), 
    'Coba Video KK')

not_run: WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/input_Rp_FormatInteger'), 
    '20000000')

not_run: WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/textarea_text'), 
    'Kendaraan Kargo Contoh')

not_run: WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/input__no-border form-control dropdownGoogl_af628b'), 
    'Surabaya')

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/div_Kec. Seputih Surabaya, Kab. Lampung Tengah'))

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/button_Unggah Iklan'))

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/a_Kembali Ke Halaman Awal'))

