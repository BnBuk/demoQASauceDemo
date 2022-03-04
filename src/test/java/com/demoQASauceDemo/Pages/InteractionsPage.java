package com.demoQASauceDemo.Pages;

import com.demoQASauceDemo.Utilities.BasePage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class InteractionsPage extends BasePage {


    @FindBy(xpath = "(//ul[@class='menu-list'])[5]")
    public List<WebElement> InteractionsAllModules;

    @FindBy(id = "droppableExample-tab-simple")
    public WebElement SimpleModule;

    @FindBy(id = "draggable")
    public WebElement SourceItem;

    @FindBy(id = "droppable")
    public WebElement TargetItem;

    @FindBy(xpath = "//div[@id ='simpleDropContainer']/div[@id = 'droppable']")
    public WebElement confirmationMessage;


}
