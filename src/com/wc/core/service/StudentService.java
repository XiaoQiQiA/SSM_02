package com.wc.core.service;

import java.util.List;

import com.wc.core.po.Student;
import com.wc.core.po.StudentGrade;

public interface StudentService {

	public Student findStudent(Integer id);
	
	public List<Student> selectAllStudent();
	
	public int updateGrade(StudentGrade sg);
	
	public StudentGrade queryGrade(Integer id);
}
