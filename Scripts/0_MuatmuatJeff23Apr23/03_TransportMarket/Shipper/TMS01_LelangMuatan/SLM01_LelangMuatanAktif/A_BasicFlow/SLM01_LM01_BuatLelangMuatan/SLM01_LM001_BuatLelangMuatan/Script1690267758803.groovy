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

WebUI.callTestCase(findTestCase('0_MuatmuatJeff23Apr23/00_RegisLogin/RL01_Login/RL01_A_BasicFlow/RL01_L005_LoginTMShipper'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForPageLoad(60)

WebUI.delay(1)

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Shipper/TMS01_LelangMuatan/SLM01_LelangMuatanAktif/A_BasicFlow/SLM_LM01_BuatLelangMuatan/Page_Subscription/ClosePopUpAwal'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/03_TransportMarket/Shipper/TMS01_LelangMuatan/SLM01_LelangMuatanAktif/A_BasicFlow/SLM_LM01_BuatLelangMuatan/Page_Subscription/a_Lelang Muatan'))

not_run: WebUI.navigateToUrl(GlobalVariable.URLListLelangMuatan)

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/03_TransportMarket/Shipper/TMS01_LelangMuatan/SLM01_LelangMuatanAktif/A_BasicFlow/SLM_LM01_BuatLelangMuatan/Page_Lelang Aktif  muatmuat/button_Buat Lelang Muatan'))

WebUI.waitForPageLoad(60)

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Shipper/TMS01_LelangMuatan/SLM01_LelangMuatanAktif/A_BasicFlow/SLM_LM01_BuatLelangMuatan/Page_Buat Lelang  muatmuat/SelectPeriodeLelangStart'))

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Shipper/TMS01_LelangMuatan/SLM01_LelangMuatanAktif/A_BasicFlow/SLM_LM01_BuatLelangMuatan/Page_Buat Lelang  muatmuat/PickDate31Aug'))

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Shipper/TMS01_LelangMuatan/SLM01_LelangMuatanAktif/A_BasicFlow/SLM_LM01_BuatLelangMuatan/Page_Buat Lelang  muatmuat/SelectPeriodeLelangEnd'))

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Shipper/TMS01_LelangMuatan/SLM01_LelangMuatanAktif/A_BasicFlow/SLM_LM01_BuatLelangMuatan/Page_Buat Lelang  muatmuat/PickDate31Aug'))

WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Shipper/TMS01_LelangMuatan/SLM01_LelangMuatanAktif/A_BasicFlow/SLM_LM01_BuatLelangMuatan/Page_Buat Lelang  muatmuat/InputJumlahTruk'), 
    '20')

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Shipper/TMS01_LelangMuatan/SLM01_LelangMuatanAktif/A_BasicFlow/SLM_LM01_BuatLelangMuatan/Page_Buat Lelang  muatmuat/DropdownPilihTruk'))

WebUI.delay(1)

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Shipper/TMS01_LelangMuatan/SLM01_LelangMuatanAktif/A_BasicFlow/SLM_LM01_BuatLelangMuatan/Page_Buat Lelang  muatmuat/OptionPilihTruk1'))

WebUI.waitForJQueryLoad(60)

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Shipper/TMS01_LelangMuatan/SLM01_LelangMuatanAktif/A_BasicFlow/SLM_LM01_BuatLelangMuatan/Page_Buat Lelang  muatmuat/DropdownPilihCarrier'))

WebUI.delay(1)

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Shipper/TMS01_LelangMuatan/SLM01_LelangMuatanAktif/A_BasicFlow/SLM_LM01_BuatLelangMuatan/Page_Buat Lelang  muatmuat/OptionPilihCarrier1'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Shipper/TMS01_LelangMuatan/SLM01_LelangMuatanAktif/A_BasicFlow/SLM_LM01_BuatLelangMuatan/Page_Buat Lelang  muatmuat/InputNamaMuatan'), 
    'Plastik')

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Shipper/TMS01_LelangMuatan/SLM01_LelangMuatanAktif/A_BasicFlow/SLM_LM01_BuatLelangMuatan/Page_Buat Lelang  muatmuat/DropdownJenisMuatan'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Shipper/TMS01_LelangMuatan/SLM01_LelangMuatanAktif/A_BasicFlow/SLM_LM01_BuatLelangMuatan/Page_Buat Lelang  muatmuat/OptionJenisMuatan1'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Shipper/TMS01_LelangMuatan/SLM01_LelangMuatanAktif/A_BasicFlow/SLM_LM01_BuatLelangMuatan/Page_Buat Lelang  muatmuat/InputBeratMuatan'), 
    '20')

WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Shipper/TMS01_LelangMuatan/SLM01_LelangMuatanAktif/A_BasicFlow/SLM_LM01_BuatLelangMuatan/Page_Buat Lelang  muatmuat/InputVolumeMuatan'), 
    '20')

WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Shipper/TMS01_LelangMuatan/SLM01_LelangMuatanAktif/A_BasicFlow/SLM_LM01_BuatLelangMuatan/Page_Buat Lelang  muatmuat/InputDimensipMuatan'), 
    '2')

WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Shipper/TMS01_LelangMuatan/SLM01_LelangMuatanAktif/A_BasicFlow/SLM_LM01_BuatLelangMuatan/Page_Buat Lelang  muatmuat/InputDimensilMuatan'), 
    '2')

WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Shipper/TMS01_LelangMuatan/SLM01_LelangMuatanAktif/A_BasicFlow/SLM_LM01_BuatLelangMuatan/Page_Buat Lelang  muatmuat/InputDimensitMuatan'), 
    '2')

WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Shipper/TMS01_LelangMuatan/SLM01_LelangMuatanAktif/A_BasicFlow/SLM_LM01_BuatLelangMuatan/Page_Buat Lelang  muatmuat/InputKoliMuatan'), 
    '20')

WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Shipper/TMS01_LelangMuatan/SLM01_LelangMuatanAktif/A_BasicFlow/SLM_LM01_BuatLelangMuatan/Page_Buat Lelang  muatmuat/InputPilihLokasiPickup'), 
    'kenjeran')

WebUI.delay(2)

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Shipper/TMS01_LelangMuatan/SLM01_LelangMuatanAktif/A_BasicFlow/SLM_LM01_BuatLelangMuatan/Page_Buat Lelang  muatmuat/OptionPilihLokasiPickup'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Shipper/TMS01_LelangMuatan/SLM01_LelangMuatanAktif/A_BasicFlow/SLM_LM01_BuatLelangMuatan/Page_Buat Lelang  muatmuat/InputDetailAlamatPickup'), 
    'kenjeran')

WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Shipper/TMS01_LelangMuatan/SLM01_LelangMuatanAktif/A_BasicFlow/SLM_LM01_BuatLelangMuatan/Page_Buat Lelang  muatmuat/InputNamaPicPickup'), 
    'Budi')

WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Shipper/TMS01_LelangMuatan/SLM01_LelangMuatanAktif/A_BasicFlow/SLM_LM01_BuatLelangMuatan/Page_Buat Lelang  muatmuat/InputNoPicPickup'), 
    '777888999777')

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Shipper/TMS01_LelangMuatan/SLM01_LelangMuatanAktif/A_BasicFlow/SLM_LM01_BuatLelangMuatan/Page_Buat Lelang  muatmuat/SelectTanggalPickup'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Shipper/TMS01_LelangMuatan/SLM01_LelangMuatanAktif/A_BasicFlow/SLM_LM01_BuatLelangMuatan/Page_Buat Lelang  muatmuat/PickDate31AugPickup'))

WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Shipper/TMS01_LelangMuatan/SLM01_LelangMuatanAktif/A_BasicFlow/SLM_LM01_BuatLelangMuatan/Page_Buat Lelang  muatmuat/InputWaktuPickup'), 
    '2000')

WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Shipper/TMS01_LelangMuatan/SLM01_LelangMuatanAktif/A_BasicFlow/SLM_LM01_BuatLelangMuatan/Page_Buat Lelang  muatmuat/InputPilihLokasiBongkar'), 
    'alun semarang')

WebUI.delay(2)

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Shipper/TMS01_LelangMuatan/SLM01_LelangMuatanAktif/A_BasicFlow/SLM_LM01_BuatLelangMuatan/Page_Buat Lelang  muatmuat/OptionPilihLokasiBongkar'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Shipper/TMS01_LelangMuatan/SLM01_LelangMuatanAktif/A_BasicFlow/SLM_LM01_BuatLelangMuatan/Page_Buat Lelang  muatmuat/InputDetailAlamatBongkar'), 
    'Alun Semarang')

WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Shipper/TMS01_LelangMuatan/SLM01_LelangMuatanAktif/A_BasicFlow/SLM_LM01_BuatLelangMuatan/Page_Buat Lelang  muatmuat/InputNamaPicBongkar'), 
    'Santoso')

WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Shipper/TMS01_LelangMuatan/SLM01_LelangMuatanAktif/A_BasicFlow/SLM_LM01_BuatLelangMuatan/Page_Buat Lelang  muatmuat/InputNoPicBongkar'), 
    '888999777888')

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Shipper/TMS01_LelangMuatan/SLM01_LelangMuatanAktif/A_BasicFlow/SLM_LM01_BuatLelangMuatan/Page_Buat Lelang  muatmuat/SelectTanggalBongkar'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Shipper/TMS01_LelangMuatan/SLM01_LelangMuatanAktif/A_BasicFlow/SLM_LM01_BuatLelangMuatan/Page_Buat Lelang  muatmuat/PickDate31AugBongkar'))

WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Shipper/TMS01_LelangMuatan/SLM01_LelangMuatanAktif/A_BasicFlow/SLM_LM01_BuatLelangMuatan/Page_Buat Lelang  muatmuat/InputWaktuBongkar'), 
    '2359')

WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Shipper/TMS01_LelangMuatan/SLM01_LelangMuatanAktif/A_BasicFlow/SLM_LM01_BuatLelangMuatan/Page_Buat Lelang  muatmuat/InputMaksHargaPenawaran'), 
    '50000000')

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Shipper/TMS01_LelangMuatan/SLM01_LelangMuatanAktif/A_BasicFlow/SLM_LM01_BuatLelangMuatan/Page_Buat Lelang  muatmuat/ChkBoxAsuransiPenawaranHarga'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Shipper/TMS01_LelangMuatan/SLM01_LelangMuatanAktif/A_BasicFlow/SLM_LM01_BuatLelangMuatan/Page_Buat Lelang  muatmuat/InputNilaiBarang'), 
    '50000000')

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Shipper/TMS01_LelangMuatan/SLM01_LelangMuatanAktif/A_BasicFlow/SLM_LM01_BuatLelangMuatan/Page_Buat Lelang  muatmuat/ChkBoxLainLainMuat'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Shipper/TMS01_LelangMuatan/SLM01_LelangMuatanAktif/A_BasicFlow/SLM_LM01_BuatLelangMuatan/Page_Buat Lelang  muatmuat/InputLainLainMuat'), 
    'Biaya Pickup')

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Shipper/TMS01_LelangMuatan/SLM01_LelangMuatanAktif/A_BasicFlow/SLM_LM01_BuatLelangMuatan/Page_Buat Lelang  muatmuat/ChkBoxLainLainTempatBongkar'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Shipper/TMS01_LelangMuatan/SLM01_LelangMuatanAktif/A_BasicFlow/SLM_LM01_BuatLelangMuatan/Page_Buat Lelang  muatmuat/InputLainLainTempatBongkar'), 
    'Biaya Bongkar')

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Shipper/TMS01_LelangMuatan/SLM01_LelangMuatanAktif/A_BasicFlow/SLM_LM01_BuatLelangMuatan/Page_Buat Lelang  muatmuat/RadioBtnLainLainTermin'), 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Shipper/TMS01_LelangMuatan/SLM01_LelangMuatanAktif/A_BasicFlow/SLM_LM01_BuatLelangMuatan/Page_Buat Lelang  muatmuat/InputLainLainTermin'), 
    'Biaya Bongkar')

WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Shipper/TMS01_LelangMuatan/SLM01_LelangMuatanAktif/A_BasicFlow/SLM_LM01_BuatLelangMuatan/Page_Buat Lelang  muatmuat/InputCatatanTambahan'), 
    'Biaya Bongkar')

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/03_TransportMarket/Shipper/TMS01_LelangMuatan/SLM01_LelangMuatanAktif/A_BasicFlow/SLM_LM01_BuatLelangMuatan/Page_Buat Lelang  muatmuat/BtnSubmitLelang'), 
    FailureHandling.CONTINUE_ON_FAILURE)

