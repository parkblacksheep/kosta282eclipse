package kr.co.kosta3;

class Apple {}
class Pencil {}

class Goods{
	//필드 타입의 모든 객체를 저장 할 수 있는 Object 로  정의
	private Object object = new Object();

	public Object getObject() {
		return object;
	}

	public void setObject(Object object) {
		this.object = object;
	}
	
}

public class NonGenericObjectTest {
	public static void main(String[] args) {
		//Goods 를 이용해서  Apple 객체를 추가하거나 가져오기
		Goods goods= new Goods();
		goods.setObject(new Apple());
		Apple apple = (Apple) goods.getObject();
		//Goods 를 이용해서  Apple 객체를 추가하거나 가져오기
		
		Goods goods2= new Goods();
		goods2.setObject(new Apple());
		Pencil pencil =  (Pencil)goods2.getObject();
		
		//Goods goods3 = new Goods();
		//
		Goods goods3= new Goods();
		goods3.setObject(new Apple());
		Pencil pencil2 =(Pencil) goods3.getObject();
		//
		
	}
}
