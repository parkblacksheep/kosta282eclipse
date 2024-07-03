package kr.co.kosta3;

public class ComepleteCalc extends Calculator{

	@Override
	public int times(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1*num2;
	}

	@Override
	public int divide(int num1, int num2) {
		// TODO Auto-generated method stub
		if(num2 !=0)
			return num1/num2;
		else 
			return Calc.ERROR;
		}
	public void showInfo() {
		System.out.println("Calc 인터페이스를 구현하였습니다.");
	}
	
	
}
