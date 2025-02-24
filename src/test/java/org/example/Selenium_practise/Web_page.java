package org.example.Selenium_practise;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Web_page {

    @Test

    public void web_page() throws Exception {

        WebDriver driver= new EdgeDriver();
        driver.get("https://katalon.com/katalon-studio");


        if(driver.getPageSource().contains("The way software testing should be"))
        {
            System.out.println("The way software testing should be");

            Assert.assertTrue(true);
        }
        else {
            throw new Exception("The way software testing should be is not visible");
        }

    }
}
