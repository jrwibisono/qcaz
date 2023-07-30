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

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT02_BuatPriceListTransporter/TBPLT01_DataArmada/A_BasicFLow/TBPLT01_DA01_BuatDataArmada/Page_Subscription/a_Buat Price List Transporter'))

not_run: WebUI.navigateToUrl('https://zo3.assetlogistik.com/manajemen-harga-transport/dataArmada')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT02_BuatPriceListTransporter/TBPLT01_DataArmada/A_BasicFLow/TBPLT01_DA01_BuatDataArmada/Page_Data Armada  muatmuat/button_Buat Data Armada'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT02_BuatPriceListTransporter/TBPLT01_DataArmada/A_BasicFLow/TBPLT01_DA01_BuatDataArmada/Page_Buat Armada  muatmuat/span_Pilih Jenis Truk'))

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT02_BuatPriceListTransporter/TBPLT01_DataArmada/A_BasicFLow/TBPLT01_DA01_BuatDataArmada/Page_Buat Armada  muatmuat/OpsiPilihJenisTruk1'))

WebUI.waitForJQueryLoad(60)

not_run: WebUI.sendKeys(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT02_BuatPriceListTransporter/TBPLT01_DataArmada/A_BasicFLow/TBPLT01_DA01_BuatDataArmada/Page_Buat Armada  muatmuat/span_Pilih Jenis Truk'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT02_BuatPriceListTransporter/TBPLT01_DataArmada/A_BasicFLow/TBPLT01_DA01_BuatDataArmada/Page_Buat Armada  muatmuat/span_Bak Terbuka'))

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT02_BuatPriceListTransporter/TBPLT01_DataArmada/A_BasicFLow/TBPLT01_DA01_BuatDataArmada/Page_Buat Armada  muatmuat/OpsiJenisCarrier1'))

WebUI.waitForJQueryLoad(60)

not_run: WebUI.sendKeys(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT02_BuatPriceListTransporter/TBPLT01_DataArmada/A_BasicFLow/TBPLT01_DA01_BuatDataArmada/Page_Buat Armada  muatmuat/span_Bak Terbuka'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT02_BuatPriceListTransporter/TBPLT01_DataArmada/A_BasicFLow/TBPLT01_DA01_BuatDataArmada/Page_Buat Armada  muatmuat/input_Kapasitas_min_capacity'), 
    '10')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT02_BuatPriceListTransporter/TBPLT01_DataArmada/A_BasicFLow/TBPLT01_DA01_BuatDataArmada/Page_Buat Armada  muatmuat/input_-_max_capacity'), 
    '20')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT02_BuatPriceListTransporter/TBPLT01_DataArmada/A_BasicFLow/TBPLT01_DA01_BuatDataArmada/Page_Buat Armada  muatmuat/input_Dimensi Maksimum_dimensi_panjang'), 
    '2')

WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT02_BuatPriceListTransporter/TBPLT01_DataArmada/A_BasicFLow/TBPLT01_DA01_BuatDataArmada/Page_Buat Armada  muatmuat/InputDimensiLebar'), 
    '2')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT02_BuatPriceListTransporter/TBPLT01_DataArmada/A_BasicFLow/TBPLT01_DA01_BuatDataArmada/Page_Buat Armada  muatmuat/input_x_dimensi_tinggi'), 
    '2')

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT02_BuatPriceListTransporter/TBPLT01_DataArmada/A_BasicFLow/TBPLT01_DA01_BuatDataArmada/Page_Buat Armada  muatmuat/input_Jumlah Unit_truck_qty'), 
    '20')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT02_BuatPriceListTransporter/TBPLT01_DataArmada/A_BasicFLow/TBPLT01_DA01_BuatDataArmada/Page_Buat Armada  muatmuat/button_Buat Data Armada'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/03_TransportMarket/Transporter/TMT02_BuatPriceListTransporter/TBPLT01_DataArmada/A_BasicFLow/TBPLT01_DA01_BuatDataArmada/Page_Buat Armada  muatmuat/img'))

