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

WebUI.callTestCase(findTestCase('0_MuatmuatJeff23Apr23/00_RegisLogin/RL01_Login/RL01_A_BasicFlow/RL01_L001_Login'), [:], 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B01_TransportationStore/B01_TS01_KendaraanKargo/Page_muatmuat Website  muatmuat/button_Temukan keperluan pengemasan produk _b2e74a'))

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/04_Buyer/B08_FinanceAssurance/Page_Home  muatmuat/img_BARU_image-item-category'))

WebUI.waitForPageLoad(60)

WebUI.waitForJQueryLoad(60)

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/04_Buyer/B08_FinanceAssurance/Page_Finance  Insurance  muatmuat.com/a_Lainnya'))

WebUI.waitForPageLoad(60)

WebUI.waitForJQueryLoad(60)

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/04_Buyer/B08_FinanceAssurance/Page_Finance  Insurance  muatmuat.com/div_Perusahaan Lainnya'))

WebUI.waitForJQueryLoad(60)

'Loop Kendaraan Kargo'
for (def row = 1; row <= findTestData('DataBuyer/B08_FA00_07_buyer_finance_assurance_perusahaan_lainnya').getRowNumbers(); row++) {
    'Load Page - Awal Loop'
    WebUI.waitForPageLoad(60)

    WebUI.waitForJQueryLoad(60)

    'Search Text'
    WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B01_TransportationStore/B01_TS01_KendaraanKargo/Page_Transportation Store  muatmuat.com/input_Pencarian Terakhir_form-pencarian'), 
        findTestData('DataBuyer/B08_FA00_07_buyer_finance_assurance_perusahaan_lainnya').getValue(12, row))

    'Search Button'
    WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B01_TransportationStore/B01_TS01_KendaraanKargo/Page_Transportation Store  muatmuat.com/img_Pencarian Terakhir_icon-search-white-24'))

    WebUI.waitForJQueryLoad(60)

    'Card Pertama'
    WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B01_TransportationStore/B01_TS01_KendaraanKargo/Page_Transportation Store  muatmuat.com/div_Verified                               _6780d8'))

    WebUI.waitForPageLoad(60)

    WebUI.waitForJQueryLoad(60)

    'Back Button - Akhir Loop'
    WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B01_TransportationStore/B01_TS01_KendaraanKargo/Page_Transportation Store  muatmuat.com/img'))
}

