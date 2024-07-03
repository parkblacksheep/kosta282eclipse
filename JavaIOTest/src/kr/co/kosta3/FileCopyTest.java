package kr.co.kosta3;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyTest {
	public static void main(String[] args) {
		long milisecond = 0;
		
		try(FileOutputStream fos = new FileOutputStream("copy.pdf");
				FileInputStream fis = new FileInputStream("spring.pdf");
				BufferedOutputStream bos = new BufferedOutputStream(fos);
				BufferedInputStream bis = new BufferedInputStream(fis);
																					) {
			milisecond = System.currentTimeMillis();	//파일 복사를 시작하기 전 시간
			int i;
			while((i=bis.read())!=-1) {
				bos.write(i);
			}
			milisecond = System.currentTimeMillis()-milisecond;	//파일 복사하는 데 걸린 시간
			
		} catch (IOException e) {
			System.out.println(e.getMessage());
		}
		System.out.println("파일 복사 시 걸린 시간: "+milisecond/1000+"초 입니다.");
	}
}
