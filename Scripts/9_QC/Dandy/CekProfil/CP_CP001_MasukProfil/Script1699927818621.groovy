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

String badan_usaha = ''

String bidang_usaha = ''

// PIC Shipper ========================
String shipperPic1 = ''

String shipperPicNumber1 = ''

String shipperPic2 = ''

String shipperPicNumber2 = ''

String shipperPic3 = ''

String shipperPicNumber3 = ''

// PIC Shipper End ========================
// PIC Transporter ========================
String transporterPic1 = ''

String transporterPicNumber1 = ''

String transporterPic2 = ''

String transporterPicNumber2 = ''

String transporterPic3 = ''

String transporterPicNumber3 = ''

// PIC Transporter End ========================
// Grup PIC Isi ========================
String isi_shipperPic1 = 'Jono'

String isi_shipperPicNumber1 = '789456123'

String isi_shipperPic2 = 'Tono'

String isi_shipperPicNumber2 = '741258963'

String isi_shipperPic3 = 'Rino'

String isi_shipperPicNumber3 = '963852741'

String isi_transporterPic1 = 'Yono'

String isi_transporterPicNumber1 = '123456789'

String isi_transporterPic2 = 'Cono'

String isi_transporterPicNumber2 = '842697135'

String isi_transporterPic3 = 'Kino'

String isi_transporterPicNumber3 = '795138462'

def hasilCekPICShipper = []

def hasilCekPICTransporter = []

// Grup Isi PIC End ========================
String input_unit_armada = '60'

String input2_unit_armada = '70'

def hasilCekArmadaProfil = []

String input_no_telp_perusahaan = '741852963'

String last_nama_armada = ''

String last_unit_armada = ''

String last_nama_armada_preview = ''

String last_unit_armada_preview = ''

String transporterPic1Hubungi = ''

String transporterPicNumber1Hubungi = ''

String transporterPic2Hubungi = ''

String transporterPicNumber2Hubungi = ''

String transporterPic3Hubungi = ''

String transporterPicNumber3Hubungi = ''

String last_nama_armada_sisi_lawan = ''

String last_unit_armada_sisi_lawan = ''

