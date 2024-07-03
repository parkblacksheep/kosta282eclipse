package co.kr.kosta6;

import java.util.Arrays;
import java.util.function.BinaryOperator;

 class CompareString implements BinaryOperator<String>{

	@Override
	public String apply(String s1, String s2) {
		if(s1.getBytes().length >= s2.getBytes().length) return s1;
		else return s2;
	}

}

public class ReduceTest{
	public static void main(String[] args) {
		String[] kostaString = { " 벌써 6월 종종반이네요","여름이 시작됨" ,"로또 4등이라도"	};
		// 람다식으로 직접 구현
		System.out.println(Arrays.stream(kostaString)
							.reduce("", (s1,s2)->{
								if(s1.getBytes().length>=s2.getBytes().length)
									return s1;
								else return s2;
							})
				);
		String str = Arrays.stream(kostaString).reduce(new CompareString()).get();
		System.out.println(str);
	}
}