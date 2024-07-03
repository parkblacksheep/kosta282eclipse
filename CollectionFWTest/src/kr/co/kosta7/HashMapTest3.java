package kr.co.kosta7;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest3 {
	public static void main(String[] args) {
		Map<Character, Integer> countMap = new HashMap<>();
		String str = "Hello, Kosta Summer Festival!";
		char[] array = str.toCharArray();
		
		for(char c : array) {
			if(countMap.containsKey(c)) {
				countMap.put(c, countMap.get(c)+1);
			}else {
				countMap.put(c, 1);
			}
		}
		System.out.println("각 Character 갯수");
		for(char c : countMap.keySet()) {
			System.out.println(c+ ": "+countMap.get(c));
		}
	}
}
