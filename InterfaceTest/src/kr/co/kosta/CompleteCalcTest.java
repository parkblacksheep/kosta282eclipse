package kr.co.kosta;

public class CompleteCalcTest {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 =5;
		
		ComepleteCalc calc=new ComepleteCalc();
		System.out.println(calc.add(num1,num2));
		System.out.println(calc.substract(num1,num2));
		System.out.println(calc.times(num1,num2));
		System.out.println(calc.divide(num1,num2));
		calc.showInfo();
	}

	private char[] add(int num1, int num2) {
		// TODO Auto-generated method stub
		return null;
	}
}
