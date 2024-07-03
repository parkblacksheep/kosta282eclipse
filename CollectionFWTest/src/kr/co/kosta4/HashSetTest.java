package kr.co.kosta4;

import java.util.HashSet;
import java.util.Set;

public class HashSetTest {
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<>();
		set.add("Apple");
		set.add("Banana");
		set.add("Cherry");
		set.add("Apple");
		
		System.out.println(set.size());
		for(String element: set) {
			System.out.println(element);
		}
		System.out.println();
		set.remove("Banana"); // 자료구조 안에 있다면 제거
		
		for(String element: set) {
			System.out.println(element);
		}System.out.println();
		
		boolean contains = set.contains("Cherry");	//set 자료구조에 체리가 포함되나요? contains의 값이 boolean type
		System.out.println("Set contains Cherry? "+contains);
		
		set.clear(); //set 내부를 비워줄게요 clear 메소드
		boolean empty= set.isEmpty(); //set 자료구조가 비어있나요? isEmpty의 값이 boolean type
		System.out.println("Set is empty? "+empty);
		
	}
	
}
