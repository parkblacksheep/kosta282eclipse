package kr.co.kosta3;

public class ForBreakTest {
	public static void main(String[] args) {
		// 구구단을 단보다 곱하는 수가 작거나 같은 경우까지만 출력하는 프로그램을 작성하시오
		/*
		2x1 =2
		2x2=2
		*/
		
		for(int i=1; i<10; i++) {
			for(int j=1; j<10; j++) {
				if(i<j) {
					break;
				}//if j
				System.out.println(i+"X"+j+"="+i*j);
			}// foir j
		}//for i
	}
}
