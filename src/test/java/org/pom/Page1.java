package org.pom;

import java.io.IOException;

import org.fb.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page1 extends LibGlobal {
	public Page1() {
		PageFactory.initElements(driver, this);

}
	
	
    @FindBy(id="username")
	private WebElement txtUserName;
	
	
	@FindBy(id="password")
	private WebElement txtpassword;
	
	
	@FindBy(id="login")
	private WebElement btnlogin;


	public WebElement getTxtUserName() {
		return txtUserName;
	}


	public WebElement getTxtpassword() {
		return txtpassword;
	}


	public WebElement getbtnlogin() {
		return btnlogin;
	}
	
	public void login() throws IOException {
		sendkeys(getTxtUserName(), getData("sheet1", 1, 0));
		sendkeys(getTxtpassword(), getData("sheet1", 1, 1));
		click(getbtnlogin());
	}
	

}
