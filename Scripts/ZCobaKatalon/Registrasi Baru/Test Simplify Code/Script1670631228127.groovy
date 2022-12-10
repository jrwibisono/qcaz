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

def burungs = new String[4]
	burungs[0] = 'Nodas Uziel Putra Serpara'
	burungs[1] = '!@#$%^&*(){}|:">?<'
	burungs[2] = '          '
	burungs[3] = 'Burung077'

def birds = new String[5]
	birds[0] = 'nodasputra@gmail.com'
	birds[1] = 'Danielwibisono539@yahoo.com'
	birds[2] = 'Daniel123'
	birds[3] = 'Daniel@abc'
	birds[4]= 'jeffryreynaldi123@gmail.com@gmail.com'

def manuks = new String[6]
	manuks[0] = '089527607467'
	manuks[1] = '+6285325110668'
	manuks[2] = '0853-2511-0668'
	manuks[3] = '+62 852 354 13 400'
	manuks[4] = '+625349889'
	manuks[5] = 'Abc123'
	
def vogels = new String[7]
	vogels[0] = 'Daniel123'
	vogels[1] = 'Dab12'
	vogels[2] = 'ABCDabcd'
	vogels[3] = '+6222222222222'
	vogels[4] = '000000000000'
	vogels[5] = ' '
	vogels[6] = '?><'

	
for (int i = 0; i < 100; i++) {
	WebUI.openBrowser('')
	WebUI.navigateToUrl('https://internal.assetlogistik.com/register/email')
	for(int j = 0;j<burungs.size();j++){
		WebUI.setText(findTestObject('ZCoba Katalon/Iklan - Landing Page (2)/Register/fieldNama'), burungs[j])
			for (int k = 0; k < manuks.size(); k++) {
				WebUI.setText(findTestObject('ZCoba Katalon/Iklan - Landing Page (2)/Register/fieldNoWhatsapp'), manuks[j])
					for (int l = 0; l < birds.size(); l++) {
						WebUI.setText(findTestObject('ZCoba Katalon/Iklan - Landing Page (2)/Register/fieldEmail'), birds[j])
						for (int m = 0; m < vogels.size(); m++) {
							WebUI.setText(findTestObject('ZCoba Katalon/Iklan - Landing Page (2)/Register/fieldPassword'), vogels[j])
							WebUI.setText(findTestObject('ZCoba Katalon/Iklan - Landing Page (2)/Register/fieldKonfirmasiPassword'), vogels[j])
							WebUI.click(findTestObject('ZCoba Katalon/Iklan - Landing Page (2)/Register/buttonDaftar2'))
							WebUI.delay(7)
					}
					WebUI.click(findTestObject('ZCoba Katalon/Iklan - Landing Page (2)/Register/buttonDaftar2'))
					WebUI.delay(7)
				}
				WebUI.click(findTestObject('ZCoba Katalon/Iklan - Landing Page (2)/Register/buttonDaftar2'))
				WebUI.delay(7)
			}
			WebUI.click(findTestObject('ZCoba Katalon/Iklan - Landing Page (2)/Register/buttonDaftar2'))
			WebUI.delay(7)
		}
		WebUI.click(findTestObject('ZCoba Katalon/Iklan - Landing Page (2)/Register/buttonDaftar2'))
		WebUI.delay(7)
	}
//	for(j=0;j<manuks.size();j++){
//		WebUI.openBrowser('')
//	
//		WebUI.navigateToUrl('https://internal.assetlogistik.com/register/email')
//	
//		WebUI.setText(findTestObject('ZCoba Katalon/Iklan - Landing Page (2)/Register/fieldNama'), 'Manuks ni Bos')
//	
//		
//	
//		WebUI.setText(findTestObject('ZCoba Katalon/Iklan - Landing Page (2)/Register/fieldEmail'), 'ryukazuandara@gmail.com')
//	
//		WebUI.setText(findTestObject('ZCoba Katalon/Iklan - Landing Page (2)/Register/fieldPassword'), 'Daniel123')
//	
//		WebUI.setText(findTestObject('ZCoba Katalon/Iklan - Landing Page (2)/Register/fieldKonfirmasiPassword'), 'Daniel123')
//	
//		
//	}
//	for(j=0;j<birds.size();j++){
//		WebUI.openBrowser('')
//	
//		WebUI.navigateToUrl('https://internal.assetlogistik.com/register/email')
//	
//		WebUI.setText(findTestObject('ZCoba Katalon/Iklan - Landing Page (2)/Register/fieldNama'), 'Manuks ni Bos')
//	
//		WebUI.setText(findTestObject('ZCoba Katalon/Iklan - Landing Page (2)/Register/fieldNoWhatsapp'), '081252110012')
//	
//		
//	
//		WebUI.setText(findTestObject('ZCoba Katalon/Iklan - Landing Page (2)/Register/fieldPassword'), 'Daniel123')
//	
//		WebUI.setText(findTestObject('ZCoba Katalon/Iklan - Landing Page (2)/Register/fieldKonfirmasiPassword'), 'Daniel123')
//	
//		WebUI.click(findTestObject('ZCoba Katalon/Iklan - Landing Page (2)/Register/buttonDaftar2'))
//	
//		WebUI.delay(7)
//	}
//	for(j=0;j<vogels.size();j++){
//		WebUI.openBrowser('')
//	
//		WebUI.navigateToUrl('https://internal.assetlogistik.com/register/email')
//	
//		WebUI.setText(findTestObject('ZCoba Katalon/Iklan - Landing Page (2)/Register/fieldNama'), 'Manuks ni Bos')
//	
//		WebUI.setText(findTestObject('ZCoba Katalon/Iklan - Landing Page (2)/Register/fieldNoWhatsapp'), '081252110012')
//	
//		WebUI.setText(findTestObject('ZCoba Katalon/Iklan - Landing Page (2)/Register/fieldEmail'), 'danielraymond@gmail.com')
//	
//		
//	
//		WebUI.click(findTestObject('ZCoba Katalon/Iklan - Landing Page (2)/Register/buttonDaftar2'))
//	
//		WebUI.delay(7)
//	}
//}
