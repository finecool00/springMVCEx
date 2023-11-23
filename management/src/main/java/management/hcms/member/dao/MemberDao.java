package management.hcms.member.dao;

import java.util.HashMap;
import java.util.Map;

import management.hcms.member.Member;

public class MemberDao {
	
	//회원정보를 담을 map 생성(key : 회원ID, value : Member클래스의 회원정보)
	private Map<String, Member> memberDB = new HashMap<>();
	
	//회원정보 조회
	public Member select(String memberId) {
		return memberDB.get(memberId);
	}
	
	//회원정보 등록
	public void insert(Member member) {
		memberDB.put(member.getMemberId(), member);
	}
	
	//회원정보 수정
	public void update(Member member) {
		memberDB.put(member.getMemberId(), member);
	}
	
	//회원정보 삭제
	public void delete(String memberId) {
		memberDB.remove(memberId);
	}
	
	//전체 회원정보
	public Map<String, Member> getMemberDB() {
		return memberDB;
	}
	
	
}
