package co.kr.kosta;

import java.util.ArrayList;
import java.util.List;

public class ArrayListStreamTest {
	public static void main(String[] args) {
		List<Integer> list =new ArrayList<>();
		
		list.add(1); list.add(2); list.add(3); list.add(4); list.add(5);

		int sum = list.stream().mapToInt(n ->n.intValue()).sum();
		System.out.println(sum);
		
	}
}
