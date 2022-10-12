package org.example.pages;

import jdk.internal.org.objectweb.asm.Handle;
import org.example.stepDefinition.Hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class P3_homePage {

    public WebElement list() {
        return Hooks.driver.findElement(By.id("customerCurrency"));
    }

    public WebElement currency() {
        //return Hooks.driver.findElement(By.linkText("Euro"));
        return Hooks.driver.findElement(By.cssSelector("option[value=\"https://demo.nopcommerce.com/changecurrency/6?returnUrl=%2F\"]"));
    }

    public List<WebElement> symbol() {
        return Hooks.driver.findElements(By.cssSelector("span[class=\"price actual-price\"]"));

    }

    public WebElement field() {
        return Hooks.driver.findElement(By.id("small-searchterms"));
    }

    public List<WebElement> elements() {
        return Hooks.driver.findElements(By.cssSelector("h2[class=\"product-title\"]"));
    }

    public WebElement pic() {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"picture\"]"));
    }

    public WebElement value() {
        return Hooks.driver.findElement(By.cssSelector("span[class=\"value\"]"));
    }

    public List<WebElement> main() {
        return Hooks.driver.findElements(By.cssSelector(" ul[class=\"top-menu notmobile\"]>li>a[href]"));
    }

    public WebElement sub() {
        return Hooks.driver.findElement(By.cssSelector("div[class=\"page-title\"]"));
    }

    public WebElement slider() {
        return Hooks.driver.findElement(By.className("nivo-imageLink"));
    }

    public WebElement facebook() {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"http://www.facebook.com/nopCommerce\"]"));
    }

    public WebElement twitter() {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"https://twitter.com/nopCommerce\"]"));
    }

    public WebElement rss() {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"/news/rss/1\"]"));
    }
    public WebElement youtube() {
        return Hooks.driver.findElement(By.cssSelector("a[href=\"http://www.youtube.com/user/nopCommerce\"]"));
    }

    public WebElement wishlistBtm (){
        return Hooks.driver.findElement(By.xpath("(//button[@class=\"button-2 add-to-wishlist-button\"])[3]"));
}
public WebElement message (){
        return Hooks.driver.findElement(By.cssSelector("p[class=\"content\"]"));
}
public WebElement color (){
        return Hooks.driver.findElement(By.cssSelector("div[class=\"bar-notification success\"]"));
}
public WebElement wishlistLbl(){
        return Hooks.driver.findElement(By.cssSelector("span[class=\"wishlist-label\"]"));
}
public WebElement quantity (){
        return  Hooks.driver.findElement(By.cssSelector("input[value=\"1\"]"));
}
}