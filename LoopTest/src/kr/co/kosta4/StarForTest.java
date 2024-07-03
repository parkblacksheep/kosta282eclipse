package kr.co.kosta4;

public class StarForTest {
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

		int lineCount = 4;
		int spaceCount = lineCount / 2 + 1;
		int starCount = 1;
		for (int i = 0; i < lineCount; i++) {
			for (int j = 0; j < spaceCount; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < starCount; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < starCount; j++) {
				System.out.print(" ");
			}
			spaceCount--;
			starCount += 2;
			System.out.println();

		}
		int lineCount2 = 7;
		int spaceCount2 = lineCount / 2 + 1;
		int starCount2 = 1;
		for (int i = 0; i < lineCount; i++) {
			for (int j = 0; j < spaceCount; j++) {
				System.out.print(" ");
			}
			for (int j = 0; j < starCount; j++) {
				System.out.print("*");
			}
			for (int j = 0; j < starCount; j++) {
				System.out.print(" ");
			}
			if (i < lineCount2 / 2) {
				spaceCount -= 1;
				starCount += 2;
			} else {
				spaceCount += 1;
				starCount = +2;
			}

			System.out.println();

		}
	}// main
} // class
