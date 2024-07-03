package kr.co.kosta3;

class A {

}

class B extends A {
}

class C extends B {
}

class D extends B {
}

public class PolymorphismTest {
	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		D d = new D();

		A a1 = new B();
		A a2 = new C();
		A a3 = new D();

		B b1 = new B();
		B b2 = new C();
		B b3 = new D();

//		C c1 = new B();
		C c2 = new C();
//		C c3 = new D();

	}
}
