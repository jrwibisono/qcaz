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

WebUI.click(findTestObject('Object Repository/8_Test/Test/Page_Seller/span_Layanan Iklan'))

WebUI.click(findTestObject('Object Repository/8_Test/Test/Page_Seller/div_Transportasi Intermoda'))

WebUI.click(findTestObject('Object Repository/8_Test/Test/Page_Seller/span_Road Transportation'))

WebUI.click(findTestObject('Object Repository/8_Test/Test/Page_LayananIklan/button_Pasang Iklan'))

WebUI.uploadFile(findTestObject('8_Test/Test/Page_LayananIklan/UploadLogo'), 'C:\\Users\\Dandy\\Downloads\\artworks-9MIV3ngwPyJvZwTe-muU9mA-t500x500.jpg')

WebUI.click(findTestObject('Object Repository/8_Test/Test/Page_LayananIklan/input_Sisa Kuota_radio_pasang_ku'))

WebUI.click(findTestObject('Object Repository/8_Test/Test/Page_LayananIklan/button_Gunakan'))

WebUI.click(findTestObject('Object Repository/8_Test/Test/Page_LayananIklan/button_Upload'))

WebUI.click(findTestObject('Object Repository/8_Test/Test/Page_LayananIklan/button_Crop'))

WebUI.setText(findTestObject('Object Repository/8_Test/Test/Page_LayananIklan/input__ff-medium fs-12'), 'Kenjeran')

WebUI.setText(findTestObject('Object Repository/8_Test/Test/Page_LayananIklan/input_Website_ff-medium fs-12'), 'www.kejeran.com')

WebUI.click(findTestObject('Object Repository/8_Test/Test/Page_LayananIklan/span_Pilih Tahun Berdiri'))

WebUI.setText(findTestObject('Object Repository/8_Test/Test/Page_LayananIklan/input_Jumlah Kantor di Indonesia_FormatInteger'), 
    '')

WebUI.setText(findTestObject('Object Repository/8_Test/Test/Page_LayananIklan/textarea_text'), 'Tentang perusahaan')

WebUI.setText(findTestObject('Object Repository/8_Test/Test/Page_LayananIklan/textarea_text_1'), 'Rute')

WebUI.setText(findTestObject('Object Repository/8_Test/Test/Page_LayananIklan/textarea_text_1_2'), '18:00')

WebUI.setText(findTestObject('Object Repository/8_Test/Test/Page_LayananIklan/input_Lokasi Iklan_no-border form-control d_722d8f'), 
    'Surabaya')

WebUI.click(findTestObject('Object Repository/8_Test/Test/Page_LayananIklan/div_Kec. Seputih Surabaya, Kab. Lampung Tengah'))

WebUI.click(findTestObject('Object Repository/8_Test/Test/Page_LayananIklan/button_Atur Pin Lokasi'))

WebUI.setText(findTestObject('Object Repository/8_Test/Test/Page_LayananIklan/input_Alamat_searchBoxModalAddress0'), 'surabaya')

WebUI.click(findTestObject('Object Repository/8_Test/Test/Page_LayananIklan/div_Surabaya - Gempol Toll Road, Ketapang, _d147b5'))

WebUI.click(findTestObject('Object Repository/8_Test/Test/Page_LayananIklan/img'))

WebUI.setText(findTestObject('Object Repository/8_Test/Test/Page_LayananIklan/input_Nama Pencapaian, Penghargaan, dan Ser_d3ca56'), 
    'Sertifikat')

WebUI.click(findTestObject('Object Repository/8_Test/Test/Page_LayananIklan/button_Tambah'))

WebUI.click(findTestObject('Object Repository/8_Test/Test/Page_LayananIklan/button_Hapus'))

WebUI.setText(findTestObject('Object Repository/8_Test/Test/Page_LayananIklan/input_Nama Pencapaian, Penghargaan, dan Ser_d3ca56'), 
    'Sertifikat')

WebUI.click(findTestObject('Object Repository/8_Test/Test/Page_LayananIklan/img_1'))

WebUI.click(findTestObject('Object Repository/8_Test/Test/Page_LayananIklan/button_Crop'))

WebUI.setText(findTestObject('Object Repository/8_Test/Test/Page_LayananIklan/input__no-border fs-12 h-30 w-100'), 'Foto')

WebUI.click(findTestObject('Object Repository/8_Test/Test/Page_LayananIklan/div_Upload File Foto'))

WebUI.click(findTestObject('Object Repository/8_Test/Test/Page_LayananIklan/button_Crop'))

WebUI.setText(findTestObject('Object Repository/8_Test/Test/Page_LayananIklan/input_Masukkan Caption_no-border fs-12 h-30 w-100'), 
    '')

WebUI.setText(findTestObject('Object Repository/8_Test/Test/Page_LayananIklan/input__no-border fs-12'), 'Promo')

WebUI.setText(findTestObject('Object Repository/8_Test/Test/Page_LayananIklan/textarea__component-input-border lh-normal _d99f6c'), 
    'Deskripsi')

WebUI.click(findTestObject('Object Repository/8_Test/Test/Page_LayananIklan/div_Upload File Promo'))

WebUI.click(findTestObject('Object Repository/8_Test/Test/Page_LayananIklan/button_Crop'))

WebUI.setText(findTestObject('Object Repository/8_Test/Test/Page_LayananIklan/input_Judul Katalog  Brosur_no-border fs-12'), 
    'katalog')

WebUI.click(findTestObject('Object Repository/8_Test/Test/Page_LayananIklan/div_Upload File Katalog Brosur'))

WebUI.click(findTestObject('Object Repository/8_Test/Test/Page_LayananIklan/button_Crop'))

WebUI.setText(findTestObject('Object Repository/8_Test/Test/Page_LayananIklan/input_Nama File_no-border fs-12 ff-medium'), 
    'Porto')

WebUI.click(findTestObject('Object Repository/8_Test/Test/Page_LayananIklan/div_Upload File Testimoni'))

WebUI.click(findTestObject('Object Repository/8_Test/Test/Page_LayananIklan/div_Upload File Testimoni'))

WebUI.click(findTestObject('Object Repository/8_Test/Test/Page_LayananIklan/button_Unggah Iklan'))

