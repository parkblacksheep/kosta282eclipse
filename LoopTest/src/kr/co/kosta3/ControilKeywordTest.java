package kr.co.kosta3;

public class ControilKeywordTest {
	public static void main(String[] args) {
		// 0,2,4,6,8,10
		for(int i=0; i<11;i++) {
			if(i%2!=0) {
				continue;
			}
			System.out.println(i);
		}

		for(int i=0; ;i++) {
			if(i%2==1) {continue;}
			if(i>10) {break;}
			System.out.println(i);
		}
		
	}
}
