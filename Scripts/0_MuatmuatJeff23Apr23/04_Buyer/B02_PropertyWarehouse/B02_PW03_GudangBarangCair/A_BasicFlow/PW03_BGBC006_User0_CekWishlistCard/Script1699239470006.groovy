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

WebUI.callTestCase(findTestCase('0_MuatmuatJeff23Apr23/04_Buyer/B02_PropertyWarehouse/B02_PW02_GudangDisewakan/A_BasicFlow/PW02_BGDis001_User0_OpenList'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/04_Buyer/B02_PropertyWarehouse/B02_PW03_GudangBarangCair/Page_Property  Warehouse  muatmuat.com/div_wishlist_card_satu'))

String CheckedText = WebUI.getText(findTestObject('0_MuatmuatJeff23Apr23/04_Buyer/B02_PropertyWarehouse/B02_PW03_GudangBarangCair/Page_Property  Warehouse  muatmuat.com/span_text_ceklogin'))

String ResultText = ''

if (CheckedText == 'Daftar atau Masuk untuk menikmati akses penuh di muatmuat') {
    ResultText = 'MASIH USER 0'
} else {
    ResultText = 'TIDAK TERDETEKSI'
}

GlobalVariable.ProsesTenderNama = ['TestHubungi']

