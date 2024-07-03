package kr.co.quiz;

import java.util.Iterator;
import java.util.Scanner;

/*
1부터 n까지 정수의 합을 구하시오.

ex) 1부터 n까지의 합을 구하시오.
	n값: 5
	1부터 5까지의 합은 15입니다. 
-> while문으로
*/
public class TotalWhileTest2 {
	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("1부터 n까지 정수의 합을 구하시오.");
		System.out.println("n값: ");
		int n=scanner.nextInt();
		int m=n;
		int sum = 0;
		while(n>0) {
			sum+=n;
			n--;
		}
		System.out.println("1부터 "+m+"까지의 합은"+sum+"입니다.");
			
			
		}//main
}//class
