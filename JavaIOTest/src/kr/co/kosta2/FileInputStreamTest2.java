package kr.co.kosta2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest2 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		
		try {
			fis = new FileInputStream("input.txt");	//input.txt 파일 입력 스트림 생성
			int i ;
			while((i=fis.read())!=-1) {
				System.out.println((char)i);
			}
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
			System.out.println((char)fis.read());
		} catch (FileNotFoundException e) {
			System.out.println(e);
//			e.printStackTrace();
		}catch (IOException e) {
			System.out.println(e);
		}
		System.out.println("");
		
	}
}
