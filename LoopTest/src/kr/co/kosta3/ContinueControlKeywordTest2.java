package kr.co.kosta3;

public class ContinueControlKeywordTest2 {
	public static void main(String[] args) {
		int total = 0;
		int num;
		for (num = 1; num <= 100; num++) {
			if (num % 2 == 0) {
				continue;
			}
			total += num;
		}
		System.out.println("1부터 100까지의 홀수의 합은" + total + "입니다.");
		
		System.out.println();
		//1~100까지 자연수 중 3의 배수만 출력하시오.
		
		for (num = 1; num <= 100; num++) {
			if (!(num % 3 == 0)) {
				continue;
			}
			System.out.println(num);
		}
	}
}
