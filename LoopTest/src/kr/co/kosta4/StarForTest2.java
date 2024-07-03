package kr.co.kosta4;

public class StarForTest2 {
	public static void main(String[] args) {

		for (int i = 4; i > 0; i--) {
			for (int j = 1; j < i; j++) {
				System.out.print(" ");
			}
			for (int j = 10; j > 2 * i + 1; j--) {
				System.out.print("*");
			}
			
			System.out.println("");
		} // -> 1,2,3,4
		for (int i = 3; i > 0; i--) {
			for (int j = 4; j > i; j--) {
				System.out.print(" ");
			}
			for (int j = 1; j < 2 * i; j++) {
				System.out.print("*");
			}
			
			System.out.println("");
		} // -> 1,2,3,4
		
		
		
		
		
		
	}// main
} // class
