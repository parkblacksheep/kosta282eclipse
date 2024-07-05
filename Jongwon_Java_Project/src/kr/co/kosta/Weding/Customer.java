package kr.co.kosta.Weding;

import java.util.ArrayList;

public class Customer {
	private String customerName;
	private int customerId;
	private String customerPhoneNum;

	private Function majorfunction;
	private ArrayList<Authority> authorities = new ArrayList<>(); // 권한 리스트

	public Customer() {
	}

	public Customer(String customerName, int customerId, String customerPhoneNum) {
		this.customerName = customerName;
		this.customerId = customerId;
		this.customerPhoneNum = customerPhoneNum;

	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public ArrayList<Authority> getAuthorities() {
		return authorities;
	}

	public void setAuthorities(ArrayList<Authority> authorities) {
		this.authorities = authorities;
	}

	public Function getMajorfunction() {
		return majorfunction;
	}

	public void setMajorfunction(Function majorfunction) {
		this.majorfunction = majorfunction;
	}

	// -----------------------메소드
	public void addFunctionAuthority(Authority authority) {
		authorities.add(authority);
	}

}
