package com.demoQASauceDemo.StepDefinitions;

import com.demoQASauceDemo.Pages.LoginPage;
import com.demoQASauceDemo.Utilities.BrowserUtils;
import com.demoQASauceDemo.Utilities.ConfigurationReader;
import com.demoQASauceDemo.Utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class TASK2BLoginStepDef {

    LoginPage loginPage = new LoginPage();


    @Given("The users should land on login page")
    public void the_users_should_land_on_login_page() {Driver.get().get(ConfigurationReader.get("url2"));

    }


    @Then("The users should login with {string} and {string} successfully")
    public void the_users_should_login_with_and_successfully(String username, String password) {

        loginPage.Login(username,password);
        BrowserUtils.waitFor(1);
        String ExpectedUrl = "https://www.saucedemo.com/inventory.html";
        Assert.assertEquals("Verify that user couldn't login successfully", ExpectedUrl,Driver.get().getCurrentUrl());

    }

    @Then("The users should not login with {string} and {string}")
    public void the_users_should_not_login_with_and(String username, String password) {

        loginPage.Login(username, password);
        BrowserUtils.waitFor(1);
        String ExpectedUrl = "https://www.saucedemo.com/";
        Assert.assertEquals("Verify that user logins with invalid credentials",ExpectedUrl, Driver.get().getCurrentUrl());

    }
}
