package co.kr.kosta4;

/*
함수형 인터페이스
	-단 하나의 추상 메서드를 가진 인터페이스 의미함
	-@FunctionalInterface 어노테이션을 사용하여 표시(선택사항) 
*/
@FunctionalInterface
public interface MathOperation {
	int operation(int x, int y);
}
