package co.kr.kosta4;

import java.util.Arrays;
import java.util.List;

class Product{
	private String name;
	private int quantity;
	
	public Product(String name, int quantity) {
		super();
		this.name = name;
		this.quantity = quantity;
	}

	public int getQuantity() {
		return quantity;
	}
}

public class StreamTest {
	//Product 클래스의 인스턴스를 생성
	public static void main(String[] args) {
		List<Product> products = Arrays.asList(
											new Product("iPad Pro M4", 2), 
											new Product("Magic keyboard", 3), 
											new Product("apple pencil", 3));
		//mapToInt를 사용하여 각 Product의 수량을 int로 매핑하고 총합 계산
		int totalQuantity = products
				.stream()
				.mapToInt(Product:: getQuantity)
				.sum();
		System.out.println("전체 총합:"+totalQuantity);
	}
	
}
