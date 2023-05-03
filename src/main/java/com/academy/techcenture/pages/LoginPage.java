package com.academy.techcenture.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    
    private WebDriver driver;

    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "username")
    protected WebElement usernameInput;


    @FindBy(id = "password")
    protected WebElement passwordInput;

    @FindBy(id = "loginbtn")
    protected WebElement loginBtn;

    public void login(){
        usernameInput.sendKeys("username");
        passwordInput.sendKeys("password");
        loginBtn.click();
    }
}
