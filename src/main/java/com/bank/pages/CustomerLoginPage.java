package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CustomerLoginPage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());//pagefactory model on the top of each class

    @FindBy(xpath ="//option[text()='Ron Weasly']")
    WebElement selectCustmerName;

    @FindBy(xpath = "//button[@class = 'btn btn-default']")
    WebElement loginbutton;

    @FindBy(xpath = "//button[@ng-click = 'byebye()']")
    WebElement logOutButton;

//    @FindBy(xpath = "//label[contains(text() , 'Your Name :')]")
//    WebElement yourNameText;

    public void selectCustomerNameFromDropDown(){

        clickOnElement(selectCustmerName);
        log.info("Clicking on add to Customer Tab"+ selectCustmerName.toString());
    }
    public void clickOnLoginButton(){

        clickOnElement(loginbutton);
        log.info("Clicking on add to Customer Tab"+ loginbutton.toString());
    }
}
