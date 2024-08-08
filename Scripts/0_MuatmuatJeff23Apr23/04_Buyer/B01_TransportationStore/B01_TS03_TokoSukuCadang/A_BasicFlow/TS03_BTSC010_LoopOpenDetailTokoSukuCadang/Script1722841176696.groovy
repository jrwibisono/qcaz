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
WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B01_TransportationStore/B01_TS01_KendaraanKargo/Page_muatmuat Website  muatmuat/img_Intermodal Transportation_image-item-category'))

WebUI.waitForPageLoad(60)

WebUI.waitForJQueryLoad(60)

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/04_Buyer/B01_TransportationStore/B01_TS03_TokoSukuCadang/Page_Transportation Store  muatmuat.com/a_Toko Suku Cadang'))

WebUI.waitForPageLoad(60)

WebUI.waitForJQueryLoad(60)

int iklan = 1

card_iklan = WebUI.modifyObjectProperty(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B00_AllBuyer/Page_Transportation Store  muatmuat.com/div_card'), 
    'xpath', 'equals', ('id("grid-card-api")/div[' + iklan) + ']', true)

boolean foundPart = WebUI.verifyElementPresent(card_iklan, 30, FailureHandling.OPTIONAL)

boolean btn_next = true

// Loop Page
while (btn_next) {
	
	iklan = 1
	
    WebUI.waitForPageLoad(60)

    WebUI.waitForJQueryLoad(60)

    // Loop Card
    while (foundPart) {
        'Mulai While'
        WebUI.click(card_iklan)

        WebUI.waitForPageLoad(60)

        WebUI.waitForJQueryLoad(60)

        'Btn Back'
        WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B00_AllBuyer/Page_Transportation Store  muatmuat.com/img'))

        iklan++

        card_iklan = WebUI.modifyObjectProperty(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B00_AllBuyer/Page_Transportation Store  muatmuat.com/div_card'), 
            'xpath', 'equals', ('id("grid-card-api")/div[' + iklan) + ']', true)

        WebUI.waitForPageLoad(60)

        WebUI.waitForJQueryLoad(60)

        foundPart = WebUI.verifyElementPresent(card_iklan, 30, FailureHandling.OPTIONAL)

        if ((foundPart == false) || (iklan > 15)) {
            break
        }
    }
    
    WebUI.waitForPageLoad(60)

    WebUI.waitForJQueryLoad(60)

    btn_next = WebUI.verifyElementPresent(findTestObject('0_MuatmuatJeff23Apr23/04_Buyer/B00_AllBuyer/Page_Transportation Store  muatmuat.com/div_next_page'), 
        30, FailureHandling.OPTIONAL)

    if (btn_next == false) {
        break
    } else {
        WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/04_Buyer/B00_AllBuyer/Page_Transportation Store  muatmuat.com/div_next_page'))
    }
}

