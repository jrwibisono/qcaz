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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://internalqc.assetlogistik.com/login')

WebUI.setText(findTestObject('Object Repository/CobaTanggalShipperList/Page_MuatMuatLogin  muatmuat/input_Email telah terdaftar secara manual_inpEmail'), 
    'hendorphin@azlogistik.net')

WebUI.setEncryptedText(findTestObject('Object Repository/CobaTanggalShipperList/Page_MuatMuatLogin  muatmuat/input_Email telah terdaftar secara manual_i_157eae'), 
    'llJHyGi6KVXuQHNdIs66aA==')

WebUI.click(findTestObject('Object Repository/CobaTanggalShipperList/Page_MuatMuatLogin  muatmuat/span_Masuk'))

WebUI.click(findTestObject('Object Repository/CobaTanggalShipperList/Page_Home  muatmuat/span_Big Fleets'))

WebUI.click(findTestObject('Object Repository/CobaTanggalShipperList/Page_Dashboard  MuatMuat/div_Transporter'))

WebUI.click(findTestObject('Object Repository/CobaTanggalShipperList/Page_Subscription  MuatMuat/a_Shipper'))

WebUI.click(findTestObject('Object Repository/CobaTanggalShipperList/Page_MuatMuat/span_Saring'))

WebUI.click(findTestObject('Object Repository/CobaTanggalShipperList/Page_MuatMuat/img_Bergabung Sejak_datepicker1'))

WebUI.click(findTestObject('Object Repository/CobaTanggalShipperList/Page_MuatMuat/td_1'))

WebUI.click(findTestObject('Object Repository/CobaTanggalShipperList/Page_MuatMuat/img_sd_datepicker2'))

WebUI.click(findTestObject('Object Repository/CobaTanggalShipperList/Page_MuatMuat/td_31'))

WebUI.click(findTestObject('Object Repository/CobaTanggalShipperList/Page_MuatMuat/button_Terapkan'))

