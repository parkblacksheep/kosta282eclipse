package kr.co.kosta3;

public class ContinueControlKeywordTest {
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			continue;
//			System.out.println();
			// -> unreachable code
		}
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.println(i);
		}
	}
}
