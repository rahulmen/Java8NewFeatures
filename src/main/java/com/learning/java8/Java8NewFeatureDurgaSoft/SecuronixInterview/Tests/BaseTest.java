package com.learning.java8.Java8NewFeatureDurgaSoft.SecuronixInterview.Tests;

import com.learning.java8.Java8NewFeatureDurgaSoft.SecuronixInterview.Pages.LoginPage;
import com.learning.java8.Java8NewFeatureDurgaSoft.SecuronixInterview.Utils.Utils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class BaseTest {

    public WebDriver driver = null;
    Utils utils = null;
    LoginPage loginPage = null;

    @BeforeSuite
    public void setup(){
        WebDriverManager.chromedriver().version("85.0.4183.87").setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("start-maximized");
        options.addArguments("enable-automation");
        options.addArguments("--no-sandbox");
        options.addArguments("--disable-infobars");
        options.addArguments("--disable-dev-shm-usage");
        options.addArguments("--disable-browser-side-navigation");
        options.addArguments("--disable-gpu");
        driver = new ChromeDriver(options);
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
    }

    @BeforeTest
    public void initialise(){
        loginPage = new LoginPage(driver);
        utils = new Utils(driver);
    }

    @AfterSuite
    public void tearDown(){
        driver.close();
    }

}
