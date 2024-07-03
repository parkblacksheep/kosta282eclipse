package kr.co.kosta5;

import java.util.ArrayList;
import java.util.List;

class Student{
	private String name;
	private int score;
	
	public Student(String name, int score) {
		super();
		this.name = name;
		this.score = score;
	}
	
	public String getName() {
		return name;
	}
	public int getScore() {
		return score;
	}
	
	
}
//사용자 정의 점수 예외 클래스 
class LowScoreException extends Exception{
	public LowScoreException(String message) {
		super(message);
	}
}

public class MyScoreExceptionTest {
	public static void main(String[] args) {
		List<Student> students = new ArrayList<>();
		students.add(new Student("홍길동",75));
		students.add(new Student("신사임당",89));
		students.add(new Student("이순신",58));
		
		try {
			for(Student student: students) {
				checkScore(student);
			}
		} catch (LowScoreException e) {
			System.out.println(e.getMessage());
//			e.printStackTrace();
		}
	}
	//점수가 60점 미만인 경우 예외를 발생시키는 메서드
	public static void checkScore(Student student) throws LowScoreException{
		System.out.println("점수 확인 중 -"+student.getName());
		if (student.getScore() <60) {
			throw new LowScoreException("Fail-"+student.getName()+": 점수가 낮음,"+student.getScore()+"\n");
		}
		System.out.println("Passed - "+student.getName()+":만족스러운 점수를 받음, "+student.getScore()+"\n");
	}
}
