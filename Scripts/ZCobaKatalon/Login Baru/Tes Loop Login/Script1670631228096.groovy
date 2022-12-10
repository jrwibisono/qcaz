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

def birds = new String[11]
	birds[0] = 'nodasputra@gmail.com'
	birds[1] = 'Danielwibisono539@yahoo.com'
	birds[2] = 'Daniel123'
	birds[3] = 'Daniel@abc'
	birds[4] = 'jeffryreynaldi123@gmail.com@gmail.com'
	birds[5] = '089527607467'
	birds[6] = '+6285325110668'
	birds[7] = '0853-2511-0668'
	birds[8] = '+62 852 354 13 400'
	birds[9] = '+625349889'
	birds[10] = 'Abc123'

def vogels = new String[7]
	vogels[0] = 'Daniel123'
	vogels[1] = 'Dab12'
	vogels[2] = 'ABCDabcd'
	vogels[3] = '+6222222222222'
	vogels[4] = '000000000000'
	vogels[5] = ' '
	vogels[6] = '?><'

for (int i = 0; i < 50; i++) {
    for (j = 0; j < birds.size(); j++) {
        WebUI.openBrowser('')

        WebUI.navigateToUrl('https://internal.assetlogistik.com/login')

        WebUI.setText(findTestObject('ZCoba Katalon/Iklan - Landing Page (1)/Login/fieldEmailNoWhatsapp'), birds[j])

        WebUI.setText(findTestObject('ZCoba Katalon/Iklan - Landing Page (2)/Login/fieldPassword'), 'Daniel123')

        WebUI.click(findTestObject('ZCoba Katalon/Iklan - Landing Page/Login/buttonMasuk'))

        WebUI.delay(7)
    }
    
    for (j = 0; j < birds.size(); j++) {
        WebUI.openBrowser('')

        WebUI.navigateToUrl('https://internal.assetlogistik.com/login')

        WebUI.setText(findTestObject('ZCoba Katalon/Iklan - Landing Page (2)/Register/fieldNama'), 'danielreynaldi@gmail.com')

        WebUI.setText(findTestObject('ZCoba Katalon/Iklan - Landing Page (2)/Register/fieldPassword'), vogels[j])

        WebUI.click(findTestObject('ZCoba Katalon/Iklan - Landing Page (2)/Register/buttonDaftar2'))

        WebUI.delay(7)
    }
}

