Feature: Login to Test Environment

  Background: 
    Given User is on TEST Environment page

  @loginTest
  Scenario: Login to MyAccount
    When User click on MyAccount
    And User click on Login
    And User enters username 'sdet@tekschool.us' and Password 'sdet'
    And User click on Login button
    Then User Should be logged in to user Dashboard

  @MultipleUsers
  Scenario Outline: Login to My Account with multiple users
    When User click on MyAccount
    And User click on Login
    And User enters username '<userName>' and Password '<password>'
    And User click on Login button
    Then User Should be logged in to user Dashboard

    Examples: 
      | userName              | password |
      | sdet@tekschool.us     | sdet     |
      | student@tekschool.us  | TEST     |
      | teacher@tekSchool.us  | teacher  |
      | consumer@tekschool.us | JBond    |

  @logout
  Scenario: Log out from  MyAccount
    When User click on MyAccount
    And User click on Login
    And User enters username 'sdet@tekschool.us' and Password 'sdet'
    And User click on Login button
    Then User Should be logged in to user Dashboard
    When User click on MyAccount
    And User click on Logout
    Then User should be logged out
