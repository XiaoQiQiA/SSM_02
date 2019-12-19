package com.wc.core.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wc.core.po.Student;
import com.wc.core.po.StudentGrade;

public interface StudentDao {
	
	public Student findStudent(
			   @Param("id") Integer id
//			   @Param("password") String password
			);
	public List<Student> selectALLStudent(); 
	
	public int updateGrade(StudentGrade sg);
	
	public StudentGrade queryGrade(Integer id);

}
