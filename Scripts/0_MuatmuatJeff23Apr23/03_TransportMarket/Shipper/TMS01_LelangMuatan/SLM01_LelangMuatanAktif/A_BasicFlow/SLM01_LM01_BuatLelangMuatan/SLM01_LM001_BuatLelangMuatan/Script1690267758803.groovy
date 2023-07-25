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

WebUI.callTestCase(findTestCase('0_MuatmuatJeff23Apr23/00_RegisLogin/RL01_Login/RL01_A_BasicFlow/RL01_L005_LoginTMShipper'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/03_TransportMarket/Shipper/TMS01_LelangMuatan/SLM01_LelangMuatanAktif/A_BasicFlow/SLM_LM01_BuatLelangMuatan/Page_Subscription/img'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/03_TransportMarket/Shipper/TMS01_LelangMuatan/SLM01_LelangMuatanAktif/A_BasicFlow/SLM_LM01_BuatLelangMuatan/Page_Subscription/a_Lelang Muatan'))

WebUI.navigateToUrl('https://zo2.assetlogistik.com/lelang/lelangAktif')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/03_TransportMarket/Shipper/TMS01_LelangMuatan/SLM01_LelangMuatanAktif/A_BasicFlow/SLM_LM01_BuatLelangMuatan/Page_Lelang Aktif  muatmuat/button_Buat Lelang Muatan'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/03_TransportMarket/Shipper/TMS01_LelangMuatan/SLM01_LelangMuatanAktif/A_BasicFlow/SLM_LM01_BuatLelangMuatan/Page_Buat Lelang  muatmuat/img_Periode Lelang Muatan_datepicker1'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/03_TransportMarket/Shipper/TMS01_LelangMuatan/SLM01_LelangMuatanAktif/A_BasicFlow/SLM_LM01_BuatLelangMuatan/Page_Buat Lelang  muatmuat/td_25'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/03_TransportMarket/Shipper/TMS01_LelangMuatan/SLM01_LelangMuatanAktif/A_BasicFlow/SLM_LM01_BuatLelangMuatan/Page_Buat Lelang  muatmuat/img_sd_datepicker2'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/03_TransportMarket/Shipper/TMS01_LelangMuatan/SLM01_LelangMuatanAktif/A_BasicFlow/SLM_LM01_BuatLelangMuatan/Page_Buat Lelang  muatmuat/td_25'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/03_TransportMarket/Shipper/TMS01_LelangMuatan/SLM01_LelangMuatanAktif/A_BasicFlow/SLM_LM01_BuatLelangMuatan/Page_Buat Lelang  muatmuat/input_Jumlah Truk_truck_qty'), 
    '50')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/03_TransportMarket/Shipper/TMS01_LelangMuatan/SLM01_LelangMuatanAktif/A_BasicFlow/SLM_LM01_BuatLelangMuatan/Page_Buat Lelang  muatmuat/h6_Jenis Truk'))

