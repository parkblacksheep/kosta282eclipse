package kr.co.kosta2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExceptionFinallyTest {
	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("a1.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e);
//			e.printStackTrace();
			return;
		}finally {
			if(fis != null) {
				try {
					fis.close();			//파일 입력 스트림 닫기 
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			System.out.println("항상 수행됩니다.");
		}
		
		System.out.println("come here!");
	}
}
