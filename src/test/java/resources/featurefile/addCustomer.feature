Feature: Add Customer Functionality
  As a User I should be able to add customer sucessfully


  Background:
    Given I am on Homepage
    Given I click on Bank Manager Login Tab
    Given I click on Add Customer Tab
    Given I enter FirstName "Jarul"
    Given I enter LastName "Mehta"
    Given I enter PostCode "LS17 8JK"
    Given I click on Add Customer Button
    Given I should see message "Customer added successfully"
    Given I should able to accept popup

#  @Sanity
#  Scenario:  User should be able to open Account Successfully
#    When I click on Open Account tab
#    And  I search customer from DropDown
#    And  I select currency from DropDown
#    And  I click on process button
#    Then I should see the message "Account created successfully"
#    And  I should be able to accept pop up


#  @Smoke
#  Scenario: User should log in and log out Successfully
#    When I click on Home button
#    And  I click on Customer Login tab
#    And  I search customer from DropDown
#    And  I click on Login Button
#    Then  I should see "Logout" tab displayed
#    And I should be able to click on Log out tab
#    And I should see "Your Name" text displayed

#  @Regression
#  Scenario: User Should deposit money Successfully
#    When I click on Home button
#    And I click on Customer Login tab
#    And I search the customer from dropdown
#    And I click on Login Button
#    And I click on Deposit tab
#    And I enter amount "100"
#    And I click on Deposit button
#    Then I should see a message "Deposit Successful"

  @Regression
  Scenario: User Should Withdrawal money Successfully
    When I click on Home button
    And I click on Customer Login tab
    And I search the customer from dropdown
    And I click on Login Button
    And I click on Deposit tab
    And I enter amount "100"
    And I click on Deposit button
    And I click on Withdrawl tab
    And I enter  Withdrawl amount "50"
    And I click on Withdraw button
    Then I should able to see message "Transaction Successful"























































#  @Sanity
#  Scenario:  User should be able to add Customer Successfully
#    Given I am on Homepage
#    When I click on Bank Manager Login Tab
#    And I click on Add Customer Tab
#    And I enter FirstName "Jarul"
#    And I enter LastName "Mehta"
#    And I enter PostCode "Ls17 3dr"
#    And I click on Add Customer Button
#    Then I should see message "Customer added successfully"
#    And I should able to accept popup


