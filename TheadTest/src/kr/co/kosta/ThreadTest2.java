package kr.co.kosta;

class MyThread2 implements Runnable{
	
	public MyThread2() {
		super();
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread()+"start!");
		int i;
		for (i=0; i<200; i++) {
			System.out.print(i + "\t");
		}
		System.out.println(Thread.currentThread()+"end!");
	}
	
}

public class ThreadTest2 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread()+"start!");
		
		MyThread2 runnable = new MyThread2();
		Thread thread =new Thread(runnable);
		thread.start();
		
		Thread thread2 = new Thread(new MyThread2());
		thread2.start();
		
		Runnable annonymousThread =new Runnable() {
			
			@Override
			public void run() {
				System.out.println("annonymoust Thread");
			}
		};
		
		annonymousThread.run();
		
		System.out.println(Thread.currentThread()+"end!");
	}
}
