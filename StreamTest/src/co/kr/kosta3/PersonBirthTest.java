package co.kr.kosta3;

public class PersonBirthTest {
	public static void main(String[] args) {
		//익명 내부 클래스
		Personbirth personbirth = new Personbirth() {
			
			@Override
			public Person born(String name, int age) {
				return new Person(name,age);
			}
		};
		Person person = personbirth.born("홍길동", 33);
		System.out.println(person);
		
		//람다 표현식 사용
		Personbirth personbirth2 = Person :: new ;
		Person person2 = personbirth2.born("신사임당", 33);
		System.out.println(person2);
	}
}
