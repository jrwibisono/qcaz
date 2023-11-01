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

String[] arrGender = gender.split(GlobalVariable.Separator)
for (int i = 0; i < arrGender.length; i++) {
	TestData data = findTestData("Data Files/Muatmuat - Apps/gender")
	for (int j = 1; j <= data.getRowNumbers(); j++ ) {
		if (arrGender[i] == data.getValue(1, j)) {
			String objectName = data.getValue(1, j)
			Mobile.tap(findTestObject('Object Repository/Muatmuat - Apps/Seller/Form Pasang Iklan/Step 2/Dropdown/Jenis Kelamin/Checkbox ' + objectName), 0)
		}
	}
}

Mobile.tap(findTestObject('Object Repository/Muatmuat - Apps/Seller/Form Pasang Iklan/Step 2/Button Simpan'), 0)