package com.optimus.pageObjectLibraries;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;

/**
 * Created by elakskg on 3/20/2017.
 */
public class basePage {

    private WebDriver driver;

    public void test() {
        System.out.println("Test");
    }

    public WebDriver initDriver() {
        String driverFolder = System.getProperty("user.dir")+ File.separator + "src" + File.separator + "main" + File.separator + "resources" + File.separator + "drivers";
        System.setProperty("webdriver.gecko.driver",driverFolder + File.separator + "geckodriver.exe");
        DesiredCapabilities capabilities = DesiredCapabilities.firefox();
        capabilities.setCapability("marionette", true);
        driver = new FirefoxDriver(capabilities);
        return driver;
    }

    public void enterText(String locator) {
        driver.findElement(By.id(locator)).sendKeys("Selenium");
    }
}
