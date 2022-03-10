package org.fb;

import org.openqa.selenium.WebElement;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebokmaven {
	public static void main(String[] args) {
		LibGlobal lib=new LibGlobal();
		lib.getdriver();
		
		lib.loadUrl("https://www.facebook.com/");
//		lib.maximize();
//		
//		WebElement elementByID = lib.findElementByID("email");
//		
//		lib.getData(")"
//				lib.type(elementByID, data);
//				
//				WebElement elementByID2 = lib.findElementByID("pass");
//				
//				lib.type(element1, data2);
//				
				WebElement elementByName = lib.findElementByName("login");
				lib.click(elementByName);
				lib.closeAll();
	
	
	}

}
