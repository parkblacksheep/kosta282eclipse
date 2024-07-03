package kr.co.kosta3;

public class PersonTest {
	public static void main(String[] args) {
		Person person = new Person();
		person.age=30;
		person.name="홍길동";
		person.graduation=true;
		person.house =2;
		String graduation;
		if(person.graduation) {
			graduation="합격";
		}else {
			graduation="떨어졌어요.";
		}
		person.print();
		System.out.println("나이: "+ person.age);
		System.out.println("이름: "+ person.name);
		System.out.println("졸업 여부: "+ graduation);
		System.out.println("집의 수: "+ person.house);
		
	}
}