WebUI.callTestCase(findTestCase('0_MuatmuatJeff23Apr23/00_RegisLogin/RL01_Login/RL01_A_BasicFlow/RL01_L001_Login'), [:], 
    FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/09_QC/10CekProfil/Page_Home  muatmuat/div_Cs Muat Tujuh'))

WebUI.click(findTestObject('Object Repository/09_QC/10CekProfil/Page_Home  muatmuat/a_Profile'))

badan_usaha = WebUI.getText(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile/div_badan_usaha'))

bidang_usaha = WebUI.getText(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile/div_bidang_usaha'))

WebUI.click(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile Management  muatmuat/button_Ubah Data'))

//String no_telp_perusahaan = WebUI.getText(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile/div_no_telp_perusahaan'))
WebUI.setText(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile Management  muatmuat/input_No. Telepon Perusahaan'), 
    input_no_telp_perusahaan)

WebUI.delay(1)

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile Management  muatmuat/button_Simpan Data'))

String no_telp_perusahaan = WebUI.getText(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile/div_no_telp_perusahaan'))

not_run: if (no_telp_perusahaan == input_no_telp_perusahaan) {
    println('TELEPON BENAR')
}

WebUI.click(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile Management  muatmuat/a_data_shipper'))

WebUI.waitForPageLoad(60)

WebUI.click(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile Management  muatmuat/button_ubahDataPICShipper'))

WebUI.setText(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile Management  muatmuat/input_picShipper_1'), 
    isi_shipperPic1)

WebUI.setText(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile Management  muatmuat/input_picNoShipper_1'), 
    isi_shipperPicNumber1)

WebUI.setText(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile Management  muatmuat/input_picShipper_2'), 
    isi_shipperPic2)

WebUI.setText(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile Management  muatmuat/input_picNoShipper_2'), 
    isi_shipperPicNumber2)

WebUI.setText(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile Management  muatmuat/input_picShipper_3'), 
    isi_shipperPic3)

WebUI.setText(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile Management  muatmuat/input_picNoShipper_3'), 
    isi_shipperPicNumber3)

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile Management  muatmuat/button_SimpanData_PICShipper'))

shipperPic1 = WebUI.getText(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile Management  muatmuat/div_picShipper1'))

if (shipperPic1 == isi_shipperPic1) {
    hasilCekPICShipper.add('PIC 1 Shipper Berubah!')
} else {
    hasilCekPICShipper.add('PIC 1 Shipper Gagal Berubah!')
}

shipperPicNumber1 = WebUI.getText(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile Management  muatmuat/div_picNoShipper1'))

if (shipperPicNumber1 == isi_shipperPicNumber1) {
    hasilCekPICShipper.add('Nomor PIC 1 Shipper Berubah!')
} else {
    hasilCekPICShipper.add('Nomor PIC 1 Shipper Gagal Berubah!')
}

shipperPic2 = WebUI.getText(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile Management  muatmuat/div_picShipper2'))

if (shipperPic2 == isi_shipperPic2) {
    hasilCekPICShipper.add('PIC 2 Shipper Berubah!')
} else {
    hasilCekPICShipper.add('PIC 2 Shipper Gagal Berubah!')
}

shipperPicNumber2 = WebUI.getText(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile Management  muatmuat/div_picNoShipper2'))

if (shipperPicNumber2 == isi_shipperPicNumber2) {
    hasilCekPICShipper.add('Nomor PIC 2 Shipper Berubah!')
} else {
    hasilCekPICShipper.add('Nomor PIC 2 Shipper Gagal Berubah!')
}

shipperPic3 = WebUI.getText(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile Management  muatmuat/div_picShipper3'))

if (shipperPic3 == isi_shipperPic3) {
    hasilCekPICShipper.add('PIC 3 Shipper Berubah!')
} else {
    hasilCekPICShipper.add('PIC 3 Shipper Gagal Berubah!')
}

shipperPicNumber3 = WebUI.getText(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile Management  muatmuat/div_picNoShipper3'))

if (shipperPicNumber3 == isi_shipperPicNumber3) {
    hasilCekPICShipper.add('Nomor PIC 3 Shipper Berubah!')
} else {
    hasilCekPICShipper.add('Nomor PIC 3 Shipper Gagal Berubah!')
}

WebUI.scrollToPosition(0, 0)

//Data Transporter
WebUI.click(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile Management  muatmuat/a_data_transporter'))

WebUI.waitForPageLoad(60)

WebUI.click(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile Management  muatmuat/button_ubahDataPICTransporter'))

WebUI.setText(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile Management  muatmuat/input_picTransporter_1'), 
    isi_transporterPic1)

WebUI.setText(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile Management  muatmuat/input_picNoTransporter_1'), 
    isi_transporterPicNumber1)

WebUI.setText(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile Management  muatmuat/input_picTransporter_2'), 
    isi_transporterPic2)

WebUI.setText(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile Management  muatmuat/input_picNoTransporter_2'), 
    isi_transporterPicNumber2)

WebUI.setText(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile Management  muatmuat/input_picTransporter_3'), 
    isi_transporterPic3)

WebUI.setText(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile Management  muatmuat/input_picNoTransporter_3'), 
    isi_transporterPicNumber3)

WebUI.click(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile Management  muatmuat/button_SimpanData_PICTransporter'))

transporterPic1 = WebUI.getText(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile Management  muatmuat/div_picTransporter1'))

if (transporterPic1 == isi_transporterPic1) {
    hasilCekPICTransporter.add('PIC 1 Transporter Berubah!')
} else {
    hasilCekPICTransporter.add('PIC 1 Transporter Gagal Berubah!')
}

transporterPicNumber1 = WebUI.getText(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile Management  muatmuat/div_picNoTransporter1'))

if (transporterPicNumber1 == isi_transporterPicNumber1) {
    hasilCekPICTransporter.add('Nomor PIC 1 Transporter Berubah!')
} else {
    hasilCekPICTransporter.add('Nomor PIC 1 Transporter Gagal Berubah!')
}

transporterPic2 = WebUI.getText(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile Management  muatmuat/div_picTransporter2'))

if (transporterPic2 == isi_transporterPic2) {
    hasilCekPICTransporter.add('PIC 2 Transporter Berubah!')
} else {
    hasilCekPICTransporter.add('PIC 2 Transporter Gagal Berubah!')
}

transporterPicNumber2 = WebUI.getText(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile Management  muatmuat/div_picNoTransporter2'))

if (transporterPicNumber2 == isi_transporterPicNumber2) {
    hasilCekPICTransporter.add('Nomor PIC 2 Transporter Berubah!')
} else {
    hasilCekPICTransporter.add('Nomor PIC 2 Transporter Gagal Berubah!')
}

transporterPic3 = WebUI.getText(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile Management  muatmuat/div_picTransporter3'))

if (transporterPic3 == isi_transporterPic3) {
    hasilCekPICTransporter.add('PIC 3 Transporter Berubah!')
} else {
    hasilCekPICTransporter.add('PIC 3 Transporter Gagal Berubah!')
}

transporterPicNumber3 = WebUI.getText(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile Management  muatmuat/div_picNoTransporter3'))

if (transporterPicNumber3 == isi_transporterPicNumber3) {
    hasilCekPICTransporter.add('Nomor PIC 3 Transporter Berubah!')
} else {
    hasilCekPICTransporter.add('Nomor PIC 3 Transporter Gagal Berubah!')
}

WebUI.click(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile Management  muatmuat/button_ubahDataProfilPerusahaan'))

WebUI.setText(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile Management  muatmuat/input_profileTransporter_areaLayanan'), 
    'Surabaya')

WebUI.waitForJQueryLoad(60)

WebUI.sendKeys(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile Management  muatmuat/input_profileTransporter_areaLayanan'), 
    Keys.chord(Keys.DOWN, Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile Management  muatmuat/input_profileTransporter_customer'), 
    GlobalVariable.NamaPerusahaan)

WebUI.waitForJQueryLoad(60)

WebUI.sendKeys(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile Management  muatmuat/input_profileTransporter_customer'), 
    Keys.chord(Keys.DOWN, Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile Management  muatmuat/input_profileTransporter_portofolio'), 
    GlobalVariable.NamaPerusahaan)

WebUI.waitForJQueryLoad(60)

WebUI.sendKeys(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile Management  muatmuat/input_profileTransporter_portofolio'), 
    Keys.chord(Keys.DOWN, Keys.ENTER))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile Management  muatmuat/button_SimpanDataProfilPerusahaan'))

not_run: WebUI.click(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile Management  muatmuat/div_Tambah Armada'))

not_run: WebUI.waitForPageLoad(60)

not_run: WebUI.click(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile Management Edit Armada  muatmuat/span_Pilih Jenis Truck'))

not_run: WebUI.waitForJQueryLoad(60)

not_run: WebUI.click(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile Management Edit Armada  muatmuat/span_Dropside 30ft(2AS)'))

not_run: WebUI.setText(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile Management Edit Armada  muatmuat/input_Kapasitas_min_capacity'), 
    '10')

not_run: WebUI.click(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile Management Edit Armada  muatmuat/input_Kapasitas_min_capacity'))

not_run: WebUI.setText(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile Management Edit Armada  muatmuat/input_-_max_capacity'), 
    '50')

not_run: WebUI.setText(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile Management Edit Armada  muatmuat/input_Dimensi Maksimum_dimensi_panjang'), 
    '10')

not_run: WebUI.setText(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile Management Edit Armada  muatmuat/input_x_dimensi_lebar'), 
    '10')

not_run: WebUI.setText(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile Management Edit Armada  muatmuat/input_x_dimensi_tinggi'), 
    '10')

not_run: WebUI.setText(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile Management Edit Armada  muatmuat/input_Jumlah Unit_truck_qty'), 
    input_unit_armada)

not_run: WebUI.click(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile Management Edit Armada  muatmuat/button_Simpan'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile Management  muatmuat/button_armadaUbah_last'))

WebUI.waitForPageLoad(60)

WebUI.setText(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile Management Edit Armada  muatmuat/input_Jumlah Unit_truck_qty'), 
    input_unit_armada)

WebUI.click(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile Management Edit Armada  muatmuat/button_Simpan'))

WebUI.waitForPageLoad(60)

WebUI.click(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile Management  muatmuat/a_data_transporter'))

WebUI.waitForPageLoad(60)

last_nama_armada = WebUI.getText(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile Management  muatmuat/div_armadaNama_last'))

last_unit_armada = WebUI.getText(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile Management  muatmuat/div_armadaJumlahUnit_last'))

last_unit_armada = last_unit_armada.replace(' unit', '')

last_unit_armada = last_unit_armada.replace(' Unit', '')

if (last_unit_armada == input_unit_armada) {
    hasilCekArmadaProfil.add('Unit Armada Profil Berhasil Ubah!')
} else {
    hasilCekArmadaProfil.add('Unit Armada Profil Tidak Berhasil Ubah!')
}

WebUI.click(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile Management  muatmuat/button_profile_preview'))

last_nama_armada_preview = WebUI.getText(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile Management  muatmuat/div_preview_armadaNama_last'))

last_unit_armada_preview = WebUI.getText(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile Management  muatmuat/div_preview_armadaUnit_last'))

last_unit_armada_preview = last_unit_armada_preview.replace(' unit', '')

last_unit_armada_preview = last_unit_armada_preview.replace(' Unit', '')

if (last_unit_armada_preview == input_unit_armada) {
    hasilCekArmadaProfil.add('Unit Armada Profil Preview Berhasil Ubah!')
} else {
    hasilCekArmadaProfil.add('Unit Armada Profil Preview Tidak Berhasil Ubah!')
}

WebUI.click(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile Management  muatmuat/img_header_general_back_to_main'))

WebUI.waitForPageLoad(60)

WebUI.click(findTestObject('Object Repository/09_QC/10CekProfil/Page_Home  muatmuat/div_Big FleetsKomunitas eksklusif untuk BIG_d7e5d3'))

WebUI.click(findTestObject('Object Repository/09_QC/10CekProfil/Page_Home  muatmuat/BtnSkipPopUp'), FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/09_QC/10CekProfil/Page_Dashboard  muatmuat/div_Shipper'))

WebUI.waitForPageLoad(60)

WebUI.click(findTestObject('09_QC/10CekProfil/Page_Big Fleets Main Dashboard  muatmuat/div_menu_transporter'))

WebUI.waitForPageLoad(60)

not_run: WebUI.click(findTestObject('09_QC/10CekProfil/Page_BF_ListTransporter/button_change_view_list'))

not_run: WebUI.waitForJQueryLoad(60)

WebUI.setText(findTestObject('Object Repository/09_QC/10CekProfil/Page_BF_ListTransporter/input_search_transporter'), GlobalVariable.NamaPerusahaan)

WebUI.delay(5)

WebUI.click(findTestObject('09_QC/10CekProfil/Page_BF_ListTransporter/button_titik_tiga_card_1'))

WebUI.click(findTestObject('09_QC/10CekProfil/Page_BF_ListTransporter/button_hubungi_list_card1'))

WebUI.click(findTestObject('09_QC/10CekProfil/Page_BF_ListTransporter/button_hubungi_no_wa'))

transporterPic1Hubungi = WebUI.getText(findTestObject('Object Repository/09_QC/10CekProfil/Page_BF_ListTransporter/div_transporter_pic1_hubungi'))

if (transporterPic1Hubungi == isi_transporterPic1) {
    hasilCekPICTransporter.add('PIC 1 List Transporter Berubah!')
} else {
    hasilCekPICTransporter.add('PIC 1 List Transporter Gagal Berubah!')
}

transporterPicNumber1Hubungi = WebUI.getText(findTestObject('Object Repository/09_QC/10CekProfil/Page_BF_ListTransporter/div_transporter_pic1no_hubungi'))

if (transporterPicNumber1Hubungi == isi_transporterPicNumber1) {
    hasilCekPICTransporter.add('Nomor PIC 1 List Transporter Berubah!')
} else {
    hasilCekPICTransporter.add('Nomor PIC 1 List Transporter Gagal Berubah!')
}

transporterPic2Hubungi = WebUI.getText(findTestObject('Object Repository/09_QC/10CekProfil/Page_BF_ListTransporter/div_transporter_pic2_hubungi'))

if (transporterPic2Hubungi == isi_transporterPic2) {
    hasilCekPICTransporter.add('PIC 2 List Transporter Berubah!')
} else {
    hasilCekPICTransporter.add('PIC 2 List Transporter Gagal Berubah!')
}

transporterPicNumber2Hubungi = WebUI.getText(findTestObject('Object Repository/09_QC/10CekProfil/Page_BF_ListTransporter/div_transporter_pic2no_hubungi'))

if (transporterPicNumber2Hubungi == isi_transporterPicNumber2) {
    hasilCekPICTransporter.add('Nomor PIC 2 List Transporter Berubah!')
} else {
    hasilCekPICTransporter.add('Nomor PIC 2 List Transporter Gagal Berubah!')
}

transporterPic3Hubungi = WebUI.getText(findTestObject('Object Repository/09_QC/10CekProfil/Page_BF_ListTransporter/div_transporter_pic3_hubungi'))

if (transporterPic3Hubungi == isi_transporterPic3) {
    hasilCekPICTransporter.add('PIC 3 List Transporter Berubah!')
} else {
    hasilCekPICTransporter.add('PIC 3 List Transporter Gagal Berubah!')
}

transporterPicNumber3Hubungi = WebUI.getText(findTestObject('Object Repository/09_QC/10CekProfil/Page_BF_ListTransporter/div_transporter_pic3no_hubungi'))

if (transporterPicNumber3Hubungi == isi_transporterPicNumber3) {
    hasilCekPICTransporter.add('Nomor PIC 3 List Transporter Berubah!')
} else {
    hasilCekPICTransporter.add('Nomor PIC 3 List Transporter Gagal Berubah!')
}

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/09_QC/10CekProfil/Page_BF_ListTransporter/button_close_hubungi'))

WebUI.click(findTestObject('09_QC/10CekProfil/Page_BF_ListTransporter/button_lihat_profil_card_1'))

last_nama_armada_sisi_lawan = WebUI.getText(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile_Sisi_Lawan/div_armada_profil_sisi_lawan_last'))

last_unit_armada_sisi_lawan = WebUI.getText(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile_Sisi_Lawan/div_armada_profil_sisi_lawan_unit_last'))

last_unit_armada_sisi_lawan = last_unit_armada_sisi_lawan.replace(' unit', '')

last_unit_armada_sisi_lawan = last_unit_armada_sisi_lawan.replace(' Unit', '')

if (last_unit_armada_sisi_lawan == input_unit_armada) {
    hasilCekArmadaProfil.add('Unit Armada Profil Sisi Lawan Berhasil Ubah!')
} else {
    hasilCekArmadaProfil.add('Unit Armada Profil Sisi Lawan Tidak Berhasil Ubah!')
}

WebUI.click(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile_Sisi_Lawan/div_ganti_sisi_transporter'))

WebUI.click(findTestObject('Object Repository/09_QC/10CekProfil/Page_Big Fleets Main Dashboard  muatmuat/a_Shipper'))

WebUI.setText(findTestObject('Object Repository/09_QC/10CekProfil/Page_muatmuat/input_Watchlist_search'), GlobalVariable.NamaPerusahaan)

WebUI.delay(5)

not_run: WebUI.click(findTestObject('Object Repository/09_QC/10CekProfil/Page_muatmuat/button_Detail_dropdownmenu185'))

not_run: WebUI.click(findTestObject('Object Repository/09_QC/10CekProfil/Page_muatmuat/a_Hubungi Shipper'))

not_run: WebUI.click(findTestObject('Object Repository/09_QC/10CekProfil/Page_muatmuat/div_No. Telepon  WhatsApp                  _9db394'))

not_run: WebUI.click(findTestObject('Object Repository/09_QC/10CekProfil/Page_muatmuat/img'))

WebUI.click(findTestObject('Object Repository/09_QC/10CekProfil/Page_muatmuat/span_Detail'))

WebUI.waitForPageLoad(60)

WebUI.waitForJQueryLoad(60)

WebUI.click(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile Shipper BF Profile  muatmuat/img_SellerPartner Center_backToMain'))

WebUI.click(findTestObject('Object Repository/09_QC/10CekProfil/Page_Home  muatmuat/div_Transport MarketWadah untuk bertemunya _c6279a'))

WebUI.click(findTestObject('Object Repository/09_QC/10CekProfil/Page_Home  muatmuat/button_Masuk Transport Market'))

WebUI.click(findTestObject('Object Repository/09_QC/10CekProfil/Page_Dashboard  muatmuat/div_Transporter                            _12234c'))

WebUI.waitForPageLoad(60)

WebUI.click(findTestObject('Object Repository/09_QC/10CekProfil/Page_Subscription  muatmuat/a_Buat Price List Transporter'))

WebUI.click(findTestObject('Object Repository/09_QC/10CekProfil/Page_Data Armada  muatmuat/button_Edit'))

WebUI.setText(findTestObject('Object Repository/09_QC/10CekProfil/Page_Edit Armada  muatmuat/input_Jumlah Unit_truck_qty'), 
    input2_unit_armada)

WebUI.click(findTestObject('Object Repository/09_QC/10CekProfil/Page_Edit Armada  muatmuat/button_Simpan'))

WebUI.click(findTestObject('Object Repository/09_QC/10CekProfil/Page_Edit Armada  muatmuat/img'))

WebUI.click(findTestObject('Object Repository/09_QC/10CekProfil/Page_Data Armada  muatmuat/div_Cs Muat'))

WebUI.click(findTestObject('Object Repository/09_QC/10CekProfil/Page_Data Armada  muatmuat/a_Profile'))

WebUI.click(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile Management  muatmuat/a_Data Transporter'))

WebUI.click(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile Management  muatmuat/button_profile_preview'))

last_nama_armada_preview = WebUI.getText(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile Management  muatmuat/div_preview_armadaNama_last'))

last_unit_armada_preview = WebUI.getText(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile Management  muatmuat/div_preview_armadaUnit_last'))

last_unit_armada_preview = last_unit_armada_preview.replace(' unit', '')

last_unit_armada_preview = last_unit_armada_preview.replace(' Unit', '')

if (last_unit_armada_preview == input2_unit_armada) {
    hasilCekArmadaProfil.add('Unit Armada Profil Preview Berhasil Ubah Dari TM!')
} else {
    hasilCekArmadaProfil.add('Unit Armada Profil Preview Tidak Berhasil Ubah Dari TM!')
}

WebUI.click(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile Management  muatmuat/div_preview_armadaNama_last'))

WebUI.waitForPageLoad(60)

WebUI.click(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile Management  muatmuat/div_preview_armadaUnit_last'))

WebUI.click(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile Management  muatmuat/img_header_general_back_to_main'), 
    FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Object Repository/09_QC/10CekProfil/Page_Home  muatmuat/div_Big FleetsKomunitas eksklusif untuk BIG_d7e5d3'))

WebUI.click(findTestObject('Object Repository/09_QC/10CekProfil/Page_Home  muatmuat/BtnSkipPopUp'))

WebUI.click(findTestObject('Object Repository/09_QC/10CekProfil/Page_Dashboard  muatmuat/div_Shipper'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.waitForJQueryLoad(60)

WebUI.click(findTestObject('09_QC/10CekProfil/Page_Big Fleets Main Dashboard  muatmuat/div_menu_transporter'))

WebUI.setText(findTestObject('Object Repository/09_QC/10CekProfil/Page_BF_ListTransporter/input_search_transporter'), GlobalVariable.NamaPerusahaan)

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/09_QC/10CekProfil/Page_BF_ListTransporter/button_titik_tiga_card_1'))

WebUI.click(findTestObject('Object Repository/09_QC/10CekProfil/Page_BF_ListTransporter/div_hubungi_card_1'))

WebUI.click(findTestObject('09_QC/10CekProfil/Page_BF_ListTransporter/button_hubungi_no_wa'))

transporterPic1Hubungi = WebUI.getText(findTestObject('Object Repository/09_QC/10CekProfil/Page_BF_ListTransporter/div_transporter_pic1_hubungi'))

transporterPicNumber1Hubungi = WebUI.getText(findTestObject('Object Repository/09_QC/10CekProfil/Page_BF_ListTransporter/div_transporter_pic1no_hubungi'))

transporterPic2Hubungi = WebUI.getText(findTestObject('Object Repository/09_QC/10CekProfil/Page_BF_ListTransporter/div_transporter_pic2_hubungi'))

transporterPicNumber2Hubungi = WebUI.getText(findTestObject('Object Repository/09_QC/10CekProfil/Page_BF_ListTransporter/div_transporter_pic2no_hubungi'))

transporterPic3Hubungi = WebUI.getText(findTestObject('Object Repository/09_QC/10CekProfil/Page_BF_ListTransporter/div_transporter_pic3_hubungi'))

transporterPicNumber3Hubungi = WebUI.getText(findTestObject('Object Repository/09_QC/10CekProfil/Page_BF_ListTransporter/div_transporter_pic3no_hubungi'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/09_QC/10CekProfil/Page_BF_ListTransporter/button_close_hubungi'))

not_run: last_nama_armada_sisi_lawan = WebUI.getText(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile_Sisi_Lawan/div_armada_profil_sisi_lawan_last'))

not_run: last_unit_armada_sisi_lawan = WebUI.getText(findTestObject('Object Repository/09_QC/10CekProfil/Page_Profile_Sisi_Lawan/div_armada_profil_sisi_lawan_unit_last'))

String strHasilCekPICShipper = 'Hasil Cek PIC Shipper Profil: ' + hasilCekPICShipper.join(', ')

println(strHasilCekPICShipper)

String strHasilCekPICTransporter = 'Hasil Cek PIC Transporter: ' + hasilCekPICTransporter.join(', ')

println(strHasilCekPICTransporter)

String strHasilCekArmadaProfil = 'Hasil Cek Armada Profil: ' + hasilCekArmadaProfil.join(', ')

println(strHasilCekArmadaProfil)

