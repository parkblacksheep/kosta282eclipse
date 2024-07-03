package kr.co.kosta8;

public class Car {
	private int carNum;
	private static int serialNumber=10000; // 공용(static) 사용 시리얼 넘버
	//variable
	
	public int getCarNum() {
		return carNum;
	}
	public void setCarNum(int carNum) {
		
		this.carNum = carNum;
	}
	//getter, setter
	public Car() {
		serialNumber++;
		this.carNum=serialNumber;
	}
	//Constructor
}//class
