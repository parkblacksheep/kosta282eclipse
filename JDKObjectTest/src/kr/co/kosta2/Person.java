package kr.co.kosta2;

public class Person {
	public String name;
	public int age;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}//setter , getter
	
	
	public Person() {
//		super();
	}

	public Person(String name) {
//		super();
		this.name = name;
	}

	public Person(String name, int age) {
//		super();
		this.name = name;
		this.age = age;
	}//Constructor
	
	
}
