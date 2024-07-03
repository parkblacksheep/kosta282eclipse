package kr.co.kosta;

//자연수를 순서대로 더해 한계가 처음으로 100보다 커지는  때의 숫자와 합게를 출력하시오.

public class WhileTest3 {
	public static void main(String[] args) {
		// 1에서 50까지의 합
		int num = 1;
		int total = 0;
		while (total<=100 ) {
			total +=num;
			num++;
		}
		num--;
		System.out.println("토탈이 처음으로 100보다 커질때의 수: "+num);
		System.out.println("처음으로 100보다 커지는  때 합: "+total);
	}
}
