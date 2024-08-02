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

Mobile.startApplication(GlobalVariable.Apk, true)

Mobile.tap(findTestObject('Object Repository/Muatmuat - Apps/Transporter/Login/Button Lewati'), 0)

Mobile.tap(findTestObject('Object Repository/Muatmuat - Apps/Transporter/Login/Button Bergabung'), 0)

Mobile.tap(findTestObject('Object Repository/Muatmuat - Apps/Transporter/Login/android.widget.ScrollView'), 0)

Mobile.swipe(720, 1780, 720, 422)

Mobile.tap(findTestObject('Object Repository/Muatmuat - Apps/Transporter/Login/Button Masuk'), 0)

Mobile.setText(findTestObject('Object Repository/Muatmuat - Apps/Transporter/Login/Text Field - Email atau No Whatsapp'), GlobalVariable.EmailOrWhatsapp, 60)

Mobile.setText(findTestObject('Object Repository/Muatmuat - Apps/Transporter/Login/Text Field - Password'), GlobalVariable.Password, 60)

Mobile.tap(findTestObject('Object Repository/Muatmuat - Apps/Transporter/Login/android.widget.ScrollView (1)'), 0)

Mobile.swipe(720, 1780, 720, 422)

Mobile.tap(findTestObject('Object Repository/Muatmuat - Apps/Transporter/Login/Button Login'), 0)

//Mobile.closeApplication()