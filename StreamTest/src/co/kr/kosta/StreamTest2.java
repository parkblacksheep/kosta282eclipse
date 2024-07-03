package co.kr.kosta;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest2 {
	public static void main(String[] args) {
		Stream<String> strStream = Stream.of("올해도 곧 6월의 끝이", "다가 오고 있습니다.", "벌써 시간이 그렇게 되었네요.");
		List<String> str = strStream.collect(Collectors.toList());
		System.out.println(str);

		String[] cityArray = new String[] { "서울", "뉴욕", "파리" };
		Stream<String> cityStream = Arrays.stream(cityArray);
		List<String> cityList = cityStream.collect(Collectors.toList());
		System.out.println(cityList);

	}
}
