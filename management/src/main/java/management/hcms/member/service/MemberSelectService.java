package management.hcms.member.service;

import management.hcms.member.Member;
import management.hcms.member.dao.MemberDao;

public class MemberSelectService {

	MemberDao memberDao;
	
	public MemberSelectService(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	
	public Member select(String memberId) {
		if(verify(memberId)) {
			return memberDao.select(memberId);
		} else {
			System.out.println("회원 정보 조회에 실패했습니다.");
		}
		return null;
	}
	
	
	//회원 정보 등록 유무 확인 메서드(정보 있으면 조회하도록!)
	public boolean verify(String memberId) {
		Member member = memberDao.select(memberId);
		return member != null ? true : false;
	}
	
}
