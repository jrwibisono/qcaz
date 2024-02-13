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

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_Seller/div_Transportation Store'))

WebUI.waitForPageLoad(60)

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_Seller/span_Kendaraan Kargo_mainPage'))

WebUI.waitForPageLoad(60)

WebUI.waitForJQueryLoad(60)

//for (def row = 1; row <= findTestData('transportation_store_kendaraan_kargo').getRowNumbers(); row++) {
WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/button_Pasang Iklan'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/input_Sisa Kuota_radio_pasang_ku'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/button_Gunakan'))

'Judul Iklan'
WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/judul_iklan'), 
    'Judul Iklan')

//String Kondisi = findTestData('transportation_store_kendaraan_kargo').getValue(2, row)
WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/div_Masukkan Kondisi Barang_unchecked-icon'))

//if (Kondisi == 'Bekas') {
//} else {
//    WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/radbtn_kondisi_baru'))
//}
'Open Pilihan Tahun'
WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/span_Tahun'))

WebUI.delay(1)

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/button_layanan-iklan'))

//	Pilih Tahun Sesuai
not_run: tahun_pilihan = WebUI.modifyObjectProperty(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/OpsiPilihTahun2017'), 
    'text', 'equals', findTestData('transportation_store_kendaraan_kargo').getValue(3, row), true)

'Pilih Tahun Pilihan'
WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/OpsiPilihTahun2017'))

'Input Jarak Tempuh'
WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/input__FormatInteger'), 
    '20000')

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/span_Jenis Truk - Carrier'))

WebUI.delay(1)

'Input Jenis Truk'
WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/InputSearchJenisTruk'), 
    'Colt Diesel Engkel')

WebUI.delay(1)

WebUI.waitForJQueryLoad(60)

WebUI.sendKeys(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/InputSearchJenisTruk'), 
    Keys.chord(Keys.ENTER))

WebUI.waitForJQueryLoad(60)

'Pilih Jenis Truk yang Dipilih'
WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/span_Jenis Truk - Carrier_1'))

WebUI.delay(1)

'Input Jenis Carrier'
WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/InputSearchJenisCarrier'), 
    'Box')

WebUI.delay(1)

WebUI.waitForJQueryLoad(60)

WebUI.sendKeys(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/InputSearchJenisCarrier'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/span_Merk Truk'))

WebUI.delay(1)

WebUI.waitForJQueryLoad(60)

//	Merk
'Input Search Merk'
WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/InputSearchMerkTruk'), 
    'Hino')

WebUI.sendKeys(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/InputSearchMerkTruk'), 
    Keys.chord(Keys.ENTER))

//	Tipe
'Input Tipe dari Merk'
WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/input_tipe'), 
    'Elf')

//	Kapasitas Mesin (9)
KapasitasMesin = findTestData('transportation_store_kendaraan_kargo').getValue(9, row)

String KapasitasPilih = ''

if (KapasitasMesin.toInteger() < 3000) {
    V

    KapasitasPilih = 'Dibawah 3.000 cc'
} else if (KapasitasMesin.toInteger() < 6000) {
    KapasitasPilih = '3.000 cc - 6.000 cc'
} else if (KapasitasMesin.toInteger() < 9000) {
    KapasitasPilih = '6.000 cc - 9.000 cc'
} else if (KapasitasMesin.toInteger() <= 11000) {
    KapasitasPilih = '9.000 cc - 11.000 cc'
} else if (KapasitasMesin.toInteger() > 11000) {
    KapasitasPilih = 'Diatas 11.000 cc'
}

not_run: picked_kapasitas_mesin = WebUI.modifyObjectProperty(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/div_pilihan_kapasitas'), 
    'text', 'equals', KapasitasPilih, true)

'Pilih Kapasitas Mesin'
WebUI.click(picked_kapasitas_mesin)

//	Warna (10)
'Pilih Warna'
WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/span_Pilih Warna'))

