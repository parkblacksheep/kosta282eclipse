package kr.co.kosta6.solve2;

import java.util.ArrayList;

class KostaBooks {
	public ArrayList<String> shelf = new ArrayList<>();

	public KostaBooks() {
		shelf.add("오리역1");
		shelf.add("오리역2");
		shelf.add("오리역3");
	}

	public synchronized String lendBook() throws InterruptedException {
		if (shelf.size() == 0) {
			System.out.println(Thread.currentThread().getName() + "wating start");
			wait();
			System.out.println(Thread.currentThread().getName() + "wating end");
		}
		if (shelf.size() > 0) {
			String book = shelf.remove(0);
			System.out.println(Thread.currentThread().getName() + ": " + book + " 빌림");
			return book;
		} else
			return null;

	}

	public synchronized void returnBook(String book) {
		shelf.add(book);
		notifyAll();
		System.out.println(Thread.currentThread().getName() + ": " + book + " 반납함");
	}
}

class Person extends Thread {
	public Person(String name) {
		super(name);
	}

	@Override
	public void run() {
		try {
			String title = SyncWaitNotifyTest.kobooks.lendBook();
			if (title == null) {
				System.out.println(getName() + "빌리지 못했음");
				return;
			}
			try {
				SyncWaitNotifyTest.kobooks.returnBook(title);
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}
}

public class SyncWaitNotifyTest {
	public static KostaBooks kobooks = new KostaBooks();

	public static void main(String[] args) {
		Person person1 = new Person("person1");
		Person person2 = new Person("person2");
		Person person3 = new Person("person3");
		Person person4 = new Person("person4");
		Person person5 = new Person("person5");
		Person person6 = new Person("person6");

		person1.start();
		person2.start();
		person3.start();
		person4.start();
		person5.start();
		person6.start();

	}
}
