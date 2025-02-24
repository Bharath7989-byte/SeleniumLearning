package org.example.ex05_SeleniumBasics;

import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Locators_2 {

    @Description("Mini Project")

    @Test

    public void locators_2(){

        WebDriver driver = new EdgeDriver();
        driver.manage().window().maximize();
        driver.get("https://app.vwo.com/#/login");

        //<a href="https://vwo.com/free-trial/?utm_medium=website&amp;utm_source=login-page&amp;utm_campaign=mof_eg_loginpage"
        //class="text-link"
        //data-qa="bericafeqo">Start a free trial</a>

       WebElement linkText=driver.findElement(By.partialLinkText("Start a free"));
       linkText.click();



    }
}
