package kr.co.kosta4;

public class PersonTest {
	public static void main(String[] args) {
		Person person = new Person("홍길동");
		person.name = "jongwon";
		person.height = 173.6f;
		person.weight = 78.6f;

		System.out.println("생성자 확인 하는 방법");
		System.out.println("이름:" + person.name);
		System.out.println("키:" + person.height);
		System.out.println("몸무게:" + person.weight);

		Person person2 = new Person();
		person2.name = "심사임당";
		System.out.println("홍길동의 어머니: " + person2.name);

		Person person3 = new Person("jongwon", 173, 85);
		System.out.println(person3.name);
		System.out.println(person3.height);
		System.out.println(person3.weight);
	}
}
