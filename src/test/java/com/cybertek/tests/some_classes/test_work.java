package com.cybertek.tests.some_classes;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class test_work {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/sign_up");
        driver.manage().window().maximize();

        WebElement HomeLink= driver.findElement(By.className("nav-link"));
        HomeLink.click();

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        // print multiple buttons header
        System.out.println(driver.findElement(By.className("h3")).getText());


        //hello for github



    }
}
