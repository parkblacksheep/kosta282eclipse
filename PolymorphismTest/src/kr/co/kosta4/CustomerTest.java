package kr.co.kosta4;

import java.util.ArrayList;

/*
ArrayList 배열로 고객 5명을 생성 하고 출력하시오.
	- Customer 2명, GoldCustomer 2명, VIPCutomer 1명
	

*/
public class CustomerTest {
	public static void main(String[] args) {
		Customer customer1 = new Customer(10001, "jongwon");
		Customer customer2 = new Customer(10002,"park");
		System.out.println(customer1.showInfo());
		System.out.println(customer2.showInfo());
		System.out.println();
		
		Customer customer3 = new GoldCustomer(10003, "kim");
		Customer customer4 = new GoldCustomer(10004, "IU");
		System.out.println(customer3.showInfo());
		System.out.println(customer4.showInfo());
		System.out.println();
		
		Customer customer5 = new VIPCustomer(10005, "Star",12345);
		System.out.println(customer5.showInfo());
		System.out.println();
		
		ArrayList<Customer> customerList= new ArrayList<Customer>();
		
		Customer customerhong = new Customer(10010,"홍길동");
		Customer customerShin = new Customer(10020,"신사임당");
		Customer customerLee = new GoldCustomer(10030, "이순신");
		Customer customerSon = new GoldCustomer(10040, "손흥민");
		Customer customerJung = new VIPCustomer(10050,"정철",12345);	
		
		customerList.add(customerJung);
		customerList.add(customerShin);
		customerList.add(customerLee);
		customerList.add(customerhong);
		customerList.add(customerSon);
		
		System.out.println("===================================================================================");
		for(Customer customer: customerList) {
			System.out.println(customer.showInfo());
		}
		
		System.out.println("======");
		int price =10000;
		for(Customer customer: customerList) {
			int cost = customer.calPrice(price);
			System.out.println(customer.getCustomerName()+"님이"+cost+"원 지불하셨습니다.");
			System.out.println(customer.getCustomerName()+"님의 현재 보너스 포인트"
			+ customer.bonusPoint+"점입니다.");
			
			
		}
		
		
		
		
		
		
		
		
		
		
		
	}
}
