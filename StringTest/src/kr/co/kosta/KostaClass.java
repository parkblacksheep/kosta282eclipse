package kr.co.kosta;

public class KostaClass {
	public static void main(String[] args) {
		System.out.println("hello java!!");
		
		int a =1 ;
		Integer aInt = a;		//JAVA 1.5 이상 에서는 오토 박싱(Auto-boxing)이 있어서 문제가 없다.
		int b= a;
		
		//JAVA 1.5 미만에서는 수동 박싱, 언박싱 필요
		int c=2;
		Integer cInt=new Integer(c);
		int d= cInt.intValue();
		
		
		
		
	}

}
