package kr.co.kosta7;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest2 {
	public static void main(String[] args) {
		Map<String, Integer> scores = new HashMap<>();
		scores.put("KIM", 95);
		scores.put("LEE", 85);
		scores.put("Park", 90);
		scores.put("Choi", 80);

		System.out.println("KIM의 점수" + scores.get("KIM"));
		System.out.println("LEE의 점수" + scores.get("LEE"));
		System.out.println("Park의 점수" + scores.get("Park"));
		System.out.println("Choi의 점수" + scores.get("Choi"));
		System.out.println();

		scores.put("Park", 92);
		System.out.println("Park의 점수" + scores.get("Park"));
		System.out.println();
		
		scores.remove("Choi");
		System.out.println("Choi의 점수" + scores.get("Choi"));
		System.out.println();
		
		for(Map.Entry<String, Integer> entry: scores.entrySet()) {
			System.out.println(entry.getKey()+ "의 점수: "+entry.getValue());
		}
	}
}
