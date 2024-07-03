package kr.co.kosta6;

class GenericMethod{
	public <T> T method(T t) {
		return t;
	}
	
	public <T> boolean method2(T t1, T t2) {
		return t1.equals(t2);
	}
	public <K,V> void method3(K k, V v) {
		System.out.println(k+":"+v);
	}
}
public class GenericMethodTest {
	public static void main(String[] args) {
		GenericMethod gm = new GenericMethod();
		String str1 =gm.<String>method("코스타 안녕");	// 제너릭 타입을 String으로 지정
		String str2 = gm.method("코스타 안녕2");	//입력 매개변수값으로 제네릭 타입 유추
		
		System.out.println(str1);
		System.out.println(str2);
		
		Boolean bool1 = gm.<Double>method2(2.5,2.5);
		
		Boolean bool2 = gm.method2(2.5,2.5);
		
		System.out.println(bool1);
		System.out.println(bool2);
	}
}
