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


def birds = new String[5]
birds[0] = "qc.azlogistik@gmail.com"
birds[1] = "Danielwibisono539@gmail.com"
birds[2] = "Keluargawibisono20@gmail.com"
birds[3] = "bobaasiyorkie@gmail.com"
birds[4] = "jeffryreynaldi123@gmail.com"

WebUI.openBrowser('')

WebUI.navigateToUrl('https://qc.assetlogistik.com/login')

for (int i=0;i<5;i++) {
	
	WebUI.setText(findTestObject('login/email_field'), birds[i])
	
	WebUI.setText(findTestObject('login/password_field'), 'Daniel123')
	
//	if (i==0) {
//		WebUI.setText(findTestObject('login/email_field'), 'qc.azlogistik@gmail.com')
//		
//		WebUI.setText(findTestObject('login/password_field'), 'Daniel123')
//	}else if (i==1) {
//		WebUI.setText(findTestObject('login/email_field'), 'Danielwibisono539@gmail.com')
//		
//		WebUI.setText(findTestObject('login/password_field'), 'Daniel123')
//	}else {
//		WebUI.setText(findTestObject('login/email_field'), 'jeffryreynaldi123@gmail.com')
//		
//		WebUI.setText(findTestObject('login/password_field'), 'Daniel123')
//	}
	
	
	WebUI.click(findTestObject('login/button_login'))
	
	WebUI.click(findTestObject('login/button_logout'))
	
	WebUI.click(findTestObject('login/login-landing-page'))
}
