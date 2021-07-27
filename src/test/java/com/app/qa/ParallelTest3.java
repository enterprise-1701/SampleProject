package com.app.qa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTest3 {

	public class ChromeTest {
		public WebDriver driver;

		@BeforeTest
		public void beforeTest() {
			System.out.println("Initilizing the Google Chrome Driver");
			driver = new ChromeDriver();
		}

		@Test(threadPoolSize = 4, invocationCount = 4, timeOut = 1000)
		public void ChromeTestMethod() throws InterruptedException {

			// Initialize the chrome driver
			System.out.println("Thread ID Is : " + Thread.currentThread().getId());
			driver.get("https://www.demoqa.com");
			

		}

		@AfterTest
		public void afterTest() {
			System.out.println("Closing the browser ");
			driver.close();
		}
	}
}