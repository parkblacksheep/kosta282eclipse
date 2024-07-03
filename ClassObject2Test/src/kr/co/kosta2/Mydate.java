package kr.co.kosta2;

import java.util.Calendar;

public class Mydate {
	private int day;
	private int month;
	private int year;
	private boolean isValid = true;

	// 생성자 추가 (int, int, int )
	// 유효한 날입니다.
	// 유효하지 않은 날입니다.
	// boolean 형 사용

	public int getDay() {
		return day;
	}

	public int getMonth() {
		return month;
	}

	public int getYear() {
		return year;
	}

	public void setDay(int day) {
//		if (month == 2) {
//			if (day < 1 || day > 28) {
//				System.out.println("오류입니다.");
//			} else {
//				this.day = day;
//			}
//		}	
		
		switch (month) { //31
			case 1, 3, 5, 7, 8, 10, 12: {
				if(day<1||day>31) {
					System.out.println("오류day입니다.");
					isValid=false;
				}else {
					this.day = day;					
				}
				break;
			}
			case 2: {//28
				if((year%4 == 0&& year%100 != 0)||year%400==0) {
					if (day < 1 || day >29) {
						System.out.println("오류day입니다.");
						isValid=false;
					} else {
						this.day = day;
						System.out.println("윤년이므로 29일 ㅇㅋ");
					}
				}else {
					if (day < 1 || day >28) {
						System.out.println("오류day입니다.");
						isValid=false;
					} else {
						this.day = day;
					}
					
				}
				break;
			}
			case 4, 6, 9, 11: { //30
				if(day<1 || day>30) {
					System.out.println("오류day입니다.");
					isValid=false;
				}else {
					this.day = day;					
				}
				break;
			}
			default:
				isValid=false;
		}//switch
	}// set day

	public void setMonth(int month) {
		if (month > 1 || month <= 12) {
			
			this.month = month;
		} else {
			isValid = false;
		}
		
	}

	public void setYear(int year) {
		int myYear = Calendar.getInstance().get(Calendar.YEAR);
		if(year > myYear) {
			isValid=false;
						
		}else {
			isValid=true;
			if((year%4 == 0&& year%100 != 0)||year%400==0) {
				
				System.out.println("윤년입니다.");
			}else {
				System.out.println("윤년 아니에용");
			}
			this.year = year;
		}
	}

	public Mydate() {};// default
	
	public Mydate(int day, int month, int year) {
		setYear(year);
		setMonth(month);
		setDay(day);
		
		this.day=day;
		this.month = month;
		this.year = year;
	}//myDate(int, int, int){}
	
	

	public String isValid() {
		if (isValid) {
			return "유효한 날짜입니다."; // false
		} else {
			return "유효하지 않은 날짜입니다."; // true
		}
	}// isValid

}//Mydate
