package org.example.stepDefinition;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P3_homePage;
import org.testng.asserts.SoftAssert;

import java.util.concurrent.TimeUnit;

public class homeSlideStepDef {
    P3_homePage homePage = new P3_homePage();
    SoftAssert softAssert = new SoftAssert();
    @When("user click on the first slider")
    public void click(){
        homePage.slider().click();
        Hooks.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Then("the product page opens")
    public void theProductPageOpens() {
        String Url = Hooks.driver.getCurrentUrl();
        softAssert.assertEquals(Url,"https://demo.nopcommerce.com/nokia-lumia-1020");
        softAssert.assertAll();
    }

    @When("user click on the second slider")
    public void userClickOnTheSecondSlider() {
        homePage.slider().click();
        Hooks.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Then("the product page open")
    public void theProductPageOpen() {
        String Url = Hooks.driver.getCurrentUrl();
        softAssert.assertEquals(Url,"https://demo.nopcommerce.com/iphone-6");
        softAssert.assertAll();
    }
}
