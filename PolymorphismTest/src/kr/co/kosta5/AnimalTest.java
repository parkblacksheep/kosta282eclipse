package kr.co.kosta5;

import java.util.ArrayList;
import java.util.Collection;

class Animal {
	public void move() {
		System.out.println("동물이 움직입니다.");
	}

	public void eating() {
		System.out.println("동물이 먹습니다.");
	}
}

class Dog extends Animal {

	@Override
	public void move() {
		System.out.println("강아지가 던진 물건을  물어옵니다.");
	}

	@Override
	public void eating() {
		System.out.println("강아지가 (알 수 없는..)고기사료를 먹습니다.");
	}

	public void bark() {
		System.out.println("강아지가 짖습니다.");
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

class Eagle extends Animal {
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

class Cat extends Animal{
	@Override
	public void move() {
		System.out.println("고양이가 담장을 넘어갑니다.");
	}
	
	@Override
	public void eating() {
	
		System.out.println("고양이가 츄르를 핥아먹습니다.");
	}
	public void sleep() {
		System.out.println("고양이가 잠을 잘 잡니다.");
	}
}


public class AnimalTest {
	ArrayList<Animal> aniList = new ArrayList<>();

	public static void main(String[] args) {

		AnimalTest aTest = new AnimalTest();
		aTest.addAnimal();
		System.out.println();
		System.out.println("원래 형으로 다운 캐스팅 해보자===============");
		aTest.downCasting();
	}

	public void downCasting() {
		for (int i = 0; i < aniList.size(); i++) {
			Animal ani = aniList.get(i);
			if (ani instanceof Dog) {
				Dog d = (Dog) ani;
				d.bark();
			} else if (ani instanceof Tiger) {
				Tiger t = (Tiger) ani;
				t.hunting();
			} else if (ani instanceof Eagle) {
				Eagle e = (Eagle) ani;
				e.flying();
			} else {
				System.out.println("I dont know animal");
			}

		}
	}

	public void addAnimal() {
		
		aniList.add(new Dog());
		aniList.add(new Tiger());
		aniList.add(new Eagle());
		aniList.add(new Cat());

		for (Animal ani : aniList) {
			ani.move();
		}

	}

}
