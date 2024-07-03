package kr.co.kosta2;

/*
한달이 몇일인지 알려주는 프로그램
*/
public class SwitchCaseTest4 {
	public static void main(String[] args) {
		int month = 5;
		int year=2024;
		int n=1;
		int day;
		if(month>13) {
			year = year+(month/12);
			month = month%12;
			switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				day = 31;
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				day = 30;
				break;
			case 2:
				day = 28;
				if(n==4) {
					day=day+1;
					n=1;
				}
				break;
			default:
				day=0;
				System.out.println("존재하지 않는 달입니다.");
			}
			System.out.println(month +"월은"+day+"일 입니다.");
		}else {
			System.out.println("고장 난 거 같네요");
		}
		
	}
}
