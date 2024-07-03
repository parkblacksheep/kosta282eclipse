package co.kr.kosta2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MethodReferenceTest {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("홍길동","이순신","신사임당");
		// String 클래스의 메서드 참조
		Collections.sort(names, String :: compareTo);
		
		System.out.println(names);
		
		
	}
}
