package kr.co.quiz;

import java.util.Scanner;

/*
 배열의 최대값을 구하시오.
 사람 숫자 : 6 
 height[0] : 173
 1: 157
 2: 191
 3: 141
 4: 167 
 5: 179
 scanner사용
 사람 키 이용


*/
public class MaxInArrayTest{
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.println("가장 키가 큰 사람을 구하시오.");
		System.out.println("사람 숫자:");
		int num = stdIn.nextInt();
		int[] height = new int [num];
		int max = height[0];
		for(int i=0; i<num;i++) {
			System.out.print("height["+i+"] : ");
			height[i]=stdIn.nextInt(); 
					
//			if(height[i]>max) {
//				max=height[i];
//			}
		}
//		System.out.println("가장 키가 큰 사람의 키는"+max+"입니다.");
		System.out.println("가장 키가 큰 사람의 키는"+maxheight(height)+"입니다.");
		stdIn.close();
	}

	//배열 arr의 최대값을 구하는 메서드
	private static int  maxheight(int[] arr) {
		
		int max = arr[0];
		for(int i=1; i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		
		return max;
	}
}
