package kr.co.kosta;

import java.util.Arrays;

public class ArrayTest4 {
	public static void main(String[] args) {
		// stack memory -> Without initializing can not print
		int value1;
//		System.out.println(value1); //error
		int[] value2;
//		System.out.println(value2); //error
		int value3 = 0;
		System.out.println(value3); // initializing 0
		int[] value4 = null;
		System.out.println(value4);// initializing null

		// hip memory initializing setting
		boolean[] array1 = new boolean[3];
		for (int i = 0; i < 3; i++) {
			System.out.print(array1[i] + " ");
		} // array1
		System.out.println();
		
		int[] array2 = new int[3];
		for (int i = 0; i < 3; i++) {
			System.out.print(array2[i]);
		}// array2
		System.out.println();
		
		// 참조 자료형 배열
		String[] array3 = new String[3]; // null initializing
		for (int i = 0; i < 3; i++) {
			System.out.print(array3[i] + " ");
		}// array3
		System.out.println();
		
		//배열 내용을 한번에 출력하기
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
		System.out.println(Arrays.toString(array3));
		
	}//main
}//class
