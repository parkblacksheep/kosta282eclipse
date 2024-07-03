package kr.co.kosta;

import java.util.List;

public class ArrayListTest {
	public static void main(String[] args) {
		String[] array = new String[] {"가", " 나", " 다", " 라 ","마","사"};
		System.out.println(array.length);
		array[2]= null;
		array[5]= null;
		
		System.out.println(array.length);
		System.out.println();
		
//		List<String> aList = new ArrayList<>();
//		System.out.println();
//		aList.add("가"); aList.add("나");
//		
		
	}
}