package com.demoQASauceDemo.StepDefinitions;

import com.demoQASauceDemo.Pages.WidgetsPage;
import com.demoQASauceDemo.Utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

public class WidgetsStepDef {

    WidgetsPage Widgets = new WidgetsPage();
    Actions actions = new Actions(Driver.get());

    @Then("Confirm {string} that appears after hovering")
    public void confirm_that_appears_after_hovering_the_button(String message) {

        String ExpectedMessage = message;

        if(message.contains("Button")){

            actions.moveToElement(Widgets.HoverMeToSeeButton).perform();

        }else {

            actions.moveToElement(Widgets.HoverMeToSeeTextBox).perform();
        }

        String ActualButtonToolTipMessage = Driver.get().findElement(By.className("tooltip-inner")).getText();

        Assert.assertEquals(ExpectedMessage, ActualButtonToolTipMessage);

    }


}
