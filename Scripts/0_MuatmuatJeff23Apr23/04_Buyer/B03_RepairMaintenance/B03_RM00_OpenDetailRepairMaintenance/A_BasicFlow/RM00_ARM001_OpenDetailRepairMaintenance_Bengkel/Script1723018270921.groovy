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

'Masuk Transportation Store'
WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/04_Buyer/B03_RepairMaintenance/B03_RM01_Bengkel/Page_muatmuat Website  muatmuat/div_Repair  Maintenance ServiceTemukan beng_9ab6df'))

WebUI.waitForPageLoad(60)

WebUI.waitForJQueryLoad(60)

not_run: WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/04_Buyer/B02_PropertyWarehouse/B02_PW01_GudangDijual/Page_Property  Warehouse  muatmuat.com/a_Gudang Dijual'))

not_run: WebUI.waitForPageLoad(60)

not_run: WebUI.waitForJQueryLoad(60)

'Loop Kendaraan Kargo'
for (def row = 1; row <= findTestData('DataBuyer/B03_RM00_01_buyer_repair_maintenance_bengkel').getRowNumbers(); row++) {
    'Load Page - Awal Loop'
    WebUI.waitForPageLoad(60)

    WebUI.waitForJQueryLoad(60)

    'Search Text'
    WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B01_TransportationStore/B01_TS01_KendaraanKargo/Page_Transportation Store  muatmuat.com/input_Pencarian Terakhir_form-pencarian'), 
        findTestData('DataBuyer/B03_RM00_01_buyer_repair_maintenance_bengkel').getValue(12, row))

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

