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

WebUI.callTestCase(findTestCase('0_MuatmuatJeff23Apr23/00_RegisLogin/RL01_Login/RL01_A_BasicFlow/RL01_L001_00_NoLogin'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B00_AllBuyer/Page_muatmuat Website  muatmuat/button_Temukan keperluan pengemasan produk _b2e74a'))

'Transportasi Intermoda'
WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B00_AllBuyer/Page_muatmuat Website  muatmuat/img_Transport Market_image-item-category'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B00_AllBuyer/Page_Transportasi Intermoda  muatmuat.com/a_Rail Freight'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B00_AllBuyer/Page_Transportasi Intermoda  muatmuat.com/a_Sea Freight'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B00_AllBuyer/Page_Transportasi Intermoda  muatmuat.com/a_Air Freight'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B00_AllBuyer/Page_Transportasi Intermoda  muatmuat.com/a_Freight Forwarding'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B00_AllBuyer/Page_Transportasi Intermoda  muatmuat.com/a_3 - 5 PL Company'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B00_AllBuyer/Page_Transportasi Intermoda  muatmuat.com/a_Lainnya'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B00_AllBuyer/Page_Transportasi Intermoda  muatmuat.com/div_Perusahaan Lainnya'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B00_AllBuyer/Page_Transportasi Intermoda  muatmuat.com/a_Kembali ke Main Menu'))

'Transportation Store'
WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B00_AllBuyer/Page_muatmuat Website  muatmuat/img_Intermodal Transportation_image-item-category'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B00_AllBuyer/Page_Transportation Store  muatmuat.com/a_Toko Suku Cadang'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B00_AllBuyer/Page_Transportation Store  muatmuat.com/a_Suku Cadang'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B00_AllBuyer/Page_Transportation Store  muatmuat.com/a_Ban, Aki dan Oli'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B00_AllBuyer/Page_Transportation Store  muatmuat.com/div_Aki'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B00_AllBuyer/Page_Transportation Store  muatmuat.com/div_Oli'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B00_AllBuyer/Page_Transportation Store  muatmuat.com/a_Perlengkapan Angkutan'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B00_AllBuyer/Page_Transportation Store  muatmuat.com/a_Container, Semi Trailer, Rigid Carrier'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B00_AllBuyer/Page_Transportation Store  muatmuat.com/div_Rigid Truck Carrier'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B00_AllBuyer/Page_Transportation Store  muatmuat.com/div_Semi Trailer Carrier'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B00_AllBuyer/Page_Transportation Store  muatmuat.com/a_Kendaraan Kargo'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B00_AllBuyer/Page_Transportation Store  muatmuat.com/a_Lainnya'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B00_AllBuyer/Page_Transportation Store  muatmuat.com/div_Produk Lainnya'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B00_AllBuyer/Page_Transportation Store  muatmuat.com/a_Kembali ke Main Menu'))

'Dealer Karoseri'
WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B00_AllBuyer/Page_muatmuat Website  muatmuat/img_Transportation Store_image-item-category'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B00_AllBuyer/Page_Dealer Truk  Karoseri  muatmuat.com/div_Katalog Produk Dealer'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B00_AllBuyer/Page_Dealer Truk  Karoseri  muatmuat.com/a_Karoseri'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B00_AllBuyer/Page_Dealer Truk  Karoseri  muatmuat.com/div_Katalog Produk Karoseri'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B00_AllBuyer/Page_Dealer Truk  Karoseri  muatmuat.com/a_Lainnya'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B00_AllBuyer/Page_Dealer Truk  Karoseri  muatmuat.com/div_Perusahaan Lainnya'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B00_AllBuyer/Page_Dealer Truk  Karoseri  muatmuat.com/a_Kembali ke Main Menu'))

