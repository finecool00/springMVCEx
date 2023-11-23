package management.hcms.member.service;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import management.hcms.member.Member;

public class PrintMemberInformationService {

	TotalMemberSelectService totalMemberSelectService;
	
	public PrintMemberInformationService(TotalMemberSelectService totalMemberSelectService) {
		this.totalMemberSelectService = totalMemberSelectService;
	}
	
	
	public void printMemberInfo() {
		Map<String, Member> totalMember = totalMemberSelectService.TotalList();
		Set<String> keys = totalMember.keySet();
		Iterator<String> iterator = keys.iterator();
		
		System.out.println("-------------------- 회원 리스트 --------------------");
		
		while(iterator.hasNext()) {
			String key = iterator.next();
			Member member = totalMember.get(key);
			System.out.print("ID : " + member.getMemberId());
			System.out.print(" | PW : " + member.getMemberPw());
			System.out.print(" | 휴대전화 : " + member.getPhoneNumber());
			System.out.print(" | e-mail : " + member.getEmail());
			System.out.print(" | 등록일 : " + member.getRegDate());
			System.out.println(" | 정보수정일 : " + member.getEndModiDate());
		}
		
		System.out.println("--------------------------------------------------");
	}
	
}
