package kr.co.kosta7;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapTest {
	public static void main(String[] args) {
		Map<Integer, String> hMap = new HashMap<>();
		// put 메소드 
		hMap.put(2, "나다라");
		hMap.put(1, "가나다");
		hMap.put(3, "다라마");
		System.out.println(hMap.toString());
		System.out.println();
		
		Map<Integer, String> hMap2 = new HashMap<>();
		hMap2.putAll(hMap);
		System.out.println(hMap2.toString());
		System.out.println();
		
		//replace(k,v) : 데이터 변경
		hMap2.replace(1, "가가가");
		hMap2.replace(4, "가가가");
		System.out.println(hMap2.toString());
		System.out.println();
		
		hMap2.replace(1, "가가가","나나나");
		hMap2.replace(2, "다다다", "라라라"); // 동작하지 않음
		System.out.println(hMap2.toString());
		System.out.println();
		
		// get(Object key) : 데이터 정보 추출 
		System.out.println(hMap2.get(1));
		System.out.println(hMap2.get(2));
		System.out.println(hMap2.get(3));
		System.out.println();
		
		//containsKey(Object key) : 데이터 정보 추출 
		System.out.println(hMap2.containsKey(1));
		System.out.println(hMap2.containsKey(5));
		System.out.println();
		
		//containsValue(Object value) : 데이터 정보 추출
		System.out.println(hMap2.containsValue("나나나"));
		System.out.println(hMap2.containsValue("다다다"));
		System.out.println();
		
		//Set<K> KeySet()
		Set<Integer> keySets =  hMap2.keySet();
		System.out.println(keySets.toString());
		System.out.println();
		
		//Set<Map.Entry<K,V> entrySet()
		Set<Map.Entry<Integer, String>> entrySet = hMap2.entrySet();
		System.out.println(entrySet);
		System.out.println(hMap2.size());
		System.out.println();
		
		//V remove(Object key) : 데이터 삭제
		hMap2.remove(1);
		hMap2.remove(4);
		System.out.println(hMap2.toString());
		System.out.println();
		
		// boolean remove(Object key, Object value) : 데이터 삭제
		hMap2.remove(2,"나다라");
		hMap2.remove(3,"나다라"); // 동작하지 않음
		System.out.println(hMap2.toString());
		
		hMap2.clear();
		System.out.println(hMap2.toString());
		
	}
}
