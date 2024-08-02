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

for (def row = 1; row <= findTestData('property_warehouse_gudang_disewakan').getRowNumbers(); row++) {
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW02_GudangDisewakan/A_BasicFlow/Page_LayananIklan/button_Pasang Iklan'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW02_GudangDisewakan/A_BasicFlow/Page_LayananIklan/input_Sisa Kuota_radio_pasang_ku'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW02_GudangDisewakan/A_BasicFlow/Page_LayananIklan/button_Gunakan'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW02_GudangDisewakan/A_BasicFlow/Page_LayananIklan/input__ff-medium fs-12'),
		findTestData('property_warehouse_gudang_disewakan').getValue(1, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW02_GudangDisewakan/A_BasicFlow/Page_LayananIklan/div__unchecked-icon'))
	
	WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW02_GudangDisewakan/A_BasicFlow/Page_LayananIklan/InputLuasTanah'),
		findTestData('property_warehouse_gudang_disewakan').getValue(2, row))
	
	WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW02_GudangDisewakan/A_BasicFlow/Page_LayananIklan/InputLuasBangunan'),
		findTestData('property_warehouse_gudang_disewakan').getValue(3, row))
	
	WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW02_GudangDisewakan/A_BasicFlow/Page_LayananIklan/InputLebarJalan'),
		findTestData('property_warehouse_gudang_disewakan').getValue(4, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW02_GudangDisewakan/A_BasicFlow/Page_LayananIklan/span_Kendaraan Yang Dapat Lewat'))
	
	WebUI.waitForJQueryLoad(60)
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW02_GudangDisewakan/A_BasicFlow/Page_LayananIklan/OpsiKendaraanYangDapatLewat'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW02_GudangDisewakan/A_BasicFlow/Page_LayananIklan/span_Hadap'))
	
	WebUI.waitForJQueryLoad(60)
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW02_GudangDisewakan/A_BasicFlow/Page_LayananIklan/OpsiHadap'))
	
	WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW02_GudangDisewakan/A_BasicFlow/Page_LayananIklan/InputDayaListrik'),
		findTestData('property_warehouse_gudang_disewakan').getValue(5, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW02_GudangDisewakan/A_BasicFlow/Page_LayananIklan/span_Tahun Dibangun'))
	
	WebUI.waitForJQueryLoad(60)
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW02_GudangDisewakan/A_BasicFlow/Page_LayananIklan/OpsiTahunDibangun'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW02_GudangDisewakan/A_BasicFlow/Page_LayananIklan/span_Tahun Terakhir Renovasi'))
	
	WebUI.waitForJQueryLoad(60)
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW02_GudangDisewakan/A_BasicFlow/Page_LayananIklan/OpsiTahunRenovasi'))
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW02_GudangDisewakan/A_BasicFlow/Page_LayananIklan/ChkBoxFasilitasAC'))
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW02_GudangDisewakan/A_BasicFlow/Page_LayananIklan/ChkBoxBarangKhususFoodGrade'))
	
	WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW02_GudangDisewakan/A_BasicFlow/Page_LayananIklan/UploadFotoGudDis1'),
		findTestData('property_warehouse_gudang_disewakan').getValue(6, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW02_GudangDisewakan/A_BasicFlow/Page_LayananIklan/button_Crop'))
	
	WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW02_GudangDisewakan/A_BasicFlow/Page_LayananIklan/InputHarga'),
		findTestData('property_warehouse_gudang_disewakan').getValue(7, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW02_GudangDisewakan/A_BasicFlow/Page_LayananIklan/textarea_text'),
		findTestData('property_warehouse_gudang_disewakan').getValue(8, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW02_GudangDisewakan/A_BasicFlow/Page_LayananIklan/input__no-border form-control dropdownGoogl_af628b'),
		findTestData('property_warehouse_gudang_disewakan').getValue(9, row))
	
	WebUI.waitForJQueryLoad(60)
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW02_GudangDisewakan/A_BasicFlow/Page_LayananIklan/div_Kec. Kenjeran, Kota Surabaya'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW02_GudangDisewakan/A_BasicFlow/Page_LayananIklan/input__ff-medium fs-12_1'),
		findTestData('property_warehouse_gudang_disewakan').getValue(10, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW02_GudangDisewakan/A_BasicFlow/Page_LayananIklan/button_Unggah Iklan'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW02_GudangDisewakan/A_BasicFlow/Page_LayananIklan/a_Kembali Ke Halaman Awal'))
	
	
}

