package org.pom;

import org.fb.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page3 extends LibGlobal  {
	public Page3() {
		PageFactory.initElements(driver, this);

}

	@FindBy(id="radiobutton_0")
	private WebElement radio;
	

	@FindBy(id="continue")
	private WebElement button;


	public WebElement getRadio() {
		return radio;
	}


	public void setRadio(WebElement radio) {
		this.radio = radio;
	}


	public WebElement getButton() {
		return button;
	}


	public void setButton(WebElement button) {
		this.button = button;
	}
	
	private void radiobuton() {
		click(getRadio());
		click(getButton());
		

	}
	
	












}
