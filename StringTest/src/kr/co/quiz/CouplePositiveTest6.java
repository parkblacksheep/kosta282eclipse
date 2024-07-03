package kr.co.quiz;

import java.util.Iterator;
import java.util.Scanner;

/*
 2자리로 구성 입력된 양수를 출력하시오.
 예시) 입력된 양수중 2자리의 양수를 출력하세요
 	no값: 5
 	no값: 105
 	no값: 59
 	변수 no값은 59입니다. 
 	dowhile을 쓰시되 마지막 것만 출력
 
*/
public class CouplePositiveTest6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int i=0;
			do {
				System.out.println("2자리로 구성 입력된 양수를 출력하시오.");
				System.out.println("입력된 양수중 2자리의 양수를 출력하세요");
				 i=scanner.nextInt();
				if(99<i) {
					System.out.println("변수 no값은 3자리수 입니다.");
					
				}
				else if(i>9) {
					System.out.println("변수 no값은"+i+"입니다.");
				}else if(i>0) {
					System.out.println("변수 no값은 한자릿 수입니다.");
				}else if(i==0) {
					System.out.println("변수는 0입니다.");
				}else {
					System.out.println("변수는 음수입니다.");
				}				
			} while (!(i>9 & i<100));
			
			
		
		}// main
}// class
