package kr.co.kosta;

public class Student {
	// 이름 나이, 성별 -> 멤버 변수
	int StudentID; // (멤버 변수)
	String studentName; // (멤버 변수)
	int grade; // (멤버 변수)
	String address; // (멤버 변수)
	private int phoneNum;
	// 학생이름을 반환하는 메서드 -- 가져오는 (get) 기능
	public String getStudentName() {

		return studentName;
	}

	// 학생이름을 매개변수로 전달
	public void setStudentName(String name) {
		studentName = name;
	}
	
	public int  getphonNum() {
		return phoneNum;
	}
}
