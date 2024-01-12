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

String titleNotif = ''

def hasilCekNotif = []

WebUI.callTestCase(findTestCase('0_MuatmuatJeff23Apr23/00_RegisLogin/RL01_Login/RL01_A_BasicFlow/RL01_L001_Login'), [:], 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/00_General/Page_Home  muatmuat/img_notifi'))

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/00_General/Page_Notifikasi  muatmuat/div_SemuaNotifikasi'))

titleNotif = WebUI.getText(findTestObject('0_MuatmuatJeff23Apr23/00_General/Page_Notifikasi  muatmuat/div_title_grup_notifikasi'))

if (titleNotif == 'Semua Notifikasi') {
    hasilCekNotif.add('V Berhasil Masuk Halaman Notif Semua Notifikasi')
} else {
    hasilCekNotif.add('X Gagal Masuk Halaman Notif Semua Notifikasi')
}

String strHasilCekNotif = 'Hasil Cek Chat: \n' + hasilCekNotif.join('\n')

println(strHasilCekNotif)

