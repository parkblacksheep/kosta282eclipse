package kr.co.kosta;

import java.util.Scanner;

//자연수를 순서대로 더해 한계가 처음으로 100보다 커지는  때의 숫자와 합게를 출력하시오.

public class WhileTest5 {
	public static void main(String[] args) {
		
		int a;
		// while
		a = 0;
		while (a < 0) {
			System.out.print(a + " "); //fail
		}
		System.out.println();
		//do-while
		a=0;
		do {
			System.err.println(a+"");
			a++;
		}while(a<0);
		
	}
	
}
