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

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_Seller/span_Layanan Iklan (1)'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_Seller/div_Transportasi Intermoda'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_Seller/span_Sea Freight'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/button_Pasang Iklan'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/input_Sisa Kuota_radio_pasang_ku'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/button_Gunakan'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/button_Upload'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/button_Crop'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/input__ff-medium fs-12'), 
    'Alamat')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/input_Website_ff-medium fs-12'), 
    'Website')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/span_Masukkan Tahun Berdiri'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/input_Crop_select2-search__field no-border'), 
    '2017')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/input__FormatInteger'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/input__FormatInteger_1'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/div__unchecked-icon'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/div__unchecked-icon'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/textarea_text'), 
    'Tentang Perusahaan')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/textarea_text_1'), 
    'Rute yang dilayani')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/textarea_text_1_2'), 
    'Waktu Operasional')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/input__no-border form-control dropdownGoogl_af628b'), 
    'Jakarta')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/div_Kec. Gambir, Kota Jakarta Pusat'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/button_Atur Pin Lokasi'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/input_Alamat_searchBoxModalAddress0'), 
    'Jakarta pusat')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/div_Jakarta Pusat, Paya Bakung, Kabupaten D_8694f7'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/img'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/div_Upload File Sertifikat'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/button_Crop'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/input_Nama Pencapaian, Penghargaan, dan Ser_d3ca56'), 
    'Sertifikat')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/div_Upload File Foto'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/button_Crop'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/input_Nama Pencapaian, Penghargaan, dan Ser_d3ca56'), 
    'Foto')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/div_Upload File Video'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/input_Masukkan Caption_no-border fs-12 h-30 w-100'), 
    'Video')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/div_Upload File Promo'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/button_Crop'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/input_Masukkan Caption_no-border fs-12 h-30 w-100'), 
    'Judul Promo')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/textarea_Deskripsi_component-input-border l_97f996'), 
    'Deskripsi Promo')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/div_Upload File Katalog Brosur'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/button_Crop'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/input_Nama Pencapaian, Penghargaan, dan Ser_d3ca56'), 
    'Brosur')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/div_Upload File Testimoni'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/button_Crop'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_TransportasiIntermoda/PI04_IT03_SeaFreight/Page_LayananIklan/input_Nama Pencapaian, Penghargaan, dan Ser_d3ca56'), 
    'Testimoni')

