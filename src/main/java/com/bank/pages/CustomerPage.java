package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class CustomerPage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());//pagefactory model on the top of each class

    @FindBy(xpath = "//button[text()='Logout']")
    WebElement logOutTab;

    @FindBy(xpath = "//label[contains(text() , 'Your Name :')]")
    WebElement yourNameText;

    public String verifyLogOutTab(){

        log.info("verifying logout tab"  +logOutTab  );

        return getTextFromElement( logOutTab );
    }
    public String verifyYourNameText(){

        log.info("verifying your name text"  +yourNameText );

        return getTextFromElement( yourNameText );

    }
    public void clickOnLogOutButton(){

        clickOnElement(logOutTab);
        log.info("click on logout button"  +logOutTab  );
    }
}
//label[contains(text() , 'Your Name :')]