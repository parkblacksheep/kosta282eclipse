package kr.co.kosta8;

import java.util.ArrayList;
import java.util.HashMap;

import kr.co.kosta3.Movie;


public class MemberHashMapTest {
	public static void main(String[] args) {
		MemberHashMap memberHashMap = new MemberHashMap();
		
		Member memberR = new Member(2024, "이순신");
		Member memberL = new Member(2025, "원균");
		Member memberW = new Member(2026, "나대용");
		Member memberS = new Member(2027, "류성룡");
		Member memberS2 = new Member(2027, "류성룡");
		
		memberHashMap.addMember(memberR);
		memberHashMap.addMember(memberL);
		memberHashMap.addMember(memberW);
		memberHashMap.addMember(memberS);
		memberHashMap.addMember(memberS2);
		memberHashMap.showAllMember();
		
		memberHashMap.removeMember(2025);
		memberHashMap.showAllMember();
		
		ArrayList<Movie> array = new ArrayList<>();
	}
}
