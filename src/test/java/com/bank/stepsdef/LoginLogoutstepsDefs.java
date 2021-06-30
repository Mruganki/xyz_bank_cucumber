package com.bank.stepsdef;

import com.bank.pages.CustomerLoginPage;
import com.bank.pages.CustomerPage;
import com.bank.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class LoginLogoutstepsDefs {
    @When("^I click on Home button$")
    public void iClickOnHomeButton() {
        new HomePage().clickonHomeTab();
    }

    @And("^I click on Customer Login tab$")
    public void iClickOnCustomerLoginTab() {
        new HomePage().clickonCustomerLoginTab();
    }

    @And("^I click on Login Button$")
    public void iClickOnLoginButton() {
        new CustomerLoginPage().clickOnLoginButton();
    }

    @Then("^I should see \"([^\"]*)\" tab displayed$")
    public void iShouldSeeTabDisplayed(String logout) throws InterruptedException {
        Thread.sleep(3000);
        String expectedlogout = "Logout";
        logout = new CustomerPage().verifyLogOutTab();
        Assert.assertEquals(expectedlogout,logout);
    }

    @And("^I should be able to click on Log out tab$")
    public void iShouldBeAbleToClickOnLogOutTab() {
        new CustomerPage().clickOnLogOutButton();
    }

    @And("^I should see \"([^\"]*)\" text displayed$")
    public void iShouldSeeTextDisplayed(String yourname)  {
        yourname = new CustomerPage().verifyYourNameText();
        Assert.assertTrue(yourname.contains("Your Name :"));

    }
}
