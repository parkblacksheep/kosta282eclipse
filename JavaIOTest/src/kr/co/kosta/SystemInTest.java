package kr.co.kosta;

import java.io.IOException;

public class SystemInTest {
	public static void main(String[] args) {
		System.out.println("알파벳을 여러 개를 쓰고 [Enter]누르세요.");
		
		int i;
		try {
			i=System.in.read();	//한 바이트 읽음
			System.out.println(i);
			System.out.println((char)i);
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}
}
