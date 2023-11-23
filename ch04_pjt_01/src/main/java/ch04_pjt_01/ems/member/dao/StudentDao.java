package ch04_pjt_01.ems.member.dao;

import java.util.HashMap;
import java.util.Map;

import ch04_pjt_01.ems.member.Student;

public class StudentDao {

	private Map<String, Student> studentDB = new HashMap<String, Student>(); //학생데이터를 담을 map 생성(key값은 sNum(학번), value값은 학생정보)
	
	//학생정보 등록
	public void insert(Student student) {
		studentDB.put(student.getsNum(), student);
	}
	
	//학생정보 조회
	public Student select(String sNum) {
		return studentDB.get(sNum);
	}
	
	//학생정보 수정
	public void update(Student student) {
		studentDB.put(student.getsNum(), student);
	}
	
	//학생정보 삭제
	public void delete(String sNum) {
		studentDB.remove(sNum);
	}
	
	//전체 학생정보
	public Map<String, Student> getStudentDB() {
		return studentDB;
	}
	
	
	
}
