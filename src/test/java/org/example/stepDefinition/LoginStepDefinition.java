package org.example.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P2_login;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class LoginStepDefinition {
    WebDriver driver = null;
    P2_login login = new P2_login(driver) ;
    @Given("user go to login page")
    public void go (){
        login.loginLink().click();
    }
    @When("user login with valid \"(.*)\"$")
    public void validEmail(String email){
       Hooks.driver.navigate().to("https://demo.nopcommerce.com/login?returnUrl=%2F");
        login.enterEmail("test@example.com",driver);
    }
    @And("valid \"(.*)\"$")
    public void validPass(String passWord){
        login.enterPass("P@ssword",driver);
        login.passWord().sendKeys(Keys.ENTER);
    }

    @Then("user login successfully")
    public void success (){
        System.out.println(login.myacc());
        login.myacc().isDisplayed();

    }

}
