package org.fb;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Broken {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		List<WebElement> elements = driver.findElements(By.tagName("a"));
		 System.out.println(elements.size());
		
		List<WebElement> elements1 = driver.findElements(By.tagName("img"));
		System.out.println(elements1.size());
		
		for (WebElement we : elements) {
			String string = we.getAttribute("href");
			System.out.println(string);
			System.out.println();
			}System.out.println("============");
			
		for (WebElement web : elements1) {
			String string1 = web.getAttribute("SRC");
			System.out.println(string1);
			
		}

	}

}
