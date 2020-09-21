package com.learning.java8.Java8NewFeatureDurgaSoft.SecuronixInterview.Tests;

import com.learning.java8.Java8NewFeatureDurgaSoft.SecuronixInterview.Pages.LoginPage;
import com.learning.java8.Java8NewFeatureDurgaSoft.SecuronixInterview.Utils.Utils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class LoginTest extends BaseTest{

    @Test
    public void testUserlogin(){
        loginPage.login();
        utils.getFluentWait().until(ExpectedConditions.invisibilityOf(driver.findElement(loginPage.getSubmit())));
    }




}
