package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class BankManagerLoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());//pagefactory model on the top of each class

    @FindBy(xpath = "//body[1]/div[3]/div[1]/div[2]/div[1]/div[1]/button[1]")
    WebElement addCustomerTab;
    @FindBy(xpath = "//body[1]/div[3]/div[1]/div[2]/div[1]/div[1]/button[2]")
    WebElement openAccountTab;
    @FindBy(xpath = "//body[1]/div[3]/div[1]/div[2]/div[1]/div[1]/button[3]")
    WebElement Customers;

    public void clickOnAddToCutomerTab(){

        clickOnElement(addCustomerTab);
        log.info("Clicking on add to Customer Tab"+ addCustomerTab.toString());
    }

    public void clickOnOpenAccountTab(){

        clickOnElement(openAccountTab);
        log.info("Clicking on add to Customer Tab"+ openAccountTab.toString());
    }

    public void clickOnCutomersTab(){

        clickOnElement(Customers);
        log.info("Clicking on add to Customer Tab"+ Customers.toString());
    }


}