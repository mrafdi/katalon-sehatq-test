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



class EditProfileSteps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@When("I click My Account icon")
	def clickMyAccountIcon() {
		WebUI.click(findTestObject('Page_SehatQ Profil/img_Tidak ada notifikasi_img-circle'))
	}
	
	@When("I select Profile menu")
	def clickProfileMenu() {
		WebUI.click(findTestObject('Page_SehatQ Profil/span_Profil'))
	}
	
	@When("I click arrow icon on my profile name")
	def clickArrowIconProfileName() {
		WebUI.click(findTestObject('Page_SehatQ Profil/i_Rafdi Shin_fs icon-chevron-circle-right c_715251'))
	}
	
	@When("I click edit icon on profile")
	def clickEditProfile() {
		WebUI.click(findTestObject('Page_SehatQ Profil/i_Rafdi Shin_fs icon-chevron-circle-right c_715251'))
	}
	
	@When("I edit Tinggi Badan field (.*) and Berat Badan field (.*) in edit profile page")
	def editProfilTinggiBerat(int tinggi, int berat) {
		WebUI.setText(findTestObject('Page_SehatQ Profil/input_Tinggi Badan (cm)_height'), tinggi)

		WebUI.setText(findTestObject('Page_SehatQ Profil/input_Berat Badan (kg)_weight'), berat)
	}

	@When("I click Simpan button in edit profile page")
	def clickSimpanProfilBtn() {
		WebUI.click(findTestObject('Page_SehatQ Profil/button_Simpan'))
	}

	@Then("I can see message that edit profile is success")
	def verifySuccessEditProfile() {
		WebUI.verifyElementPresent(findTestObject('Page_SehatQ Profil/span_Edit profile berhasil'), 5)

		WebUI.closeBrowser()
	}
}