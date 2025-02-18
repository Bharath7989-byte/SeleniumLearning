package org.example.ex01_SeleniumBasics;

import io.qameta.allure.Description;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TestSelenium01 {

    @Description("Open the vwo.com and the get the title")
    @Test
    public  void test_selenium01(){

        FirefoxDriver driver =new FirefoxDriver();
        driver.get("https://app.vwo.com");
        System.out.println(driver.getTitle());

    }
}
