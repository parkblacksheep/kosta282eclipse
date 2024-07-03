package kosta3;

public class ReactangleArrayTest {
	public static void main(String[] args) {

		int[][] a = new int[3][1];
		// 행 성분 생성
		a[0] = new int[3];
		a[0][0] = 1;
		a[0][1] = 2;
		a[0][2] = 3;
		// 열 성분 생성
		int[][] b = new int[2][];
		a[0] = new int[] { 1, 2, 3 };
		a[1] = new int[] { 4, 5, 6 };

		int[][] c = new int[][] { { 1, 2, 3 }, { 4, 5, 6 } };
	}
}
