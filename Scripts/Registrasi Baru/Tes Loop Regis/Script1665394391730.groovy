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

def arrName = new String[4]
	arrName[0] = 'Nodas Uziel Putra Serpara'
	arrName[1] = '!@#$%^&*(){}|:">?<'
	arrName[2] = '          '
	arrName[3] = 'Burung077'

def email = new String[5]
	email[0] = 'nodasputra@gmail.com'
	email[1] = 'Danielwibisono539@yahoo.com'
	email[2] = 'Daniel123'
	email[3] = 'Daniel@abc'
	email[4] = 'jeffryreynaldi123@gmail.com@gmail.com'

def noHp = new String[6]
	noHp[0] = '089527607467'
	noHp[1] = '+6285325110668'
	noHp[2] = '0853-2511-0668'
	noHp[3] = '+62 852 354 13 400'
	noHp[4] = '+625349889'
	noHp[5] = 'Abc123'
	
def password = new String[7]
	password[0] = 'Daniel123'
	password[1] = 'Dab12'
	password[2] = 'ABCDabcd'
	password[3] = '+6222222222222'
	password[4] = '000000000000'
	password[5] = ' '
	password[6] = '?><'

def myArray = [[100,200,300,400],[1,2,3,4],[99999]];
	
for (int i = 0; i < 100; i++) {
	for(j=0;j<arrName.size();j++){
	    WebUI.openBrowser('')
	
	    WebUI.navigateToUrl('https://internal.assetlogistik.com/register/email')
	
	    WebUI.setText(findTestObject('Registrasi Baru/fieldNama'), arrName[j])
	
	    WebUI.setText(findTestObject('Registrasi Baru/fieldNoWhatsapp'), '085148991030')
	
	    WebUI.setText(findTestObject('Registrasi Baru/fieldEmail'), 'ryukazuandara@gmail.com')
	
	    WebUI.setText(findTestObject('Registrasi Baru/fieldPassword'), 'Daniel123')
	
	    WebUI.setText(findTestObject('Registrasi Baru/fieldKonfirmasiPassword'), 'Daniel123')
	
	    WebUI.click(findTestObject('Registrasi Baru/buttonDaftar2'))
	
	    WebUI.delay(7)
	}
	for(j=0;j<noHp.size();j++){
		WebUI.openBrowser('')
	
		WebUI.navigateToUrl('https://internal.assetlogistik.com/register/email')
	
		WebUI.setText(findTestObject('Registrasi Baru/fieldNama'), 'noHp ni Bos')
	
		WebUI.setText(findTestObject('Registrasi Baru/fieldNoWhatsapp'), noHp[j])
	
		WebUI.setText(findTestObject('Registrasi Baru/fieldEmail'), 'ryukazuandara@gmail.com')
	
		WebUI.setText(findTestObject('Registrasi Baru/fieldPassword'), 'Daniel123')
	
		WebUI.setText(findTestObject('Registrasi Baru/fieldKonfirmasiPassword'), 'Daniel123')
	
		WebUI.click(findTestObject('Registrasi Baru/buttonDaftar2'))
	
		WebUI.delay(7)
	}
	for(j=0;j<email.size();j++){
		WebUI.openBrowser('')
	
		WebUI.navigateToUrl('https://internal.assetlogistik.com/register/email')
	
		WebUI.setText(findTestObject('Registrasi Baru/fieldNama'), 'noHp ni Bos')
	
		WebUI.setText(findTestObject('Registrasi Baru/fieldNoWhatsapp'), '081252110012')
	
		WebUI.setText(findTestObject('Registrasi Baru/fieldEmail'), email[j])
	
		WebUI.setText(findTestObject('Registrasi Baru/fieldPassword'), 'Daniel123')
	
		WebUI.setText(findTestObject('Registrasi Baru/fieldKonfirmasiPassword'), 'Daniel123')
	
		WebUI.click(findTestObject('Registrasi Baru/buttonDaftar2'))
	
		WebUI.delay(7)
	}
	for(j=0;j<password.size();j++){
		WebUI.openBrowser('')
	
		WebUI.navigateToUrl('https://internal.assetlogistik.com/register/email')
	
		WebUI.setText(findTestObject('Registrasi Baru/fieldNama'), 'noHp ni Bos')
	
		WebUI.setText(findTestObject('Registrasi Baru/fieldNoWhatsapp'), '081252110012')
	
		WebUI.setText(findTestObject('Registrasi Baru/fieldEmail'), 'danielraymond@gmail.com')
	
		WebUI.setText(findTestObject('Registrasi Baru/fieldPassword'), password[j])
	
		WebUI.setText(findTestObject('Registrasi Baru/fieldKonfirmasiPassword'), password[j])
	
		WebUI.click(findTestObject('Registrasi Baru/buttonDaftar2'))
	
		WebUI.delay(7)
	}
}
