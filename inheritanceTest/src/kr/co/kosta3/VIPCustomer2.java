package kr.co.kosta3;

public class VIPCustomer2 extends Customer {
	public VIPCustomer2(int customerId2, String customerName2) {
		super(customerId2, customerName2);
		// TODO Auto-generated constructor stub
	}

	protected int customerId;
	private String cutomerName;
	private String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
	private int agentId; //VIP 고객 담당 상담원 아이디
	double saleRatio; // 할인율
	
//	public VIPCustomer2() {
//		customerGrade="VIP"; 	//고객등급
//		bonusRatio=0.05;			//보너스 적립  5%
//		saleRatio =0.1;			//할인율
//	}
	
	public int calPrice(int price) {
		bonusPoint += price* bonusRatio;
		
		return price*(1-(int)bonusRatio); 
	}
	
	public String showInfo() {
		return "이잉 앗쌀라 말라이쿵~";
		
	}
	
}
