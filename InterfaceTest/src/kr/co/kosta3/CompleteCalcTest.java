package kr.co.kosta3;

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
		calc.describe(); // default 메서드 호출
		
		Calc calc2= new ComepleteCalc();
		calc2.add(num1, num2);
		
		int[] arr = {1,2,3,4,5};
		System.out.println(Calc.total(arr));
	}
}
