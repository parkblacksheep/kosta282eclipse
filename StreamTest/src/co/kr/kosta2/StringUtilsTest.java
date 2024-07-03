package co.kr.kosta2;

public class StringUtilsTest {
	public static void main(String[] args) {
		StringUtils stringUtils = new StringUtils();
		// 인스턴스 메서드 참조 
		Converter<String, String> converter= stringUtils :: reverse;
		String result=converter.convert("반전");
		System.out.println("Result value"+result);
	}
}
