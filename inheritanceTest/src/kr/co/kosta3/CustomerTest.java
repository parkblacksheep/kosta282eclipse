package kr.co.kosta3;

public class CustomerTest {
	public static void main(String[] args) {
		int price = 15000;
		Customer2 customer2 = new Customer2(price, null);
		customer2.setCustomerName("jongwon");
		customer2.setAgent("메이드 상"); //상담원 배정
		System.out.println(customer2.batch());
		
		customer2.calPrice(price);
		System.out.println("택시비는"+price+"이며, 보너스 포인트는 "+customer2.calPrice(price)
			+" 이며, 할인 후 금액은 "+customer2.sale(price) +" 입니다."
				);
	}
}
