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

WebUI.callTestCase(findTestCase('0_MuatmuatJeff23Apr23/00_RegisLogin/RL01_Login/RL01_A_BasicFlow/RL01_L001_00_NoLogin'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B05_HumanCapital/B05_HC01_LowonganProfesional/Page_muatmuat Website  muatmuat/div_Human CapitalCari lowongan dan pelamar _efa029'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B05_HumanCapital/B05_HC01_LowonganProfesional/Page_Human Capital  muatmuat.com/div_card_satu'))

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/04_Buyer/B05_HumanCapital/B05_HC01_LowonganProfesional/Page_Human Capital  muatmuat.com/div_laporkan_iklan_compro'))

String CheckedText = WebUI.getText(findTestObject('0_MuatmuatJeff23Apr23/04_Buyer/B05_HumanCapital/B05_HC01_LowonganProfesional/Page_muatmuat Website  muatmuat/span_text_ceklogin'))

if (CheckedText == 'Silahkan Masuk atau Daftar terlebih dahulu jika belum punya akun muatmuat') {
    println('MASIH USER 0')
} else {
    println('TIDAK TERDETEKSI')
}

