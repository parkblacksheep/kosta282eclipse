package kr.co.kosta3;

public class StringTest {
	public static void main(String[] args) {
		String str1 = new String("abc");
		String str2 = new String("abc");
		
//		System.out.println(str1);
//		System.out.println(str2);
		System.out.println();
		
		System.out.println(str1 == str2);
//		System.out.println("instance 매번 생성되므로 str1과 str2의 address 가 다름");
		System.out.println(str1.equals(str2));
//		System.out.println("문자열 값은 같으므로 true 반환");
		System.out.println();
		
		String str3 = "abc";
		String str4 = "abc";
		
		System.out.println(str3==str4);
//		System.out.println("문자열 abc는 상수 풀에 저장되어 있으므로 str3과 str4가 가리키는 주소 값이 같음");
		System.out.println(str3.equals(str4));
//		System.out.println("문자열 값도 같으므로 true 반환");
	}
}
