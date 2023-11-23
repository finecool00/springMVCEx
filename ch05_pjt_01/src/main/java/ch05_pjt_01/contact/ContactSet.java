package ch05_pjt_01.contact;

public class ContactSet {

	private String name;
	private String phoneNumber;
	
	
	//생성자
	public ContactSet(String name, String phoneNumber) {
		this.name = name;
		this.phoneNumber = phoneNumber;
	}


	//getter, setter
	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	
	
	
	
	
	
	
}
