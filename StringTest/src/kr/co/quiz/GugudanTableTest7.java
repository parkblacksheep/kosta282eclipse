package kr.co.quiz;

import java.util.Iterator;
import java.util.Scanner;

/*
  1		2	3	4	5	6	7	8	9
  2
  3
  4
  5
  6
  7
  8
  9
  

*/
public class GugudanTableTest7 {
	public static void main(String[] args) {
		for(int i=1; i<=9; i++) {
			System.out.print(i);
			for(int j=1; j<=9; j++) {
				int k=i*j;
				System.out.print(" "+k);
			}
			System.out.println();
		}
	}// main
}// class
