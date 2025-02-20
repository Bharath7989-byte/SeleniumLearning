package org.example.ex03_SeleniumBasic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class TestSelenium04 {

    @Test
    public void test_selenium(){

        WebDriver driver= new EdgeDriver();
        driver.get("https://www.google.com");

        driver.navigate().to("https://bing.com");
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();

    }
}
