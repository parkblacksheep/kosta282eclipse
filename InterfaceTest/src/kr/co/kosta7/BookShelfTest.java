package kr.co.kosta7;

public class BookShelfTest {
	public static void main(String[] args) {
		Queue shelfQue = new BookShelf();
		//순서대로 요소를 추가
		shelfQue.enQueue("파우스트");
		shelfQue.enQueue("이상");
		shelfQue.enQueue("돈키호테");
		
		//입력 순서대로 요소를 꺼내서 출력
		System.out.println(shelfQue.deQueue());
		System.out.println(shelfQue.deQueue());
		System.out.println(shelfQue.deQueue());
	}
}
