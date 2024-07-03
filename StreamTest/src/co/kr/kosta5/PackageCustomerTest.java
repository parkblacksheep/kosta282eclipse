package co.kr.kosta5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PackageCustomerTest {
	public static void main(String[] args) {
		// 고객 생성
		packageCustomer customeHong = new packageCustomer("홍길동", 40, 100);
		packageCustomer customerLee = new packageCustomer("이순신", 20, 100);
		packageCustomer customerShin = new packageCustomer("신사임당", 13, 50);

		// ArrayList에 고객 추가
		List<packageCustomer> list = new ArrayList<>();
		list.add(customeHong);
		list.add(customerLee);
		list.add(customerShin);

		System.out.println("------------------------고객 명단----------");
		list.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));

		int sum = list.stream().mapToInt(d -> d.getPrice()).sum();
		System.out.println("총 여행 비용은" + sum + "입니다.");

		System.out.println("20세 이상 고객 명단 정렬하여 출력하기");
		list.stream().mapToInt(age -> age.getAge())
		.filter(s -> s >= 20).sorted().forEach(s -> System.out.print(" 나이: \t "+s));
		System.out.println();
		
		Scanner scanner = new Scanner(System.in);
		String search = scanner.nextLine();
		
		list.stream().filter(s-> s.getName() =="홍길동").forEach(s->System.out.println(s.getName()));

	}
}
