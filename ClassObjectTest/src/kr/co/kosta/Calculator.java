package kr.co.kosta;

public class Calculator {
	int a = 3;
	int b = 4;

	public int add(int num1, int num2) {
		num1 = a;
		num2 = b;
		int result = num1 + num2;
		System.out.println(result);
		return result;
	} // num1값과 num2값의 합에 대한 계산

	public int minus(int num1, int num2) {
		num1 = a;
		num2 = b;
		int result = num1 - num2;
		System.out.println(result);
		return result;
	}

	public int multi(int num1, int num2) {
		num1 = a;
		num2 = b;
		int result = num1 * num2;
		System.out.println(result);
		return result;
	}
	//divide, 두 수를 매개변수로 나눗셈을 한 후 몫을 출력하는 함수
	//단, 만약 나누는 수가 0이라면 수행이 안됨 
	public void divide(int num1, int num2) {
		int result = num1 / num2;
		if(num2==0) {
			System.out.println("나누는 수를 0으로 만들지 마라~");
			return ; //함수 수행 종료
		}else{ 
			System.out.println(num1+"/"+num2+"="+result+"입니댜.");
		}
	}

	public double circle(int num1) {
		num1 = a; // r
		double pi = num1 + 0.14;
		double result = pi * num1 * num1;
		System.out.println(result);
		return result;
	}

	public int getTenTotal() {
		int i;
		int total = 0;

		for (i = 1; i < -10; i++) {
			total += i;
		}
		return total;
	}
	//void : 반환할 값이 없다.
	public void printGreeting(String name) {
		System.out.println(name+"님 안녕하세요");
		return; //반환값 없음, 함수 수행을 끝내고 프로그램  흐름 중에서 호출한 곳으로 다시 되돌아갈때 사용함
	}
	
	

}
