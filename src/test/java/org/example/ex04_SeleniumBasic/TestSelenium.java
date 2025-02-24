package org.example.ex04_SeleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

public class TestSelenium {

    @Test

    public void optionclasses() throws InterruptedException {

        EdgeOptions edgeOptions= new EdgeOptions();

        edgeOptions.addArguments("--windows-size=1920,1080");

        WebDriver driver= new EdgeDriver(edgeOptions);
        driver.get("https://www.google.com");

        Thread.sleep(15000);
        driver.quit();


    }
}