WebUI.delay(1)

warna_pilihan = WebUI.modifyObjectProperty(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/OpsiPilihWarnaKK1'), 
    'text', 'equals', findTestData('transportation_store_kendaraan_kargo').getValue(10, row), true)

WebUI.click(warna_pilihan)

//	Tanggal (11)
'Pajak Berlaku'
WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/InputTanggalKK'), 
    findTestData('transportation_store_kendaraan_kargo').getValue(11, row))

//	Foto (12) Harus looping
String FullFotoUrl = findTestData('transportation_store_kendaraan_kargo').getValue(12, row)

String[] ArrFotoUrl = FullFotoUrl.split(', ')

int indexFoto = 1

for (String values : ArrFotoUrl) {
    println(values)

    String xpathUploadFoto = ('/html/body/div[3]/div[1]/div/div[5]/div[1]/div[2]/div[2]/div[11]/div/div[2]/div/div[' + indexFoto) + 
    ']/input'

    not_run: uploadObject = WebUI.modifyObjectProperty(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/UploadFotoKK'), 
        'xpath', 'equals', xpathUploadFoto, true)

    'Upload Foto dengan Path'
    WebUI.uploadFile(uploadObject, '')

    'Crop'
    WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/button_Crop'))

    not_run: indexFoto++
}

String FullVideoUrl = findTestData('transportation_store_kendaraan_kargo').getValue(13, row)

String[] ArrVideoUrl = FullVideoUrl.split(', ')

String FullVideoCaption = findTestData('transportation_store_kendaraan_kargo').getValue(14, row)

String[] ArrVideoCaption = FullVideoCaption.split(', ')

int indexVideo = 1

for (String values : ArrVideoUrl) {
    String videoUploadXpath = ('/html/body/div[3]/div[1]/div/div[5]/div[1]/div[2]/div[2]/div[12]/div[3]/div/div[' + indexVideo) + 
    ']/div[1]/div[1]/input'

    uploadVideoObj = WebUI.modifyObjectProperty(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/UploadVideoKK'), 
        'xpath', 'equals', videoUploadXpath, true)

    String videoCaptionXpath = ('/html/body/div[3]/div[1]/div/div[5]/div[1]/div[2]/div[2]/div[12]/div[3]/div/div[' + indexVideo) + 
    ']/div[1]/div[2]/div[2]/input'

    uploadCaptionObj = WebUI.modifyObjectProperty(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/InputCaptionVideoKK'), 
        'xpath', 'equals', videoCaptionXpath, true)

    //	Video (13)
    WebUI.uploadFile(uploadVideoObj, values)

    WebUI.delay(2)

    //	Caption Video (14)
    WebUI.setText(uploadCaptionObj, ArrVideoCaption[(indexVideo - 1)])

    if (ArrVideoUrl.length > 1) {
        indexVideo++

        WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/btn_tambah_video'))
    }
}

//    //	Video (13)
//    WebUI.uploadFile(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/UploadVideoKK1'), 
//        findTestData('transportation_store_kendaraan_kargo').getValue(13, row))
//
//    WebUI.delay(2)
//
//    //	Caption Video (14)
//    WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/InputCaptionVideoKK'), 
//        findTestData('transportation_store_kendaraan_kargo').getValue(14, row))
//	Harga (15)
'Input Harga'
WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/input_Rp_FormatInteger'), 
    '50000000')

//	Deskripsi (16)
'Input Deskripsi'
WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/textarea_text'), 
    'Deskripsi')

//	Lokasi Iklan (17)
'Input Lokasi Iklan'
WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/input_lokasi-iklan'), 
    findTestData('transportation_store_kendaraan_kargo').getValue(17, row))

WebUI.delay(1)

WebUI.waitForJQueryLoad(60)

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/div_Kec. Seputih Surabaya, Kab. Lampung Tengah'))

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/button_Unggah Iklan'))

not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/a_Kembali Ke Halaman Awal'))

