package com.learning.java8.Java8NewFeatureDurgaSoft.SecuronixInterview.Utils;

import com.learning.java8.Java8NewFeatureDurgaSoft.SecuronixInterview.Tests.BaseTest;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Utils{

    WebDriver driver;

    public Utils(WebDriver driver){
        this.driver=driver;
    }

    public FluentWait<WebDriver> getFluentWait(){
         return new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30)).ignoring(NoSuchFieldException.class);
    }

}
