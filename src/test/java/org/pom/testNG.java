package org.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class testNG {
	 static WebDriver driver;
	 @Parameters({"browser"})
	 @Test
	 
	 private void test(String name) {
		 if (name.equals("chrome")) {
			 WebDriverManager.chromedriver().setup();
			 driver=new ChromeDriver();
		 }
		 else if (name.equals("gekco")) {
			 WebDriverManager.firefoxdriver().setup();
			 driver=new FirefoxDriver();		
		}
		 else {
			 WebDriverManager.iedriver().setup();
			 driver=new InternetExplorerDriver();
			 }
		 driver.get(");
	}
	}
