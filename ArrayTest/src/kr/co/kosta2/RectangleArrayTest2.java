package kr.co.kosta2;

public class RectangleArrayTest2 {
	public static void main(String[] args) {
		int[][] array1 = new int[2][3];
		array1[0][0] = 1;

		for (int i = 0; i < array1.length; i++) {
			for (int j = 0; j < array1[i].length; j++) {
				array1[i][j] = array1[i][j] + i;
				System.out.print(array1[i][j] + " ");
			}
			System.out.println();
		}

		System.out.println(array1.length);
		System.out.println(array1[0].length);
		System.out.println(array1[1].length);
		System.out.println();

		int[][] array2;
		array2 = new int[2][3];
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[i].length; j++) {
				array2[i][j] = array2[i][j] + i;
				System.out.print(array2[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println();
		
		int[][] array3 = { {1,2,3}, {4,5,6} };
		for (int i = 0; i < array3.length; i++) {
			for (int j = 0; j < array3[i].length; j++) {
				array3[i][j] = array3[i][j] + i;
				System.out.print(array3[i][j] + " ");
			}
			System.out.println();
		}
		
		
	}
}
