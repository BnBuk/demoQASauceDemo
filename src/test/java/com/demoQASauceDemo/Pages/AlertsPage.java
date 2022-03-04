package com.demoQASauceDemo.Pages;

import com.demoQASauceDemo.Utilities.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AlertsPage extends BasePage {


    @FindBy(xpath = "(//ul[@class='menu-list'])[3]")
    public List<WebElement> AlertsAllModules;

    @FindBy(id = "alertButton")
    public WebElement AlertSeeClickButton;

    @FindBy(id = "timerAlertButton")
    public WebElement WaitForAlertButton;

    @FindBy(id = "confirmButton")
    public WebElement AlertConfirmButton;

    @FindBy(id = "confirmResult")
    public WebElement confirmResult;

    @FindBy(id = "promtButton")
    public WebElement AlertPromptButton;

    @FindBy(id = "promptResult")
    public WebElement promptResult;






}
