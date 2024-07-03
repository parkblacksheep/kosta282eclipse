package kr.co.kosta2;

public class NestedForTest2 {
	public static void main(String[] args) {
		// 중첩 반복문으로 구구단을 3단 부터 7단까지만 출력하시오.
		
		for(int number=3;number<8;number++) {
			for(int dan=1;dan<=9;dan++) {
				System.out.println(number+" x "+dan+" = "+number*dan);
			}
			System.out.print("");
		}
	}
}
