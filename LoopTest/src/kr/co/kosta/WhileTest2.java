package kr.co.kosta;

public class WhileTest2 {
	public static void main(String[] args) {
		// 1에서 50까지의 합
		int num = 1;
		int total = 0;
		
		
		while (num <=50) {
			total +=num;
			num++;
		}
		
		System.out.println("50 다음에 나오는 num값"+num);
		System.out.println("1에서 50까지의 합"+total);
		
		total=0;
		

	}
}
