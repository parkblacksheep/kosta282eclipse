package kr.co.kosta;

import java.util.ArrayList;

class Animal{
	public void move() {
		System.out.println("동물이 움직입니다.");
	}
	
	public void eating() {
		System.out.println("동물이 먹습니다.");
	}
}
class Dog extends Animal{
	
	@Override
	public void move() {
		System.out.println("강아지가 던진 물건을  물어옵니다.");
	}
	@Override
	public void eating() {
		System.out.println("강아지가 (알 수 없는..)고기사료를 먹습니다.");
	}
}
class Tiger extends Animal {
	@Override
	public void move() {
		System.out.println("호랑이가 탐색합니다.");
	}
	@Override
	public void eating() {
		System.out.println("호랑이가 사냥한 것을 먹습니다.");
	}
	public void hunting() {
		System.out.println("호랑이가 너를 사냥합니다.");
	}
}
class Eagle extends Animal{
	@Override
	public void move() {
		System.out.println("독수리가 하늘을 날아갑니다.");
	}
	
	@Override
	public void eating() {
		System.out.println("독수리가 밥을 먹습니다.");
	}
	
	public void flying() {
		System.out.println("독수리가 멀리 날아갑니다.");
	}
}



public class AnimalTest {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.eating();
		animal.move();
		System.out.println();
		
		Dog dog = new Dog();
		dog.move();
		dog.eating();
		System.out.println();
		
		Animal danimal=new Dog();
		danimal.move();
		danimal.eating();
		
		Animal animal2 = new Tiger();
		animal2.move();
		animal2.eating();
		ArrayList<Animal> arrayList=new ArrayList<Animal>();
		arrayList.add(animal);
		arrayList.add(animal2);
		arrayList.add(danimal);
		arrayList.add(dog);
		
		for(Animal animal3: arrayList) {
			animal3.move();
		}
	}
}
