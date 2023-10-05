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

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/button_layanan-iklan'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_Seller/div_Transportation Store'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_Seller/span_Kendaraan Kargo'))

for (def row = 1; row <= findTestData('transportation_store_kendaraan_kargo').getRowNumbers(); row++) {
    WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/button_Pasang Iklan'))

    WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/input_Sisa Kuota_radio_pasang_ku'))

    WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/button_Gunakan'))

    WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/judul_iklan'), 
        findTestData('transportation_store_kendaraan_kargo').getValue(1, row))

    WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/div_Masukkan Kondisi Barang_unchecked-icon'))

    WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/span_Tahun'))

    WebUI.delay(1)

    WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/OpsiPilihTahun1'))

    WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/input__FormatInteger'), 
        findTestData('transportation_store_kendaraan_kargo').getValue(2, row))

    WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/span_Jenis Truk - Carrier'))

    WebUI.delay(1)

    WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/InputSearchJenisTruk'), 
        findTestData('transportation_store_kendaraan_kargo').getValue(3, row))

    WebUI.delay(1)

    WebUI.waitForJQueryLoad(60)

    WebUI.sendKeys(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/InputSearchJenisTruk'), 
        Keys.chord(Keys.ENTER))

    WebUI.waitForJQueryLoad(60)

    WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/span_Jenis Truk - Carrier_1'))

    WebUI.delay(1)

    WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/InputSearchJenisCarrier'), 
        findTestData('transportation_store_kendaraan_kargo').getValue(4, row))

    WebUI.delay(1)

    WebUI.waitForJQueryLoad(60)

    WebUI.sendKeys(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/InputSearchJenisCarrier'), 
        Keys.chord(Keys.ENTER))

    WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/span_Merk Truk'))

    WebUI.delay(1)

    WebUI.waitForJQueryLoad(60)

    WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/InputSearchMerkTruk'), 
        findTestData('transportation_store_kendaraan_kargo').getValue(5, row))

    WebUI.sendKeys(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/InputSearchMerkTruk'), 
        Keys.chord(Keys.ENTER))

    WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/input__ff-medium fs-12_1'), 
        findTestData('transportation_store_kendaraan_kargo').getValue(6, row))

    WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/div__unchecked-icon'))

    WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/span_Pilih Warna'))

    WebUI.delay(1)

    WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/OpsiPilihWarnaKK1'))

    WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/InputTanggalKK'), 
        findTestData('transportation_store_kendaraan_kargo').getValue(7, row))

    WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/UploadFotoKK1'), 
        findTestData('transportation_store_kendaraan_kargo').getValue(8, row))

    WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/button_Crop'))

    WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/UploadVideoKK1'), 
        findTestData('transportation_store_kendaraan_kargo').getValue(9, row))

    WebUI.delay(2)

    WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/InputCaptionVideoKK'), 
        findTestData('transportation_store_kendaraan_kargo').getValue(10, row))

    WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/input_Rp_FormatInteger'), 
        findTestData('transportation_store_kendaraan_kargo').getValue(11, row))

    WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/textarea_text'), 
        findTestData('transportation_store_kendaraan_kargo').getValue(12, row))

    WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/input__no-border form-control dropdownGoogl_af628b'), 
        findTestData('transportation_store_kendaraan_kargo').getValue(13, row))

    WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/div_Kec. Seputih Surabaya, Kab. Lampung Tengah'))

    not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/button_Unggah Iklan'))

    not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/a_Kembali Ke Halaman Awal'))
}

