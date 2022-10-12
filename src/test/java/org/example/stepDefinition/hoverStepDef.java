package org.example.stepDefinition;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P3_homePage;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import java.util.List;
import java.util.Random;

public class hoverStepDef {
    P3_homePage homePage = new P3_homePage();
    String subcategory ;
    @When("user select sub category")
    public void hovering(){
        int random = new Random().nextInt(3);
        Actions hover = new Actions(Hooks.driver);
        hover.moveToElement(homePage.main().get(random)).perform();
        String category = homePage.main().get(random).getText();
        System.out.println(category);
        random =random + 1;
        List<WebElement> subcate = Hooks.driver.findElements(By.xpath("//ul[@class=\"top-menu notmobile\"]/li["+random+"]/ul[@class=\"sublist first-level\"]/li"));
        int ranSub = new Random().nextInt(3);
        subcategory = subcate.get(ranSub).getText();
        System.out.println(subcategory);
        subcate.get(ranSub).click();

    }
    @Then("sub category page open")
    public void subCategoryPageOpen() {
       String title = homePage.sub().getText();
        Assert.assertTrue(title.contains(subcategory));
    }
}
