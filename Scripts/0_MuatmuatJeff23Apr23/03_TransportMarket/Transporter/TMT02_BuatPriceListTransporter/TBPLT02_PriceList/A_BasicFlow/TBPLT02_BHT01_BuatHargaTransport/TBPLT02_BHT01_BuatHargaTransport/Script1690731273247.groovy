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

WebUI.callTestCase(findTestCase('0_MuatmuatJeff23Apr23/00_RegisLogin/RL01_Login/RL01_A_BasicFlow/RL01_L006_LoginTMTransporter'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT02_BuatPriceListTransporter/TBPLT02_BHT01_BuatHargaTransporter/Page_Subscription/a_Buat Price List Transporter'))

not_run: WebUI.navigateToUrl('https://zo3.assetlogistik.com/manajemen-harga-transport/dataArmada')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT02_BuatPriceListTransporter/TBPLT02_BHT01_BuatHargaTransporter/Page_Data Armada  muatmuat/a_Price List'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT02_BuatPriceListTransporter/TBPLT02_BHT01_BuatHargaTransporter/Page_Harga Transport  muatmuat/button_Buat Harga Transport'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT02_BuatPriceListTransporter/TBPLT02_BHT01_BuatHargaTransporter/Page_Buat Harga Transport  muatmuat/span_Pilih Nama Lokasi yang Disimpan'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT02_BuatPriceListTransporter/TBPLT02_BHT01_BuatHargaTransporter/Page_Buat Harga Transport  muatmuat/h6_Tambah Lokasi'))

WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT02_BuatPriceListTransporter/TBPLT02_BHT01_BuatHargaTransporter/Page_Buat Harga Transport  muatmuat/InputNamaLokasiPickup'), 
    'PickupJatim5')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT02_BuatPriceListTransporter/TBPLT02_BHT01_BuatHargaTransporter/Page_Buat Harga Transport  muatmuat/button_Simpan'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT02_BuatPriceListTransporter/TBPLT02_BHT01_BuatHargaTransporter/Page_Buat Harga Transport  muatmuat/span_Pilih Lokasi'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT02_BuatPriceListTransporter/TBPLT02_BHT01_BuatHargaTransporter/Page_Buat Harga Transport  muatmuat/InputSearchPickupKota'), 
    'Surabaya')

WebUI.waitForJQueryLoad(60)

WebUI.delay(2)

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT02_BuatPriceListTransporter/TBPLT02_BHT01_BuatHargaTransporter/Page_Buat Harga Transport  muatmuat/OpsiPickupCity1'))

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT02_BuatPriceListTransporter/TBPLT02_BHT01_BuatHargaTransporter/Page_Buat Harga Transport  muatmuat/DropdownPickupKecamatan'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT02_BuatPriceListTransporter/TBPLT02_BHT01_BuatHargaTransporter/Page_Buat Harga Transport  muatmuat/input_Kecamatan_pickup-semua'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT02_BuatPriceListTransporter/TBPLT02_BHT01_BuatHargaTransporter/Page_Buat Harga Transport  muatmuat/button_Terapkan'))

WebUI.waitForJQueryLoad(60)

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT02_BuatPriceListTransporter/TBPLT02_BHT01_BuatHargaTransporter/Page_Buat Harga Transport  muatmuat/button_Simpan_1'))

WebUI.waitForJQueryLoad(60)

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT02_BuatPriceListTransporter/TBPLT02_BHT01_BuatHargaTransporter/Page_Buat Harga Transport  muatmuat/button_Ya'))

WebUI.waitForJQueryLoad(60)

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT02_BuatPriceListTransporter/TBPLT02_BHT01_BuatHargaTransporter/Page_Buat Harga Transport  muatmuat/ClosePopUpPickup'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT02_BuatPriceListTransporter/TBPLT02_BHT01_BuatHargaTransporter/Page_Buat Harga Transport  muatmuat/span_Pilih Nama Lokasi yang Disimpan_1'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT02_BuatPriceListTransporter/TBPLT02_BHT01_BuatHargaTransporter/Page_Buat Harga Transport  muatmuat/h6_Tambah Lokasi'))

WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT02_BuatPriceListTransporter/TBPLT02_BHT01_BuatHargaTransporter/Page_Buat Harga Transport  muatmuat/InputNamaLokasiPickup'), 
    'JatimDestinasi5')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT02_BuatPriceListTransporter/TBPLT02_BHT01_BuatHargaTransporter/Page_Buat Harga Transport  muatmuat/button_Simpan'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT02_BuatPriceListTransporter/TBPLT02_BHT01_BuatHargaTransporter/Page_Buat Harga Transport  muatmuat/span_Pilih Lokasi_1'))

WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT02_BuatPriceListTransporter/TBPLT02_BHT01_BuatHargaTransporter/Page_Buat Harga Transport  muatmuat/InputSearchDestinasiKota'), 
    'Surabaya')

WebUI.delay(2)

WebUI.waitForJQueryLoad(60)

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT02_BuatPriceListTransporter/TBPLT02_BHT01_BuatHargaTransporter/Page_Buat Harga Transport  muatmuat/OpsiDestinasiCity1'))

WebUI.waitForJQueryLoad(60)

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT02_BuatPriceListTransporter/TBPLT02_BHT01_BuatHargaTransporter/Page_Buat Harga Transport  muatmuat/PilihKecamatanDestinasi'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT02_BuatPriceListTransporter/TBPLT02_BHT01_BuatHargaTransporter/Page_Buat Harga Transport  muatmuat/input_Kecamatan_destination-semua'))

WebUI.waitForJQueryLoad(60)

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT02_BuatPriceListTransporter/TBPLT02_BHT01_BuatHargaTransporter/Page_Buat Harga Transport  muatmuat/button_Terapkan_1'))

WebUI.waitForJQueryLoad(60)

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT02_BuatPriceListTransporter/TBPLT02_BHT01_BuatHargaTransporter/Page_Buat Harga Transport  muatmuat/BtnSimpanDestinasi'))

WebUI.waitForJQueryLoad(60)

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT02_BuatPriceListTransporter/TBPLT02_BHT01_BuatHargaTransporter/Page_Buat Harga Transport  muatmuat/button_Ya'))

WebUI.waitForJQueryLoad(60)

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT02_BuatPriceListTransporter/TBPLT02_BHT01_BuatHargaTransporter/Page_Buat Harga Transport  muatmuat/ClosePopUpDestinasi'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT02_BuatPriceListTransporter/TBPLT02_BHT01_BuatHargaTransporter/Page_Buat Harga Transport  muatmuat/input_Harge Per Unit (Rp)_custom-input-form_1baf9c'), 
    '2000000')

WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT02_BuatPriceListTransporter/TBPLT02_BHT01_BuatHargaTransporter/Page_Buat Harga Transport  muatmuat/InputHargaTruck2'), 
    '4000000')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT02_BuatPriceListTransporter/TBPLT02_BHT01_BuatHargaTransporter/Page_Buat Harga Transport  muatmuat/span_Pilih Jenis Pembayaran'))

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT02_BuatPriceListTransporter/TBPLT02_BHT01_BuatHargaTransporter/Page_Buat Harga Transport  muatmuat/OpsiPilihJenisPembayaran1'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT02_BuatPriceListTransporter/TBPLT02_BHT01_BuatHargaTransporter/Page_Buat Harga Transport  muatmuat/textarea_(Opsional)_fee_notes'), 
    'Termasuk PPN 10%')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT02_BuatPriceListTransporter/TBPLT02_BHT01_BuatHargaTransporter/Page_Buat Harga Transport  muatmuat/textarea_(Opsional)_additional_notes'), 
    'Ini Catatan Tambahan')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT02_BuatPriceListTransporter/TBPLT02_BHT01_BuatHargaTransporter/Page_Buat Harga Transport  muatmuat/button_Simpan_1'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT02_BuatPriceListTransporter/TBPLT02_BHT01_BuatHargaTransporter/Page_Buat Harga Transport  muatmuat/img'))

