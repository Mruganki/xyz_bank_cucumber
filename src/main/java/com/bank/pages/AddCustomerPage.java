package com.bank.pages;

import com.bank.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class AddCustomerPage extends Utility {

    private static final Logger log = LogManager.getLogger(HomePage.class.getName());//pagefactory model on the top of each class

    @FindBy(xpath = "//body[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[1]/input[1]")
    WebElement firstNameField;
    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement lastNameField;
    @FindBy(xpath = "//body[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/input[1]")
    WebElement postcodeTab;
    @FindBy(xpath = "//body[1]/div[3]/div[1]/div[2]/div[1]/div[2]/div[1]/div[1]/form[1]/button[1]")
    WebElement addCustomerButton;

    public void enterFirstName(String firstname){

      sendTextToElement(firstNameField,firstname);
        log.info("Enter First Name"+ firstNameField.toString());
    }
    public void enterLastName(String lastname){

       sendTextToElement(lastNameField,lastname);
        log.info("Enter Last Name"+ lastNameField.toString());
    }
    public void enterPostCode(String postcode){

        sendTextToElement(postcodeTab,postcode);
        log.info("Enter post code"+ postcodeTab.toString());
    }
    public void clickAddCustomerButton(){

        log.info("Click On Add Customer button"+ addCustomerButton.toString());
      clickOnElement(addCustomerButton);

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
