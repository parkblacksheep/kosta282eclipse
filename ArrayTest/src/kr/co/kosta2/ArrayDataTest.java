package kr.co.kosta2;

import java.util.Arrays;

public class ArrayDataTest {
	public static void main(String[] args) {
		int[] array = new int[] { 3, 4, 5, 6, 7 };
		// save array.length
		int length = array.length;
		System.out.println(length);
		System.out.println(array.length);
		
		// As using array's index, we print entire value
		System.out.print(array[0] + " ");
		System.out.print(array[1] + " ");
		System.out.print(array[2] + " ");
		System.out.print(array[3] + " ");
		System.out.print(array[4] + " ");
		System.out.println();
		
		// for loop length
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
		// for ~each
		for(int k : array) {
			System.out.print(k+" ");
		}
		System.out.println();
		
		//Arrays.toString()
		System.out.println(Arrays.toString(array));
		
	}
}
