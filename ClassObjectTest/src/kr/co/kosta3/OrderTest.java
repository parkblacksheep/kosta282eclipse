package kr.co.kosta3;

public class OrderTest {
	public static void main(String[] args) {
		Order order =new Order();
		
		order.num=202405281108001L;
		order.ID= "kosta100";
		order.OrderDate="2024년 5월 28일";
		order.Name="홍길동";
		order.ProductNumber="PD123-12";
		order.address="경기도 성남시 오리역 인근";
		
		System.out.println("영수증: ");
		System.out.println("주문 번호: "+order.num);
		System.out.println("아이디: "+order.ID);
		System.out.println("날짜: "+order.OrderDate);
		System.out.println("이름: "+order.Name);
		System.out.println("주문 상품 번호: "+order.ProductNumber);
		System.out.println("배송 주소: "+order.address);
	}
}
