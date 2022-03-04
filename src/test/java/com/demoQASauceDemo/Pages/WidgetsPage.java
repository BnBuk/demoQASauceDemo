package com.demoQASauceDemo.Pages;

import com.demoQASauceDemo.Utilities.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class WidgetsPage extends BasePage {

    @FindBy(xpath = "(//ul[@class='menu-list'])[4]")
    public List<WebElement> WidgetsAllModules;

    @FindBy(id = "toolTipButton")
    public WebElement HoverMeToSeeButton;

    @FindBy(xpath = "//button[@aria-describedby = 'buttonToolTip']")
    public WebElement verifyToolTip;

    @FindBy(id = "texFieldToolTopContainer")
    public WebElement HoverMeToSeeTextBox;

    @FindBy(xpath = "//div/input[@aria-describedby = 'textFieldToolTip']")
    public WebElement verifyTextToolTip;




}
