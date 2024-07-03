package kr.co.kosta11;

import java.util.ArrayList;

public class Student {
	
	private static int originalId = 1000;
	int studentId;
	String name;
	ArrayList<Subject> subjectList;
	// instance variable

	public int getStudentid() {
		return studentId;
	}

	public void setStudentid(int studentid) {
		this.studentId = studentid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	// setter, getter

	public Student() {
	}

	public Student(int studentid, String name) {
//		super();
		originalId++;
		studentid = originalId;
		
		subjectList = new ArrayList<Subject>();
		this.studentId = studentid;
		this.name = name;
	}
	// Constructor
	public void addSubject(String name, int score) {
		Subject subject =new Subject(); //과목 생성하기
		subject.setName(name);
		subject.setScorePoint(score);
		
		subjectList.add(subject);
	}// 학생이 수강하는 과목을 arrayList 배열(정확힌 Connection)에 하나씩 추가하는 메서드

	public void showInfo() {
		System.out.println(studentId + " " + name);
		int total = 0;
		int average=total;
		for(Subject subject : subjectList ) {
			total += subject.getScorePoint(); //총점 더하기
			System.out.println("학생 "+name+"의 "+ subject.getName()+" 성적은 "+subject.getScorePoint()+" 입니다.");
		}
		System.out.println("학생 "+name+"의 총점은 "+total+" 입니다."	);
		System.out.println("평균:"+average+" 입니다.");
		
	}
	// method
}// class







