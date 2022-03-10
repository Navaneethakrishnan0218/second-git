package org.pom;

import java.io.IOException;

import org.fb.LibGlobal;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Page2  extends LibGlobal  {
	public Page2() {
		PageFactory.initElements(driver, this);

}
	 @FindBy(id="location")
	private WebElement dDnLocation;
	
	@FindBy(id="hotels")
	private WebElement dDnhotels;
	
	@FindBy(id="room_sendkeys")
	private WebElement dDnRoomsendkeys1;
	
	@FindBy(id="room_nos")
	private WebElement dDnRoomNos;
	
	@FindBy(id="datepick_in")
	private WebElement dDnDatepickin;
	
	@FindBy(id="datepick_out")
	private WebElement dDnDatepickout;

	@FindBy(id="adult_room")
	private WebElement dDnAdultRoom;
	
	@FindBy(id="child_room")
	private WebElement dDnChildRoom;
	
	@FindBy(id="Submit")
	private WebElement dDnSubmit;

	public WebElement getdDnLocation() {
		return dDnLocation;
	}

	public WebElement getdDnhotels() {
		return dDnhotels;
	}

	public WebElement getdDnRoomsendkeys1() {
		return dDnRoomsendkeys1;
	}

	public WebElement getdDnRoomNos() {
		return dDnRoomNos;
	}

	public WebElement getdDnDatepickin() {
		return dDnDatepickin;
	}

	public WebElement getdDnDatepickout() {
		return dDnDatepickout;
	}

	public WebElement getdDnAdultRoom() {
		return dDnAdultRoom;
	}

	public WebElement getdDnChildRoom() {
		return dDnChildRoom;
	}

	public WebElement getdDnSubmit() {
		return dDnSubmit;
	}

	public void setdDnLocation(WebElement dDnLocation) {
		this.dDnLocation = dDnLocation;
	}

	public void setdDnhotels(WebElement dDnhotels) {
		this.dDnhotels = dDnhotels;
	}

	public void setdDnRoomsendkeys1(WebElement dDnRoomsendkeys1) {
		this.dDnRoomsendkeys1 = dDnRoomsendkeys1;
	}

	public void setdDnRoomNos(WebElement dDnRoomNos) {
		this.dDnRoomNos = dDnRoomNos;
	}

	public void setdDnDatepickin(WebElement dDnDatepickin) {
		this.dDnDatepickin = dDnDatepickin;
	}

	public void setdDnDatepickout(WebElement dDnDatepickout) {
		this.dDnDatepickout = dDnDatepickout;
	}

	public void setdDnAdultRoom(WebElement dDnAdultRoom) {
		this.dDnAdultRoom = dDnAdultRoom;
	}

	public void setdDnChildRoom(WebElement dDnChildRoom) {
		this.dDnChildRoom = dDnChildRoom;
	}

	public void setdDnSubmit(WebElement dDnSubmit) {
		this.dDnSubmit = dDnSubmit;
	}
	
	private void search() throws IOException {
		
		sendkeys(getdDnLocation(), getData("sheet 1", 1, 3));
		sendkeys(getdDnhotels(), getData("sheet1",1,4));
		sendkeys(getdDnRoomsendkeys1(), getData("sheet1",1,5));
		
	
	
	
	
	
	}
//		sendkeys(getdDnAdultRoom(), dDnAdultRoom);
//		sendkeys(getdDnChildRoom(), dDnAdultRoom);
//		sendkeys(getdDnDatepickin(), dDnDatepickin);
//		sendkeys(getdDnDatepickout(), dDnDatepickout);
//		sendkeys(getdDnLocation(), dDnLocation);
//		sendkeys(getdDnRoomNos(), dDnRoomNos);
//		sendkeys(getdDnRoomsendkeys1(), dDnRoomsendkeys1);
//		sendkeys(getdDnSubmit(), dDnSubmit);
//		sendkeys(getdDnhotels(), dDnhotels);
//	}
	
}





