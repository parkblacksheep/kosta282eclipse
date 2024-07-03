package kr.co.kosta;

public abstract class Computer {
	public abstract void display(); //오류 발생
	public abstract void typing();//오류 발생
	
	public void turnOn() {
		System.out.println("전원을 켜다");	
	};
	public void turnOff() {
		System.out.println("전원을 끄다");	
	};
}
