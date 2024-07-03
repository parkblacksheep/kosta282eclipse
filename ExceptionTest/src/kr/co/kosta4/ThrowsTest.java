package kr.co.kosta4;

import java.io.FileNotFoundException;

public class ThrowsTest {
	public Class loadClass(String fileName, String className) throws
	// 두 예외를 메서드가 호출 될 때 처리하도록 미룸
	FileNotFoundException, ClassNotFoundException {
		FileNotFoundException fis = new FileNotFoundException(fileName);
		Class c = Class.forName(className); // ClassNotFoundException 발생 가능 
		return c;
	}

	public static void main(String[] args) {
		ThrowsTest test = new ThrowsTest();
		try {
			test.loadClass("a1.txt", "java.lang.String"); //메서드를 호출 할 때 예외 처리함
		} catch (FileNotFoundException | ClassNotFoundException e) {
			System.out.println(e);
//			e.printStackTrace();
		}
		System.out.println("끝");
	}
}
