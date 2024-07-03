package kr.co.kosta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListObjectTest {
	public static void main(String[] args) {
		//1 . List 구현 클래스의 생성자 이용해 객체 생성
		List<Integer> aList1 = new ArrayList<>(); 
		List<Integer> aList2 = new ArrayList<>(30);
		List<Integer> aList3 = new Vector<>();
		List<Integer> aList4 = new Vector<>(30);
		List<Integer> aList5 = new LinkedList<>();
		
		//2.Array클래스의 정적 메서드로 객체 생성
		List<Integer> aList6 = Arrays.asList(1,2,3,4);
		List<String> aList7 = Arrays.asList("안녕하세요, 커스트 ");
		
		aList6.set(1,7);
		aList7.set(0,"화요일");
		
		System.out.println(aList6);
		System.out.println(aList7);
	}
}
