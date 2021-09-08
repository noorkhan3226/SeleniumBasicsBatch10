package com.syntax.class01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
git
public class MaximizeWindow {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://google.com");
        driver.manage().window().maximize();
        //driver.manage().window().fullscreen();
    }
}
