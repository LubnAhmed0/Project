package org.example.pages;

import org.example.stepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class P1_register {
    WebDriver driver;
    public P1_register(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
    public WebElement registerLink (){
        return Hooks.driver.findElement(By.className("ico-register"));
    }
   public WebElement Male(){
       return Hooks.driver.findElement(By.className("male"));
}
public WebElement Female(){
        return Hooks.driver.findElement(By.className("female"));
}
public WebElement firstName(){
        return Hooks.driver.findElement(By.id("FirstName"));
}
public void enterSteps(String firstName,WebDriver driver){
        firstName();
        firstName().sendKeys("automation");
}
public WebElement lastName(){
        return Hooks.driver.findElement(By.id("LastName"));
}
public void completeSteps(String lastName, WebDriver driver){
        lastName();
        lastName().sendKeys("tester");
}
public WebElement mail (){
        return Hooks.driver.findElement(By.name("Email"));
}
public void enterMail(String mail, WebDriver driver){
        mail();
        mail().sendKeys("test@example.com");
}
public WebElement pass(){
        return Hooks.driver.findElement(By.id("Password"));
}
public void enterPass(String pass , WebDriver driver){
        pass();
        pass().sendKeys("P@ssword");
}

    public WebElement pass2(){
        return Hooks.driver.findElement(By.id("ConfirmPassword"));
    }
    public void confirmPass(String pass2 , WebDriver driver){
        pass2();
        pass2().sendKeys("P@ssword");
    }
    public WebElement registerBtn(){
        return Hooks.driver.findElement(By.id("register-button"));
    }
    public By regMsg (){
        return By.className("result");
    }

}

