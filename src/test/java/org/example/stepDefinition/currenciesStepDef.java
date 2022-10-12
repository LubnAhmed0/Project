package org.example.stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P3_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class currenciesStepDef {
    P3_homePage homePage = new P3_homePage();

    @Given("user select customer currency")
    public void select() {
        homePage.list().click();
    }
    @When("user chose Euro")
    public void chose() throws InterruptedException {
       homePage.currency().click();
       homePage.currency().getText();
       Thread.sleep(3000);

       }
    @Then("Euro symbol is shown")
    public void check () {
        for (int x = 0; x < 4; x++) {
            String price = homePage.symbol().get(x).getText();
            System.out.println(price);
            Assert.assertTrue(price.contains("€"),"true");
        }

    }
}
