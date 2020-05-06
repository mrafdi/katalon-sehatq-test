@test
Feature: Login to SehatQ
  As a User I should be able to login to SehatQu successfully

  @login @positiveCase
  Scenario: As a User I should be able to login to SehatQu successfully using right credentials
    Given I go to Sehatqu website
    When I click account icon
    And I click Continue with email
    And I fill email field 'rafshin40@gmail.com' and password field '+8lfF++HKkFedFK3DGW3VA==' in login page
    And I click Continue button in login page
    Then I can see that I am logged in successfully
    
    

  @login @negativeCase
  Scenario Outline: As a User I should not be able to login to SehatQu using wrong credentials
    Given I go to Sehatqu website
    When I click account icon
    And I click Continue with email
    And I fill email field <email> and password field <password> in login page
    And I click Continue button in login page
		Then I can see the warning message on login page
		
    Examples: 
      | email							| password	|
      | email@yahoo.com 	|    123 		|
      | email@gmail.com		|    456 		|
