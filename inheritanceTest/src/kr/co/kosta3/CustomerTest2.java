package kr.co.kosta3;

public class CustomerTest2 {
	public static void main(String[] args) {
		Customer customerHong = new Customer(10001, "hong");
		customerHong.bonusPoint = 1000;
		System.out.println(customerHong.showInfo());
		
		VIPCustomer customerShin = new VIPCustomer(10002, "심사임당", 100);
		customerShin.bonusPoint =10000;
		System.out.println(customerShin.showInfo());
//		
//		Customer customerHong = new Customer();
//		customerHong.setCustomerId(10001);
//		customerHong.setCustomerName("hong");
//		customerHong.bonusPoint = 1000;
//		System.out.println(customerHong.showInfo());
//		
//		VIPCustomer customerShin = new VIPCustomer(0, null, 0);
//		customerShin.setCustomerId(10002);
//		customerShin.setCustomerName("심사");
//		customerShin.bonusPoint =10000;
//		System.out.println(customerShin.showInfo());
		
		//vc 변수는 Customer 클래스의 멤버 변수와 메서드만 사용 가능
		Customer vc = new VIPCustomer(10003,"이순신",200);
		
	}
}
