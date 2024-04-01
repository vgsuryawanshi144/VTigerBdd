Feature: Admin can manage employee records

  Background:
    Given user logged in as an admin
    And user is on PIM Page

  Scenario: Adding employee 
    When user choose to add a new employee
    And user fill in the employee details:
    Then user is on employees details page
    
  Scenario: Updating employee details
    When user choose to edit an existing employee record
    Then user should be redirected to the personal details section for that employee
    And user can update the employee personal details
    And user save the changes
    Then the employee details should be updated successfully

  Scenario: Deleting an employee record 
    When user choose to delete an existing employee record
    And user clicked on delete reord button
