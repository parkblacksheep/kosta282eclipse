package kr.co.kosta3;

import java.util.Iterator;

public class BreakControllKeywordTest {
	public static void main(String[] args) {

		for (int i = 0; i < 10; i++) {
			System.out.println(i);
			break; // 반복문 탈출을 실행
		} // for

		System.out.println();

		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				break;
			} // if
			System.out.println(i);
		} // for

		System.out.println();

		// double for break exit
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (j == 3) {
					break;
				} // if j=3
				System.out.println(i + ", " + j);
			} // for j -> break exit
			// 레이블을 이용해 이중 for문 한 번에 탈출하기
		} // for i
		
		System.out.println();
		
		out:
		//Using lable exit double loop
			//lable position (break front of for(){})
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				if (j==3)
					break out; // out 레이블이 달린 반복문 탈출
				System.out.println(i+","+j);
			} //out for j
		}//out for i (break out)
	}// main
}// class
