import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

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



class RegisterSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I go to Sehatqu website")
	def goToSehatqPage() {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://www.sehatq.com/')
	}

	@When("I click account icon")
	def clickAccountIcon() {
		WebUI.click(findTestObject('Object Repository/Page_SehatQ  Tanya Dokter dan Tips Keluarga Sehat/i_Tidak ada notifikasi_fs icon-profile colo_658490'))
	}

	@When("I click Continue with email")
	def clickContinueEmail() {
		WebUI.click(findTestObject('Object Repository/Page_Login/a_Continue with Email'))
	}

	@When("I click Sign Up button")
	def clickSignupBtn() {
		WebUI.click(findTestObject('Object Repository/Page_Login/a_New to SehatQ Sign Up'))
	}

	@Then("I can see that I am in Sign Up page")
	def verifySignupPage() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Register/h1_Sign up'), 5)
	}

	@When("I input Nama Lengkap with (.*) Email with (.*) Password with (.*)")
	def inputSignupData(String name, String email, String pwd) {
		WebUI.setText(findTestObject('Object Repository/Page_Register/input_Nama Lengkap_name'), name)

		WebUI.setText(findTestObject('Object Repository/Page_Register/input_Email_email'), email)

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_Register/input_show password_password'), pwd)
	}

	@When("I check the agreement checkbox")
	def checkAgreement() {
		WebUI.click(findTestObject('Object Repository/Page_Register/span_Saya telah menyetujui SehatQ'))
	}

	@When("I click Continue button in register page")
	def clickContinueRegisBtn() {
		WebUI.click(findTestObject('Object Repository/Page_Register/button_Continue'))
	}

	@Then("I can see Pendaftaran Berhasil message")
	def verifyPendaftaranBerhasilMsg() {
		WebUI.verifyElementPresent(findTestObject('Object Repository/Page_SehatQ  Tanya Dokter dan Tips Keluarga Sehat/span_Pendaftaran berhasil'),
				5)
		WebUI.closeBrowser()
	}

	@Then("I can see error message on Nama")
	def verifyErrorMsgNama() {
		WebUI.verifyElementPresent(findTestObject('Page_Register/label_Email harus diisi dengan benar'), 5)
	}

	@Then("I can see error message on Email")
	def verifyErrorMsgEmail() {
		WebUI.verifyElementPresent(findTestObject('Page_Register/label_Kolom wajib diisi'), 5)
	}

	@Then("I can see error message on Password")
	def verifyErrorMsgPassword() {
		WebUI.verifyElementPresent(findTestObject('Page_Register/label_Password harus diisi minimal 6 karakter'), 5)

		WebUI.closeBrowser()
	}
}