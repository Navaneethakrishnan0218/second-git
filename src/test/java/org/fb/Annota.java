package org.fb;

import static org.junit.Assert.assertEquals;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebElement;

public class Annota extends LibGlobal{
	
	@BeforeClass
	public static void base() {
		getdriver();
		String url="https://adactinhotelapp.com/";
		loadUrl(url);
		
	}
	@Test
	public void test() throws IOException, InterruptedException {

		WebElement elem = xpath("//*[@id=\"login_form\"]/table/tbody/tr[1]/td");
		String actuals = elem.getText();
		assertEquals("Existing User Login - Build 1", actuals);
		
		WebElement xpath = xpath("//input[@id='username']");
		sendkeys(xpath, getData("data",1, 0));
		
		WebElement xpath1 = xpath("//input[@id='password']");
		sendkeys(xpath1, getData("data",1, 1));
		
		WebElement xpath2 = xpath("//*[@id=\"login\"]");
		xpath2.click();
		
		 WebElement xpath3 = xpath("//*[@id=\"location\"]");
	     String data2 =getData("data", 1, 2);
	     sendkeys(xpath3, data2);
	   
	     WebElement hotel = xpath("//*[@id='hotels']");
			String hoe = getData("data", 1, 3);
			sendkeys(hotel, hoe);
			
			WebElement roomtype = xpath("//*[@id='room_type']");
		   String data3 = getData("data", 1,4);
			sendkeys(roomtype, data3);
			
			WebElement noRooms = xpath("//*[@id='room_nos']");
			String nroom = getData("data", 1,5);
			sendkeys(noRooms, nroom);
			
			WebElement checkin = xpath("//input[@id='datepick_in']");
			String cin = getData("data", 1, 6);
			sendkeys(checkin, cin);
			
			WebElement checkout = xpath("//input[@id='datepick_out']");
			String cout = getData("data", 1, 7);
			sendkeys(checkout, cout);
		
			WebElement Adultroom = xpath("//*[@id='adult_room']");
			String aroom = getData("data", 1, 8);
			sendkeys(Adultroom, aroom);
		   
			WebElement search = xpath("//input[@id='Submit']");
			click(search);
			
			WebElement radioclick = xpath("//input[@id='radiobutton_0']");
			click(radioclick);
			
			WebElement continues = xpath("//input[@id='continue']");
			click(continues);
			
			WebElement firstname = xpath("//input[@id='first_name']");
			String fname = getData("data", 1, 10);
			sendkeys(firstname, fname);
			
			WebElement lastname = xpath("//input[@id='last_name']");
			String lname = getData("data", 1, 11);
			sendkeys(lastname, lname);
			
			WebElement address = xpath("//*[@id=\"address\"]");
			String add = getData("data", 1, 12);
			sendkeys(address, add);
			
			WebElement creditno = xpath("//input[@id='cc_num']");
			String crno = getData("data", 1, 13);
			sendkeys(creditno, crno);
			
			WebElement cardtype = xpath("//*[@id='cc_type']");
			String type = getData("data", 1, 14);
			sendkeys(cardtype, type);
			
			WebElement expiremonth = xpath("//*[@id='cc_exp_month']");
			String month = getData("data", 1, 15);
			sendkeys(expiremonth, month);
			
			WebElement expireyear = xpath("//*[@id='cc_exp_year']");
			String year = getData("data", 1, 16);
			sendkeys(expireyear, year);
			
			WebElement cvv = xpath("//input[@id='cc_cvv']");
			String cvv1 = getData("data", 1, 17);
			sendkeys(cvv, cvv1);
			
			WebElement book = xpath("//*[@id=\"book_now\"]");
			click(book);
			
			Thread.sleep(6000);
			
			WebElement xpath4 = xpath("//*[@id=\"order_no\"]");
			String attr = getAttribute(xpath4);
			System.out.println(attr);
			
			
				}
	@AfterClass
	
	public static void afterclass() {
		closeAll();



	}
		
		}
	
	


