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

String searchQ = "Saya lupa password saya"

String searchR1 = ""

def hasilCekFAQ = []

WebUI.callTestCase(findTestCase('0_MuatmuatJeff23Apr23/00_RegisLogin/RL01_Login/RL01_A_BasicFlow/RL01_L001_Login'), [:], 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.navigateToUrl('https://rc.azlogistik.id/dashboard/home')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/00_General/Page_Home  muatmuat/a_Pusat Bantuan'))

WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/00_General/Page_Pusat Bantuan  muatmuat/input_Halo ,Ada yang bisa kami bantu_search-input'), 
    searchQ)

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/00_General/Page_Pusat Bantuan  muatmuat/span_Cari'))

searchR1 = WebUI.getText(findTestObject('0_MuatmuatJeff23Apr23/00_General/Page_Pusat Bantuan  muatmuat/div_search_result1'))

if(searchQ == searchR1) {
	hasilCekFAQ.add('V Search FAQ Benar')
} else {
	hasilCekFAQ.add('X Search FAQ Salah')
}

String strHasilCekFAQ = 'Hasil Cek FAQ: \n' + hasilCekFAQ.join('\n')

println(strHasilCekFAQ)