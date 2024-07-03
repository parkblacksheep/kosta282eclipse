package kr.co.kosta2;

public class ForTest {
	public static void main(String[] args) {
		int i;
		int sum;
		int minus=0;
		int multi=0;
		int divide=0;
		for (i = 1, sum = 0; i <= 10; i++) {
			sum += i;
			multi*=i;
		}
		System.out.print("sum from 1 to 10"+sum);
		System.out.println("factiorial 10"+multi);
	}
}
