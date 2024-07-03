package kr.co.kosta;

public class IfElseIfTest {
	public static void main(String[] args) {
		int a = 75;
		if (a >= 90) {
			System.out.println("A학점");
		} else if (a >= 80) {
			System.out.println("B학점");
		} else if (a >= 70) {
			System.out.println("C학점");
		}else {
			System.out.println("F학점");
		}
	}
}
