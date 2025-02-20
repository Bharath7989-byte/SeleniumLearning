package org.example.ex03_SeleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import static dev.failsafe.spi.ExecutionResult.exception;

public class TestSelenium03 {

    @Test
    public void test_selenium() throws Exception {

        WebDriver driver = new EdgeDriver();
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        if(driver.getTitle().contains("CURA Healthcare Service")){
            System.out.println("CURA Healthcare Service is visible");
            Assert.assertTrue(true);
        }
        else{
            throw new Exception("CURA Healthcare Service is not visible");
        }

    }
}
