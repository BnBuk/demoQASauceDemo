package com.demoQASauceDemo.StepDefinitions;

import com.demoQASauceDemo.Utilities.BrowserUtils;
import com.demoQASauceDemo.Utilities.ConfigurationReader;
import com.demoQASauceDemo.Utilities.Driver;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.util.concurrent.TimeUnit;

public class Hooks {

    @Before ("@sauceDemo")
    public void setUp1(){
        Driver.get().get(ConfigurationReader.get("url2"));
        Driver.get().manage().window().maximize();
        Driver.get().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }


    @After
    public void tearDown(Scenario scenario){

        if (scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) Driver.get()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", "screenshot");
        }
        BrowserUtils.waitFor(2);
        Driver.closeDriver();
    }

    @Before ("@demoQA")
    public void setUp2(){
        Driver.get().get(ConfigurationReader.get("url1"));
        Driver.get().manage().window().maximize();
        Driver.get().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
    }


}
