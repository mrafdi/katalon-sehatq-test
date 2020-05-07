import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When

public class LoginSteps {
	
	@Given("I go to SehatQ login page")
	def visitSehatqLogin(){
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://www.sehatq.com/login/email')
	}
	
	@When("I do login in login page")
	def inputLoginDataDirect() {
		WebUI.setText(findTestObject('Page_Login/input_Email_email'), 'rafshin40@gmail.com')

		WebUI.setEncryptedText(findTestObject('Page_Login/input_show password_password'), '+8lfF++HKkFedFK3DGW3VA==')
		
		WebUI.click(findTestObject('Page_Login/button_Continue'))
		
	}
	
	@When("I fill email field (.*) and password field (.*) in login page")
	def inputLoginData(String email, String pwd) {
		WebUI.setText(findTestObject('Page_Login/input_Email_email'), email)

		WebUI.setEncryptedText(findTestObject('Page_Login/input_show password_password'), pwd)
	}

	@When("I click Continue button in login page")
	def clickContinueLoginBtn() {
		WebUI.click(findTestObject('Page_Login/button_Continue'))
	}

	@Then("I can see that I am logged in successfully")
	def verifySuccessLogin() {
		WebUI.click(findTestObject('Page_SehatQ Profil/img_Tidak ada notifikasi_img-circle'))

		WebUI.verifyElementPresent(findTestObject('Page_SehatQ Profil/span_Profil'), 5)

		WebUI.closeBrowser()
	}
	
	@Then("I can see the warning message about email on login page")
	def verifyLoginPageEmailWarning() {
		WebUI.verifyElementPresent(findTestObject('Page_Login/label_Email harus diisi dengan benar'), 5)

		WebUI.closeBrowser()
	}
	
	@Then("I can see the warning message about password on login page")
	def verifyLoginPagePasswordWarning() {
		WebUI.verifyElementPresent(findTestObject('Page_Login/label_Password harus diisi minimal 6 karakter'), 5)

		WebUI.closeBrowser()
	}
	
}