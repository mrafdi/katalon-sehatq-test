@test
Feature: Edit profile on SehatQ
  As a User I should be able to edit my profile in SehatQu

  @editProfile @positiveCase
  Scenario: As a User I should be able to edit my profile in SehatQu successfully
    Given I go to SehatQ login page
    When I do login in login page
    And I click My Account icon
    And I select Profile menu
    And I click arrow icon on my profile name
    And I click edit icon on profile
    And I edit Tinggi Badan field '175' and Berat Badan field '65' in edit profile page
    And I click Simpan button in edit profile page
    Then I can see message that edit profile is success
