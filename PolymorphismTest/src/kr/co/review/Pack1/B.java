package kr.co.review.Pack1;

public class B {
	//다른 클래스의 인스턴스 멤버를 사용하기 위해 객체 생성
	A a =new A();
	
	public void print() {
		//멤버 활용 -클래스 A는 같은 패키지에 있으므로 public, protected,default 접근 지정자로
		//지정된 필드는 사용가능
		System.out.println(a.a+"");
		System.out.println(a.b+"");
		System.out.println(a.c+"");
//		System.out.println(a.d+"");
	}
}
