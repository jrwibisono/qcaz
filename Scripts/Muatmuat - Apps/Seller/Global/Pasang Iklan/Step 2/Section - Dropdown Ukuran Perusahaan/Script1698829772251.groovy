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

int companySize = number.toInteger()

if (companySize < 51) {
	Mobile.tap(findTestObject('Object Repository/Muatmuat - Apps/Seller/Form Pasang Iklan/Step 2/Dropdown/Ukuran Perusahaan/android.view.View'), 0)
} else if (companySize > 50 && companySize < 201) {
	Mobile.tap(findTestObject('Object Repository/Muatmuat - Apps/Seller/Form Pasang Iklan/Step 2/Dropdown/Ukuran Perusahaan/android.view.View (1)'), 0)
} else if (companySize > 200 && companySize < 501) {
	Mobile.tap(findTestObject('Object Repository/Muatmuat - Apps/Seller/Form Pasang Iklan/Step 2/Dropdown/Ukuran Perusahaan/android.view.View (2)'), 0)
} else if (companySize > 500 && companySize < 1001) {
	Mobile.tap(findTestObject('Object Repository/Muatmuat - Apps/Seller/Form Pasang Iklan/Step 2/Dropdown/Ukuran Perusahaan/android.view.View (3)'), 0)
} else if (companySize > 1000 && companySize < 2001) {
	Mobile.tap(findTestObject('Object Repository/Muatmuat - Apps/Seller/Form Pasang Iklan/Step 2/Dropdown/Ukuran Perusahaan/android.view.View (4)'), 0)
} else {
	Mobile.tap(findTestObject('Object Repository/Muatmuat - Apps/Seller/Form Pasang Iklan/Step 2/Dropdown/Ukuran Perusahaan/android.view.View (5)'), 0)
}