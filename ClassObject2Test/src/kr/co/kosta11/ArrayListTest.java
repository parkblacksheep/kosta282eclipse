package kr.co.kosta11;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[] args) {
		ArrayList<Book> library=new ArrayList<Book>();
		
		library.add(new Book("금강산","오리남"));
		library.add(new Book("금강산2","오리남"));
		library.add(new Book("금강산3","오리남"));
		library.add(new Book("금강산4","오리남"));
		library.add(new Book("금강산5","오리남"));
		
		for(int i=0; i<library.size();i++) {
			Book book = library.get(i);
			book.showInfo();
		}
		System.out.println();
		
		for(Book book :library) {
			book.showInfo();
		}
	}
}
