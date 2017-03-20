package com.optimus.pageObjectLibraries;

import org.openqa.selenium.WebDriver;


/**
 * Created by elakskg on 3/20/2017.
 */
public class homePage extends basePage {
    public static void main(String[] args) throws Exception {
        homePage hp = new homePage();
        hp.test();
        WebDriver driver = hp.initDriver();
        driver.get("http://www.google.com");
        Thread.sleep(5000);
        driver.quit();
    }
}
