package org.example.ex03_SeleniumBasic;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestSelenium05 {

    @Test

    public void test_selenium() throws InterruptedException {

        WebDriver driver= new EdgeDriver();
        driver.get("Https://www.google.com");

        Thread.sleep(3000);
        driver.quit();

    }


}
