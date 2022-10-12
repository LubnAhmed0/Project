package org.example.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P2_login;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.Color;
import org.testng.asserts.SoftAssert;

public class InvalidLoginStepDefinition {
    WebDriver driver = null;
    P2_login login = new P2_login(driver) ;
    @Given("user go to the login page")
   public void get (){

    login.loginLink().click();
}
    @When("user login with invalid \"(.*)\"$")
    public void invalidEmail(String email){
        Hooks.driver.navigate().to("https://demo.nopcommerce.com/login?returnUrl=%2F");
        login.wrongEmail("wrong@example.com",driver);
    }
    @And("the validpass \"(.*)\"$")
    public void valid(String passWord){
        login.enterPass("P@ssword",driver);
        login.passWord().sendKeys(Keys.ENTER);
    }

    @Then("user could not login successfully")
    public void unsuccess(){
        SoftAssert softAssert = new SoftAssert();
        String expresult = "Login was unsuccessful. Please correct the errors and try again.";
        String actResult = login.unsuccmsg().getText();
        softAssert.assertTrue(actResult.contains(expresult),"doesnot");
        String colour = login.unsuccmsg().getCssValue("color");
        Color.fromString(colour).asHex();
        System.out.println("the color "+colour);
        softAssert.assertAll();
    }
}
