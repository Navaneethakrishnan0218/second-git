package org.pom;

import org.fb.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page4  extends LibGlobal {
	public Page4() {
		PageFactory.initElements(driver, this);

}
	
	@FindBy(id="first_name")
	private WebElement first;
	
	@FindBy(id="last_name")
	private WebElement last;
	
	@FindBy(id="address")
	private WebElement add;
	
	@FindBy(id="cc_num")
	private WebElement cc;
	
	@FindBy(id="cc_type")
	private WebElement cctype;
	
	@FindBy(id="cc_exp_month")
	private WebElement mon;
	
	@FindBy(id="cc_exp_year")
	private WebElement year;
	
	@FindBy(id="cc_cvv")
	private WebElement cvv;
	
	@FindBy(id="book_now")
	private WebElement book;
	
	
	public WebElement getFirst() {
		return first;
	}

	public void setFirst(WebElement first) {
		this.first = first;
	}

	public WebElement getLast() {
		return last;
	}

	public void setLast(WebElement last) {
		this.last = last;
	}

	public WebElement getAdd() {
		return add;
	}

	public void setAdd(WebElement add) {
		this.add = add;
	}

	public WebElement getCc() {
		return cc;
	}

	public void setCc(WebElement cc) {
		this.cc = cc;
	}

	public WebElement getCctype() {
		return cctype;
	}

	public void setCctype(WebElement cctype) {
		this.cctype = cctype;
	}

	public WebElement getMon() {
		return mon;
	}

	public void setMon(WebElement mon) {
		this.mon = mon;
	}

	public WebElement getYear() {
		return year;
	}

	public void setYear(WebElement year) {
		this.year = year;
	}

	public WebElement getCvv() {
		return cvv;
	}

	public void setCvv(WebElement cvv) {
		this.cvv = cvv;
	}

	public WebElement getBook() {
		return book;
	}

	public void setBook(WebElement book) {
		this.book = book;
	}

	private void search(String first, String last,String add, String cc,String cctype,
			String mon,String year, String cvv, String book) {
		
		sendkeys(getAdd(), add);
		sendkeys(getCc(), cc);
		sendkeys(getCctype(), cctype);
		sendkeys(getCvv(), cvv);
		sendkeys(getFirst(), first);
		sendkeys(getLast(), last);
		sendkeys(getMon(), mon);
		sendkeys(getYear(), year);
		click(getBook());


		
		


	}
	
	
	
	




}
