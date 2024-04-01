Feature: Login to the OrarangeHrm

Scenario: Verify user is able to login
    Given user is on LoginPage
    When user enters valid username and password and clicks on LoginButton
    Then verify the title of the HomePage
    And verify the presence of Welcome message
    And close the browser