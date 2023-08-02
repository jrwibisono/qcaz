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

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW02_GudangDisewakan/A_BasicFlow/Page_Seller/span_Layanan Iklan'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW02_GudangDisewakan/A_BasicFlow/Page_Seller/div_Property  Warehouse'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI02_PropertyWarehouse/PI02_PW02_GudangDisewakan/A_BasicFlow/Page_Seller/span_Gudang Disewakan'))

WebUI.navigateToUrl('https://iklanqc.assetlogistik.com/layananiklan/iklanDashboard?SubKategoriID=16&KategoriID=27&sub_text=Gudang%20Disewakan&layanan_text=Property%20%26%20Warehouse&no')

