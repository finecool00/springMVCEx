package management.hcms.member.service;

import java.util.Map;

import management.hcms.member.Member;
import management.hcms.member.dao.MemberDao;

public class TotalMemberSelectService {

	MemberDao memberDao;
	
	public TotalMemberSelectService(MemberDao memberDao) {
		this.memberDao = memberDao;
	}
	
	public Map<String, Member> TotalList() {
		return memberDao.getMemberDB();
	}
	
}
