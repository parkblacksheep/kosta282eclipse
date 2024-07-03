package kr.co.kosta;

public class ArrayExceptiontest {
	public static void main(String[] args) {
		int[] arr = new int[5];
		
		try {//예외가 발생할 수 있으므로 try블록에 작성
			for(int i = 0; i<=5;i++) {
				arr[i]= i;
				System.out.println(arr[i]);
			}
		
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e);
			System.out.println("예외처리 부분 : 5252~ array의 인덱스값 초과라고~ ");
		}
		System.out.println("프로그램 종료");
	}

}
