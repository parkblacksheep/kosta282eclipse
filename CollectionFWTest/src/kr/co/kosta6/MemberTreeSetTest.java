package kr.co.kosta6;

import java.util.Iterator;

import kr.co.kosta5.Member;

public class MemberTreeSetTest {
	public static void main(String[] args) {
		MemberTreeSet memberTreeSet = new MemberTreeSet();
		
		Member memberR = new Member(2024, "이순신");
		Member memberL = new Member(2025, "원균");
		Member memberW = new Member(2026, "나대용");
		Member memberS = new Member(2027, "류성룡");
		
		memberTreeSet.addMember(memberR);
		memberTreeSet.addMember(memberL);
		memberTreeSet.addMember(memberW);
		memberTreeSet.addMember(memberS);
		
		memberTreeSet.showAllMember();
	
		System.out.println();
		
		memberTreeSet.removeMember(2024);
		memberTreeSet.showAllMember();
		
	}
}
