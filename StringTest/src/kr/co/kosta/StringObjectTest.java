package kr.co.kosta;

import java.util.Arrays;

public class StringObjectTest {
	public static void main(String[] args) {
		// String 객체 생성
		String str1 = new String("Kosta"); // new 키워드와 생성자를 이용
		System.out.println(str1);

		String str2 = "안녕하세요";
		System.out.println(str2);

		String str3 = str2;
		System.out.println(str3);

		String str4 = str3;
		System.out.println(str4);

		String str5 = new String("안녕"); // 100번지
		String str6 = "안녕"; //200번지
		String str7 = "안녕"; //200번지 
		String str8 = new String("안녕"); //300번지
		String[] str= {str6,str7};
		
		//스택 메모리값 비교(==)
		System.out.print("str5번과 6번의 스택 메모리 주소가 같은가?: "); System.out.println(str5 == str6);
		System.out.print("str6번과 7번의 스택 메모리 주소가 같은가?: "); System.out.println(str6 == str7);
		System.out.print("str7번과 8번의 스택 메모리 주소가 같은가?: "); System.out.println(str7 == str8);
		System.out.print("str5번과 8번의 스택 메모리 주소가 같은가?: "); System.out.println(str5 == str8);
		
		
		System.out.println(Arrays.hashCode(str));
	}
}
