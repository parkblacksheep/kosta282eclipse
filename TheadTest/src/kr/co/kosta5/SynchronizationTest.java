package kr.co.kosta5;

class Bank{
	private int money =10000;

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	//예금하다
	public void deposite(int save) {
		int m = this.getMoney();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		setMoney(m+save);
	}
	//출금하다
	public void withdraw(int minus){
		int m = this.getMoney();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		setMoney(m-minus);		
	}
}
class Lee extends Thread{
	@Override
	public void run() {
		System.out.println("입금 시작");
		SynchronizationTest.myBank.deposite(3000);
		System.out.println("3000원 입금: "+SynchronizationTest.myBank.getMoney()); // -> 입금 후의 잔액
	}
	
}
class Shin extends Thread{
	@Override
	public void run() {
		System.out.println("출금 시작");
		SynchronizationTest.myBank.withdraw(1000);
		System.out.println("1000원 출금: "+SynchronizationTest.myBank.getMoney()); // -> 입금 후의 잔액
	}
}

public class SynchronizationTest {
	public static Bank myBank = new Bank();
	
	public static void main(String[] args) {
		Lee threadLee = new Lee();
		threadLee.start();
		Shin threShin=new Shin();
		threShin.start();
		
		
		
	}
}








