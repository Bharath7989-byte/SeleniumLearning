package org.example.ex03_SeleniumBasic;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestSelenium02 {

    @Test
    public void TestSelenium(){

        WebDriver driver= new EdgeDriver();
        driver.get("https://www.google.com");

        Assert.assertEquals(driver.getTitle(), "Google");

    }
}
