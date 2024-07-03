package co.kr.kosta5;

public class StringOperationTest {
	public static void main(String[] args) {
		//람다식으로 모든 문자를 대문자로 변환하는 구현
		StringOperation toUpperCase = s-> s.toUpperCase();
		//람다식으로 모든 문자를 소문자로 변환하는 구현
		StringOperation toLowerCase = s-> s.toLowerCase();
		
		String input ="Hello Lambda Kosta";
		
		System.out.println("To Upper Case + "+processString(input, toUpperCase));
		System.out.println("To Lowwer Case + "+processString(input, toLowerCase));
		
	}
	public static String processString(String input, StringOperation operation) {
		return operation.apply(input);
	}
}
