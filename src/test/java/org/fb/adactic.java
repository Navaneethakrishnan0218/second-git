package org.fb;

import java.io.IOException;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class adactic {
	@BeforeClass
	public static void main(String[] args) throws IOException, InterruptedException {
		LibGlobal libG=new LibGlobal();
		libG.getdriver();
		libG.loadUrl("https://adactinhotelapp.com/");
		
		
		  		
		WebElement id = libG.findbyId("username");
		String data = libG.getData("data", 1, 0);
		libG.sendkeys(id, data);
		
		WebElement xpath = libG.xpath("//*[@id=\"password\"]");
		String data1 = libG.getData("data", 1, 1);
		libG.sendkeys(xpath, data1);
		
		WebElement xpath1 = libG.xpath("//*[@id=\"login\"]");	
        xpath1.click();
        
     WebElement xpath2 = libG.xpath("//*[@id=\"location\"]");
     String data2 = libG.getData("data", 1, 2);
     libG.sendkeys(xpath2, data2);
       
      WebElement hotel = libG.xpath("//*[@id='hotels']");
		String hoe = libG.getData("data", 1, 3);
		libG.sendkeys(hotel, hoe);
		
		WebElement roomtype = libG.xpath("//*[@id='room_type']");
	   String data3 = libG.getData("data", 1,4);
		libG.sendkeys(roomtype, data3);
		
		WebElement noRooms = libG.xpath("//*[@id='room_nos']");
		String nroom = libG.getData("data", 1,5);
		libG.sendkeys(noRooms, nroom);
		
		WebElement checkin = libG.xpath("//input[@id='datepick_in']");
		String cin = libG.getData("data", 1, 6);
		libG.sendkeys(checkin, cin);
		
		WebElement checkout = libG.xpath("//input[@id='datepick_out']");
		String cout = libG.getData("data", 1, 7);
		libG.sendkeys(checkout, cout);
	
		WebElement Adultroom = libG.xpath("//*[@id='adult_room']");
		String aroom = libG.getData("data", 1, 8);
		libG.sendkeys(Adultroom, aroom);
		
		WebElement Childroom = libG.xpath("//*[@id='child_room']");
		String Croom = libG.getData("data", 1, 9);
		libG.sendkeys(Childroom, Croom);
		
		WebElement search = libG.xpath("//input[@id='Submit']");
		libG.click(search);
		
		WebElement radioclick = libG.xpath("//input[@id='radiobutton_0']");
		libG.click(radioclick);
		
		WebElement continues = libG.xpath("//input[@id='continue']");
		libG.click(continues);
		
		WebElement firstname = libG.xpath("//input[@id='first_name']");
		String fname = libG.getData("data", 1, 10);
		libG.sendkeys(firstname, fname);
		
		WebElement lastname = libG.xpath("//input[@id='last_name']");
		String lname = libG.getData("data", 1, 11);
		libG.sendkeys(lastname, lname);
		
		WebElement address = libG.xpath("//*[@id=\"address\"]");
		String add = libG.getData("data", 1, 12);
		libG.sendkeys(address, add);
		
		WebElement creditno = libG.xpath("//input[@id='cc_num']");
		String crno = libG.getData("data", 1, 13);
		libG.sendkeys(creditno, crno);
		
		WebElement cardtype = libG.xpath("//*[@id='cc_type']");
		String type = libG.getData("data", 1, 14);
		libG.sendkeys(cardtype, type);
		
		WebElement expiremonth = libG.xpath("//*[@id='cc_exp_month']");
		String month = libG.getData("data", 1, 15);
		libG.sendkeys(expiremonth, month);
		
		WebElement expireyear = libG.xpath("//*[@id='cc_exp_year']");
		String year = libG.getData("data", 1, 16);
		libG.sendkeys(expireyear, year);
		
		WebElement cvv = libG.xpath("//input[@id='cc_cvv']");
		String cvv1 = libG.getData("data", 1, 17);
		libG.sendkeys(cvv, cvv1);
		
		WebElement book = libG.xpath("//*[@id=\"book_now\"]");
		libG.click(book);
		
		Thread.sleep(6000);
		
		WebElement xpath3 = libG.xpath("//*[@id=\"order_no\"]");
		String attr = libG.getAttribute(xpath3);
		System.out.println(attr);
	
		
		
		
	
	}
}
