package kr.co.kosta3;

public class StringTest2 {
	public static void main(String[] args) {
		String str1= new String("java");
		String str2 = new String (" mysql");
		
		System.out.println(str1.toString());
		System.out.println(str1);
		System.out.println();
		//-> toString값이 원본 값과 같다는 걸 의미
		System.out.println(str1.toString()==str1);
		//toString이 오버라이딩 된 거라서 주소값이 같다.
		
		System.out.println("str1의 문자열 주소 값: "+ System.identityHashCode(str1));
		
		str1= str1.concat(str2);
		
		System.out.println(str1);
		System.out.println("str1의 연결된 문자열 주소 값: "+ System.identityHashCode(str1));
		
		
	}
}
