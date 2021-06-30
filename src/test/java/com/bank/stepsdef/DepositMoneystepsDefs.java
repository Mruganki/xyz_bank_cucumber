package com.bank.stepsdef;

import com.bank.pages.AccountPage;
import com.bank.pages.CustomerLoginPage;
import com.bank.pages.CustomerPage;
import com.bank.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class DepositMoneystepsDefs {
    @And("^I click on Customer Login button$")
    public void iClickOnCustomerLogintab() throws InterruptedException{
        Thread.sleep(3000);
        new HomePage().clickonCustomerLoginTab();
    }

    @And("^I search the customer from dropdown$")
    public void iSearchTheCustomerFromDropdown() {
        new CustomerLoginPage().selectCustomerNameFromDropDown();
    }

    @And("^I click on Deposit tab$")
    public void iClickOnDepositTab()throws InterruptedException {
        Thread.sleep(3000);
        new AccountPage().clickOnDepostiTab();
    }

    @And("^I enter amount \"([^\"]*)\"$")
    public void iEnterAmount(String amount)throws InterruptedException {
        Thread.sleep(2000);
        new AccountPage().enterAmount(amount);

    }

    @And("^I click on Deposit button$")
    public void iClickOnDepositButton() {
        new AccountPage().clickOnDepostbutton();
    }

    @Then("^I should see a message \"([^\"]*)\"$")
    public void iShouldSeeAMessage(String depositmessage) {
        String expecteddepositmessage = "Deposit Successful";
        depositmessage = new AccountPage().verifyDepositMsgTab();
        Assert.assertEquals(expecteddepositmessage,depositmessage);

    }


}
