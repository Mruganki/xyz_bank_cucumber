package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class OpenAccountPage extends Utility {

    private static final Logger log = LogManager.getLogger( AddCustomerPage.class.getName());

    @FindBy(xpath = "//select[@id = 'userSelect']")
    WebElement selectCust;

    @FindBy(xpath = "//option[text()='Jarul Mehta']")
    WebElement custName;

    @FindBy(xpath = "//select[@id = 'currency']")
    WebElement currency;

    @FindBy(xpath = "//option[text()='Pound']")
    WebElement pound;

    @FindBy(xpath = "//body[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/button[1]")
    WebElement processButton;

    public void selectCustomerNameFromDropDown(String value){

        clickOnElement( selectCust );
        clickOnElement( custName );
        log.info( "clicking on customer name"  +custName  +selectCust );
    }

    public void selectCurrency(){

        clickOnElement( currency );
        clickOnElement( pound );
        log.info( "clicking on currency"  +currency +pound  );
    }
    public void clickOnProcessButton(){

        mouseHoverToElement( processButton );
        log.info( "clicking on process button"  +processButton  );
        clickOnElement( processButton );

    }
    public void acceptAlert(){
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
    public String getTextFromAlert(){
        Alert alert = driver.switchTo().alert();
        return alert.getText();

    }







}
