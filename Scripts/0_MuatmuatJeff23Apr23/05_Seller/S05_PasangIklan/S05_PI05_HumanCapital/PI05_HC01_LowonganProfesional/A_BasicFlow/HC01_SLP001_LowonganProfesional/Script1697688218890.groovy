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

WebUI.callTestCase(findTestCase('0_MuatmuatJeff23Apr23/00_RegisLogin/RL01_Login/RL01_A_BasicFlow/RL01_L007_LoginSeller'), 
    [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.waitForPageLoad(60)

WebUI.waitForJQueryLoad(60)

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC01_LowonganProfesional/Page_Seller/span_Layanan Iklan (1)'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC01_LowonganProfesional/Page_Seller/div_Human Capital'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC01_LowonganProfesional/Page_Seller/span_Lowongan Profesional'))

for (def row = 1; row <= findTestData('human_capital_lowongan_profesional').getRowNumbers(); row++) {
    WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC01_LowonganProfesional/Page_LayananIklan/button_Pasang Iklan'))

    WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC01_LowonganProfesional/Page_LayananIklan/input_Sisa Kuota_radio_pasang_ku'))

    WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC01_LowonganProfesional/Page_LayananIklan/button_Gunakan'))

    WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC01_LowonganProfesional/Page_LayananIklan/input__ff-medium fs-12'), 
        findTestData('human_capital_lowongan_profesional').getValue(1, row))

    WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC01_LowonganProfesional/Page_LayananIklan/button_Upload'), 
        findTestData('human_capital_lowongan_profesional').getValue(2, row))

    WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC01_LowonganProfesional/Page_LayananIklan/button_Crop'))

    WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC01_LowonganProfesional/Page_LayananIklan/textarea_text'), 
        findTestData('human_capital_lowongan_profesional').getValue(3, row))

    WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC01_LowonganProfesional/Page_LayananIklan/textarea_text_1'), 
        findTestData('human_capital_lowongan_profesional').getValue(4, row))

    WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC01_LowonganProfesional/Page_LayananIklan/span_Masukkan Tingkat Pendidikan'))

    WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC01_LowonganProfesional/Page_LayananIklan/li_tingkat_pendidikan_sekolah_dasar'))

    WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC01_LowonganProfesional/Page_LayananIklan/input__FormatInteger'), 
        findTestData('human_capital_lowongan_profesional').getValue(5, row))

    WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC01_LowonganProfesional/Page_LayananIklan/span_Masukkan Tingkat Jabatan'))

    WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC01_LowonganProfesional/Page_LayananIklan/li_tingkat_jabatan_entry_level'))

    WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC01_LowonganProfesional/Page_LayananIklan/div__unchecked-icon'))

    WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC01_LowonganProfesional/Page_LayananIklan/input_batasan_umur_min'), 
        findTestData('human_capital_lowongan_profesional').getValue(6, row))

    WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC01_LowonganProfesional/Page_LayananIklan/input_batasan_umur_max'), 
        findTestData('human_capital_lowongan_profesional').getValue(7, row))

    WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC01_LowonganProfesional/Page_LayananIklan/textarea_text_1_2'), 
        findTestData('human_capital_lowongan_profesional').getValue(8, row))

    WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC01_LowonganProfesional/Page_LayananIklan/span_Masukkan Tipe Pekerjaan'))

    WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC01_LowonganProfesional/Page_LayananIklan/li_tipe_pekerjaan_freelance'))

    WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC01_LowonganProfesional/Page_LayananIklan/span_Masukkan Sistem Kerja'))

    WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC01_LowonganProfesional/Page_LayananIklan/li_sistem_masuk_kerja_wfo'))

    WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC01_LowonganProfesional/Page_LayananIklan/input_batas_lamaran'), 
        findTestData('human_capital_lowongan_profesional').getValue(9, row))

    WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC01_LowonganProfesional/Page_LayananIklan/input_tentang_perusahaan'), 
        findTestData('human_capital_lowongan_profesional').getValue(10, row))

    WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC01_LowonganProfesional/Page_LayananIklan/input__ff-medium fs-12_1'), 
        findTestData('human_capital_lowongan_profesional').getValue(11, row))

    WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC01_LowonganProfesional/Page_LayananIklan/span_Masukkan Ukuran Perusahaan'))

    WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC01_LowonganProfesional/Page_LayananIklan/li_ukuran_perusahaan_1-50'))

    WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC01_LowonganProfesional/Page_LayananIklan/div_Upload File Foto'), 
        findTestData('human_capital_lowongan_profesional').getValue(12, row))

    WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC01_LowonganProfesional/Page_LayananIklan/button_Crop'))

    WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC01_LowonganProfesional/Page_LayananIklan/input__no-border fs-12 h-30 w-100'), 
        findTestData('human_capital_lowongan_profesional').getValue(13, row))

    WebUI.uploadFile(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC01_LowonganProfesional/Page_LayananIklan/div_Upload File Video'), 
        findTestData('human_capital_lowongan_profesional').getValue(14, row))

    WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC01_LowonganProfesional/Page_LayananIklan/input_caption_video'), 
        findTestData('human_capital_lowongan_profesional').getValue(15, row))

    WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC01_LowonganProfesional/Page_LayananIklan/input_gaji_min'), 
        findTestData('human_capital_lowongan_profesional').getValue(16, row))

    WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC01_LowonganProfesional/Page_LayananIklan/input_gaji_maks'), 
        findTestData('human_capital_lowongan_profesional').getValue(17, row))

    WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC01_LowonganProfesional/Page_LayananIklan/div_Rp_unchecked-icon'))

    WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC01_LowonganProfesional/Page_LayananIklan/textarea_text_1_2_3_4'), 
        findTestData('human_capital_lowongan_profesional').getValue(18, row))

    WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC01_LowonganProfesional/Page_LayananIklan/input__no-border form-control dropdownGoogl_af628b'), 
        findTestData('human_capital_lowongan_profesional').getValue(19, row))

    WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC01_LowonganProfesional/Page_LayananIklan/div_Kota Surabaya'))

    WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC01_LowonganProfesional/Page_LayananIklan/btn_unggah_iklan'))

    WebUI.waitForJQueryLoad(60)

    WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI05_HumanCapital/PI05_HC01_LowonganProfesional/Page_LayananIklan/btn_kembali_awal'))
}

