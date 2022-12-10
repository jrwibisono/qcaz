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

//// Data Uji V1 =========================================================
//def arrName = new String[5]
//arrName[0] = 'Nodas Uziel Putra Serpara'
//arrName[1] = '!@#$%^&*(){}|:">?<'
//arrName[2] = '          '
//arrName[3] = 'Burung077'
//arrName[4] = ''
//
//def arrEmail = new String[10]
//arrEmail[0] = 'nodasputra@gmail.com'
//arrEmail[1] = 'Danielwibisono539@yahoo.com'
//arrEmail[2] = 'Daniel123'
//arrEmail[3] = 'Daniel@abc'
//arrEmail[4] = 'jeffryreynaldi123@gmail.com@gmail.com'
//arrEmail[5] = '@gmail.com'
//arrEmail[6] = '@gmail'
//arrEmail[7] = '.com'
//arrEmail[8] = '           '
//arrEmail[9] = ''
//
//def arrNoHp = new String[15]
//arrNoHp[0] = '089527607467'
//arrNoHp[1] = '+6285325110668'
//arrNoHp[2] = '0853-2511-0668'
//arrNoHp[3] = '+62 852 354 13 400'
//arrNoHp[4] = '6285325110668'
//arrNoHp[5] = 'Abc123'
//arrNoHp[6] = '+625349889'
//arrNoHp[7] = '6285325110668-'
//arrNoHp[8] = '6285325110668-'
//arrNoHp[9] = '0315349889'
//arrNoHp[10] = '0853ABCD'
//arrNoHp[11] = '0853'
//arrNoHp[12] = '?><",'
//arrNoHp[13] = '          '
//arrNoHp[14] = ''
//
//def arrPassword = new String[8]
//arrPassword[0] = 'Daniel123'
//arrPassword[1] = 'Dab12'
//arrPassword[2] = 'ABCDabcd'
//arrPassword[3] = '+6222222222222'
//arrPassword[4] = '000000000000'
//arrPassword[5] = '     '
//arrPassword[6] = '?><'
//arrPassword[7] = ''
//
//def arrConfPasswords = new String[8]
//arrConfPasswords[0] = 'Daniel123'
//arrConfPasswords[1] = 'Dab12'
//arrConfPasswords[2] = 'ABCDabcd'
//arrConfPasswords[3] = '+6222222222222'
//arrConfPasswords[4] = '000000000000'
//arrConfPasswords[5] = '     '
//arrConfPasswords[6] = '?><'
//arrConfPasswords[7] = ''
//
//def arrRefCode = new String[10]
//arrRefCode[0] = ''
//arrRefCode[1] = '            '
//arrRefCode[2] = 'ABCDabcd'
//arrRefCode[3] = '+6222222222222'
//arrRefCode[4] = '0jhuadcb'
//arrRefCode[5] = 'PINGPING'
//arrRefCode[6] = '8QKZ3TMG'
//arrRefCode[7] = '8qkz3tmg'
//arrRefCode[8] = '88888888'
//arrRefCode[9] = '88as'

// Data Uji V2 =========================================================
//// Data Uji V1=========================================================
def arrName = new String[1]
arrName[0] = 'Nodas Uziel Putra Serpara'



// Data Uji Pasti Lancar (Default) =========================================
name = 'Ryukazu'

noHp = '085325110668'

email = 'Ryukazu@gmail.com'

password = 'Qcaz1234'

confPassword = 'Qcaz1234'

refCode = ''

String dataUji = ''

String errornya = ''

String Cetak = ''

// Uji Nama ========================
Cetak = Cetak + loopingRegisterTest(Cetak, dataUji, errornya, 'nama', arrName, name, noHp, email, password, confPassword, refCode)
dataUji = ''
errornya = ''

printBug(Cetak)





