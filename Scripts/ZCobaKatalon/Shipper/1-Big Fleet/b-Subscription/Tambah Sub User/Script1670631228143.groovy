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

WebUI.callTestCase(findTestCase('ZCobaKatalon/Shipper/1-Big Fleet/b-Subscription/Tampilan Awal Subscription'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.verifyElementText(findTestObject('ZCoba Katalon/Shipper/Big Fleet/Button Tambah Sub User'), 'Tambah Sub User')

WebUI.click(findTestObject('ZCoba Katalon/Shipper/Big Fleet/Button Tambah Sub User'))

WebUI.verifyTextPresent('Langganan Sub User', false)

WebUI.verifyElementClickable(findTestObject('ZCoba Katalon/Shipper/Big Fleet/Back Button'))

WebUI.click(findTestObject('ZCoba Katalon/Shipper/Big Fleet/Back Button'))

WebUI.verifyElementText(findTestObject('ZCoba Katalon/Shipper/Big Fleet/Button Tambah Sub User'), 'Tambah Sub User')

WebUI.click(findTestObject('ZCoba Katalon/Shipper/Big Fleet/Button Tambah Sub User'))

'Click Pilih Paket Sub User\r\n'
WebUI.click(findTestObject('ZCoba Katalon/Shipper/Big Fleet/Pilihan Paket Sub User'))

WebUI.click(findTestObject('ZCoba Katalon/Shipper/Big Fleet/dropdown pilih sub user'))

WebUI.click(findTestObject('ZCoba Katalon/Shipper/Big Fleet/Button Pembayaran'))

WebUI.click(findTestObject('ZCoba Katalon/Shipper/Big Fleet/Button Metode Bayar'))

WebUI.verifyElementText(findTestObject('ZCoba Katalon/Shipper/Big Fleet/Button Pilih Voucher'), 'Cari Voucher')

WebUI.click(findTestObject('ZCoba Katalon/Shipper/Big Fleet/Button Pilih Voucher'))

WebUI.verifyTextPresent('Cari Voucher', false)

WebUI.setText(findTestObject('ZCoba Katalon/Shipper/Big Fleet/Field Cari Voucher'), 'V')

WebUI.verifyTextPresent('V', false)

WebUI.click(findTestObject('ZCoba Katalon/Shipper/Big Fleet/Button Cari Voucher'))

WebUI.click(findTestObject('ZCoba Katalon/Shipper/Big Fleet/Pilih Voucher'))

WebUI.click(findTestObject('ZCoba Katalon/Shipper/Big Fleet/Button OK - Pop Up Cari Voucher'))

WebUI.click(findTestObject('ZCoba Katalon/Shipper/Big Fleet/Button Buat Pesanan'))

WebUI.verifyTextPresent('Pembayaran', false)

WebUI.click(findTestObject('ZCoba Katalon/Shipper/Big Fleet/Button OK Bayar'))

WebUI.verifyTextPresent('Selamat Anda berhasil berlangganan paket sub user', false)

WebUI.click(findTestObject('ZCoba Katalon/Shipper/Big Fleet/Button Close Pop Up Berhasil Bayar'))

