package com.app.qa;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Locale;

public class ThirdTest {

    private static final String email_field  = "//*[@id=\'login-username\']";
    private static final String next = "signin";
    private static final String password_field = "//*[@id='login-passwd']";
    private static final String login = "verifyPassword";
    private static final String Error = "//*[@id=\'password-challenge\']/form/p[1]";
    private static String baseUrl = "https://login.yahoo.com/";
    private static String email = "reza281@yahoo.com";
    private static String password = "lajolla101";
    private static WebDriver driver = new ChromeDriver();

    @BeforeMethod
    public void setUp(){

        System.setProperty("webdriver.chrome.driver", "C:\\Users\\reza2\\Downloads\\chromedriver_win32\\chromedriver.exe");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
    }

    @Test(description = "ThirdTest")
    public static void thirdTest() throws Exception {

        driver.get(baseUrl);
        Thread.sleep(2000);
        driver.findElement(By.xpath(email_field)).sendKeys(email);
        Thread.sleep(2000);
        driver.findElement(By.name(next)).submit();
        Thread.sleep(2000);
        driver.findElement(By.xpath(password_field)).sendKeys(password);
        driver.findElement(By.name(login)).sendKeys(Keys.ENTER);
        Thread.sleep(2000);

    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }
}
