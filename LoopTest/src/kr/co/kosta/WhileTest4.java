package kr.co.kosta;

//자연수를 순서대로 더해 한계가 처음으로 100보다 커지는  때의 숫자와 합게를 출력하시오.

public class WhileTest4 {
	public static void main(String[] args) {
		//while make infinity loop
//		while (true) {
//			System.out.println("loop");
//		}
		
		int temp = 0;
		int day =1;
//		while(temp==31) {
			while (true) {
				if(temp<4) {
					System.out.print(" ");	
				}else if(temp>5){
					System.out.println(temp);
					temp++;
				}else if(temp>31){
					
					break;
				}
				
			}
//		}
	}
}
