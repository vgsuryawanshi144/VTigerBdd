Feature: Add Lead
  As a salesperson
  I want to add a new lead
  So that I can manage my leads effectively

  Scenario Outline: Add a new lead
    Given I am on the create lead page
    When I fill in lead details with "<FirstName>", "<LastName>", "<PrimaryPhone>", "<MobileNumber>", "<Company>", "<Designation>", "<LeadSource>", "<Industry>", "<LeadStatus>", "<Rating>", "<AssignedTo>", "<Fax>", "<Email>", "<Website>", "<AddressStreet>", "<POBox>", "<PostalCode>", "<Country>", "<City>", "<State>", "<Description>"
    And I save the lead
    Then the lead should be successfully added

    Examples:
      | FirstName | LastName   | PrimaryPhone | MobileNumber | Company       | Designation   | LeadSource | Industry | LeadStatus | Rating | AssignedTo     | Fax | Email           | Website         | AddressStreet | POBox | PostalCode | Country | City | State | Description |
      | Gaurav    | Suryawanshi| 8888147876   | 8888147876   | Tech Mahindra| Test Engineer | Employee   | Banking  | Hot        | Active | Support Group  | 123 | gs@example.com | www.example.com | 123 Hadapsar   | 411028 | 411028      | India    | Pune   | MH    | New lead    |
