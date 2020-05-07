@test
Feature: SehatQu Register Cases
  As a User I should be able to register to SehatQu

  @register @positiveCase
  Scenario: As a User I should be able to register to SehatQu successfully
    Given I go to Sehatqu website
    When I click account icon
    And I click Continue with email
    And I click Sign Up button
    Then I can see that I am in Sign Up page
    When I input Nama Lengkap with 'Tester Sehatq' Email with 'testersehat@yopmail' Password with 'EIxfoJfk6/NHBldnX1zqmw=='
    And I check the agreement checkbox
    And I click Continue button in register page
		Then I can see Pendaftaran Berhasil message
		
  @register @negativeCase
  Scenario: As a User I should not be able to register to SehatQu if the field is blank
    Given I go to Sehatqu website
    When I click account icon
    And I click Continue with email
    And I click Sign Up button
    Then I can see that I am in Sign Up page
    When I check the agreement checkbox
    And I click Continue button in register page
		Then I can see error message on Nama
		And I can see error message on Email
		And I can see error message on Password
