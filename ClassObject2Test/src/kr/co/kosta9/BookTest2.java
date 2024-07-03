package kr.co.kosta9;

public class BookTest2 {
	public static void main(String[] args) {
		Book[] library = new Book[5];
		
		library[0]= new Book("청계산1","코스타");
		library[1]= new Book("청계산2","코스타");
		library[2]= new Book("청계산3","코스타");
		library[3]= new Book("청계산4","코스타");
		library[4]= new Book("청계산5","코스타");
		
		for(int i=0; i<library.length; i++) {
			System.out.println(library[i]);
			library[i].showInfo();
		}
	}
}
