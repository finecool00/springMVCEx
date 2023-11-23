package management.hcms.member.service;

import management.hcms.member.Member;
import management.hcms.member.dao.MemberDao;

public class MemberDeleteService {

	MemberDao memberDao;
	
	public MemberDeleteService(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	
	public void delete(String memberId) {
		if(verify(memberId)) {
			memberDao.delete(memberId);
			System.out.println("회원 정보가 삭제되었습니다.");
		} else {
			System.out.println("회원 정보 삭제에 실패했습니다.");
		}
	}
	
	
	//회원 정보 등록 유무 확인 메서드(정보가 있으면 삭제하도록!)
	public boolean verify(String memberId) {
		Member member = memberDao.select(memberId);
		return member != null ? true : false;
	}
	
}
