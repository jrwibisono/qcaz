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

not_run: WebUI.callTestCase(findTestCase('0_MuatmuatJeff23Apr23/00_RegisLogin/RL01_Login/RL01_A_BasicFlow/RL01_L007_LoginSeller'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

not_run: WebUI.waitForJQueryLoad(60)

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS02_BanAkiOli/A_BasicFlow/Page_Seller/div_Transportation Store'))

not_run: WebUI.delay(1)

not_run: WebUI.waitForJQueryLoad(60)

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS02_BanAkiOli/A_BasicFlow/Page_Seller/span_Ban, Aki, Oli'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS02_BanAkiOli/A_BasicFlow/Page_LayananIklan/button_Pasang Iklan (1)'))

WebUI.delay(2)

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS02_BanAkiOli/A_BasicFlow/Page_LayananIklan/img (1)'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS02_BanAkiOli/A_BasicFlow/Page_LayananIklan/button_Pilih (1)'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS02_BanAkiOli/A_BasicFlow/Page_LayananIklan/input_Sisa Kuota_radio_pasang_ku (1)'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS02_BanAkiOli/A_BasicFlow/Page_LayananIklan/button_Gunakan (1)'))

not_run: WebUI.navigateToUrl('https://iklanqc.assetlogistik.com/layananiklan/pasangIklan?SubKategoriID=38&KategoriID=48&sub_text=Ban,%20Aki,%20Oli&layanan_text=Transportation%20Store&detail_pembelian=21486')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS02_BanAkiOli/A_BasicFlow/Page_LayananIklan/input__ff-medium fs-12 (1)'), 
    'Aki GS Bekas Coba')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS02_BanAkiOli/A_BasicFlow/Page_LayananIklan/div__unchecked-icon (1)'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS02_BanAkiOli/A_BasicFlow/Page_LayananIklan/span_Masukkan Jenis Aki'))

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS02_BanAkiOli/A_BasicFlow/Page_LayananIklan/OpsiJenisAki1'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS02_BanAkiOli/A_BasicFlow/Page_LayananIklan/span_Masukkan Merk Aki'))

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS02_BanAkiOli/A_BasicFlow/Page_LayananIklan/OpsiMerkAki1'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS02_BanAkiOli/A_BasicFlow/Page_LayananIklan/input__FormatFloat'), 
    '25,7')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS02_BanAkiOli/A_BasicFlow/Page_LayananIklan/input__FormatFloat_1'), 
    '17,1')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS02_BanAkiOli/A_BasicFlow/Page_LayananIklan/input__FormatFloat_1_2'), 
    '20')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS02_BanAkiOli/A_BasicFlow/Page_LayananIklan/input__FormatFloat_1_2_3'), 
    '12')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS02_BanAkiOli/A_BasicFlow/Page_LayananIklan/input__FormatFloat_1_2_3_4'), 
    '68')

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS02_BanAkiOli/A_BasicFlow/Page_LayananIklan/div_Masukkan Gambar (1)'))

WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS02_BanAkiOli/A_BasicFlow/Page_LayananIklan/UploadImgAki1'), 
    'C://Users/USER/Downloads/ContohAki.jpg')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS02_BanAkiOli/A_BasicFlow/Page_LayananIklan/button_Crop (1)'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS02_BanAkiOli/A_BasicFlow/Page_LayananIklan/input_Rp_FormatInteger (1)'), 
    '1170000')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS02_BanAkiOli/A_BasicFlow/Page_LayananIklan/textarea_text (1)'), 
    'Aki Merk Incoe Ori')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS02_BanAkiOli/A_BasicFlow/Page_LayananIklan/input__no-border form-control dropdownGoogl_af628b (1)'), 
    'Surabaya')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS02_BanAkiOli/A_BasicFlow/Page_LayananIklan/div_Kec. Seputih Surabaya, Kab. Lampung Tengah (1)'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS02_BanAkiOli/A_BasicFlow/Page_LayananIklan/button_Unggah Iklan (1)'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS02_BanAkiOli/A_BasicFlow/Page_LayananIklan/a_Kembali Ke Halaman Awal (1)'))

