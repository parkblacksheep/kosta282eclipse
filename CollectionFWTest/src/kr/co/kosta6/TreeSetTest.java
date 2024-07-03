package kr.co.kosta6;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetTest {
	public static void main(String[] args) {
		TreeSet<String> tree = new TreeSet<>();
		tree.add("이순신");
		tree.add("류성룡");
		tree.add("신사임당");
		tree.add("최문선");
		tree.add("신사임당");
		
		System.out.println("객체 수: "+tree.size());
		System.out.println();
		//Iterator 반복자에 의해 출력하기
		//1
		Iterator<String> ir = tree.iterator();
		for(int i=0; i<tree.size();i++) {
			String str = ir.next();
			System.out.println(str);
		}
		System.out.println();
		//2
		for(String str2: tree) {
			System.out.print(str2+" ");
		}
		System.out.println();
		System.out.println();
		
		//3
		for(Iterator<String> itr = tree.iterator(); itr.hasNext(); )
			System.out.print(itr.next().toString()+"\t");
		System.out.println();
	}
}
