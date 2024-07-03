package kr.co.kosta3;

public class Customer {
	protected int customerId;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;

	
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
	public Customer(int customerId2, String customerName2) {
		customerGrade = "SILVER"; // 기본 등급
		bonusRatio = 0.01; // 보너스 적립비율
		System.out.println("상위 클래스 생성자 호출--");
	}

	public int calPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showInfo() {
		return customerName +"님의 등은"+ customerGrade + "이며, 보너스 프이트는"
				+bonusPoint+"입니다.";
	}
}
