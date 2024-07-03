package kr.co.kosta2;

import java.io.IOException;
import java.util.Scanner;

/*
전화 상담 할당 방식을 선택하세요
R : 한 명씩 차레로 할당한다.
L : 쉬고 있거나 대기가 가장 적은 상담원에게 할당
P : 우선 순위가 높은 고객에게 먼저 할당

L(입력받기)
상담 전화를 순서대로 대기열에서 가져옵니다
현재 상담 업무가 없거나 상담 대기가 가장 적은 상담원에게 할당합니다.

상담원 배분 정책 추가
getNextCall(): '상담원이 다음 전화 요청'
sendCallToAgent() : '상담원이 전화 상담을 가져갔습니다."


*/
public class SchedulerTest {
	public static void main(String[] args) throws IOException  {
		System.out.println("전화 상담 할당 방식을 선택하세요");
		System.out.println("R : 한 명씩 차레로 할당한다.");
		System.out.println("L : 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
		System.out.println("P : 우선 순위가 높은 고객에게 먼저 할당");
		System.out.println("A: 상담원의 요청에 따라 할당됩니다.");
		Scanner scanner = new Scanner(System.in);
		
		 int kosta=System.in.read(); 
		 
		// IOException 입출력 값쪽으로 입력적으로 에러가 날수 있다.
		//상담원 할당 방식을 입력 받아 kosta변수에 대입
		Scheduler scheduler = null;
		if(kosta == 'R'|| kosta=='r')
			scheduler = new RoundRobin();
		else if( kosta =='L'|| kosta == 'l')
			scheduler =new LeastJob();
		else if(kosta == 'P' || kosta == 'p')
			scheduler=new PriorityAllocation();
		else if(kosta=='A'|| kosta =='a')
			scheduler=new AgentGetCall();
		else{
			System.out.println("지원되지 않는 기능이다.");
			return;
		}
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
		
//		
//		String key = scanner.nextLine();
//		RoundRobin robin = new RoundRobin();
//		LeastJob job= new LeastJob();
//		PriorityAllocation allocation = new PriorityAllocation();
//		
//			switch (key) {
//			case "R": {
//				robin.getNextCall();
//				robin.sendCallToAgent();
//				break;
//			}
//			case "L": {
//				job.getNextCall();
//				job.sendCallToAgent();
//				break;
//			}
//			case "P": {
//				allocation.getNextCall();
//				allocation.sendCallToAgent();
//				break;
//			}
//			} //switch	
//			
		
		
		
	}//main
}//class
