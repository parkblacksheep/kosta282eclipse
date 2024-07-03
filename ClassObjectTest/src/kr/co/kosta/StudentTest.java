package kr.co.kosta;

public class StudentTest {
	public static void main(String[] args) {
		Student student1 = new Student();
		Student student2 = new Student();
		student1.setStudentName("jongwon");
		
		System.out.println(student1.getphonNum());// -> private 일때 
		System.out.println(student1.getStudentName());
		
//		System.out.println(student1);
//		System.out.println(student2); 		//참조 변수 값 출력		
		
		student2.studentName = "홍홍홍";
		System.out.println(student2.getStudentName());
		
		System.out.println(student1.getStudentName()+" vs "+ student2.getStudentName());
	}
}
