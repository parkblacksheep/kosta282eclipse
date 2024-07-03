package kr.co.kosta3;

public class Person {
	String name;
	int age;

	public Person() {
		this("hong", 17);
		// super();
	}

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	public Person getPerson() {
		return this;
	}

	public static void main(String[] args) {
		Person person = new Person();
		System.out.println(person.name + "의 나이는" + person.age + "살 입니다.");

		person.name = "심사임당";
		person.age = 20;
		Person person2 = person.getPerson();
		System.out.println(person);
		System.out.println(person2);
	}
}
