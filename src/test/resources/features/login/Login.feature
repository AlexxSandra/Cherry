Feature: Login page

Scenario: Verify that Login was successful
  Given user is accessing the login page
  When user enters correct credentials
  And user clicks on the Login button
  Then user should be successful Login