package kr.co.quiz;

import java.util.Scanner;

/*
입력한 정숫값의 부호를 판단 출력하시오.

ex) 정수를 입력하세요: 10
	이 수는 양수입니다.
	
	정수를 입력하세요: -7
	이 수는 음수입니다.
	
	정수를 입력하세요: 0
	이 수는 0입니다.

*/
public class IntegerSignTest {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n;
		do {
			System.out.println("정수를 입력하세요:");
			 n=scanner.nextInt();
			if(n>0) {
				System.out.println("이 수는 양수 입니다.");
			}else if(n<0) {
				System.out.println("이 수는 음수입니다.");
			}else {
				System.out.println("이 수는 0입니다.");
			}			
		} while (n!=1);
		System.out.println("n=1일 때 종료합니다.");
		}//main
}//class
