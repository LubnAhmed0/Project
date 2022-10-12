package org.example.pages;

import org.example.stepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class P2_login {
    WebDriver driver;

    public P2_login(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public WebElement loginLink() {
        return Hooks.driver.findElement(By.className("ico-login"));
    }

    public WebElement email() {
        return Hooks.driver.findElement(By.id("Email"));
    }

    public void enterEmail(String email, WebDriver driver) {
        email();
        email().sendKeys("test@example.com");
    }
    public void wrongEmail (String email , WebDriver driver){
        email();
        email().sendKeys("wrong@example.com");
    }

    public WebElement passWord() {
        return Hooks.driver.findElement(By.id("Password"));
    }

    public void enterPass(String passWord, WebDriver driver) {
        passWord();
        passWord().sendKeys("P@ssword");
    }

    public WebElement loginBtn() {
        return Hooks.driver.findElement(By.cssSelector("button[type=\"submit\"]"));
    }
    public WebElement myacc(){
         return Hooks.driver.findElement(By.cssSelector("a[href=\"/customer/info\"]"));
}
    public WebElement unsuccmsg(){
        return Hooks.driver.findElement(By.cssSelector("div[class=\"message-error validation-summary-errors\"]"));
}
}
