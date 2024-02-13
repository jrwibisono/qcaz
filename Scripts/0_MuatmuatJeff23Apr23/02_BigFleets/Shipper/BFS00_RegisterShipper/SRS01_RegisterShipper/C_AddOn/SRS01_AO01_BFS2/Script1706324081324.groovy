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

'Upload File Surat Jalan'
WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS00_RegisterShipper/Page_Register Big Fleets Shipper/upload_file_surat_jalan'), 
    'C:\\Users\\Dandy\\Downloads\\Data (31).pdf')

'Nama PIC 1'
WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS00_RegisterShipper/Page_Register Big Fleets Shipper/input_Nama PIC 1_Pic1Name'), 
    'Doni')

'Nomor HP PIC 1'
WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS00_RegisterShipper/Page_Register Big Fleets Shipper/input_No. HP PIC 1_Pic1Phone'), 
    '081336437133')

'Nama PIC 2'
WebUI.setText(findTestObject(null), '')

'Nomor HP PIC 2'
WebUI.setText(findTestObject(null), '')

'Nama PIC 3'
WebUI.setText(findTestObject(null), '')

'Nomor HP PIC 3'
WebUI.setText(findTestObject(null), '')

'Tombol Daftar'
WebUI.click(findTestObject(null))

WebUI.waitForPageLoad(60)

'Tombol Jelajahi Produk Lainnya'
WebUI.click(findTestObject(null))

