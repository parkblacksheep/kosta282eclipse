package kr.co.kosta5;

public class MemberHashSetTest {
	public static void main(String[] args) {
		MemberHashSet memberHashSet = new MemberHashSet();
		//MemberHashSet으로 HashSet 객체로 해서 생성 
		
		Member memberL = new Member(2024,"이순신");
		Member memberW = new Member(2025,"원균");
		Member memberR = new Member(2026,"나대용");
		Member memberS = new Member(2027,"류성룡");
		//Member 객체 4개 생성
		
		memberHashSet.addMember(memberL);
		memberHashSet.addMember(memberW);
		memberHashSet.addMember(memberR);
		memberHashSet.addMember(memberS);
		//memberHashSet이라는 객체로 된 HashSet에 4개의 객체 추가
		
		memberHashSet.showAllMembers();
		
		Member memberL2 = new Member(2027,"이도"); //2027 아이디 중복
		memberHashSet.addMember(memberL2); 
		//멤버 객체에서 equals로 key값이 같다면 참이기 때문에 true값이 반환되어,
		//hashCode에서 memberId를 그대로 반환하기 때문에 같다고 여겨져서 
		//hashCode에 따라 중복된 것은 올리지 않음
		memberHashSet.showAllMembers();
	}
}
