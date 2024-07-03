package co.kr.kosta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class IntARrayStreamTest2 {
	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int sumValue = Arrays.stream(arr).sum();
		// Stream<E> stream() : 스트링 클래스를 반환함
		int count =(int) Arrays.stream(arr).count();
		System.out.println(sumValue);
		System.out.println(count);
		
		List<String> sList = new ArrayList<String>();
		sList.add("이순신");
		sList.add("나대용 구선 제직자");
		sList.add("권율");
		
		Stream<String> stream = sList.stream();
		stream.forEach(s-> System.out.println(s+"\t"));
		System.out.println();
		
		sList.stream().filter(s -> s.length() >=7).forEach(n->System.out.println(n+"\t"));
		
		
	}

}
