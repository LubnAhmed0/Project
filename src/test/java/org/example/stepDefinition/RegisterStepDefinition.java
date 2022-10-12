package org.example.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P1_register;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.asserts.SoftAssert;

public class RegisterStepDefinition {
    WebDriver driver = null;
    P1_register register = new P1_register(driver) ;
    dropSelection selection = new dropSelection();

    @Given("user go to register page")
    public void go() {

        register.registerLink().click();
    }
    @When("user select gender type")
    public void select () {
        register.Male().click();
        register.Female().click();
    }
    @When("^user enter first name \"(.*)\"$")
    public void enterFirst(String firstName)
    {
        register.enterSteps("automation",driver);

    }
    @And ("^user enter last name \"(.*)\"$")
    public void enterLast(String lastName)
    {
        register.completeSteps("tester",driver); }


    @And ("user enter date of birth")
    public void date (){
        selection.Day().getText();
        selection.Month().getText();
        selection.Year().getText();
    }
    @And("user enter email \"(.*)\"$")
    public void Email(String mail){
        register.enterMail("lamba@test.com",driver);
    }
    @And("user fills Password field \"(.*)\"$")
    public void Password1(String pass){
        register.enterPass("P@ssword",driver);
    }
    @And("user fills password field \"(.*)\"$")
    public void Password2(String pass2){
        register.confirmPass("P@ssword",driver);
    }
    @And("user clicks on register button")
    public void click() throws InterruptedException {
        register.registerBtn().click();
        Thread.sleep(3000);
    }
    @Then("success message is displayed")
    public void display(){
        SoftAssert soft = new SoftAssert();
        String expected ="Your registration completed";
        String actual = Hooks.driver.findElement(register.regMsg()).getText();
        soft.assertTrue(actual.contains(expected),"error");
        soft.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/registerresult/1?returnUrl=/","error url");
        String Color = Hooks.driver.findElement(By.className("result")).getCssValue("color");
        System.out.println(Color);
        soft.assertAll();
    }
}
