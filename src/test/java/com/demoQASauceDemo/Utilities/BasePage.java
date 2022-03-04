package com.demoQASauceDemo.Utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

    public BasePage() { PageFactory.initElements(Driver.get(),this);}

    public WebDriverWait wait;
    public Actions actions;



    @FindBy(xpath = "//div[@class='card-body']/h5[contains(text(),'Alerts, Frame & Windows')]")
    public WebElement AlertsFrameWindowsTag;

    @FindBy(xpath = "//div[@class='card-body']/h5[contains(text(),'Widgets')]")
    public WebElement WidgetsTag;

    @FindBy(xpath = "//div[@class='card-body']/h5[contains(text(),'Interactions')]")
    public WebElement InteractionsTag;

}