def loopingRegisterTest(def Cetak, def dataUji, def errornya, def dataTestType, String[] arrData, def name, def noHp, def email, def password, def confPassword, def refCode) {
	for (int i = 0; i < arrData.size(); i++) {
		
		String TextSyarat   = ''
		String arrDataParam = ''
		
		if (dataTestType.equals('nama')) {
			arrDataParam = (arrData[i])
			TextSyarat = registerFlow(arrDataParam, noHp, email, password, confPassword, refCode)
		}else if (dataTestType.equals('noHp')) {
			arrDataParam = (arrData[i])
			TextSyarat = registerFlow(name, arrDataParam, email, password, confPassword, refCode)
		}else if (dataTestType.equals('email')) {
			arrDataParam = (arrData[i])
			TextSyarat = registerFlow(name, noHp, arrDataParam, password, confPassword, refCode)
		}else if (dataTestType.equals('password')) {
			arrDataParam = (arrData[i])
			TextSyarat = registerFlow(name, noHp, email, arrDataParam, confPassword, refCode)
		}else if (dataTestType.equals('confPassword')) {
			arrDataParam = (arrData[i])
			TextSyarat = registerFlow(name, noHp, email, password, arrDataParam, refCode)
		}else if (dataTestType.equals('refCode')) {
			arrDataParam = (arrData[i])
			TextSyarat = registerFlow(name, noHp, email, password, confPassword, arrDataParam)
		}
	
		dataUji = (((((dataUji + 'Data Uji ke (') + i) + ') ==> ') + (arrData[i])) + '\n')
	
		if (TextSyarat.equals('Syarat dan Ketentuan Pengguna')) {
			println(' Data Benar ==> ' + (arrData[i]))
		} //println(' ============>>> ' + TextSyarat)
		else {
			errornya = (((((errornya + 'UJI REFERRAL CODE :: TIDAK LOLOS == Data Uji ke (') + i) + ') ==> ') + (arrData[i])) + '\n')
		}
	}
	
	Cetak = ((((((Cetak + '==== Data Uji '+ dataTestType +' ====') + '\n') + dataUji) + '\n') + errornya) + '\n')
	
	return Cetak
}

// JRW : Function untuk Flow Register ================================================================

def registerFlow(def name, def noHp, def email, def password, def confPassword, def refCode) {
    WebUI.openBrowser('')

    WebUI.navigateToUrl('https://internalqc.assetlogistik.com/register/email')

    WebUI.setText(findTestObject('ZCoba Katalon/Iklan - Landing Page (2)/Register/fieldNama'), name)

    WebUI.setText(findTestObject('ZCoba Katalon/Iklan - Landing Page (2)/Register/fieldNoWhatsapp'), noHp)

    WebUI.setText(findTestObject('ZCoba Katalon/Iklan - Landing Page (2)/Register/fieldEmail'), email)

    WebUI.setText(findTestObject('ZCoba Katalon/Iklan - Landing Page (2)/Register/fieldPassword'), password)

    WebUI.setText(findTestObject('ZCoba Katalon/Iklan - Landing Page (2)/Register/fieldKonfirmasiPassword'), confPassword)

    WebUI.setText(findTestObject('ZCoba Katalon/Iklan - Landing Page (2)/Register/fieldReferral'), refCode)

    WebUI.click(findTestObject('ZCoba Katalon/Iklan - Landing Page (2)/Register/buttonDaftar2'))

    String TextSyarat = WebUI.getText(findTestObject('ZCoba Katalon/Iklan - Landing Page (2)/Register/GetSyaratdanKetentuan'))

    WebUI.delay(2)

    return TextSyarat
}

// JRW : Flow untuk Cetak Data Uji & Bug ========================================================================

def printBug(def errornya) {
    WebUI.openBrowser('')

    WebUI.navigateToUrl('http://notepad.pw/teskatalon')

    WebUI.setText(findTestObject('ZCoba Katalon/testBasicLogic/Notepad'), errornya)
}


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

