package kr.co.review.Pack2;

import kr.co.review.Pack1.A;

public class C {
	A a =new A();
	public void print() {
		//멤버 활용 -클래스 A는 같은 패키지에 있으므로 public, protected,default 접근 지정자로
		//지정된 필드는 사용가능
		System.out.println(a.a+"");
		//다른 패키지 내의 클래스에서는 자식 클래스가 아닐때는 public 접근 지정자만 사용 가능
//		System.out.println(a.b+"");
//		System.out.println(a.c+"");
//		System.out.println(a.d+"");
	}
}
