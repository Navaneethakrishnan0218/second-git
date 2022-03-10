package org.fb;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class javauni {
	static WebDriver driver;
	
	@BeforeClass
	public static void BeforeClass() throws IOException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("http://greenscart.in/#/login?returnUrl=%2F");
		driver.manage().window().maximize();
		System.out.println("beforeclass");
	


		}
	@Test
	public void test() {
		WebElement findElement = driver.findElement(By.xpath("//input[@id='loginEmailId']"));
		findElement.sendKeys("Navan");
		
		WebElement txtPassWord = driver.findElement(By.xpath("//*[@id=\"loginPassword\"]"));
		txtPassWord.sendKeys("0987654321");
		
		WebElement element = driver.findElement(By.xpath("(//input[@type='submit'])[2]"));
        element.click();
        System.out.println("test");
    }
	@Before
	public void before() throws InterruptedException {
		long millis = System.currentTimeMillis();
		System.out.println(millis);
		System.out.println("before");
		Thread.sleep(1000);
    } 
	
	@AfterClass
	public static  void Afterclass() throws IOException {
		System.out.println("Afterclass");
		 
		
       	              }
	@After
	public void after() {
		long millis = System.currentTimeMillis();
		System.out.println(millis);
		System.out.println("after");

	}
	
	
	
	
	

}
