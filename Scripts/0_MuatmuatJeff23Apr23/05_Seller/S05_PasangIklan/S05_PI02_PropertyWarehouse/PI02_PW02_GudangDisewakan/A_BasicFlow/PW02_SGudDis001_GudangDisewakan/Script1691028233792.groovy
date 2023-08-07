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

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW02_GudangDisewakan/A_BasicFlow/Page_Seller/span_Layanan Iklan (1)'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW02_GudangDisewakan/A_BasicFlow/Page_Seller/div_Property  Warehouse (1)'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW02_GudangDisewakan/A_BasicFlow/Page_Seller/span_Gudang Disewakan (1)'))

not_run: WebUI.navigateToUrl('https://iklanqc.assetlogistik.com/layananiklan/iklanDashboard?SubKategoriID=16&KategoriID=27&sub_text=Gudang%20Disewakan&layanan_text=Property%20%26%20Warehouse&no')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW02_GudangDisewakan/A_BasicFlow/Page_LayananIklan/button_Pasang Iklan'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW02_GudangDisewakan/A_BasicFlow/Page_LayananIklan/input_Sisa Kuota_radio_pasang_ku'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW02_GudangDisewakan/A_BasicFlow/Page_LayananIklan/button_Gunakan'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW02_GudangDisewakan/A_BasicFlow/Page_LayananIklan/input__ff-medium fs-12'), 
    'Gudang Disewakan Coba')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW02_GudangDisewakan/A_BasicFlow/Page_LayananIklan/div__unchecked-icon'))

WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW02_GudangDisewakan/A_BasicFlow/Page_LayananIklan/InputLuasTanah'), 
    '20')

WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW02_GudangDisewakan/A_BasicFlow/Page_LayananIklan/InputLuasBangunan'), 
    '20')

WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW02_GudangDisewakan/A_BasicFlow/Page_LayananIklan/InputLebarJalan'), 
    '20')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW02_GudangDisewakan/A_BasicFlow/Page_LayananIklan/span_Kendaraan Yang Dapat Lewat'))

WebUI.waitForJQueryLoad(60)

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW02_GudangDisewakan/A_BasicFlow/Page_LayananIklan/OpsiKendaraanYangDapatLewat'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW02_GudangDisewakan/A_BasicFlow/Page_LayananIklan/span_Hadap'))

WebUI.waitForJQueryLoad(60)

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW02_GudangDisewakan/A_BasicFlow/Page_LayananIklan/OpsiHadap'))

WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW02_GudangDisewakan/A_BasicFlow/Page_LayananIklan/InputDayaListrik'), 
    '2000')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW02_GudangDisewakan/A_BasicFlow/Page_LayananIklan/span_Tahun Dibangun'))

WebUI.waitForJQueryLoad(60)

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW02_GudangDisewakan/A_BasicFlow/Page_LayananIklan/OpsiTahunDibangun'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW02_GudangDisewakan/A_BasicFlow/Page_LayananIklan/span_Tahun Terakhir Renovasi'))

WebUI.waitForJQueryLoad(60)

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW02_GudangDisewakan/A_BasicFlow/Page_LayananIklan/OpsiTahunRenovasi'))

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW02_GudangDisewakan/A_BasicFlow/Page_LayananIklan/ChkBoxFasilitasAC'))

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW02_GudangDisewakan/A_BasicFlow/Page_LayananIklan/ChkBoxBarangKhususFoodGrade'))

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW02_GudangDisewakan/A_BasicFlow/Page_LayananIklan/div_Upload Foto'))

WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW02_GudangDisewakan/A_BasicFlow/Page_LayananIklan/UploadFotoGudDis1'), 
    'C://Users/USER/Downloads/ContohBan.jpg')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW02_GudangDisewakan/A_BasicFlow/Page_LayananIklan/button_Crop'))

WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW02_GudangDisewakan/A_BasicFlow/Page_LayananIklan/InputHarga'), 
    '2000000')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW02_GudangDisewakan/A_BasicFlow/Page_LayananIklan/textarea_text'), 
    'Gudang Sewa Deskripsi Coba')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW02_GudangDisewakan/A_BasicFlow/Page_LayananIklan/input__no-border form-control dropdownGoogl_af628b'), 
    'Kenjeran')

WebUI.waitForJQueryLoad(60)

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW02_GudangDisewakan/A_BasicFlow/Page_LayananIklan/div_Kec. Kenjeran, Kota Surabaya'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW02_GudangDisewakan/A_BasicFlow/Page_LayananIklan/input__ff-medium fs-12_1'), 
    'Kedungdoro 101, Surabaya, Jawa Timur')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW02_GudangDisewakan/A_BasicFlow/Page_LayananIklan/button_Unggah Iklan'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW02_GudangDisewakan/A_BasicFlow/Page_LayananIklan/a_Kembali Ke Halaman Awal'))

