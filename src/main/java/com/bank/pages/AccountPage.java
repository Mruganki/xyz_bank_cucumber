package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AccountPage extends Utility{

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());//pagefactory model on the top of each class

    @FindBy(xpath = "//body[1]/div[3]/div[1]/div[2]/div[1]/div[3]/button[2]")
    WebElement depositTab;

    //button[@ng-click = 'deposit()']
    @FindBy(xpath = "//input[@ng-model='amount']")
    WebElement amountEnter;

    @FindBy(xpath = "//body[1]/div[3]/div[1]/div[2]/div[1]/div[4]/div[1]/form[1]/button[1]")
    WebElement depositButton;

    @FindBy(xpath = "//span[text() = 'Deposit Successful']")
    WebElement verifyDepositMsg;

    @FindBy(xpath = "//button[@ng-class='btnClass3']")
    WebElement withDrawlTab;

    @FindBy(xpath = "//button[@type='submit']")
    WebElement withDrawlButton;

    @FindBy(xpath = "//span[text()='Transaction successful']")
    WebElement withDrawlMessage;



    public void clickOnDepostiTab()throws InterruptedException{
        Thread.sleep(2000);
       // mouseHoverToElement(depositTab);
        clickOnElement(depositTab);
    }

    public void enterAmount(String amount){

        sendTextToElement(amountEnter,amount);

    }
    public void clickOnDepostbutton(){

        clickOnElement(depositButton);
    }
    public String verifyDepositMsgTab(){

        log.info("verifying Deposit Message"  +verifyDepositMsg  );

        return getTextFromElement( verifyDepositMsg );
    }


    public void clickonWithdrawlTab(){
        clickOnElement(withDrawlTab);
    }

    public void withdrawlAmount(String amount){
        sendTextToElement(amountEnter,amount);

    }
    public void clickOnWithdrawlButton(){

        clickOnElement(withDrawlButton);
    }

    public String verifyWithDrawlMsgTab(){

        log.info("verifying Deposit Message"  +withDrawlMessage  );
        return getTextFromElement( withDrawlMessage );
    }






}
