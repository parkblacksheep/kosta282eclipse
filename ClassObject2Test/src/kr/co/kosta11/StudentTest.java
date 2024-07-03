package kr.co.kosta11;

public class StudentTest {
	public static void main(String[] args) {
		Student student = new Student(1001,"홍길동");
		student.addSubject("국어", 100);
		student.addSubject("수학", 89);
		
		Student student2 = new Student(1002,"신사임당");
		student2.addSubject("국어", 90);
		student2.addSubject("수학", 95);
		student2.addSubject("영어", 100);
		
		
		student.showInfo();
		System.out.println();
		student2.showInfo();
	}
}
