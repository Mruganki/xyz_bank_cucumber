package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class HomePage extends Utility {


    private static final Logger log = LogManager.getLogger(HomePage.class.getName());//pagefactory model on the top of each class

    @FindBy(xpath = "//button[text()='Customer Login']")
    WebElement customerloginButton;

    @FindBy(xpath = "//button[text()='Bank Manager Login']")
    WebElement bankManagerLogin;

    @FindBy(xpath = "//button[text()='Home']")
    WebElement homeTab;


    public void clickonCustomerLoginTab(){

        clickOnElement(customerloginButton);
        log.info("Clicking on customer login button" + customerloginButton.toString());
    }

    public void clickonBankManagerLoginTab(){

        clickOnElement(bankManagerLogin);
        log.info("Clicking on Bank Manager Login Button" + bankManagerLogin.toString());
    }
    public void clickonHomeTab(){

        clickOnElement(homeTab);
        log.info("Clicking on Bank Manager Login Button" + homeTab.toString());
    }

}
