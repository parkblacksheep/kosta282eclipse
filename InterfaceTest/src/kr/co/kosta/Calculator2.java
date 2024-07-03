package kr.co.kosta;

public  class Calculator2 implements Calc{
	
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
		
		return num1*num2;
	}

	@Override
	public int divide(int num1, int num2) {
		return num1/num2;
	}

	

}
