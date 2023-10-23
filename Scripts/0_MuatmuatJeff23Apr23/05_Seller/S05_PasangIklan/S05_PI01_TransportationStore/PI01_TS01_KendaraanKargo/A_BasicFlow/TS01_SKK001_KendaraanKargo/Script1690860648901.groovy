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

WebUI.click(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/button_layanan-iklan'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_Seller/div_Transportation Store'))

WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_Seller/span_Kendaraan Kargo'))

for (def row = 1; row <= findTestData('transportation_store_kendaraan_kargo').getRowNumbers(); row++) {
    WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/button_Pasang Iklan'))

    WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/input_Sisa Kuota_radio_pasang_ku'))

    WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/button_Gunakan'))

    WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/judul_iklan'), 
        findTestData('transportation_store_kendaraan_kargo').getValue(1, row))

    String Kondisi = findTestData('transportation_store_kendaraan_kargo').getValue(2, row)

    if (Kondisi == 'Bekas') {
        WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/div_Masukkan Kondisi Barang_unchecked-icon'))
    } else {
        WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/radbtn_kondisi_baru'))
    }
    
    WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/span_Tahun'))

    WebUI.delay(1)

    //	Pilih Tahun Sesuai
    tahun_pilihan = WebUI.modifyObjectProperty(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/OpsiPilihTahun2017'), 
        'text', 'equals', findTestData('transportation_store_kendaraan_kargo').getValue(3, row), true)

    WebUI.click(tahun_pilihan)

    WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/input__FormatInteger'), 
        findTestData('transportation_store_kendaraan_kargo').getValue(4, row))

    WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/span_Jenis Truk - Carrier'))

    WebUI.delay(1)

    WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/InputSearchJenisTruk'), 
        findTestData('transportation_store_kendaraan_kargo').getValue(5, row))

    WebUI.delay(1)

    WebUI.waitForJQueryLoad(60)

    WebUI.sendKeys(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/InputSearchJenisTruk'), 
        Keys.chord(Keys.ENTER))

    WebUI.waitForJQueryLoad(60)

    WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/span_Jenis Truk - Carrier_1'))

    WebUI.delay(1)

    WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/InputSearchJenisCarrier'), 
        findTestData('transportation_store_kendaraan_kargo').getValue(6, row))

    WebUI.delay(1)

    WebUI.waitForJQueryLoad(60)

    WebUI.sendKeys(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/InputSearchJenisCarrier'), 
        Keys.chord(Keys.ENTER))

    WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/span_Merk Truk'))

    WebUI.delay(1)

    WebUI.waitForJQueryLoad(60)

    //	Merk
    WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/InputSearchMerkTruk'), 
        findTestData('transportation_store_kendaraan_kargo').getValue(7, row))

    WebUI.sendKeys(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/InputSearchMerkTruk'), 
        Keys.chord(Keys.ENTER))

    //	Tipe
    WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/input_tipe'), 
        findTestData('transportation_store_kendaraan_kargo').getValue(8, row))

    //	Kapasitas Mesin (9)
    KapasitasMesin = findTestData('transportation_store_kendaraan_kargo').getValue(9, row)

    String KapasitasPilih = ''

    if (KapasitasMesin.toInteger() < 3000) {
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
    
    picked_kapasitas_mesin = WebUI.modifyObjectProperty(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/div_pilihan_kapasitas'), 
        'text', 'equals', KapasitasPilih, true)

    WebUI.click(picked_kapasitas_mesin)

    //	Warna (10)
    WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/span_Pilih Warna'))

    WebUI.delay(1)

    warna_pilihan = WebUI.modifyObjectProperty(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/OpsiPilihWarnaKK1'), 
        'text', 'equals', findTestData('transportation_store_kendaraan_kargo').getValue(10, row), true)

    WebUI.click(warna_pilihan)

	//	Tanggal (11)
    WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/InputTanggalKK'), 
        findTestData('transportation_store_kendaraan_kargo').getValue(11, row))

    //	Foto (12) Harus looping
    String FullFotoUrl = findTestData('transportation_store_kendaraan_kargo').getValue(12, row)

    String[] ArrFotoUrl = FullFotoUrl.split(', ')

    int indexFoto = 1
	
    for (String values : ArrFotoUrl) {
        println(values)
		
		String xpathUploadFoto = "/html/body/div[3]/div[1]/div/div[5]/div[1]/div[2]/div[2]/div[11]/div/div[2]/div/div["+indexFoto+"]/input"

		uploadObject = WebUI.modifyObjectProperty(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/UploadFotoKK'),
			'xpath', 'equals', xpathUploadFoto, true)
		
        WebUI.uploadFile(uploadObject, values)

        WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/button_Crop'))

        indexFoto++
    }
	
	String FullVideoUrl = findTestData('transportation_store_kendaraan_kargo').getValue(13, row)
	String[] ArrVideoUrl = FullVideoUrl.split(', ')
	
	String FullVideoCaption = findTestData('transportation_store_kendaraan_kargo').getValue(14, row)
	String[] ArrVideoCaption = FullVideoCaption.split(', ')
    
	int indexVideo = 1
	
	for (String values : ArrVideoUrl) {
		String videoUploadXpath = "/html/body/div[3]/div[1]/div/div[5]/div[1]/div[2]/div[2]/div[12]/div[3]/div/div["+indexVideo+"]/div[1]/div[1]/input"
		
		uploadVideoObj = WebUI.modifyObjectProperty(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/UploadVideoKK'),
			'xpath', 'equals', videoUploadXpath, true)
		
		String videoCaptionXpath = "/html/body/div[3]/div[1]/div/div[5]/div[1]/div[2]/div[2]/div[12]/div[3]/div/div["+indexVideo+"]/div[1]/div[2]/div[2]/input"
		
		uploadCaptionObj = WebUI.modifyObjectProperty(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/InputCaptionVideoKK'),
			'xpath', 'equals', videoCaptionXpath, true)
		
		//	Video (13)
		WebUI.uploadFile(uploadVideoObj, values)
	
		WebUI.delay(2)
	
		//	Caption Video (14)
		WebUI.setText(uploadCaptionObj,	ArrVideoCaption[indexVideo-1])
		
		if(ArrVideoUrl.length > 1) {
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
    WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/input_Rp_FormatInteger'), 
        findTestData('transportation_store_kendaraan_kargo').getValue(15, row))

    //	Deskripsi (16)
    WebUI.setText(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/textarea_text'), 
        findTestData('transportation_store_kendaraan_kargo').getValue(16, row))

    //	Lokasi Iklan (17)
    WebUI.setText(findTestObject('0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/input_lokasi-iklan'), 
        findTestData('transportation_store_kendaraan_kargo').getValue(17, row))

    WebUI.delay(1)

    WebUI.waitForJQueryLoad(60)

    WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/div_Kec. Seputih Surabaya, Kab. Lampung Tengah'))

    not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/button_Unggah Iklan'))

    not_run: WebUI.click(findTestObject('Object Repository/0_MuatmuatJeff23Apr23/05_Seller/S05_PasangIklan/S05_PI01_TransportationStore/PI01_TS01_KendaraanKargo/A_BasicFlow/Page_LayananIklan/a_Kembali Ke Halaman Awal'))
}

