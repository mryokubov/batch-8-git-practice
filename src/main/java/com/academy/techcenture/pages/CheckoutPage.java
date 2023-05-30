package com.academy.techcenture.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckoutPage {

    public CheckoutPage (WebDriver driver){

    }


    @FindBy (xpath = "//div[@id='username']")
    protected WebElement usernameInput;


}
