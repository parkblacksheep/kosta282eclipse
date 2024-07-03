package kr.co.kosta3;

import java.util.ArrayList;

public class MovieListTest {
	public static void main(String[] args) {
		ArrayList<Movie> list = new ArrayList<>();
		list.add(new Movie("인사이드 아웃2", "켈시 만", "2024", "미국"));
		list.add(new Movie("해리포터", "데이비드", "2010", "미국"));
		list.add(new Movie("반지의 제왕", "피터", "2003", "미국"));
		
		for(Movie m: list) {
			System.out.println(m);
		} // toString Overriding
		System.out.println();
		
		String searchTitle = "해리포터";
		for(Movie m: list) {
			if(m.getTitle().equals(searchTitle)) {
				System.out.println("제목: "+m.getTitle());
				System.out.println("감독: "+m.getDirector());
				System.out.println("개봉년도: "+m.getYear());
				System.out.println("국가: "+m.getCountry());
			}
		} // 영화이름으로 찾는 방법
		
	}
}
