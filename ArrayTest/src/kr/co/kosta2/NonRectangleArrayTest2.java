package kr.co.kosta2;

public class NonRectangleArrayTest2 {
	public static void main(String[] args) {

		System.out.println();
		int[][] c = new int[][] { { 1, 2 }, { 3, 4, 5 } };
		int[][] d = { { 1, 2 }, { 3, 4, 5 } };

		for (int i = 0; i < d.length; i++) {
			for (int j = 0; j < d[i].length; j++) {
				System.out.print(d[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		//향상된 for문
		for (int[] m : d) {
			for (int n : m) {
				System.out.print(n+" ");
			}
			System.out.println( );
		}
	}// main
}// class
