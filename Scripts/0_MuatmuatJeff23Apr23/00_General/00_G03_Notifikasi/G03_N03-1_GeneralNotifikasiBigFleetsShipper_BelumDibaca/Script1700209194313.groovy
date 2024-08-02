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

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/00_General/Page_Notifikasi  muatmuat/div_BFShipper'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/00_General/Page_Notifikasi  muatmuat/div_Tandai Semua Telah Dibaca_btn-notif-all-option'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/00_General/Page_Notifikasi  muatmuat/input_Tampilkan semua notifikasi_RadioTampilkanBelumBaca'))

String attrFirstNotif = WebUI.getAttribute(findTestObject('0_MuatmuatJeff23Apr23/00_General/Page_Notifikasi  muatmuat/div_first_notifikasi'), 
    'class')

int index = attrFirstNotif.indexOf('unseen-notif')

if (index > -1) {
    hasilCekNotif.add('V Berhasil Ganti View Notif BF Shipper Belum Dibaca')
} else {
	boolean noNotifPresent = WebUI.verifyTextPresent('Anda Belum Menerima Notifikasi', false, FailureHandling.OPTIONAL)
	
	if (noNotifPresent) {
		hasilCekNotif.add('V Berhasil Ganti View Notif BF Shipper Belum Dibaca dan Kosong Benar')
	} else {
		hasilCekNotif.add('X Gagal Ganti View Notif BF Shipper Belum Dibaca')
	}
}

String strHasilCekNotif = 'Hasil Cek Notif: \n' + hasilCekNotif.join('\n')

println(strHasilCekNotif)

