package kr.co.kosta;

import java.util.Scanner;

public class KostBankAccount {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		// 계좌를 개설할때는 개설자명, 초기입금액
		System.out.println("개설자명을 입력: ");
		String owner = scanner.nextLine();
		System.out.println("개설자는: " + owner + "입니다.");

		System.out.println("초기 입금액 입력: ");
		double input = scanner.nextDouble();
		System.out.println(input + "원 입력하셨습니다.");
		double total = 0 + input;
		double plus = 0;
		double minus = 0;
		boolean exit = false;
		while (!exit) {

			// 메뉴 출력
			System.out.println("메뉴를 선택하시오: 1.입금 2.출금 3.잔액 확인 4.종료");
			int choice = scanner.nextInt();

			if (choice == 1) {
				System.out.println("입금하고자 하는 금액을 적어주세요");
				plus = scanner.nextDouble();
				total = total + plus;
				System.out.println(total+"현재 금액");
				// 입금 처리
			} else if (choice == 2) {
				System.out.println("출금하고자 하는 금액을 적어주세요");
				minus = scanner.nextDouble();
				total = total - minus;
			} else if (choice == 3) {
				System.out.println("잔액을 확인합니다.");
				System.out.println("잔액은" + total + "원 입니다.");

			} else if (choice == 4) {
				exit = true;
				System.out.println("프로그램을 종료 합니다.");
			} else {
				System.out.println("다시 입력해 주세요");
			}

			switch (choice) {
			 case 1: {
				 System.out.println("돈을 넣어주세요");
				 plus=scanner.nextDouble();
				 total=total+plus;
				 System.out.println("잔액은" + total + "원 입니다.");
			 // 입금처리
			 }
			 case 2: {
				 System.out.println("출금하고자 하는 금액을 적어주세요");
				 minus = scanner.nextDouble();
				 total = total-minus;
				 System.out.println("잔액은" + total + "원 입니다.");
			 // 출금처리
			 }
			 case 3: {
				 System.out.println("잔액을 확인합니다.");
				 System.out.println("잔액은" + total + "원 입니다.");
			 // 잔액확인
			 }
			 case 4: {
				 exit = true;
				 System.out.println("프로그램을 종료합니다.");
				 // 종료
				 break;
			 }
			 default: {
			 System.out.println("다시 입력해 주세요");
			 break;
			 }
			}
		}
		scanner.close();
	}
}
