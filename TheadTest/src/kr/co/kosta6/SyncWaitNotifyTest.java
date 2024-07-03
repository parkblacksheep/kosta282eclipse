package kr.co.kosta6;

import java.util.ArrayList;

class KostaBooks {
	public ArrayList<String> shelf = new ArrayList<>();

	public KostaBooks() {
		shelf.add("오리역1");
		shelf.add("오리역2");
		shelf.add("오리역3");
		shelf.add("오리역4");
		shelf.add("오리역5");
		shelf.add("오리역6");
	}

	public String lendBook() {
		String book = shelf.remove(0);
		System.out.println(Thread.currentThread().getName() + ": " + book + " 빌림");
		return book;
	}

	public void returnBook(String book) {
		shelf.add(book);
		System.out.println(Thread.currentThread().getName() + ": " + book + " 반납함");
	}
}

class Person extends Thread {
	public Person(String name) {
		super(name);
	}

	@Override
	public void run() {
		String title = SyncWaitNotifyTest.kobooks.lendBook();
		if (title == null)
			return;
		try {
			SyncWaitNotifyTest.kobooks.returnBook(title);
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}

public class SyncWaitNotifyTest {
	public static KostaBooks kobooks = new KostaBooks();

	public static void main(String[] args) {
		Person person1 = new Person("person1");
		person1.start();
		Person person2 = new Person("person2");
		person2.start();
		Person person3 = new Person("person3");
		person3.start();
		Person person4 = new Person("person4");
		person4.start();
		Person person5 = new Person("person5");
		person5.start();
		Person person6 = new Person("person6");
		person6.start();

	}
}
