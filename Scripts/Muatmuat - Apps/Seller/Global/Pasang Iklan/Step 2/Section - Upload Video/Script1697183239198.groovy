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

if (fileString != '') {
	Mobile.tap(findTestObject('Object Repository/Muatmuat - Apps/Seller/Form Pasang Iklan/Step 2/Button Tambah - Field Video'), 0)
	
	String[] files = fileString.split(GlobalVariable.Separator)
	String[] captions = captionString.split(GlobalVariable.Separator)
	
	for (int i = 0; i < files.length; i++) {
		Mobile.tap(findTestObject('Object Repository/Muatmuat - Apps/Seller/Form Pasang Iklan/Step 2/Button Upload 2'), 0)

		//Mobile.tap(findTestObject('Object Repository/Muatmuat - Apps/Seller/Form Pasang Iklan/Step 2/Upload Photo/Button Gallery'), 0)
		//
		//Mobile.tap(findTestObject('Object Repository/Muatmuat - Apps/Seller/Form Pasang Iklan/Step 2/android.widget.TextView - ' + GlobalVariable.VideoFilename), 0)
		Mobile.callTestCase(findTestCase('Test Cases/Muatmuat - Apps/Seller/Global/Pasang Iklan/Step 2/Upload File'), [('filename'): files[i]])
		
		if (Mobile.verifyElementExist(findTestObject('Object Repository/Muatmuat - Apps/Seller/Form Pasang Iklan/Step 2/android.widget.EditText - Masukan Caption'), GlobalVariable.Timeout, FailureHandling.OPTIONAL)) {
			Mobile.setText(findTestObject('Object Repository/Muatmuat - Apps/Seller/Form Pasang Iklan/Step 2/android.widget.EditText - Masukan Caption'), captions[i], 60)
		} else if (Mobile.verifyElementExist(findTestObject('Object Repository/Muatmuat - Apps/Seller/Form Pasang Iklan/Step 2/android.widget.EditText - Masukkan Caption'), GlobalVariable.Timeout, FailureHandling.OPTIONAL)) {
			Mobile.setText(findTestObject('Object Repository/Muatmuat - Apps/Seller/Form Pasang Iklan/Step 2/android.widget.EditText - Masukkan Caption'), captions[i], 60)
		}
		
		if (i < files.length - 1) {
			Mobile.swipe(720, 1400, 720, 1000)
			Mobile.tap(findTestObject('Object Repository/Muatmuat - Apps/Seller/Form Pasang Iklan/Step 2/Button Tambah'), 0)
			Mobile.swipe(720, 1400, 720, 1000)
		}
	}
	
	Mobile.tap(findTestObject('Object Repository/Muatmuat - Apps/Seller/Form Pasang Iklan/Step 2/Button Simpan'), 0)
}