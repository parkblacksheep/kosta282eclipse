package kr.co.kosta;

public class DeskTopPC extends Computer{

	@Override
	public void display() {
		System.out.println("DeskTop dispay()");
	}

	@Override
	public void typing() {
		System.out.println("Desktop PC typing()");
		// TODO Auto-generated method stub
	}
	
	@Override
	public void turnOff() {
		System.out.println("DeskTopPc turn off");
	}

}
