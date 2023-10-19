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

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S06_NonAktifIklan/S06_NA01_TransportationStore/NA01_TS01_KendaraanKargo/Page_Seller/div_Layanan Iklan'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S06_NonAktifIklan/S06_NA01_TransportationStore/NA01_TS01_KendaraanKargo/Page_Seller/div_Transportation Store'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S06_NonAktifIklan/S06_NA01_TransportationStore/NA01_TS01_KendaraanKargo/Page_Seller/span_Produk Lainnya'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S06_NonAktifIklan/S06_NA01_TransportationStore/NA01_TS01_KendaraanKargo/Page_LayananIklan/div_Filter'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S06_NonAktifIklan/S06_NA01_TransportationStore/NA01_TS01_KendaraanKargo/Page_LayananIklan/input_Highlight_status_iklan'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S06_NonAktifIklan/S06_NA01_TransportationStore/NA01_TS01_KendaraanKargo/Page_LayananIklan/div_Terapkan'))

for (def i = 1; i <= 1; i++) {
    WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S06_NonAktifIklan/S06_NA01_TransportationStore/NA01_TS01_KendaraanKargo/Page_LayananIklan/div_Aksi Lainnya'))

    WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S06_NonAktifIklan/S06_NA01_TransportationStore/NA01_TS01_KendaraanKargo/Page_LayananIklan/div_Non-Aktifkan'))

    WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S06_NonAktifIklan/S06_NA01_TransportationStore/NA01_TS01_KendaraanKargo/Page_LayananIklan/button_Ya'))

    WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S06_NonAktifIklan/S06_NA01_TransportationStore/NA01_TS01_KendaraanKargo/Page_LayananIklan/img_Logout_close-alert'))

    WebUI.delay(1)
}

