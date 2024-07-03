package kr.co.kosta2;

class Human{
	String name;
	int age;
	void eat() {}
	void sleep(){}
}
class Student extends Human{
	int studentId;
	void goToSchool() {}
}
class Worker extends Human{
	int workerId;
	void goToWork() {	}
}

public class InheritanceTest {
	public static void main(String[] args) {
		Human h= new Human();
		h.name = "홍길동";
		h.age=10;
		h.eat();
		h.sleep();
		
		Student s= new Student();
		s.name = "신사임당";
		s.age=15;
		s.studentId=1000;
		s.eat();
		s.sleep();
		
		Worker w= new Worker();
		w.name = "홍길동";
		w.age=10;
		w.eat();
		w.sleep();
	}
}
