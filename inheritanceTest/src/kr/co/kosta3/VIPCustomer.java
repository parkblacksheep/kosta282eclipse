package kr.co.kosta3;

public class VIPCustomer extends Customer{
	private int agentId; //VIP 고객 담당 상담원 아이디
	double saleRatio; // 할인율
	
	public VIPCustomer(int customerId, String customerName, int agentId) {
		super(customerId,customerName);
		customerGrade="VIP"; 	//고객등급
		bonusRatio=0.05;			//보너스 적립  5%
		saleRatio =0.1;			//할인율
		System.out.println("하위 클래스 생성자 호출--");
	}
	
	//@Override
	public int calPrice(int price) {
		bonusPoint += price* bonusRatio;
		
		return price*(1-(int)bonusRatio); 
	}
	
	public String showInfo() {
		return "이잉 앗쌀라 말라이쿵~";
		
	}
	
}
