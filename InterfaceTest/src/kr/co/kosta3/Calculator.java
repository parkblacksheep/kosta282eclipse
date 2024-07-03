package kr.co.kosta3;

public  class Calculator implements Calc{
//Calc라는 인터페이스에서 모두 받아 오버라이드를 하지 않아
	// 이 클래스도 객체가 되지 못한 추상클래스가 되어 다른곳에 상속 되어야 가능하다.
	
	@Override
	public int add(int num1, int num2) {
		
		return num1+num2;
	}

	@Override
	public int substract(int num1, int num2) {
		return num1-num2;
	}

	@Override
	public int times(int num1, int num2) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int divide(int num1, int num2) {
		// TODO Auto-generated method stub
		return 0;
	}

	

}
