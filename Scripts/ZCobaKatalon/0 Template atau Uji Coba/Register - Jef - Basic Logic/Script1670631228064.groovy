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

//z = add(2, 3)
//
//println(z) // 5
def password = new String[7]

(password[0]) = 'Daniel123'

(password[1]) = 'Dab12'

(password[2]) = 'ABCDabcd'

(password[3]) = '+6222222222222'

(password[4]) = '000000000000'

(password[5]) = ' '

(password[6]) = '?><'

String errornya = ''

for (j = 0; j < password.size(); j++) {
    //println('ha' + j)
    errornya = ((errornya + (password[j])) + '\n')

    println(password[j])
}

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.google.com/search?q=tes&oq=tes&aqs=chrome..69i57j69i60.435j0j7&sourceid=chrome&ie=UTF-8')

//WebUI.setText(findTestObject('ZCoba Katalon/testBasicLogic/Notepad'), errornya)

String sipp = WebUI.getText(findTestObject('ZCoba Katalon/testBasicLogic/TestNotepad'))


if(sipp.equals('Berita')) {
	println(" ====> " + sipp)
}else {
	println(" Syalalalalalla ")
}
