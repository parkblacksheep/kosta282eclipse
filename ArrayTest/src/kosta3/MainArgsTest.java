package kosta3;

public class MainArgsTest {
	public static void main(String[] ar) {

		String a = ar[0];
		String b = ar[1];
		String c = ar[2];
		String d = ar[3];
		String e = ar[4];

		System.out.print(a + " " + b + " " + c + " " + d + " " + e);
		System.out.println();
		System.out.println(b + " " + 1);
		System.out.println(c + " " + 1);
		Integer.parseInt(b);
		System.out.println(Integer.parseInt(b) + 1);
		System.out.println("=========================");
		double f = Double.parseDouble(c);
		System.out.println(f + 1);

		String astring = String.valueOf(a);
		String bstring = String.valueOf(3.2);
		System.out.println(astring);
		System.out.println(bstring);

	}// main
}// class
