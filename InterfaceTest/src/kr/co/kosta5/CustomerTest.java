package kr.co.kosta5;

public class CustomerTest {
	public static void main(String[] args) {
		Customer customer = new Customer();
		
		System.out.println("구매자 기준");
		Buyer buyer = customer;
		buyer.buy();
		buyer.order();
		
		System.out.println();
		
		System.out.println("판매자 기준");
		Seller seller = customer;
		seller.sell();
		seller.order();
		System.out.println();
		
		if(seller instanceof Customer) {
			Customer customer2 = (Customer)seller; 
			// seller를 하위 클래스형인 Customer로 다시 형변환
			customer2.buy();
			customer2.sell();
		}
		
		
	}
}
