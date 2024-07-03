package kr.co.kosta11;

import java.util.ArrayList;

public class ArrayListTest2 {
	public static void main(String[] args) {
		
		ArrayList<Student> students = new ArrayList<Student>();
		
		students.add(new Student(1001, "홍길동"));
		students.add(new Student(1002, "신사임당"));
		students.add(new Student(1003, "이순신"));
		
		for(int i = 0 ; i<students.size();i++) {
			Student student= students.get(i);
			student.showInfo();
		}
		System.out.println();
		
	}
}
