package kr.co.quiz2;

import java.util.Random;
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
		Random rand = new Random();
		Scanner stdIn = new Scanner(System.in);
		System.out.println("가장 키가 큰 사람을 구하시오.");
		System.out.println("사람 숫자:");
		int num = stdIn.nextInt(); // 배열의 요소수를 입력
		int[] height = new int [num]; // 요소수가 num인 배열 생성
		
		int max = height[0];
		
		for(int i=0; i<num;i++) {
			System.out.print("height["+i+"] : ");
			height[i]=100 +rand.nextInt(90);	//요소값을 난수로 결정(0~89)
			System.out.println("height["+"]"+height[i]);
					
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
