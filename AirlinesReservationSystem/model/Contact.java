package model;

public class Contact{
	private String address;
	private String city;
	private String email;
	private int phone;
	
	public Contact(String address, String city, String email, int phone) {
		this.address = address;
		this.city = city;
		this.email = email;
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}
	
	
}