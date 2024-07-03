package kr.co.quiz;

import java.util.Scanner;

/*
	 왼쪽 아래가 직각인 이등변 삼각형을 출력하시오.
	 예시) 왼쪽 아래가 직각인 이등변 삼각형을 출력합니다.
	 몇단 삼각형입니까? :5


*/
public class StarForTest8 {
	public static void main(String[] args) {
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력하시오.");
		System.out.println("n값을 입력해주세요");
		System.out.println("몇단 삼각형입니까? :");
		Scanner scanner = new Scanner(System.in);
		int n=scanner.nextInt();
		
//		System.out.println(arr.length);
		for(int i=1; i<=n;i++) {
//			System.out.println(i);
			for(int j=0; j<i;j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
