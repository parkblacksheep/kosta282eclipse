package co.kr.kosta2;

@FunctionalInterface
public interface Converter<F,T>{ // 매개변수 리턴타입
	T convert(F from);
	
}
