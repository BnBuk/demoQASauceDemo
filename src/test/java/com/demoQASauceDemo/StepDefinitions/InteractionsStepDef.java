package com.demoQASauceDemo.StepDefinitions;

import com.demoQASauceDemo.Pages.InteractionsPage;
import com.demoQASauceDemo.Utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;

public class InteractionsStepDef {

    InteractionsPage Interactions = new InteractionsPage();

    Actions actions = new Actions(Driver.get());

    @Then("Verify that source item is on the target")
    public void verify_that_source_item_is_on_the_target() {

        String ExpectedMessage = "Dropped!";

        actions.dragAndDrop(Interactions.SourceItem,Interactions.TargetItem).perform();

        Assert.assertEquals("Verify that source is dropped.",Interactions.confirmationMessage.getText(),ExpectedMessage);

    }


}
