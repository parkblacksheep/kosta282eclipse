package co.kr.kosta;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArrayStreamTest {
	public static void main(String[] args) {
		// 정수 5개를 요소로 가진 배열, 이를 모두 출력
		int[] arr = {1,2,3,4,5};
		for (int a: arr)
				System.out.print(a + "\t");
		System.out.println();
		
		//이 배열에 대한 스트림을 생성하여 출력
		Arrays.stream(arr).forEach(n-> System.out.print(n+"\t"));
		// ------------  -------------------------------
		//Stream Create    요소를 하나씩 꺼내어 출력하는 기능 (forEach() 메서드 : 최종연산) 
		System.out.println();
		
		IntStream is =  Arrays.stream(arr);
		is.forEach(n-> System.out.print(n+"\t"));
		
		Arrays.stream(arr);
		
	}
}
