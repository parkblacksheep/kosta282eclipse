package kr.co.kosta7;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapTest4 {
	public static void main(String[] args) {
		Map<String, Integer> map = new HashMap<>();
		
//		System.out.println("사이즈 : "+ map.size());
//		System.out.println();
		
		map.put("이순신", 95);
		map.put("정도전", 90);
		map.put("심사임당", 93);
		map.put("정도전", 94);
		map.put("이성계", 95);
		
//		System.out.println("사이즈: "+ map.size());
//		System.out.println("값: "+ map.get("정도전"));
//		System.out.println(map);
//		System.out.println();
		
		Set<Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String,Integer>> entryIterator = entrySet.iterator();
		while(entryIterator.hasNext()) {
			Map.Entry<String, Integer> entry = entryIterator.next();
			String key=entry.getKey();
			Integer value= entry.getValue();
			System.out.println(key+": "+value);
		}
		System.out.println();
		
		map.clear();
		System.out.println("사이즈: "+map.size());
		
		
	}
}
