package ch04_pjt_01.ems.member.service;

import ch04_pjt_01.ems.member.Student;
import ch04_pjt_01.ems.member.dao.StudentDao;

public class StudentRegisterService {

	private StudentDao studentDao;
	
	public StudentRegisterService(StudentDao studentDao) {
		this.studentDao = studentDao;
	}
	
	
	public void register(Student student) {
		if(verify(student.getsNum())) {
			studentDao.insert(student);
		} else {
			System.out.println("The student has already registered.");
		}
	}
	
	
	
	
	//학번으로 학생정보 조회하여 정보 등록여부 판단하는 메서드
	public boolean verify(String sNum) {
		
		Student student = studentDao.select(sNum);
		
		return student == null ? true : false;
	}
	
	
	
}
