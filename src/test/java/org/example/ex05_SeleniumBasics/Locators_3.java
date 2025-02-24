package org.example.ex05_SeleniumBasics;

import jdk.jfr.Description;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Locators_3 {

    @Description("Invalid message")

    @Test

    public void Invalid_mail(){

        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addArguments("--start-maximized");

        WebDriver driver = new EdgeDriver(edgeOptions);
        driver.get("https://vwo.com/free-trial/?utm_medium=website&utm_source=login-page&utm_campaign=mof_eg_loginpage");

       // <input class="W(100%) Py(14px) input-text"
        //placeholder="name@yourcompany.com"
        //type="email" id="page-v1-step1-email"
      //  name="email"
    //data-qa="page-su-step1-v1-email"
    //required=""
        // fdprocessedid="fn0eb">

       WebElement invalid=driver.findElement(By.id("page-v1-step1-email"));
       invalid.sendKeys("abcdefgh");

      // <input class="Cur(p) Flxs(0) M(0) Pos(r) T(2px)"
    //type="checkbox"
    //name="gdpr_consent_checkbox"
    //id="page-free-trial-step1-cu-gdpr-consent-checkbox"
    //value="true" data-qa="page-free-trial-step1-gdpr-consent-checkbox"
    //data-gtm-form-interact-field-id="0">

        WebElement checkbox=driver.findElement(By.id("page-free-trial-step1-cu-gdpr-consent-checkbox"));
        checkbox.click();

        //<button type="submit"
        //class="button W(100%) btn-modal-form-submit"
    //data-qa="page-su-submit"
    //fdprocessedid="d02gr9"
    //value="">Create a Free Trial Account</button>

        List<WebElement> buttonlist=  driver.findElements(By.tagName("button"));
        buttonlist.get(0).click();

        //<div class="C($color-red) Fz($font-size-12) Trsp($Op) Trsdu(0.15s) Op(0) invalid-input+Op(1) invalid-reason">
             //   A value for this field is required.</div>

       // <div class="C($color-red) Fz($font-size-12) Trsp($Op) Trsdu(0.15s) Op(0) invalid-input+Op(1) invalid-reason">
               // The email address you entered is incorrect.</div>

       WebElement errormessasge=driver.findElement(By.className("invalid-reason"));
        Assert.assertEquals(errormessasge.getText(),"The email address you entered is incorrect.");


    }
}
