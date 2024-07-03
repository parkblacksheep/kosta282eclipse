package kr.co.kosta2;

public class SwitchCaseTest3 {
	public static void main(String[] args) {
		int month= 5;
		
		int day = switch (month) {
			case 1,3,5,7,8,10,12 ->{
				System.out.println("한 달은 31일 입니다.");
				yield 31;
			}
			case 4,6,9,11 ->{
				System.out.println("한 달은 30일 입니다.");
				yield 30;
			}
			case 2 ->{
				System.out.println("한 달은 28일 입니다.");
				yield 28;
			}
			default ->{
				System.out.println("존재 x");
				yield 0;
			}
		};
		System.out.println(month +"월은"+day+"일 입니다.");
	}
}
