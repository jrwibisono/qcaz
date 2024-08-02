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

String inputSearchUser = 'Mengenai pembelian'

def hasilCekChat = []

WebUI.callTestCase(findTestCase('0_MuatmuatJeff23Apr23/00_RegisLogin/RL01_Login/RL01_A_BasicFlow/RL01_L001_Login'), [:], 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/00_General/Page_Home  muatmuat/img_chat'))

WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/00_General/Page_Chat List  muatmuat/input_search_chat'), inputSearchUser)

WebUI.delay(2)

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/00_General/Page_Chat List  muatmuat/chat_room1'))

WebUI.delay(2)

boolean cekText = WebUI.verifyTextPresent(inputSearchUser, false, FailureHandling.OPTIONAL)

if (cekText) {
    hasilCekChat.add('V Search Chat Berhasil')
} else {
    hasilCekChat.add('X Search Chat Gagal')
}

String strHasilCekChat = 'Hasil Cek FAQ: \n' + hasilCekChat.join('\n')

println(strHasilCekChat)

