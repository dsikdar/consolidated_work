Feature: Application login

Scenario: Home page deafult login
Given user in the home page
When user logs in with user name and password
Then main page is displayed
And all cards arre displayed