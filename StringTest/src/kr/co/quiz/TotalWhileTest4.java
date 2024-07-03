package kr.co.quiz;

import java.util.Iterator;
import java.util.Scanner;

/*
1부터 n까지 정수의 합을 구하시오.

ex) 1부터 n까지의 합을 구하시오.
	n값: 5
	1부터 5까지 출력이 되게? 
		1+2+3+4+5=15
*/
public class TotalWhileTest4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1부터 n까지의 합을 구하시오.");
		System.out.print("n값: ");
		int one = scanner.nextInt();
		int sum = 0;
		int[] array = new int[10];
		for (int i = 1; i <= one; i++) {
			sum += i;
			array[i] = i;
			if(array[i]==array[one]) {
				System.out.print(array[i]);
			}else {
				System.out.print(array[i]+"+");				
			}
		}
		System.out.println();
		System.out.println("1부터" + one + "까지의 합은 " + sum);

	}// main
}// class
