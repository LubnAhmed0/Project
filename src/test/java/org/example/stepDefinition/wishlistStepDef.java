package org.example.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P3_homePage;
import org.testng.asserts.SoftAssert;

import java.awt.*;
import java.util.concurrent.TimeUnit;

public class wishlistStepDef {
    SoftAssert softAssert = new SoftAssert();
    P3_homePage page = new P3_homePage();
    @When("user clicks on add button")
    public void click (){
        page.wishlistBtm().click();

    }

    @Then("Success message is displayed")
    public void successMessageIsDisplayed() {
        String  actualMsg = page.message().getText();
        System.out.println(actualMsg);
        String expectedMsg ="The product has been added to your wishlist";
        softAssert.assertTrue(actualMsg.contains(expectedMsg));

        String actualcolor = page.color().getCssValue("background-color");
        System.out.println("actual"+actualcolor);
        String expectedcolor = "75, 176, 122, 1";
        System.out.println("expected"+expectedcolor);
        softAssert.assertEquals(actualcolor,expectedcolor);

    }

    @And("user clicks on wishlist")
    public void userClicksOnWishlist() throws InterruptedException {
        Hooks.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        page.wishlistLbl().click();
        Thread.sleep(2000);
    }

    @Then("the quantity number is more than one")
    public void theQuantityNumberIsMoreThanOne() {
        int qty = Integer.parseInt(page.quantity().getAttribute("value"));
        System.out.println(qty);
        softAssert.assertTrue(qty != 0);
    }
}
