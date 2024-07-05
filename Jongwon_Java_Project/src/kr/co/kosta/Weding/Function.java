package kr.co.kosta.Weding;

import java.util.ArrayList;

public class Function {
	private int fuctionId;
	private String funtionName;
	private int functionType;
	private ArrayList<Customer> customers = new ArrayList<>();

	public Function(int functionId, String funtionName) {
		this.fuctionId = -functionId;
		this.funtionName = funtionName;
	}

	public int getFuctionId() {
		return fuctionId;
	}

	public void setFuctionId(int fuctionId) {
		this.fuctionId = fuctionId;
	}

	public String getFuntionName() {
		return funtionName;
	}

	public void setFuntionName(String funtionName) {
		this.funtionName = funtionName;
	}

	public int getFunctionType() {
		return functionType;
	}

	public void setFunctionType(int functionType) {
		this.functionType = functionType;
	}

	// ArrayList<Customer 부분 get,set 메소드
	public ArrayList<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(ArrayList<Customer> customers) {
		this.customers = customers;
	}

//	---------------메소드
	public void register(Customer customer) {
		customers.add(customer);
	}
}
