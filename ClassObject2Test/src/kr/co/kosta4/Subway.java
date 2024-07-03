package kr.co.kosta4;

public class Subway {
	
	String linNumber;
	int passengerCount;
	int money;
	//variable
	
	
	public String getLinNumber() {
		return linNumber;
	}
	public void setLinNumber(String linNumber) {
		this.linNumber = linNumber;
	}
	public int getPassengerCount() {
		return passengerCount;
	}
	public void setPassengerCount(int passengerCount) {
		this.passengerCount = passengerCount;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	//getter, setter
	
	
	public Subway() {
	};
	public Subway(String linNumber) {
		super();
		this.linNumber = linNumber;
	}
	//Constructor
	
	
	public void take(int money) {
		this.money +=money;
		passengerCount++;
	}//take
	
	public void showInfo() {
		System.out.println(linNumber+"지하철의 승객은"+passengerCount+"명 이고 "+
		"수입은"+money+"원 입니다.");
	}//showInfo
	
	//method
	
}//class Subway
