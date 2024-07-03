package kr.co.kosta5;

public class GenericThreeDPrinter<T> {
	private T material; // T 자료형으로 선언한 변수

	//제너릭 메서드 
	public T getMaterial() {
		return material;
	}

	public void setMaterial(T material) {
		this.material = material;
	}
	
	
	
}
