package kr.co.kosta;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileNotFoundExceptionTest {
	public static void main(String[] args) {
		try {
			FileInputStream fileInputStream = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 종료");
	}
}
