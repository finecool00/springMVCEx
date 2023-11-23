package management.hcms.member;

import java.sql.Timestamp;
import java.time.LocalDate;

public class Member {

	String memberId;
	String memberPw;
	String phoneNumber;
	String email;
	String regDate;
	String endModiDate;
	
	
	//생성자
	public Member(String memberId, String memberPw, String phoneNumber, String email, String regDate,
			String endModiDate) {
		this.memberId = memberId;
		this.memberPw = memberPw;
		this.phoneNumber = phoneNumber;
		this.email = email;
		this.regDate = regDate;
		this.endModiDate = endModiDate;
	}


	//getter, setter
	public String getMemberId() {
		return memberId;
	}


	public void setMemberId(String memberId) {
		this.memberId = memberId;
	}


	public String getMemberPw() {
		return memberPw;
	}


	public void setMemberPw(String memberPw) {
		this.memberPw = memberPw;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getRegDate() {
		return regDate;
	}


	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}


	public String getEndModiDate() {
		return endModiDate;
	}


	public void setEndModiDate(String endModiDate) {
		this.endModiDate = endModiDate;
	}
	
}
