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

//for (def index : (0..0)) {
//}
WebUI.callTestCase(findTestCase('0_MuatmuatJeff23Apr23/00_RegisLogin/RL01_Login/RL01_A_BasicFlow/RL01_L003_LoginBFShipper'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.callTestCase(findTestCase('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST02_ProsesTender/A_BasicFlow/ST02_T01_BuatProsesTender/ST02_T000_List_ProsesTender'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

for (int i = 1; i <= 5; i++) {
    GlobalVariable.ProsesTenderNama = ('Hantar Jati Unit ' + i)

    WebUI.callTestCase(findTestCase('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST02_ProsesTender/A_BasicFlow/ST02_T01_BuatProsesTender/ST02_T010_Part_BuatProsesTender_Unit_Transporter_1'), 
        [:], FailureHandling.CONTINUE_ON_FAILURE)
}

for (int i = 1; i <= 5; i++) {
    GlobalVariable.ProsesTenderNama = ('Hantar Jati Berat ' + i)

    WebUI.callTestCase(findTestCase('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST02_ProsesTender/A_BasicFlow/ST02_T01_BuatProsesTender/ST02_T011_Part_BuatProsesTender_Berat_Transporter_1'), 
        [:], FailureHandling.CONTINUE_ON_FAILURE)
}

for (int i = 1; i <= 5; i++) {
    GlobalVariable.ProsesTenderNama = ('Hantar Jati Volume ' + i)

    WebUI.callTestCase(findTestCase('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST02_ProsesTender/A_BasicFlow/ST02_T01_BuatProsesTender/ST02_T012_Part_BuatProsesTender_Volume_Transporter_1'), 
        [:], FailureHandling.CONTINUE_ON_FAILURE)
}

