Feature: It contains TCs related to Actitime Login page

  Scenario: check VTiger login functinality with valid User
    Given user in on VTiger login page
    When user enters username and password as password in password field
    And clicks on Login button
    Then verify HomePage title
		And close the browser
    
