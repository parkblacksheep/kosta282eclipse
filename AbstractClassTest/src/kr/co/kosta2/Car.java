package kr.co.kosta2;

public abstract class Car {
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public abstract void drive();
	public abstract void stop();
	
	public void turnoff() {
		System.out.println("시동을 끕니다.");
	}
	// 템플릿 메서드 -> 더 이상 정해진 틀에서 벗어나지 않도록
	final public void run() {
		startCar();
		drive();
		stop();
		turnoff();
	}
}
