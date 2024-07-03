package kr.co.kosta4;

/*
이순신과 신사임당은 각각 버스와 지하철을 타고 KOSTA 협회에 갑니다.
이순신은 5000원을 가지고 있었고, 8100번 버스를 타면서 3000원을 지불합니다.
신사임당은 10000원을 가지고 있었고, 신분당선 지하철을 타면서 2500원을 지불합니다.
*/
public class Student {
	String studentName;
	int grade;
	int money;
	// variable

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public int getGrade() {
		return grade;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	// setter, getter method

	public Student() {
	}

	public Student(String studentName, int money) {
//		super();
		this.studentName = studentName;
		this.money = money;
	}
	// Constructor

	public void takeBus(Bus bus) {
		bus.take(1700);
		this.money -= 1700;
	}
	
	public void takeSubway(Subway Subway) {
		Subway.take(2500);
		this.money-=2500;
	}
	
	public void taketaxi(Taxi taxi){
		taxi.take(15000);
		this.money-=15000;
	}
	
	public void showInfo() {
		System.out.println(studentName+"님의 남은 돈은"+money+"원 입니다.");
	}
	// method
}// class Student
