package kr.co.kosta3;

public class Customer2 extends Customer {
	public Customer2(int customerId2, String customerName2) {
		super(customerId2, customerName2);
		// TODO Auto-generated constructor stub
	}
	private double sale;
	private String agent;
	
	
	
//	public Customer2() {
//		
//		customerGrade = "VVIP";
//		bonusRatio = 0.05;
//		sale = 0.1;
//	}
//
	
	public String getAgent() {
		return agent;
	}


	public void setAgent(String agent) {
		this.agent = agent;
	}

//
	public int calPrice(int price) {
		bonusPoint += price * bonusRatio;
		return bonusPoint; //포인트 적립
	}
	public int sale(int price) { //가격할인
		price -=sale*price;
		return price;
	}
	public String batch() { //등급 및 상담원 배정
		return customerName+"님의 등급은"+customerGrade+"이며, 상담원 "+agent+"씨가 배정되어"
				+"도와드리겠습니다.";
	}
}//class Customer2
