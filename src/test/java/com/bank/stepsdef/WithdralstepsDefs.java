package com.bank.stepsdef;

import com.bank.pages.AccountPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import org.junit.Assert;

public class WithdralstepsDefs {
    @And("^I click on Withdrawl tab$")
    public void iClickOnWithdrawlTab() {
        new AccountPage().clickonWithdrawlTab();
    }

    @And("^I enter  Withdrawl amount \"([^\"]*)\"$")
    public void iEnterWithdrawlAmount(String amount) throws InterruptedException {
        Thread.sleep(2000);
        new AccountPage().enterAmount(amount);

    }

    @And("^I click on Withdraw button$")
    public void iClickOnWithdrawButton() {
        new AccountPage().clickOnWithdrawlButton();
    }

    @Then("^I should able to see message \"([^\"]*)\"$")
    public void iShouldAbleToSeeMessage(String withdrawlmessage)  {
        String expectedwidthdrawmessage = "Transaction successful";
        withdrawlmessage = new AccountPage().verifyWithDrawlMsgTab();
        Assert.assertEquals(expectedwidthdrawmessage,withdrawlmessage);
    }
}
