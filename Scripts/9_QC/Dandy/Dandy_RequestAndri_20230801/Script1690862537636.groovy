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

not_run: for (int i = 1; i <= 2; i++) {
    GlobalVariable.ProsesTenderNama = ('Hantar Jati Unit ' + i)

    if (i == 1) {
        GlobalVariable.TransporterTujuan1 = 'PT Tujuh'

        GlobalVariable.LokasiPickupTender = 'Surabaya'

        GlobalVariable.LokasiDestinasiTender = 'Malang'

        GlobalVariable.JumlahSatuan = '300'
    } else {
        GlobalVariable.TransporterTujuan1 = 'PT Sebelas'

        GlobalVariable.LokasiPickupTender = 'Malang'

        GlobalVariable.LokasiDestinasiTender = 'Semarang'

        GlobalVariable.JumlahSatuan = '100'
    }
    
    WebUI.callTestCase(findTestCase('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST02_ProsesTender/A_BasicFlow/ST02_T01_BuatProsesTender/ST02_T007_1_PartBuatProsesTender_Unit_Kirim_Satu_Transporter'), 
        [:], FailureHandling.CONTINUE_ON_FAILURE)
}

not_run: for (int i = 1; i <= 2; i++) {
    GlobalVariable.ProsesTenderNama = ('Hantar Jati Berat ' + i)

    if (i == 1) {
        GlobalVariable.TransporterTujuan1 = 'PT Tujuh'

        GlobalVariable.LokasiPickupTender = 'Semarang'

        GlobalVariable.LokasiDestinasiTender = 'Surakarta'

        GlobalVariable.JumlahSatuan = '300'
    } else {
        GlobalVariable.TransporterTujuan1 = 'PT Sebelas'

        GlobalVariable.LokasiPickupTender = 'Surakarta'

        GlobalVariable.LokasiDestinasiTender = 'Semarang'

        GlobalVariable.JumlahSatuan = '300'
    }
    
    WebUI.callTestCase(findTestCase('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST02_ProsesTender/A_BasicFlow/ST02_T01_BuatProsesTender/ST02_T008_1_PartBuatProsesTender_Berat_Kirim_Satu_Transporter'), 
        [:], FailureHandling.CONTINUE_ON_FAILURE)
}

not_run: for (int i = 1; i <= 2; i++) {
    GlobalVariable.ProsesTenderNama = ('Hantar Jati Volume m3' + i)

    if (i == 1) {
        GlobalVariable.TransporterTujuan1 = 'PT Tujuh'

        GlobalVariable.LokasiPickupTender = 'Surakarta'

        GlobalVariable.LokasiDestinasiTender = 'Semarang'

        GlobalVariable.JumlahSatuan = '50000'
    } else {
        GlobalVariable.TransporterTujuan1 = 'PT Sebelas'

        GlobalVariable.LokasiPickupTender = 'Semarang'

        GlobalVariable.LokasiDestinasiTender = 'Surabaya'

        GlobalVariable.JumlahSatuan = '50000'
    }
    
    WebUI.callTestCase(findTestCase('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST02_ProsesTender/A_BasicFlow/ST02_T01_BuatProsesTender/ST02_T009_1_PartBuatProsesTender_Volume_Kirim_Satu_Transporter'), 
        [:], FailureHandling.CONTINUE_ON_FAILURE)
}

for (int i = 1; i <= 2; i++) {
    GlobalVariable.ProsesTenderNama = ('Hantar Jati Volume L ' + i)

    if (i == 1) {
        GlobalVariable.TransporterTujuan1 = 'PT Tujuh'

        GlobalVariable.LokasiPickupTender = 'Semarang'

        GlobalVariable.LokasiDestinasiTender = 'Malang'

        GlobalVariable.JumlahSatuan = '40000'
    } else {
        GlobalVariable.TransporterTujuan1 = 'PT Sebelas'

        GlobalVariable.LokasiPickupTender = 'Malang'

        GlobalVariable.LokasiDestinasiTender = 'Surakarta'

        GlobalVariable.JumlahSatuan = '40000'
    }
    
    WebUI.callTestCase(findTestCase('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST02_ProsesTender/A_BasicFlow/ST02_T01_BuatProsesTender/ST02_T009_1_PartBuatProsesTender_Volume_Kirim_Satu_Transporter'), 
        [:], FailureHandling.CONTINUE_ON_FAILURE)
}

