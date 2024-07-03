package kr.co.kosta2;

public class NonRectangleArrayTest {
	public static void main(String[] args) {
		int[][] a = new int[2][];
		a[0] = new int[2]; // 첫 번째 행의 열의 갯수
		a[0][0] = 1;
		a[0][1] = 2;
		a[1] = new int[3];
		a[1][0] = 3;
		a[1][1] = 4;
		a[1][2] = 5;

		int[][] b = new int[2][];
		b[0] = new int[] { 1, 2 };
		b[1] = new int[] { 3, 4, 5 };
		System.out.println(b.length); // b의 횡
		System.out.println(b[0].length); // b의 종1
		System.out.println(b[1].length); // b의 종2
		
	}// main
}// class
