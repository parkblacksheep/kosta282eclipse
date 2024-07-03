package kr.co.kosta;

import java.util.Scanner;

public class MethodTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("1번값을 입력해 주세요");
		int num1 = scanner.nextInt();
		System.out.println("2번값을 입력해 주세요");
		int num2 = scanner.nextInt();

		int sum = add(num1, num2);
		int minus1=minus(num1,num2);
		int multi1=multi(num1,num2);
		int divide1=divide(num1,num2);
		
		System.out.println(num1 + "+" + num2 + "=" + sum + "입니다.");
		System.out.println(num1 + "-" + num2 + "=" + minus1 + "입니다.");
		System.out.println(num1 + "*" + num2 + "=" + multi1 + "입니다.");
		System.out.println(num1 + "/" + num2 + "=" + divide1 + "입니다.");
	}

	// outline S 가 static 을 의미
	public static int add(int num1, int num2) {

		return num1 + num2;
	}
	//사칙연산 나머지 3개 구현하고 결과값을 출력하시오.
	
	public static int minus(int num1, int num2) {
		if(num1>num2) {
			return num1 - num2;			
		}else {
			System.out.println("num2값이 더 커서 값의 차이를 구했습니다.");
			return num2-num1;
		}
	}
	public static int multi(int num1, int num2) {
		
		return num1 * num2;
	}
	public static int divide(int num1, int num2) {
		if(num2==0) {
			System.err.println(" 삐빅 나눗셈은 무한으로 수렴되어 볼 수 없습니다.");
			return 0;
		}else {
			return num1 / num2;			
		}
	}
}
