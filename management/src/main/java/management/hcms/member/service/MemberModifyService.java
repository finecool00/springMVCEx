package management.hcms.member.service;

import management.hcms.member.Member;
import management.hcms.member.dao.MemberDao;

public class MemberModifyService {

	MemberDao memberDao;
	
	public MemberModifyService(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	
	public void modify(Member member) {
		if(verify(member.getMemberId())) {
			memberDao.update(member);
			System.out.println("회원 정보가 수정되었습니다.");
		} else {
			System.out.println("회원 정보 수정에 실패했습니다.");
		}
	}
	
	
	//회원 정보 등록 유무 확인 메서드(정보가 있으면 수정하도록!)
	public boolean verify(String memberId) {
		Member member = memberDao.select(memberId);
		return member != null ? true : false;
	}
	
}
