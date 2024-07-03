package kr.co.kosta6;

public class EmployeeTest2 {
	public static void main(String[] args) {
		
		Employee employee =new Employee();
		employee.setEmployeeName("홍길동");
		
		Employee employee2 =new Employee();
		employee2.setEmployeeName("신사임당");
		
		System.out.println(employee.getEmployeeName()+","+employee.getEmployeeId());
		System.out.println(employee2.getEmployeeName()+","+employee2.getEmployeeId());
	}
}
