package kr.co.kosta2;

class Apple {
}

class Goods1 {
	private Apple apple = new Apple();

	public Apple getApple() {
		return apple;
	}

	public void setApple(Apple apple) {
		this.apple = apple;
	}

}

class Pencil {
}

class Goods2 {
	private Pencil pencil = new Pencil();

	public Pencil getPencil() {
		return pencil;
	}

	public void setPencil(Pencil pencil) {
		this.pencil = pencil;
	}

}

public class NonGenericTest {
	public static void main(String[] args) {
		// Goods1을 이용해 Apple 객체를 추가하거나 가져오기
		Goods1 goods1 = new Goods1();
		goods1.setApple(new Apple());	// Apple 타입만 입력 가능
		Apple apple = goods1.getApple(); //Apple 타입 리턴

		// Goods2을 이용해 Pencil 객체를 추가하거나 가져오기
		Goods2 goods2 = new Goods2();
		goods2.setPencil(new Pencil()); // Pencil 타입만 입력 가능
		Pencil pencil = goods2.getPencil();	//Pencil 타입 리턴 

	}
}
