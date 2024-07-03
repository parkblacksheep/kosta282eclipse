package kr.co.kosta6;

import java.util.Iterator;
import java.util.TreeSet;
import kr.co.kosta5.Member;

public class MemberTreeSet {
	private TreeSet<Member> treeSet;
	
	public MemberTreeSet() {
		treeSet = new TreeSet<Member>();
	}
	
	public void addMember(Member member) {
		treeSet.add(member);
	}
	
	public Boolean removeMember(int memberId) {
		Iterator<Member> ir=treeSet.iterator();
		while(ir.hasNext()) {
			Member member=ir.next();
			int tempId = member.getMemberId();
			if(tempId==memberId) {
				treeSet.remove(member);
				return true;
			}
			return false;
		}
		System.out.println(memberId+" 가 존재하지 않습니다.");
		return false;
	}
	//showAllMember()
	public void showAllMember() {
		for(Member member: treeSet) {
			System.out.println(member);
		}
		System.out.println();
		
		System.out.println("객체 사이즈"+treeSet.size());
	}
}
