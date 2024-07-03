package kr.co.kosta2;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
Person 클래스의 Class 클래스를 가져와서 
getConstructors(), getMethods(), getFields()메서드를 
사용해 생성자, 메서드 , 멤버 변수(필드) 정보를 출력하시오.

*/
public class PersonTest2 {
	public static void main(String[] args) throws ClassNotFoundException {
		Class PersonClass = Class.forName("kr.co.kosta2.Person");
		Constructor[] cons = PersonClass.getConstructors();
		
		//생성자
		for(Constructor c: cons) {
			System.out.println(c);
		}
		System.out.println();
		
		Method[] methods=PersonClass.getMethods();
		
		// 메서드
		for(Method m: methods) {
			System.out.println(m);
		}System.out.println();
		
		//멤버 변수(필드) fields는 public만 보임
		Field[] fields = PersonClass.getFields();
		for(Field f: fields) {
			System.out.println(f);
		}System.out.println();
	}
}
