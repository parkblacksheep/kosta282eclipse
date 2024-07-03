package kr.co.kosta4;

import java.io.FileNotFoundException;

public class ThrowsTest2 {
	public Class loadClass(String fileName, String className) throws
	// 두 예외를 메서드가 호출 될 때 처리하도록 미룸
	FileNotFoundException, ClassNotFoundException {
		FileNotFoundException fis = new FileNotFoundException(fileName);
		Class c = Class.forName(className); // ClassNotFoundException 발생 가능 
		return c;
	}

	public static void main(String[] args) {
		ThrowsTest2 test = new ThrowsTest2();
		try {
			test.loadClass("a1.txt", "java.lang.String");
			
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch(Exception e) {
			e.printStackTrace();	//위 예외처리 외의 예외 상황 처리 
		}
//		System.out.println("끝");
	}
}
