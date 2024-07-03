package kr.co.quiz;

import java.util.Iterator;
import java.util.Scanner;

/*
입력한 값까지의 합을 구하시오.
	ex) 1부터 n까지의 합을 구하시오.
		n값: 5
		1부터 5까지의 합은 15입니다. 
 -> for문으로
		
*/
public class TotalWhileTest3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1부터 n까지의 합을 구하시오.");
		System.out.print("n값: ");
		int one = scanner.nextInt();
		int sum = 0;
		for (int i = 1; i <= one; i++) {

			sum += i;
		}
		System.out.println("1부터" + one + "까지의 합은 " + sum);

	}// main
}// class
