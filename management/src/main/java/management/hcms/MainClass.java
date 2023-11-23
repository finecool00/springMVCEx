package management.hcms;

import org.springframework.context.support.GenericXmlApplicationContext;

import management.hcms.member.Member;
import management.hcms.member.service.HCMSInformationService;
import management.hcms.member.service.MemberDeleteService;
import management.hcms.member.service.MemberModifyService;
import management.hcms.member.service.MemberRegisterService;
import management.hcms.member.service.MemberSelectService;
import management.hcms.member.service.PrintMemberInformationService;
import management.hcms.utils.InitSampleData;

public class MainClass {

	public static void main(String[] args) {
		
		
		//IoC 컨테이너 생성
		GenericXmlApplicationContext ctx = new GenericXmlApplicationContext("classpath:appCtxImport.xml");
		
		
		//샘플데이터 빈
		InitSampleData initSampleData = ctx.getBean("initSampleData", InitSampleData.class);
		
		String[] memberIds = initSampleData.getMemberIds();
		String[] memberPws = initSampleData.getMemberPws();
		String[] phoneNumbers = initSampleData.getPhoneNumbers();
		String[] emails = initSampleData.getEmails();
		String[] regDates = initSampleData.getRegDates();
		String[] endModiDates = initSampleData.getEndModiDates();
		
		//데이터베이스에 샘플 데이터 등록
		MemberRegisterService registerService = ctx.getBean("memberRegisterService", MemberRegisterService.class);
		
		for(int i = 0; i < memberIds.length; i++) {
			registerService.insert(new Member(memberIds[i], memberPws[i], phoneNumbers[i], emails[i], regDates[i], endModiDates[i]));
		}
		//전체 회원 리스트 출력
		PrintMemberInformationService printMemberInformationService = ctx.getBean("printMemberInformationService", PrintMemberInformationService.class);
		printMemberInformationService.printMemberInfo();
		
		
		//신규회원 등록
		registerService.insert(new Member("bluebeard99", "code999", "010-1717-3939", "ddd@aaa.com", "2023-11-23", null));
		printMemberInformationService.printMemberInfo();
		
		
		//회원정보 수정
		MemberModifyService modifyService = ctx.getBean("memberModifyService", MemberModifyService.class);
		modifyService.modify(new Member("bluebeard99", "code777", "010-1717-3939", "ddd@aaa.com", "2023-11-23", "2023-11-23 11:57"));
		printMemberInformationService.printMemberInfo();
		
		
		//회원정보 조회
		MemberSelectService selectService = ctx.getBean("memberSelectService", MemberSelectService.class);
		selectService.select("bluebeard99");
		
		
		//회원정보 삭제
		MemberDeleteService deleteService = ctx.getBean("memberDeleteService", MemberDeleteService.class);
		deleteService.delete("finecool00");
		printMemberInformationService.printMemberInfo();
		
		
		//시스템 정보
		HCMSInformationService hcmsInfo = ctx.getBean("hCMSInformationService", HCMSInformationService.class);
		hcmsInfo.printHCMSInformation();
	}
	
}
