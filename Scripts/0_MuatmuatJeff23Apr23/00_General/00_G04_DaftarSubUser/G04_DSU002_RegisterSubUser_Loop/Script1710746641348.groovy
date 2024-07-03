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

WebUI.callTestCase(findTestCase('0_MuatmuatJeff23Apr23/00_RegisLogin/RL01_Login/RL01_A_BasicFlow/RL01_L001_Login_WO_Report'), 
    [('noTelp') : GlobalVariable.User, ('password') : GlobalVariable.User_Password], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/00_General/Page_Home  muatmuat/div_Kal Tsit Sechs'))

'Masuk Profile'
WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/00_General/Page_Home  muatmuat/a_Profile'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/00_General/Page_Profile Management  muatmuat/a_Manajemen User'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/00_General/Page_User Management  muatmuat/a_OK_CloseBtn1'))

for (def row = 1; row <= findTestData('test_smtp_sub_user').getRowNumbers(); row++) {
    WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/00_General/Page_User Management  muatmuat/button_Tambah User'))

    String subUserName = findTestData('test_smtp_sub_user').getValue(2, row)

    String subUserEmail = findTestData('test_smtp_sub_user').getValue(3, row)

    String subUserPhone = findTestData('test_smtp_sub_user').getValue(4, row)

    String subUserPassword = 'Gundam00'

    'Nama Sub User'
    WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/00_General/Page_User Management  muatmuat/input_Nama Lengkap_name'), 
        subUserName)

    'Email Sub User'
    WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/00_General/Page_User Management  muatmuat/input_Email_email-'), 
        subUserEmail)

    'Nomor Sub User'
    WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/00_General/Page_User Management  muatmuat/input_No. Whatsapp_phone'), 
        subUserPhone)

    WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/00_General/Page_User Management  muatmuat/button_Tambah User_1'))

    WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/00_General/Page_User Management  muatmuat/img'))

    WebUI.waitForJQueryLoad(60)

    WebUI.waitForPageLoad(60)
}

'Masuk Yopmail'
not_run: WebUI.navigateToUrl('https://yopmail.com/')

'Email Sub User di Yopmail'
not_run: WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/00_General/Page_YOPmail - Disposable Email Address - A_32619f/input_Type the Email name of your choice_login'), 
    subUserEmail)

not_run: WebUI.sendKeys(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/00_General/Page_YOPmail - Disposable Email Address - A_32619f/input_Type the Email name of your choice_login'), 
    Keys.chord(Keys.ENTER))

not_run: WebUI.switchToWindowTitle('Inbox')

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/00_General/Page_Inbox/button_Verifikasi Email'))

'Password Sub User'
not_run: WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/00_General/Page_Verif Email Sub User  muatmuat/input_Email Sub User Anda Berhasil didaftar_ca5a0d'), 
    subUserPassword)

not_run: WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/00_General/Page_Verif Email Sub User  muatmuat/input_Email Sub User Anda Berhasil didaftar_39f6d7'), 
    subUserPassword)

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/00_General/Page_Verif Email Sub User  muatmuat/button_Lanjutkan'))

//Cek URL CEK OTP NE
//GlobalVariable.UrlCekOTP = ('https://rc.azlogistik.id/tan/viewotp?data=' + noTelp)
not_run: String urlCekOtpOri = GlobalVariable.UrlCekOTP

not_run: GlobalVariable.UrlCekOTP = (GlobalVariable.UrlCekOTP + subUserPhone)

not_run: WebUI.navigateToUrl(GlobalVariable.UrlCekOTP)

not_run: String stringOTP = WebUI.getText(findTestObject('Object Repository/8_Test/CobaAmbilText/Page_/body_MessageCode200,TextOK (uc131uacf5),Dat_598ef3'))

not_run: WebUI.verifyMatch(OTP, '{"Message":{"Code":200,"Text":"OK (성공)"},"Data":{"Pin":"574248","Created":"2023-08-09 17:21:01"},"Type":"TAN_Backdoor_OTP"}"', 
    false)

not_run: String[] OTP

not_run: OTP = stringOTP.split('"')

//for(String values : OTP) {
//	println(values);
//}
not_run: String realOTP = OTP[13]

not_run: println(realOTP)

not_run: String[] splitOTP = realOTP.split('')

//for (String values : splitOTP) {
//	println(values)
//}
not_run: WebUI.switchToWindowTitle('')

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/00_RegisLogin/RL02_Register/RL02_01_RegisterUser1/A_BasicFlow/R01_RU01_RegisterUser/Page_/body_MessageCode200,TextOK (uc131uacf5),Dat_559c02'))

not_run: GlobalVariable.UrlCekOTP = urlCekOtpOri

not_run: WebUI.switchToWindowTitle('Verifikasi Whatsapp | muatmuat')

not_run: WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/00_General/Page_Verif Phone Sub User  muatmuat/input_Masukkan OTP_OTPField1'), 
    splitOTP[0])

not_run: WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/00_General/Page_Verif Phone Sub User  muatmuat/input_Masukkan OTP_OTPField2'), 
    splitOTP[1])

not_run: WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/00_General/Page_Verif Phone Sub User  muatmuat/input_Masukkan OTP_OTPField3'), 
    splitOTP[2])

not_run: WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/00_General/Page_Verif Phone Sub User  muatmuat/input_Masukkan OTP_OTPField4'), 
    splitOTP[3])

not_run: WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/00_General/Page_Verif Phone Sub User  muatmuat/input_Masukkan OTP_OTPField5'), 
    splitOTP[4])

not_run: WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/00_General/Page_Verif Phone Sub User  muatmuat/input_Masukkan OTP_OTPField6'), 
    splitOTP[5])

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/00_General/Page_Berhasil Verif Sub User  muatmuat/button_Masuk ke muatmuat'))

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/00_General/Page_Home  muatmuat/div_Sub User Satu'))

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/00_General/Page_Home  muatmuat/button_Keluar'))