'Repair Maintenance'
WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B00_AllBuyer/Page_muatmuat Website  muatmuat/img_Dealer  Karoseri_image-item-category'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B00_AllBuyer/Page_Repair  Maintenances Service  muatmuat.com/a_Teknisi'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B00_AllBuyer/Page_Repair  Maintenances Service  muatmuat.com/a_Lainnya'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B00_AllBuyer/Page_Repair  Maintenances Service  muatmuat.com/div_Perusahaan Lainnya'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B00_AllBuyer/Page_Repair  Maintenances Service  muatmuat.com/a_Kembali ke Main Menu'))

'Human Capital'
WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B00_AllBuyer/Page_muatmuat Website  muatmuat/img_Repair  Maintenance_image-item-category'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B00_AllBuyer/Page_Human Capital  muatmuat.com/a_Lowongan Umum'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B00_AllBuyer/Page_Human Capital  muatmuat.com/a_Pencari Kerja'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B00_AllBuyer/Page_Human Capital  muatmuat.com/a_HR Consultant and Training'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B00_AllBuyer/Page_Human Capital  muatmuat.com/a_Lainnya'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B00_AllBuyer/Page_Human Capital  muatmuat.com/div_Perusahaan Lainnya'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B00_AllBuyer/Page_Human Capital  muatmuat.com/a_Kembali ke Main Menu'))

'Property Warehouse'
WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B00_AllBuyer/Page_muatmuat Website  muatmuat/img_Human Capital_image-item-category'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B00_AllBuyer/Page_Property  Warehouse  muatmuat.com/a_Gudang Disewakan'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B00_AllBuyer/Page_Property  Warehouse  muatmuat.com/a_Gudang Barang Cair'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B00_AllBuyer/Page_Property  Warehouse  muatmuat.com/a_Jasa Pergudangan'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B00_AllBuyer/Page_Property  Warehouse  muatmuat.com/a_Pusat Logistik Berikat'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B00_AllBuyer/Page_Property  Warehouse  muatmuat.com/a_Peralatan Gudang'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B00_AllBuyer/Page_Property  Warehouse  muatmuat.com/a_Lainnya'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B00_AllBuyer/Page_Property  Warehouse  muatmuat.com/div_Perusahaan Lainnya'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B00_AllBuyer/Page_Property  Warehouse  muatmuat.com/a_Kembali ke Main Menu'))

'Places Promo'
WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B00_AllBuyer/Page_muatmuat Website  muatmuat/img_Property  Warehouse_image-item-category'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B00_AllBuyer/Page_Places  Promo  muatmuat.com/a_Promo KotaKabupaten'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B00_AllBuyer/Page_Places  Promo  muatmuat.com/a_Promo Nasional'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B00_AllBuyer/Page_Places  Promo  muatmuat.com/a_Kembali ke Main Menu'))

'Finance'
WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B00_AllBuyer/Page_muatmuat Website  muatmuat/img_BARU_image-item-category'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B00_AllBuyer/Page_Finance  Insurance  muatmuat.com/a_Asuransi'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B00_AllBuyer/Page_Finance  Insurance  muatmuat.com/a_Venture Capital'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B00_AllBuyer/Page_Finance  Insurance  muatmuat.com/a_Leasing and Financing'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B00_AllBuyer/Page_Finance  Insurance  muatmuat.com/a_Finance and Tax Consultant'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B00_AllBuyer/Page_Finance  Insurance  muatmuat.com/a_Lainnya'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B00_AllBuyer/Page_Finance  Insurance  muatmuat.com/div_Produk Lainnya'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B00_AllBuyer/Page_Finance  Insurance  muatmuat.com/a_Kembali ke Main Menu'))

'Plastic'
WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B00_AllBuyer/Page_muatmuat Website  muatmuat/img_BARU_image-item-category_1'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B00_AllBuyer/Page_Packaging  Plastic  muatmuat.com/a_Lainnya'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B00_AllBuyer/Page_Packaging  Plastic  muatmuat.com/div_Produk Lainnya'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/04_Buyer/B00_AllBuyer/Page_Packaging  Plastic  muatmuat.com/a_Kembali ke Main Menu'))

