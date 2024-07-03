package co.kr.kosta;

class A {
	public int a = 3;
	protected int b = 4;
	int c = 5;
	private int d = 6;

	public A() {
		super();
	}

	public A(int a, int b, int c, int d) {
		super();
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}

	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}

	public int getB() {
		return b;
	}

	public void setB(int b) {
		this.b = b;
	}

	public int getC() {
		return c;
	}

	public void setC(int c) {
		this.c = c;
	}

	public void setD(int d) {
		this.d = d;
	}

	void abc() {
		System.out.println("A 클래스 메서드 abc()");
	}

	// 인스턴스 이너 클래스
	class B {
		void bcd() {
			// 아웃 클래스의 모든 멤버를 접근 가능
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
			System.out.println(d);

			abc();
		}
	}
}

public class InstanceInnerClassTest {
	public static void main(String[] args) {
		//아웃터 클래스 객체 생성
		A a = new A();
		//이너 클래스 객체 생성 
		A.B b = a.new B();
		b.bcd();
	}
}










