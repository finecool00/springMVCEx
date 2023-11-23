package management.hcms.member.service;

import management.hcms.member.Member;
import management.hcms.member.dao.MemberDao;

public class MemberRegisterService {

	MemberDao memberDao;
	
	public MemberRegisterService(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	
	public void insert(Member member) {
		if(verify(member.getMemberId())) {
			memberDao.insert(member);
			System.out.println("회원 등록을 완료했습니다.");
		} else {
			System.out.println("회원 정보 등록에 실패했습니다.");
		}
	}
	
	
	//회원 정보 등록 유무 확인 메서드(정보가 없으면 등록하도록!)
	public boolean verify(String memberId) {
		Member member = memberDao.select(memberId);
		return member == null ? true : false;
	}
	
}
