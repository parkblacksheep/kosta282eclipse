package kr.co.kosta2;

public class PersonTest {
	public static void main(String[] args) throws ClassNotFoundException {
		Person person = new Person();
		Class pClass = person.getClass();
		//Object 클래스의 getClass()
		System.out.println(pClass.getName());
		
		Class pClass2 =Person.class;
		//직접 class 파일 대입하기
		System.out.println(pClass2.getName());
		
		Class pClass3= Class.forName("kr.co.kosta2.Person");
		//클래스 이름으로 가져오기
		System.out.println(pClass3.getName());
		
	}
}
