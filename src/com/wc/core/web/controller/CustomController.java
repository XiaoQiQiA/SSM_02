package com.wc.core.web.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.commons.lang3.StringUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.wc.core.po.Student;
import com.wc.core.po.StudentGrade;
import com.wc.core.service.StudentService;

@Controller
public class CustomController {

	@Autowired
	public StudentService studentservice;
	
	@RequestMapping(value = "/customer/list.action")
	public String studentList(Model model) {
		
		List<Student> list = studentservice.selectAllStudent();
		
		model.addAttribute("list", list);
		return "customer";
		
	}
	
	@RequestMapping(value = "/customer/updateGrade.action")
	@ResponseBody
	public String updateGrade(HttpServletRequest request) {
		System.out.println("start");
        Integer id = NumberUtils.toInt(StringUtils.trimToEmpty(request.getParameter("id")));
        
        double sixiang = NumberUtils.toDouble(StringUtils.trimToEmpty(request.getParameter("sixiang")));
        
        double keji = NumberUtils.toDouble(StringUtils.trimToEmpty(request.getParameter("keji")));
        
        double shenxin = NumberUtils.toDouble(StringUtils.trimToEmpty(request.getParameter("shenxin")));
		
        StudentGrade studentgrade = new StudentGrade();
        if(studentservice.queryGrade(id).getKeji()!=0) {
        	double sixiang1 = (studentservice.queryGrade(id).getSixiang()+sixiang)/2;
        	double keji1 = (studentservice.queryGrade(id).getKeji()+keji)/2;
        	double shenxin1 = (studentservice.queryGrade(id).getShenxin()+shenxin)/2;
        	studentgrade.setId(id);
            studentgrade.setSixiang(sixiang1);
            studentgrade.setKeji(keji1);
            studentgrade.setShenxin(shenxin1);
        }else {
            studentgrade.setId(id);
            studentgrade.setSixiang(sixiang);
            studentgrade.setKeji(keji);
            studentgrade.setShenxin(shenxin);
        }
        System.out.println("init success!");
        if(studentservice.updateGrade(studentgrade)==1) {
        	 return "success";
        }
             return "fail";
       
	}
}
