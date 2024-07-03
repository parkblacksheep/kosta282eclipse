package kr.co.kosta5;


public class Customer implements Buyer,Seller{

	@Override
	public void sell() {
		System.out.println("판매하기");
	}

	@Override
	public void buy() {
		System.out.println("구매하기");
	}

	@Override
	public void order() {
//		Buyer.super.order();
		System.out.println("고객 판매 주문 "); 
		// 디폴트 메서드  order()를 Customer클래스에서 재정의함
	}
	
	
}
