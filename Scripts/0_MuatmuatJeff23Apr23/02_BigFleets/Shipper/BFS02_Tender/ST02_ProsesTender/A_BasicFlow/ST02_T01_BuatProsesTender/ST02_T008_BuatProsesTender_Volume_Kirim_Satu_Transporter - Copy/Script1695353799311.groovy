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
import org.openqa.selenium.By as By
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory
import org.openqa.selenium.JavascriptExecutor

WebUI.callTestCase(findTestCase('0_MuatmuatJeff23Apr23/00_RegisLogin/RL01_Login/RL01_A_BasicFlow/RL01_L003_LoginBFShipper'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST02_ProsesTender/A_BasicFlow/ST02_T01_BuatProsesTender/Page_Subscription  muatmuat/li_Tender'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST02_ProsesTender/A_BasicFlow/ST02_T01_BuatProsesTender/Page_Subscription  muatmuat/a_Proses Tender'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST02_ProsesTender/A_BasicFlow/ST02_T01_BuatProsesTender/Page_Users  muatmuat/a_Buat Proses Tender'))
// Set the desired date in yyyy-mm-dd format
String desiredDate = "2023-09-26"

// Specify the ID of the input field
String inputFieldId = "min-date-2"

// Get the JavaScript executor instance
JavascriptExecutor jsExecutor = DriverFactory.getWebDriver()

// Execute JavaScript to set the value of the input field
String script = "document.getElementById('" + inputFieldId + "').value = '" + desiredDate + "';"
jsExecutor.executeScript(script)
TestObject myObject = new TestObject('MonthYear')

myObject.addProperty('xpath', ConditionType.EQUALS, '//input[@id="myId"]')