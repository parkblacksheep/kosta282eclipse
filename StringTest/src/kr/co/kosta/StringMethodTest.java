package kr.co.kosta;

import java.lang.reflect.Array;
import java.util.Arrays;

public class StringMethodTest {
	public static void main(String[] args) {

		String str1 = "Hello Java!";
		String str2 = "안녕하세요! 반갑습니다.";

		System.out.println("st1의 참조 변수의 길이: " + str1.length());
		System.out.println("st2의 참조 변수의 길이: " + str2.length());
		// 한글, 영문 구분없이 한 문자당 1개의 크기를 가짐.
		// -> byte 기준이 아닌 -> 배열처럼 한 칸을 가졌다고 보면 됨
		System.out.println();

		// 문자열 검색
		System.out.println("문자열로 나타내기");
		System.out.println(str1.charAt(0));
		System.out.println(str2.charAt(0));
		System.out.println();
		System.out.println("for문으로 나타내기");
		for (int i = 0; i < str1.length(); i++) {
			System.out.print(str1.charAt(i));
		}
		System.out.println();
		for (int i = 0; i < str2.length(); i++) {
			System.out.print(str2.charAt(i));
		}
		System.out.println();
		System.out.println();

		System.out.print("str1의 글 중 앞에서부터 첫번째 a의 위치: ");
		System.out.println(str1.indexOf('a'));
		System.out.print("str1의 글 중 뒤에서부터 첫번째 a의 위치: ");
		System.out.println(str1.lastIndexOf('a'));
		System.out.print("str1의 글 중 앞에서 8번째 자리에서 뒤로 첫번째a의 위치: ");
		System.out.println(str1.indexOf('a', 8));
		System.out.print("str1의 글 중 앞에서 8번째 자리에서 앞으로 첫번째a의 위치: ");
		System.out.println(str1.lastIndexOf('a', 8));
		System.out.println(str1.indexOf("Java"));
		System.out.println(str1.lastIndexOf("Java"));
		System.out.println(str1.indexOf("하세요"));
		System.out.println(str1.lastIndexOf("하세요"));
		System.out.print("없는 HTML을 넣었을 때: ");
		System.out.println(str1.indexOf("HTML"));

		// 문자열 변환
		String str3 = String.valueOf(2.3);
		String str4 = String.valueOf(false);
		System.out.println(str3);
		System.out.println(str4);

		// 문자열 연결
		String str5 = str3.concat(str4);
		System.out.println(str5);
		byte[] array1 = str1.getBytes();
		byte[] array2 = str2.getBytes();

		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));

		char[] array3 = str1.toCharArray();
		char[] array4 = str2.toCharArray();
		
		System.out.println(Arrays.toString(array3));
		System.out.println(Arrays.toString(array4));

	}// class
}// main
