package kr.co.kosta.Weding;

import java.util.ArrayList;

public class Hole {
	private static Hole instance = new Hole();

	private Hole() {
	}

	public static Hole getInstance() {
		if (instance == null)
			instance = new Hole();
		return instance;
	}// 싱글톤 패턴

	private ArrayList<Customer> customers = new ArrayList<>();
	private ArrayList<Function> functions = new ArrayList<>();

	public ArrayList<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(ArrayList<Customer> customers) {
		this.customers = customers;
	}

	public ArrayList<Function> getFunctions() {
		return functions;
	}

	public void setFunctions(ArrayList<Function> functions) {
		this.functions = functions;
	}

//----
	public void addFunction(Function function) {
		functions.add(function);
	}

	public void addCustomer(Customer customer) {
		customers.add(customer);
	}
}
