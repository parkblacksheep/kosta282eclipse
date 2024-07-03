package co.kr.kosta3;

public class StiringConcatTest2 {
	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "Kosta";
		StringConcat concat2 = (s, v) -> System.out.println(s + "," + v);
		concat2.makeString(s1, s2);
		
		StringConcat stringConcat2 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1 + "," + s2);
			}
		};
		
		stringConcat2.makeString(s1, s2);
	}
}
