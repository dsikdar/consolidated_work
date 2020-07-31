#Please Do not change Feature Templet
Feature: Customer Registration
#Please Do not change Scenario Outline Templet
Scenario Outline: User registered on entering the user details and click on Submit button
#Please Do not change Given Templet
Given User launches the Registration URL
#When User enters name as <name>, Age as <Age>, Address as <Address>, Phone Number as <Phone Number>, Email as <Email>, clicks <submit> button$
When User enters name as "<name>",Age as "<Age>",Address as "<Address>",Phone Number as "<Phone Number>",Email as "<Email>",clicks "<submit>"
Then user is registered with user details displayed
Examples:
|name|Age|Address|Phone Number|Email|submit|
|Debajyoti|33|kolkata|9831676009|ac@ac.com|submit|
|tst|44|delhi|99999|h@w.com|submit|