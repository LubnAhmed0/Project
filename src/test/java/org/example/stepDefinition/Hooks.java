package org.example.stepDefinition;

import io.cucumber.java.Before;
import io.cucumber.java.After;

import org.example.pages.P1_register;
import org.example.pages.P2_login;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

public class Hooks {
    public static WebDriver driver ;
    P1_register register = new P1_register(driver) ;
    P2_login login = new P2_login(driver);
    dropSelection selection = new dropSelection();
    @Before
    public static void OpenBrowser() {
        //1-Bridge
        String chromePath = System.getProperty("user.dir") + "\\src\\main\\resources\\chromedriver.exe";
        System.out.println(chromePath);
        System.setProperty("webdriver.chrome.driver"
                , chromePath);
        //2- create obj from chrome browser
       Hooks.driver= new ChromeDriver();
        // 3- Configuration
        Hooks.driver.manage().window().maximize();
        Hooks.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        // 4- navigate to url
       Hooks.driver.get("https://demo.nopcommerce.com/");
    }
  @After
  public void quit() throws InterruptedException {
   Thread.sleep(3000);
       driver.quit();
    }
}
