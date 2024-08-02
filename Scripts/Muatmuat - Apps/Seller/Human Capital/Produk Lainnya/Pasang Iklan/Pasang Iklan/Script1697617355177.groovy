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

Mobile.callTestCase(findTestCase('Test Cases/Muatmuat - Apps/Seller/Login'), [:])

Mobile.tap(findTestObject('Object Repository/Muatmuat - Apps/Seller/SingleChildScrollView'), 0)

Mobile.swipe(0, 1400, 0, 350)

Mobile.delay(2)

Mobile.tap(findTestObject('Object Repository/Muatmuat - Apps/Seller/Human Capital/Produk Lainnya/Menu'), 0)

Mobile.tap(findTestObject('Object Repository/Muatmuat - Apps/Seller/Form Pasang Iklan/Step 1/Button Buat Iklan'), 0)

for (int i = 0; i < GlobalVariable.TotalLoop; i++) {
	Mobile.callTestCase(findTestCase('Test Cases/Muatmuat - Apps/Seller/Global/Pasang Iklan/Step 1'), [:])
	
	Mobile.callTestCase(findTestCase('Test Cases/Muatmuat - Apps/Seller/Human Capital/Produk Lainnya/Pasang Iklan/Step 2'), [:])
	
	if (Mobile.verifyElementExist(findTestObject('Object Repository/Muatmuat - Apps/Seller/Notifikasi'), GlobalVariable.Timeout, FailureHandling.OPTIONAL)) {
		Mobile.tap(findTestObject('Object Repository/Muatmuat - Apps/Seller/Notifikasi'), 0)
		
		Mobile.pressBack()
	}
}