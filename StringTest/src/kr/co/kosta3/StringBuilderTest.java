package kr.co.kosta3;

public class StringBuilderTest {
	public static void main(String[] args) {
		String str1= new String("java");
		System.out.println("str1의 문자열 주소 값: "+ System.identityHashCode(str1));
		
		//String으로부터 StringBuilder 객체 생성
		StringBuilder buffer = new StringBuilder(str1);
		
		System.out.println(buffer);
		System.out.println("buffer의 문자열 주소 값: "+ System.identityHashCode(buffer));
		
		//문자열 추가
		buffer.append(" and");
		buffer.append(" mysql");
		buffer.append(" , HTML5");
		
		System.out.println("buffer의 문자열 주소 값: "+ System.identityHashCode(buffer));
		
		str1 = buffer.toString();
		System.out.println(str1);
		System.out.println("str1의 문자열 주소 값: "+ System.identityHashCode(str1));
	}
}
