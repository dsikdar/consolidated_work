Feature: Google Search
  Verify Google Search functionality with several search inputs content.

    //Background:
    //Given system is up
	
	@SignUpTest
	Scenario: User signs up
	Given The User provide details as 
	| John Smith | Abcd1234!@#$ | India | john.smith@yahoo.com |
	Then Clicks on Submit button
	Then The User shown a sign-up succesful msg
    
    Scenario: User valid login
    Given The User logs in with "John Smith" and "Abcd1234!@#$"
	Then Login should be successful
	
	Scenario: User invalid login
	Given The User logs in with "John Smith" and "xyz"
	Then Login should not be successful

	Scenario Outline: Print all user name and passwords
	Then I print all <username> and <password>
	Examples:
	|username|password|
	|User 1|Password1|
	|User 2|Password2|
	|User 3|Password3|
	