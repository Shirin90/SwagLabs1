Feature: QA Engineer Coding Test-Swag labs login 

	Descriptoin "As a Swag Labs customer who is not locked out, I need to be able to log in so"
                    "that I can purchase Sauce Labs merch"
@sanity
Scenario: Successful Login 
	Given I am on the Sauce Demo Login Page 
	When I fill the user name "standard_user" into the Username field 
	And I fill password "secret_sauce" the Password field 
	And I click the Login Button 
	Then I am redirected to the Sauce Demo Main Page 
	And I verify the App Logo exists 
	
	
@sanity	
Scenario: Failed Login 
	Given I am on the Sauce Demo Login Page 
	When I fill the LockedOutUser name "locked_out_user" into the Username field 
	And I fill password "secret_sauce" the Password field 
	And I click the Login Button 
	Then I verify the Error Message contains the text 
	
