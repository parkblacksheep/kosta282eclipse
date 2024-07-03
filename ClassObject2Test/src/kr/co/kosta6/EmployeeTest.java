package kr.co.kosta6;

public class EmployeeTest {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.setEmployeeName("홍길동");
		System.out.println(employee.serialNum);
		
		Employee employee2 = new Employee();
		employee2.setEmployeeName("신사임당");
		System.out.println(employee2.serialNum);
		employee2.serialNum++;
		
		System.out.println(employee.serialNum);
		System.out.println(employee2.serialNum);
		
		
		
	}
}
