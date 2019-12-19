package com.wc.core.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.wc.core.dao.StudentDao;
import com.wc.core.po.Student;
import com.wc.core.po.StudentGrade;
import com.wc.core.service.StudentService;

@Service("studentService")
@Transactional
public class StduentServiceImpl implements StudentService{

	@Autowired
	private StudentDao studentdao;
	@Override
	public Student findStudent(Integer id) {
	
		Student student = this.studentdao.findStudent(id);
		return student;
	}
	@Override
	public List<Student> selectAllStudent() {
		// TODO Auto-generated method stub
		return studentdao.selectALLStudent();
	}
	@Override
	public int updateGrade(StudentGrade sg) {
		// TODO Auto-generated method stub
		return studentdao.updateGrade(sg);
	}
	@Override
	public StudentGrade queryGrade(Integer id) {
		// TODO Auto-generated method stub
		return studentdao.queryGrade(id);
	}

}
