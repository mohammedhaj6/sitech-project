package com.saucedemo.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.time.Duration;


public class DriverFactory {

    private WebDriver driver;

    public WebDriver initializeDriver() {
        String browser = System.getProperty("browser", "CHROME");

        switch (browser) {
            case "CHROME":

                driver = new ChromeDriver();
                break;

            case "FIREFOX":
                driver = new FirefoxDriver();
                break;

            case "EDGE":
                driver = new EdgeDriver();
                break;

            case "SAFARI":
                driver = new SafariDriver();
                break;
            default:
                throw new RuntimeException("The browser is not supported");


        }

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
        return driver;
    }
}
