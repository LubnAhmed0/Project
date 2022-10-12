package org.example.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P3_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

public class searchStepDef {
    P3_homePage homePage = new P3_homePage();
    SoftAssert softAssert = new SoftAssert();
    @Given("user navigate to search field")
    public void navigate(){
        homePage.field().click();
       // softAssert.assertEquals(Hooks.driver.getCurrentUrl(),);
    }
    @When("user enter {string}")
    public void userEnter(String arg0) {
        homePage.field().sendKeys(arg0);
        homePage.field().sendKeys(Keys.ENTER);
        softAssert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/search?q=","true");

    }
    @Then("search shows relevant {string}")
    public void result(String arg2 ){
       int num = homePage.elements().size();
       System.out.println("number=" + num);
        for (int i = 0; i < num; i++) {
            String Name = homePage.elements().get(i).getText();
            System.out.println(Name);
            Assert.assertTrue(Name.toLowerCase().contains(arg2),"true");

        }
    }


    @When("user search by {string}")
    public void userSearchBy(String arg0) {
        homePage.field().sendKeys(arg0);
        homePage.field().sendKeys(Keys.ENTER);
        softAssert.assertEquals(Hooks.driver.getCurrentUrl(),"https://demo.nopcommerce.com/search?q=","true");
    }

    @And("opens the product")
    public void opensTheProduct() {
     homePage.pic().click();
    }

    @Then("{string} appears")
    public void appears(String arg1) {
    String sku = homePage.value().getText();
    System.out.println(sku);
    softAssert.assertEquals(sku,arg1);
    }
}
