package kr.co.kosta4;

public class Bus {
	int busNumber;
	int passengerCount;
	int money;
	// variable

	public int getBusNumber() {
		return busNumber;
	}

	public void setBusNumber(int busNumber) {
		this.busNumber = busNumber;
	}
	// getter, setter

	public Bus() {	
	}

	public Bus(int busNumber) {
		this.busNumber = busNumber;
	}

	public Bus(int busNumber, int passengerCount, int money) {
		super();
		this.busNumber = busNumber;
		this.passengerCount = passengerCount;
		this.money = money;
	}
	// Constructor

	public void take(int money) {
		this.money += money;
		passengerCount++;

	}// take
	
	public void showInfo() {
		System.out.println(busNumber+"번 버스의 승객은"+passengerCount+
		"명 이고, 그 수입은"+money+"원 입니다.");
	}//showInfo

	// method

}// class Bus
