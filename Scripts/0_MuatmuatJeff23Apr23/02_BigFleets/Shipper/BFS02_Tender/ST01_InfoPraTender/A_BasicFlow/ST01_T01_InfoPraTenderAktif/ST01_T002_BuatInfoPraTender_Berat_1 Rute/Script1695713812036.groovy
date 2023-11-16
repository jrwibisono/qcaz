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

WebUI.callTestCase(findTestCase('0_MuatmuatJeff23Apr23/00_RegisLogin/RL01_Login/RL01_A_BasicFlow/RL01_L003_LoginBFShipper'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST01_InfoPraTender/A_BasicFlow/ST01_T01_BuatInfoPraTender/Page_Subscription  muatmuat/li_Tender'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST01_InfoPraTender/A_BasicFlow/ST01_T01_BuatInfoPraTender/Page_Subscription  muatmuat/a_Info Pra Tender'))

for (def row = 1; row <= findTestData('list_pratender_berat').getRowNumbers(); row++) {
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST01_InfoPraTender/A_BasicFlow/ST01_T01_BuatInfoPraTender/Page_Users  muatmuat/a_Buat Info Pra Tender'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST01_InfoPraTender/A_BasicFlow/ST01_T01_BuatInfoPraTender/Page_Users  muatmuat/button_Pilih TransporterMitra'))
	
    for (def row1 = 1; row1 <= findTestData('list_transporter').getRowNumbers(); row1++) {
        WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST01_InfoPraTender/A_BasicFlow/ST01_T01_BuatInfoPraTender/Page_Users  muatmuat/Input_Mitra'), findTestData('list_transporter').getValue(
                1, row1))

        WebUI.sendKeys(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST01_InfoPraTender/A_BasicFlow/ST01_T01_BuatInfoPraTender/Page_Users  muatmuat/Input_Mitra'), Keys.chord(Keys.ARROW_DOWN, 
                Keys.ENTER))

        WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST01_InfoPraTender/A_BasicFlow/ST01_T01_BuatInfoPraTender/Page_Users  muatmuat/Delete_text_mitra'))
    }
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST01_InfoPraTender/A_BasicFlow/ST01_T01_BuatInfoPraTender/Page_Users  muatmuat/button_Terapkan'))
	
	WebUI.waitForJQueryLoad(60)
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST01_InfoPraTender/A_BasicFlow/ST01_T01_BuatInfoPraTender/Page_Users  muatmuat/input_Judul_namaPratender'), 
	    findTestData('list_pratender_berat').getValue(1, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST01_InfoPraTender/A_BasicFlow/ST01_T01_BuatInfoPraTender/Page_Users  muatmuat/input_Periode_tahap_tender0min_date'))
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST01_InfoPraTender/A_BasicFlow/ST01_T01_BuatInfoPraTender/Page_Users  muatmuat/BtnTodayTanggalMulai'))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST01_InfoPraTender/A_BasicFlow/ST01_T01_BuatInfoPraTender/Page_Users  muatmuat/input_sd_tahap_tender0max_date'))
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST01_InfoPraTender/A_BasicFlow/ST01_T01_BuatInfoPraTender/Page_Users  muatmuat/BtnTodayTanggalAkhir'))
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST01_InfoPraTender/A_BasicFlow/ST01_T01_BuatInfoPraTender/Page_Users  muatmuat/RadBtnBerat'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST01_InfoPraTender/A_BasicFlow/ST01_T01_BuatInfoPraTender/Page_Users  muatmuat/input_Muatan_nama_muatan'), 
	    findTestData('list_pratender_berat').getValue(2, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST01_InfoPraTender/A_BasicFlow/ST01_T01_BuatInfoPraTender/Page_Users  muatmuat/span_Pilih Jenis Muatan_1'))
	
	WebUI.waitForJQueryLoad(60)
	
	WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST01_InfoPraTender/A_BasicFlow/ST01_T01_BuatInfoPraTender/Page_Users  muatmuat/PilihanJenisMuatan1'))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST01_InfoPraTender/A_BasicFlow/ST01_T01_BuatInfoPraTender/Page_Users  muatmuat/input_(opsional)_berat_muatan'), 
	    findTestData('list_pratender_berat').getValue(4, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST01_InfoPraTender/A_BasicFlow/ST01_T01_BuatInfoPraTender/Page_Users  muatmuat/input_(opsional)_volume_muatan'), 
	    findTestData('list_pratender_berat').getValue(3, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST01_InfoPraTender/A_BasicFlow/ST01_T01_BuatInfoPraTender/Page_Users  muatmuat/input_(opsional)_panjang'), 
	    findTestData('list_pratender_berat').getValue(5, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST01_InfoPraTender/A_BasicFlow/ST01_T01_BuatInfoPraTender/Page_Users  muatmuat/input_x_lebar'), 
	    findTestData('list_pratender_berat').getValue(6, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST01_InfoPraTender/A_BasicFlow/ST01_T01_BuatInfoPraTender/Page_Users  muatmuat/input_x_tinggi'), 
	    findTestData('list_pratender_berat').getValue(7, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST01_InfoPraTender/A_BasicFlow/ST01_T01_BuatInfoPraTender/Page_Users  muatmuat/input_(opsional)_jumlah_koli'), 
	    findTestData('list_pratender_berat').getValue(8, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST01_InfoPraTender/A_BasicFlow/ST01_T01_BuatInfoPraTender/Page_Users  muatmuat/input_Rute_rute0pickup'), 
	    findTestData('list_pratender_berat').getValue(9, row))
	
	WebUI.delay(3)
	
	WebUI.sendKeys(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST01_InfoPraTender/A_BasicFlow/ST01_T01_BuatInfoPraTender/Page_Users  muatmuat/input_Rute_rute0pickup'), 
	    Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST01_InfoPraTender/A_BasicFlow/ST01_T01_BuatInfoPraTender/Page_Users  muatmuat/input_Kota Surakarta_rute0destinasi'), 
	    findTestData('list_pratender_berat').getValue(10, row))
	
	WebUI.delay(3)
	
	WebUI.sendKeys(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST01_InfoPraTender/A_BasicFlow/ST01_T01_BuatInfoPraTender/Page_Users  muatmuat/input_Kota Surakarta_rute0destinasi'), 
	    Keys.chord(Keys.ARROW_DOWN, Keys.ENTER))
	
	WebUI.delay(1)
	
	WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST01_InfoPraTender/A_BasicFlow/ST01_T01_BuatInfoPraTender/Page_Users  muatmuat/Input_volume_berat_rute'), findTestData('list_pratender_berat').getValue(11, row))
	
	WebUI.waitForJQueryLoad(60)
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST01_InfoPraTender/A_BasicFlow/ST01_T01_BuatInfoPraTender/Page_Users  muatmuat/textarea_(opsional)_kualifikasi_lampiran'), 
	   findTestData('list_pratender_berat').getValue(12, row))
	
	WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST01_InfoPraTender/A_BasicFlow/ST01_T01_BuatInfoPraTender/Page_Users  muatmuat/textarea_(opsional)_catatan_tambahan'), 
	    findTestData('list_pratender_berat').getValue(13, row))
	
	WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/02_BigFleets/Shipper/BFS02_Tender/ST01_InfoPraTender/A_BasicFlow/ST01_T01_BuatInfoPraTender/Page_Users  muatmuat/button_Buat'))
	
	WebUI.waitForJQueryLoad(240)

}
