package com.learning.java8.Java8NewFeatureDurgaSoft.SecuronixInterview.Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

    public WebDriver driver = null;

    public LoginPage(WebDriver driver){
        this.driver=driver;
    }

    private By email = By.name(Locators.LoginPage.userName);
    private By password = By.name(Locators.LoginPage.passWord);
    private By submit = By.name(Locators.LoginPage.loginBtn);
    private By homePage = By.id(Locators.HomePage.homePagePresence);

    public By getEmail() {
        return email;
    }

    public By getPassword() {
        return password;
    }

    public By getHomePage() {
        return homePage;
    }

    public By getSubmit() {
        return submit;
    }

    public void login(){
        driver.findElement(email).sendKeys("");
        driver.findElement(password).sendKeys("");
        driver.findElement(submit).click();
    }

}
