package kr.co.kosta3;

import java.util.Scanner;

public class IFSwitchTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		char operator = scanner.next().charAt(0);
		int result = 0;
		// if~else if ~else 문으로 사칙연산을 수행하는 프로그램을 하시오.

		// 출력 예시) 결과 값은 00입니다.

		if (operator == '+') {
			System.out.println(num1 + num2);
		} else if (operator == '-') {
			if (num1 > num2) {
				result = num1 - num2;
				System.out.println("결과 값은 "+result+"입니다.");
			} else {
				result=num2 - num1;
				System.out.println("결과 값은 "+result+"입니다.");
			}
		} else if (operator == '*') {
			System.out.println(num1 * num2);
		} else if (operator == '/') {
			System.out.println(num1 / num2);
		} else {
			System.out.println("사칙연산을 제대로 넣어 주세요");
		} // if
			
		// switch 문으로 ~~
		switch (operator) {
			case '+': {
				result = num1 + num2;
				System.out.println("덧셈의 결과값은: " + result);
				break;
			}
			case '-': {
				if(num1>num2) {
					result = num1 - num2;
					System.out.println("뺄셈의 결과값은: " + result);
					break;
				}
				if(num1<=num2) {
					result = num1 - num2;
					System.out.println("뺄셈의 결과값은: " + result);
					break;
				}
			}
			case '*': {
				result = num1 * num2;
				System.out.println("곱셈의 결과값은: " + result);
				break;
			}
			case '/': {
				result = num1 / num2;
				System.out.println("나눗셈의 결과값은: " + result);
				break;
			}
			default:
				System.out.println("사칙연산을 제대로 넣어 주세요");
		} // switch
	}// main
}// class
