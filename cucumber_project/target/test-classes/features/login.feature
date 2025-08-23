Feature: Login functionality
Scenario:
	: Successful Login
  Given I open the browser and launch the login page
  When I login with username "<username>" and password "<password>"
  Then I should see the home page
   Examples: Successful Login
	|username|password|
	|anu123  |hi123	 |
	|anusha |1234        |
 Scenario: Failed login
  Given I open the browser and launch the login page
  When I login with username "<username>" and password "<password>"
  Then I should see an error message
 Examples: Failed login
	|username  |password|
	|anu178     |hi19	   |
	|anusha         |120         |
