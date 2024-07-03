package kr.co.kosta3;

public class AutoCloseTest {
	public static void main(String[] args) {
		try(MyAutoClose obj = new MyAutoClose()){
			throw new Exception();
		}catch(Exception e) {
			System.out.println("예외 부분입니다.");
		}
	}
}
