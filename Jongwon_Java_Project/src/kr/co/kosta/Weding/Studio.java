package kr.co.kosta.Weding;

import java.time.LocalDate;
import java.util.ArrayList;

public class Studio {
	private String studioName;
	private int studioId;
	private Customer customerName = new Customer(studioName);
	private LocalDate reservationDate;
	private ArrayList<Authority> authorities = new ArrayList<>();
	private ArrayList<Customer> customers = new ArrayList<>();

	public Studio(String studioName, LocalDate reservationDate) {
		super();
		this.studioName = studioName;

		this.reservationDate = reservationDate;
	}

	public String getStudioName() {
		return studioName;
	}

	public void setStudioName(String studioName) {
		this.studioName = studioName;
	}

	public int getStudioId() {
		return studioId;
	}

	public void setStudioId(int studioId) {
		this.studioId = studioId;
	}

	public Customer getCustomerName() {
		return customerName;
	}

	public void setCustomerName(Customer customerName) {
		this.customerName = customerName;
	}

	public LocalDate getReservationDate() {
		return reservationDate;
	}

	// ------메소드
	public void addFunctionAuthority(Authority authority) {
		authorities.add(authority);
	}

	public void addCustomers(String customerName) {

		customers.add(getCustomerName());
	}
}
