package org.fb;

import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Broken2 {

	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		
		List<WebElement> elements = d.findElements(By.tagName("a"));
		System.out.println(elements.size());
		for (WebElement webE : elements) {
			String st = webE.getAttribute("href");
			if (st!=null) {
				URL u=new URL(st);
				URLConnection connection = u.openConnection();
				HttpsURLConnection hp=(HttpsURLConnection)connection;
				int code = hp.getResponseCode();
				if (code>=44-00) {
					System.out.println(st);
					
				}
				
			}
			
			
			
		}

	}

}
