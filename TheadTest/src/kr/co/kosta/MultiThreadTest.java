package kr.co.kosta;

import java.util.ArrayList;
import java.util.List;

/*
taks1
: 20미만의 짝수(0,2,4,~~~)
	1000밀리세컨드(1초) 쉼

task2
:10미만의 수 출력( 9~1까지 출력)
500밀리세컨드(0.5초) 쉼
*/


public class MultiThreadTest {
	public static void main(String[] args) {
		Runnable task1 =()->{
			for(int i =0; i<20;i++) {
				if(i%2==0) {
					System.out.println(i);
					try {
						Thread.sleep(1000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		Runnable task2 =()->{
			for(int i=0; i<10;i++) {
				System.out.println(10-i);
				try {
					Thread.sleep(500);
				} catch (InterruptedException e2) {
					e2.printStackTrace();
				}
			}
		};
		
		
		Thread thread1 = new Thread(task1);
		Thread thread2 = new Thread(task2);
		
		thread1.start();
		thread2.start();
		System.out.println(Thread.currentThread().getName());
		
		
	}
}
