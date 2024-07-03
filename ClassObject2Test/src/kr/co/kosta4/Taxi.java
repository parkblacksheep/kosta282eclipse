package kr.co.kosta4;

public class Taxi {
	String TaxiName;
	int money;
	int passengerCount;
	// variable

	public String getTaxiName() {
		return TaxiName;
	}

	public void setTaxiName(String taxiName) {
		TaxiName = taxiName;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public int getPassengerCount() {
		return passengerCount;
	}

	public void setPassengerCount(int passengerCount) {
		this.passengerCount = passengerCount;
	} // getter, setter

	public Taxi() {

	}
	public Taxi(String taxiName) {
		super();
		TaxiName = taxiName;
	}

	public Taxi(String taxiName, int money, int passengerCount) {
		super();
		TaxiName = taxiName;
		this.money = money;
		this.passengerCount = passengerCount;
	}// Constructor


	public void take(int money) {
		// TODO Auto-generated method stub
		this.money += money;
	} // take

	public void showInfo() {
		System.out.println(TaxiName + "택시" + passengerCount + "명 이고 " + "수입은" + money + "원 입니다.");
	}

	// method

}// class
