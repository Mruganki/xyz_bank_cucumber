$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/resources/featurefile/addCustomer.feature");
formatter.feature({
  "line": 1,
  "name": "Add Customer Functionality",
  "description": "As a User I should be able to add customer sucessfully",
  "id": "add-customer-functionality",
  "keyword": "Feature"
});
formatter.before({
  "duration": 3804129600,
  "status": "passed"
});
formatter.background({
  "line": 5,
  "name": "",
  "description": "",
  "type": "background",
  "keyword": "Background"
});
formatter.step({
  "line": 6,
  "name": "I am on Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "I click on Bank Manager Login Tab",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "I click on Add Customer Tab",
  "keyword": "Given "
});
formatter.step({
  "line": 9,
  "name": "I enter FirstName \"Jarul\"",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "I enter LastName \"Mehta\"",
  "keyword": "Given "
});
formatter.step({
  "line": 11,
  "name": "I enter PostCode \"LS17 8JK\"",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "I click on Add Customer Button",
  "keyword": "Given "
});
formatter.step({
  "line": 13,
  "name": "I should see message \"Customer added successfully\"",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "I should able to accept popup",
  "keyword": "Given "
});
formatter.match({
  "location": "AddCustStepDefs.iAmOnHomepage()"
});
formatter.result({
  "duration": 197890200,
  "status": "passed"
});
formatter.match({
  "location": "AddCustStepDefs.iClickOnBankManagerLoginTab()"
});
formatter.result({
  "duration": 336656100,
  "status": "passed"
});
formatter.match({
  "location": "AddCustStepDefs.iClickOnAddCustomerTab()"
});
formatter.result({
  "duration": 143546200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Jarul",
      "offset": 19
    }
  ],
  "location": "AddCustStepDefs.iEnterFirstName(String)"
});
formatter.result({
  "duration": 251234200,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Mehta",
      "offset": 18
    }
  ],
  "location": "AddCustStepDefs.iEnterLastName(String)"
});
formatter.result({
  "duration": 144347900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "LS17 8JK",
      "offset": 18
    }
  ],
  "location": "AddCustStepDefs.iEnterPostCode(String)"
});
formatter.result({
  "duration": 124811200,
  "status": "passed"
});
formatter.match({
  "location": "AddCustStepDefs.iClickOnAddCustomerButton()"
});
formatter.result({
  "duration": 131275900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Customer added successfully",
      "offset": 22
    }
  ],
  "location": "AddCustStepDefs.iShouldSeeMessage(String)"
});
formatter.result({
  "duration": 22655900,
  "status": "passed"
});
formatter.match({
  "location": "AddCustStepDefs.iShouldAbleToAcceptPopup()"
});
formatter.result({
  "duration": 28983900,
  "status": "passed"
});
formatter.scenario({
  "comments": [
    {
      "line": 16,
      "value": "#  @Sanity"
    },
    {
      "line": 17,
      "value": "#  Scenario:  User should be able to open Account Successfully"
    },
    {
      "line": 18,
      "value": "#    When I click on Open Account tab"
    },
    {
      "line": 19,
      "value": "#    And  I search customer from DropDown"
    },
    {
      "line": 20,
      "value": "#    And  I select currency from DropDown"
    },
    {
      "line": 21,
      "value": "#    And  I click on process button"
    },
    {
      "line": 22,
      "value": "#    Then I should see the message \"Account created successfully\""
    },
    {
      "line": 23,
      "value": "#    And  I should be able to accept pop up"
    },
    {
      "line": 26,
      "value": "#  @Smoke"
    },
    {
      "line": 27,
      "value": "#  Scenario: User should log in and log out Successfully"
    },
    {
      "line": 28,
      "value": "#    When I click on Home button"
    },
    {
      "line": 29,
      "value": "#    And  I click on Customer Login tab"
    },
    {
      "line": 30,
      "value": "#    And  I search customer from DropDown"
    },
    {
      "line": 31,
      "value": "#    And  I click on Login Button"
    },
    {
      "line": 32,
      "value": "#    Then  I should see \"Logout\" tab displayed"
    },
    {
      "line": 33,
      "value": "#    And I should be able to click on Log out tab"
    },
    {
      "line": 34,
      "value": "#    And I should see \"Your Name\" text displayed"
    },
    {
      "line": 36,
      "value": "#  @Regression"
    },
    {
      "line": 37,
      "value": "#  Scenario: User Should deposit money Successfully"
    },
    {
      "line": 38,
      "value": "#    When I click on Home button"
    },
    {
      "line": 39,
      "value": "#    And I click on Customer Login tab"
    },
    {
      "line": 40,
      "value": "#    And I search the customer from dropdown"
    },
    {
      "line": 41,
      "value": "#    And I click on Login Button"
    },
    {
      "line": 42,
      "value": "#    And I click on Deposit tab"
    },
    {
      "line": 43,
      "value": "#    And I enter amount \"100\""
    },
    {
      "line": 44,
      "value": "#    And I click on Deposit button"
    },
    {
      "line": 45,
      "value": "#    Then I should see a message \"Deposit Successful\""
    }
  ],
  "line": 48,
  "name": "User Should Withdrawal money Successfully",
  "description": "",
  "id": "add-customer-functionality;user-should-withdrawal-money-successfully",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 47,
      "name": "@Regression"
    }
  ]
});
formatter.step({
  "line": 49,
  "name": "I click on Home button",
  "keyword": "When "
});
formatter.step({
  "line": 50,
  "name": "I click on Customer Login tab",
  "keyword": "And "
});
formatter.step({
  "line": 51,
  "name": "I search the customer from dropdown",
  "keyword": "And "
});
formatter.step({
  "line": 52,
  "name": "I click on Login Button",
  "keyword": "And "
});
formatter.step({
  "line": 53,
  "name": "I click on Deposit tab",
  "keyword": "And "
});
formatter.step({
  "line": 54,
  "name": "I enter amount \"100\"",
  "keyword": "And "
});
formatter.step({
  "line": 55,
  "name": "I click on Deposit button",
  "keyword": "And "
});
formatter.step({
  "line": 56,
  "name": "I click on Withdrawl tab",
  "keyword": "And "
});
formatter.step({
  "line": 57,
  "name": "I enter  Withdrawl amount \"50\"",
  "keyword": "And "
});
formatter.step({
  "line": 58,
  "name": "I click on Withdraw button",
  "keyword": "And "
});
formatter.step({
  "line": 59,
  "name": "I should able to see message \"Transaction Successful\"",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginLogoutstepsDefs.iClickOnHomeButton()"
});
formatter.result({
  "duration": 154424200,
  "status": "passed"
});
formatter.match({
  "location": "LoginLogoutstepsDefs.iClickOnCustomerLoginTab()"
});
formatter.result({
  "duration": 157657200,
  "status": "passed"
});
formatter.match({
  "location": "DepositMoneystepsDefs.iSearchTheCustomerFromDropdown()"
});
formatter.result({
  "duration": 275449300,
  "status": "passed"
});
formatter.match({
  "location": "LoginLogoutstepsDefs.iClickOnLoginButton()"
});
formatter.result({
  "duration": 98539200,
  "status": "passed"
});
formatter.match({
  "location": "DepositMoneystepsDefs.iClickOnDepositTab()"
});
formatter.result({
  "duration": 5127431000,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "100",
      "offset": 16
    }
  ],
  "location": "DepositMoneystepsDefs.iEnterAmount(String)"
});
formatter.result({
  "duration": 2128303800,
  "status": "passed"
});
formatter.match({
  "location": "DepositMoneystepsDefs.iClickOnDepositButton()"
});
formatter.result({
  "duration": 88358800,
  "status": "passed"
});
formatter.match({
  "location": "WithdralstepsDefs.iClickOnWithdrawlTab()"
});
formatter.result({
  "duration": 118084900,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "50",
      "offset": 27
    }
  ],
  "location": "WithdralstepsDefs.iEnterWithdrawlAmount(String)"
});
formatter.result({
  "duration": 2122800800,
  "status": "passed"
});
formatter.match({
  "location": "WithdralstepsDefs.iClickOnWithdrawButton()"
});
formatter.result({
  "duration": 108844100,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Transaction Successful",
      "offset": 30
    }
  ],
  "location": "WithdralstepsDefs.iShouldAbleToSeeMessage(String)"
});
formatter.result({
  "duration": 88270600,
  "status": "passed"
});
formatter.after({
  "duration": 775121500,
  "status": "passed"
});
});