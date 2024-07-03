package kr.co.kosta2;

import java.util.Scanner;

public class whileDoWhileTest {
	public static void main(String[] args) {
		// 1회 이상 roop
		int a;
		// While
		a = 0;
		while (a < 10) {
			System.out.print(a + " ");
//				10번 실행
			a++;
		}
		System.out.println();
		
//		do-while
		a = 0;
		do {
			System.out.print(a+" "); // 10 action
			a++;
		}while(a<10);
		
	}
}
