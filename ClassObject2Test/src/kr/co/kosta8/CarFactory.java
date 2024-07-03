package kr.co.kosta8;

import kr.co.kosta7.Company;

public class CarFactory {
	
	
	private CarFactory() {	
	}//private 로 숨겨진 default생성자
	private static CarFactory instance=new CarFactory();  // private 로 숨겨진 생성자
	public static CarFactory getInstance() {
		if(instance==null) {
			instance = new CarFactory();
		}
		return instance;
	}// public 으로 보이는 getInstance 생성자
	
	public Car createCar() {
		Car car =new Car();
		return car;
	}//createCar method
}//class
