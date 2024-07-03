package kr.co.quiz;

//import java.util.Iterator;
import java.util.Scanner;

/*
  +와 -를 번갈아 출력하시오.
 	ex) +와 -를 번갈아 n개 출력합니다.
 	n값: 12
 	+-+-+-+-+-+-

*/
public class SignAlternativeTest5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("+와 -를 번갈아 출력하시오.");
		System.out.println("n값을 입력해주세요:");
		System.out.println("n값:");
		int n = scanner.nextInt();
		int m=0;
		for(int i =1;i<=n;i++) {
			m=i%2;
//			System.out.print(m);
			if(m==1) {
				System.out.print("+");
			}else if(m==0) {
				System.out.print("-");
			}else {
				System.out.println("error");
			}
		}
	}// main
}// class
