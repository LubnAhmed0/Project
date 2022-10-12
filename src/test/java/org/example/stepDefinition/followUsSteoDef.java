package org.example.stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.pages.P3_homePage;
import org.testng.asserts.SoftAssert;

import java.util.ArrayList;

public class followUsSteoDef {
    SoftAssert softAssert= new SoftAssert();
    P3_homePage  home = new P3_homePage();
    @When("user click on facebook button")
    public void click() throws InterruptedException {
        home.facebook().click();
        Thread.sleep(2000);
    }

    @Then("facebook window is opened")
    public void facebookTapIsOpened() throws InterruptedException {
        ArrayList<String> windows = new ArrayList<String>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(windows.get(1));
        Thread.sleep(2000);
        String faceTab =Hooks.driver.getCurrentUrl();
        softAssert.assertEquals(faceTab,"https://www.facebook.com/nopCommerce");
    }

    @When("user click on twitter button")
    public void userClickOnTwitterButton() throws InterruptedException {
        home.twitter().click();
        Thread.sleep(2000);
    }

    @Then("twitter window is opened")
    public void twitterWindowIsOpened() throws InterruptedException {
        ArrayList<String> tabs = new ArrayList<String>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tabs.get(1));
        Thread.sleep(2000);
        String twitTab =Hooks.driver.getCurrentUrl();
        softAssert.assertEquals(twitTab,"https://www.twitter.com/nopCommerce");
    }

    @When("user click on rss button")
    public void userClickOnRssButton() throws InterruptedException {

            home.rss().click();
            Thread.sleep(2000);
    }


    @Then("rss window is opened")
    public void rssWindowIsOpened() throws InterruptedException {
        ArrayList<String> tab = new ArrayList<String>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(tab.get(1));
        Thread.sleep(2000);
        String rssTab =Hooks.driver.getCurrentUrl();
        softAssert.assertEquals(rssTab,"https://demo.nopcommerce.com/new-online-store-is-open");
    }

    @When("user click on youtube button")
    public void userClickOnYoutubeButton() throws InterruptedException {
        home.youtube().click();
        Thread.sleep(2000);
    }

    @Then("youtube window is opened")
    public void youtubeWindowIsOpened() throws InterruptedException {
        ArrayList<String> youtab = new ArrayList<String>(Hooks.driver.getWindowHandles());
        Hooks.driver.switchTo().window(youtab.get(1));
        Thread.sleep(2000);
        String youtubeTab =Hooks.driver.getCurrentUrl();
        softAssert.assertEquals(youtubeTab,"http://www.youtube.com/user/nopCommerce");
    }
}
