package kr.co.kosta;

public class WhileTest {
	public static void main(String[] args) {
		// 1에서 10까지의 합
		int num = 1;
		int total = 0;
		int average = 0;
		
		while (num <=10) {
			total +=num;
			num++;
		}
		average=total/num;
		System.out.println(num);
		System.out.println(total);
		System.out.println(average);
	}
}
