package kr.co.kosta4;

public class VIPCustomer extends Customer{
	private int agentId;
	double saleRatio;
	
	public VIPCustomer(int customerId, String customerName,int agentId) {
		super(customerId, customerName);
		this.agentId = agentId;
		customerGrade = "VIP";
		bonusRatio = 0.05;
		saleRatio = 0.1;
		System.out.println("하위 ");
		
	}

	@Override
	public int calPrice(int price) {
		bonusPoint += price* bonusRatio;
		return (int)(price*(1-saleRatio));
	}

	@Override
	public String showInfo() {
		return customerName + "님의 등급은 " + customerGrade + "이며, "+
				"안내원은"+agentId+ "입니다."
				+ "보너스 포인트는" + bonusPoint + "입니다.";
	}
	
	
	
	
	
	
}
