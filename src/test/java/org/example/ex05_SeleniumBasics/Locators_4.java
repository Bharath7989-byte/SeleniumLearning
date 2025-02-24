package org.example.ex05_SeleniumBasics;

import jdk.jfr.Description;
import org.checkerframework.checker.signature.qual.DotSeparatedIdentifiers;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;

import java.util.List;

public class Locators_4 {

    @Description("Mini Project Assignment")
    @Test

    public void Login_Page(){

        EdgeOptions edgeOptions= new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver= new EdgeDriver(edgeOptions);
        driver.get("https://katalon-demo-cura.herokuapp.com/");

        //<a id="btn-make-appointment"
        //href="./profile.php#login"
       // class="btn btn-dark btn-lg">Make Appointment</a>
            WebElement Appointment_button=driver.findElement(By.linkText("Make Appointment"));
            Appointment_button.click();

            //<input type="text" class="form-control"
            //id="txt-username"
            //name="username"
            //placeholder="Username"
            //value="" autocomplete="off">
       WebElement user_input =driver.findElement(By.id("txt-username"));
       user_input.sendKeys("Jhon");

      // <input type="password"
        //class="form-control"
    //id=id="txt-password"
    //name="password" placeholder="Password" value="" autocomplete="off">

       WebElement password=driver.findElement(By.id("txt-password"));
       password.sendKeys("Jhon@123");

      // <button id="btn-login" type="submit" class="btn btn-default" fdprocessedid="d7pjj9">Login</button>
      WebElement button = driver.findElement(By.id("btn-login"));
      button.click();

    }

}
