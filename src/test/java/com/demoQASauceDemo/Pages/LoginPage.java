package com.demoQASauceDemo.Pages;

import com.demoQASauceDemo.Utilities.BasePage;
import com.demoQASauceDemo.Utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends BasePage {

    public LoginPage(){PageFactory.initElements(Driver.get(), this);

}
    @FindBy(id = "user-name")
    public WebElement Username;

    @FindBy(id = "password")
    public WebElement Password;

    @FindBy(id = "login-button")
    public WebElement loginButton;

    @FindBy(xpath = "//button[@class = 'error-button']")
    public WebElement errorMessage;

    public void Login(String username, String password){
     Username.sendKeys(username);
     Password.sendKeys(password);
     loginButton.click();
    }

}
