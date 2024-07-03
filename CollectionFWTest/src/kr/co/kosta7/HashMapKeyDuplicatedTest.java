package kr.co.kosta7;

import java.util.HashMap;
import java.util.Objects;

//HashMap<K,V> 에서 Key의 중복시 확인 (논리적인 동등성) 

//어떤 것도 오버라이딩하지 않음
class A {
	int data;

	public A(int data) {
		this.data = data;
	}

}

// equals() 메소드만 오버라이딩 
class B {
	int data;

	public B(int data) {
		this.data = data;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof B) {
			this.data = ((B) obj).data;
			return true;
		}
		return false;
	}
}
//equals() + hashcode() 오버라이딩
class C{
	int data;
	public C(int data) {
		this.data=data;
	}
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof C) {
			this.data = ((C)obj).data;
			return true;
		}
		return false;
	}
	@Override
	public int hashCode() {
//		return this.data;
		return Objects.hash(data);
	}
}
public class HashMapKeyDuplicatedTest {
	public static void main(String[] args) {
		HashMap<A, String> hashMap = new HashMap<>();
		A a1 = new A(3);
		A a2 = new A(3);

		System.out.println(a1 == a2);
		System.out.println(a1.equals(a2));
		System.out.println(a1.hashCode() + "," + a2.hashCode());

		hashMap.put(a1, "첫 번째");
		hashMap.put(a2, "첫 번째");
		System.out.println(hashMap.size());
		System.out.println();

		HashMap<B, String> hashMap2 = new HashMap<>();
		B b1 = new B(3);
		B b2 = new B(3);
		
		System.out.println(b1 == b2);
		System.out.println(b1.equals(b2));
		System.out.println(b1.hashCode() + "," + b2.hashCode());
		hashMap2.put(b1, "첫 번째");
		hashMap2.put(b2, "두 번째");
		System.out.println(hashMap2.size());
		System.out.println();
		
		HashMap<C, String> hashMap3 = new HashMap<>();
		C c1 = new C(3);
		C c2 = new C(3);
		
		System.out.println(c1 == c2);
		System.out.println(c1.equals(c2));
		System.out.println(c1.hashCode() + "," + c2.hashCode());
		hashMap3.put(c1, "첫 번째");
		hashMap3.put(c1, "두 번째");
		System.out.println(hashMap3.size());
		System.out.println();
	}
}
