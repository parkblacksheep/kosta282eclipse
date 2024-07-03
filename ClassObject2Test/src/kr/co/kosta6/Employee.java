package kr.co.kosta6;

public class Employee {
	
	public static int serialNum = 1000; //객체가 달라도 공유
	private int employeeId;
	private String employeeName;
	private String department;
	//variable
	
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	//setter, getter
	
	public Employee() {
		serialNum++;
		this.employeeId = serialNum;
	}
	
	//Constructor
	
	
	//Method
	
}
