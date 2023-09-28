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

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW05_ProdukLainnya/Page_Seller/span_Layanan Iklan (1)'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW05_ProdukLainnya/Page_Seller/div_Property  Warehouse (1)'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW05_ProdukLainnya/Page_Seller/span_Produk Lainnya'))

for (def row = 1; row <= findTestData('property_warehouse_produk_lainnya').getRowNumbers(); row++) {
    WebUI.waitForPageLoad(60)

    WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW05_ProdukLainnya/Page_LayananIklan/button_Pasang Iklan'))

    WebUI.delay(5)

    WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW05_ProdukLainnya/Page_LayananIklan/input_Sisa Kuota_radio_pasang_ku'))

    WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW05_ProdukLainnya/Page_LayananIklan/button_Gunakan'))

    WebUI.waitForPageLoad(5)

    WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW05_ProdukLainnya/Page_LayananIklan/input__ff-medium fs-12'), 
        findTestData('property_warehouse_produk_lainnya').getValue(1, row))

    WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW05_ProdukLainnya/Page_LayananIklan/upload_foto1'), 
        findTestData('property_warehouse_produk_lainnya').getValue(2, row))

    WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW05_ProdukLainnya/Page_LayananIklan/button_Crop'))

    WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW05_ProdukLainnya/Page_LayananIklan/upload_foto2'), 
        findTestData('property_warehouse_produk_lainnya').getValue(3, row))

    WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW05_ProdukLainnya/Page_LayananIklan/button_Crop'))

    not_run: WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW05_ProdukLainnya/Page_LayananIklan/div_Masukkan Video'), 
        '')

    WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW05_ProdukLainnya/Page_LayananIklan/input_harga'), 
        findTestData('property_warehouse_produk_lainnya').getValue(4, row))

    WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW05_ProdukLainnya/Page_LayananIklan/textarea_text'), 
        findTestData('property_warehouse_produk_lainnya').getValue(5, row))

    WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW05_ProdukLainnya/Page_LayananIklan/input__no-border form-control dropdownGoogl_af628b'), 
        findTestData('property_warehouse_produk_lainnya').getValue(6, row))

    WebUI.waitForJQueryLoad(5)

    WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW05_ProdukLainnya/Page_LayananIklan/div_Kec. Tangerang, Kota Tangerang'))

    WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW05_ProdukLainnya/Page_LayananIklan/btn_unggah_iklan'))

    WebUI.waitForJQueryLoad(60)

    WebUI.waitForPageLoad(60)

    WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW05_ProdukLainnya/Page_LayananIklan/btn_kembali_halaman_awal'))
}

