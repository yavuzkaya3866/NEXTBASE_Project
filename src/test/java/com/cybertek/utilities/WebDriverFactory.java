package com.cybertek.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebDriverFactory {

    // task:
    // Write a static method that takes a string method parameter name: browser Type
    // based on the value of parameter
    // it will setup the browser and
    // the method will return chromedriver or firefoxdriver object.
    //name of gonna be getDriver

    public static WebDriver getDriver(String browserType){

        WebDriver driver = null;

        //Chrome,CHROME,ChrOme
        switch (browserType.toLowerCase()){
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver= new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver=new FirefoxDriver();
                break;
        }
        return driver;
    }


}