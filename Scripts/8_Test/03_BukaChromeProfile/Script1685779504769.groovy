import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import org.openqa.selenium.chrome.ChromeOptions

// Set path to ChromeDriver executable
//System.setProperty("webdriver.chrome.driver","D:\\Chrome\\chromedriver.exe")
//
//// Set path to Chrome user profile directory
//String userProfile = "C:\\Users\\HP\\AppData\\Local\\Google\\Chrome\\User Data\\Profile 2"
//
//// Buat objek ChromeOptions untuk mengkonfigurasi ChromeDriver
//ChromeOptions options = new ChromeOptions()
//options.addArguments("user-data-dir=" + userProfile)
//// Tambahkan opsi tambahan jika diperlukan
//
//// Buka browser Chrome dengan profil yang dikonfigurasi
////DriverFactory.updateWebDriver(new ChromeDriver(options))
////DriverFactory.changeWebDriver("user-data-dir=" + userProfile)
//String isi = "user-data-dir=" + userProfile
//WebUI.openBrowser(isi)

import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.WebDriver

ChromeOptions options = new ChromeOptions()
options.addArguments("user-data-dir=C:/Users/HP/AppData/Local/Google/Chrome/User Data/Profile 2")

WebDriver driver = new ChromeDriver(options)