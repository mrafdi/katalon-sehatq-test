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

WebUI.click(findTestObject('Object Repository/Page_SehatQ  Tanya Dokter dan Tips Keluarga Sehat/i_Tidak ada notifikasi_fs icon-profile colo_658490'))

WebUI.click(findTestObject('Object Repository/Page_Login/a_Continue with Email'))

WebUI.click(findTestObject('Object Repository/Page_Login/a_New to SehatQ Sign Up'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Register/h1_Sign up'), 5)

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Nama Lengkap_name'), 'Rafdi Shin')

WebUI.setText(findTestObject('Object Repository/Page_Register/input_Email_email'), 'rafshin40@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Register/input_show password_password'), '+8lfF++HKkFedFK3DGW3VA==')

WebUI.click(findTestObject('Object Repository/Page_Register/span_Saya telah menyetujui SehatQ'))

WebUI.click(findTestObject('Object Repository/Page_Register/button_Continue'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_SehatQ  Tanya Dokter dan Tips Keluarga Sehat/span_Pendaftaran berhasil'), 
    5)

WebUI.closeBrowser()

