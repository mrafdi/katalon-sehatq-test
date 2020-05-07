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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.sehatq.com/')

WebUI.click(findTestObject('Page_SehatQ  Tanya Dokter dan Tips Keluarga Sehat/i_Tidak ada notifikasi_fs icon-profile colo_658490'))

WebUI.click(findTestObject('Page_Login/a_Continue with Email'))

WebUI.setText(findTestObject('Page_Login/input_Email_email'), 'rafshin40@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_Login/input_show password_password'), '+8lfF++HKkFedFK3DGW3VA==')

WebUI.click(findTestObject('Page_Login/button_Continue'))

WebUI.click(findTestObject('Page_SehatQ Profil/img_Tidak ada notifikasi_img-circle'))

WebUI.click(findTestObject('Page_SehatQ Profil/span_Profil'))

Windows.sendKeys(findWindowsObject('Page_SehatQ Profil/input_Tinggi Badan (cm)_height'), '${KEY_PGDN}')

WebUI.click(findTestObject('Page_SehatQ Profil/i_Rafdi Shin_fs icon-chevron-circle-right c_715251'))

WebUI.click(findTestObject('Page_SehatQ Profil/i_Berat (kg)_fs icon-edit font-16'))

WebUI.scrollToElement(findTestObject('Page_SehatQ Profil/label_Jenis Kelamin'), 5)

WebUI.setText(findTestObject('Page_SehatQ Profil/input_Tinggi Badan (cm)_height'), '170')

WebUI.setText(findTestObject('Page_SehatQ Profil/input_Berat Badan (kg)_weight'), '60')

WebUI.setText(findTestObject('Page_SehatQ Profil/input__address'), 'Perum Testing Jaya')

WebUI.setText(findTestObject('Page_SehatQ Profil/input__phone'), '08213456789')

WebUI.click(findTestObject('Page_SehatQ Profil/button_Simpan'))

WebUI.verifyElementPresent(findTestObject('Page_SehatQ Profil/span_Edit profile berhasil'), 5)

