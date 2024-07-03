package kr.co.kosta2;

public class MydateTest {
	public static void main(String[] args) {
		Mydate date = new Mydate();

//		date.setMonth(5); 
//		date.setDay(28);
//		date.setYear(2024);
		
//		System.out.println(date.getYear());
//		System.out.println(date.getMonth());
//		System.out.println(date.getDay());
		
		Mydate mydate= new Mydate(32,5,2004);
		System.out.println(mydate.isValid());
		System.out.println();
		Mydate mydate1= new Mydate(29,2,2024);
		System.out.println(mydate1.isValid());
	}
}
