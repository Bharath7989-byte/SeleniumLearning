package org.example.ex05_SeleniumBasics;

import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Locators {

    @Description("Locators in selenium")

    @Test

    public void locators_selenium() throws InterruptedException {

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver();
        driver.get("https://app.vwo.com/#/login");

        // <input type="email"
        //class="text-input W(100%)"
        // name="username"
        //id="login-username"
        // data-qa="hocewoqisi"
        //fdprocessedid="xjjbc">

        WebElement emailInput = driver.findElement(By.id("login-username"));
        emailInput.sendKeys("admin@gmail.com");

        //<input type="password"
        //class="text-input W(100%)"
        //name="password"
        //id="login-password"
        //data-qa="jobodapuxe"
       // fdprocessedid="7x8uqm">

        WebElement passwordInput = driver.findElement(By.id("login-password"));
        passwordInput.sendKeys("Admin@123");

       // <button type="submit"
        //id="js-login-btn"
        //class="btn btn--positive btn--inverted W(100%) H(48px) Fz(16px)"
        //onclick="login.login(event)"
        //data-qa="sibequkica"
        //fdprocessedid="nbw2vs">
               // <span class="icon loader hidden"
           //data-qa="zuyezasugu"></span>
               // <span data-qa="ezazsuguuy">Sign in</span>
                //</button>
        WebElement SubmitBtn = driver.findElement(By.id("js-login-btn"));
        SubmitBtn.click();

        Thread.sleep(3000);
       // <div class="notification-box-description"
    //id="js-notification-box-msg"
    //data-qa="rixawilomi">Your email, password, IP address or location did not match</div>


        WebElement errorMessage=driver.findElement(By.id("js-notification-box-msg"));
       Assert.assertEquals(errorMessage.getText(),"Your email, password, IP address or location did not match");

       Thread.sleep(5000);
       driver.quit();
    }


}

