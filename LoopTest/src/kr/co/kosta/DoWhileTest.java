package kr.co.kosta;
//입력 받는 모든 숫자 합을 구하시오. 단, 입력이 0이되면 반복을 그만하고 합을 하시오.

import java.util.Scanner;

public class DoWhileTest {

	public static void main(String[] args) {
		System.out.print("정수를 입력해주세요, 단 0 입력시 이전 값의 합이 나옵니다.");
		Scanner scanner = new Scanner(System.in);
		int input;
		int sum = 0;
		int calculator =0;
		
		do {
			input = scanner.nextInt();
			sum += input;
			System.out.println("현재 합: "+sum);
		} while (input != 0);
		System.out.println("합은: "+sum);
		scanner.close();
	}
}
