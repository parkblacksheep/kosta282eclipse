package kr.co.kosta2;

public class NestedForTest {
	public static void main(String[] args) {
		int dan;
		int times;
		for(dan =2; dan<=9; dan++) {
			for(times=1; times<=9; times++) {
				System.out.print(dan+"X"+ times+"="+dan*times+ " ");
			}
			System.out.println();
		}
	}
}
