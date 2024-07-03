package kr.co.review;

import kr.co.review.Pack1.A;
import kr.co.review.Pack1.B;
import kr.co.review.Pack2.C;
import kr.co.review.Pack2.D;

public class AccessModifierTest {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();
		
		a.print();
		System.out.println();
		b.print();
		System.out.println();
		c.print();
		System.out.println();
		d.print();
		
	}
}
