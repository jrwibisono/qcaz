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

WebUI.callTestCase(findTestCase('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS01_KontrakHarga/SKH01_KontrakHarga/A_BasicFlow/SKH01_KH01_BuatKontrakBaru/SKH01_KH000_ListBuatKontrakBaru'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

for(int i = 1; i <= 5; i++) {
	GlobalVariable.NomorReferensiKH = 'KH/230815/'+i
	
	WebUI.callTestCase(findTestCase('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS01_KontrakHarga/SKH01_KontrakHarga/A_BasicFlow/SKH01_KH01_BuatKontrakBaru/SKH01_KH001_01_Part_BuatKontrakBaru'),
		[:], FailureHandling.CONTINUE_ON_FAILURE)
}


