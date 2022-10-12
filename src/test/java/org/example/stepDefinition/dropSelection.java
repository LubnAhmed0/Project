package org.example.stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;



public class dropSelection {
    public WebElement Day() {

        WebElement Day = Hooks.driver.findElement(By.name("DateOfBirthDay"));
        Select dayDate = new Select(Day);
        dayDate.selectByValue("1");

        return Day;
    }
    public WebElement Month () {
        WebElement Month = Hooks.driver.findElement(By.name("DateOfBirthMonth"));
        Select monthDate = new Select(Month);
        monthDate.selectByValue("4");
        return Month;
    }
    public WebElement Year() {
        WebElement Year = Hooks.driver.findElement(By.name("DateOfBirthYear"));
        Select yearDate = new Select(Year);
        yearDate.selectByValue("1913");
        return Year;
    }
}

