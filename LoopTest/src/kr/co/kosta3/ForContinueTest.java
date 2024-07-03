package kr.co.kosta3;

public class ForContinueTest {
	public static void main(String[] args) {
		//구구단을 짝수 단만 출력하는 프로그램을 작성
		int result=0;
		for(int i=1;i<10;i++) {
			for(int j=1;j<10;j++) {
				result=i*j;
//				System.out.println(i+"x"+j+"="+result);
				if(result%2!=0) {
//					System.out.println(i+"x"+j+"="+result);
					continue;
				}
				System.out.println(i+"x"+j+"="+result);
			}
//			
		}
	}
}
