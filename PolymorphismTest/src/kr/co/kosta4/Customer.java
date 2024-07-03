package kr.co.kosta4;

/*
다형성을 활용한 고객관리 프로그램 확장
-중간 멤버십 생성하기
-일반 고객보다는 많이 구매하고 VIP보다는 적게 구매하는 곡객이 대상 
-혜택 
	-제품 구매시 10프로 할인하기 
	-보너스 포인트는 2% 적립하기

*/
public class Customer {
	protected int customerId;
	protected String customerName;
	protected String customerGrade;

	int bonusPoint;
	double bonusRatio;

	// variable

	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public int getBonusPoint() {
		return bonusPoint;
	}

	public void setBonusPoint(int bonusPoint) {
		this.bonusPoint = bonusPoint;
	}

	public double getBonusRatio() {
		return bonusRatio;
	}

	public void setBonusRatio(double bonusRatio) {
		this.bonusRatio = bonusRatio;
	}

	// getter, setter

	public Customer(int customerId, String customerName) {
		this.customerName=customerName;
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		System.out.println("상위");
	}
	// Constructer

	public int calPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}

	public String showInfo() {
		return customerName + "님의 등급은 " + customerGrade + "이며, "
				+ "보너스 포인트는" + bonusPoint + "입니다.";
	}
	
	//mehod
}
