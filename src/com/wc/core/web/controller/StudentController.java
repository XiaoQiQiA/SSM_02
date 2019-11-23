package com.wc.core.web.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.wc.core.po.Student;
import com.wc.core.service.StudentService;

@Controller

public class StudentController {
	
	@Autowired
	private StudentService studentservice;
	
	@RequestMapping(value="/login.action",method=RequestMethod.POST)
	public String login(Integer id,String password,Model model,HttpSession session){
		
		Student student = studentservice.findStudent(id);
		if(student!=null) {
			
			if(student.getPassword().equals(password)) {
				session.setAttribute("STUDENT_SESSION", student);
				return "customer";
			}else {
				model.addAttribute("msg", "密码错误，请重新输入");
				return "login";
			}
		}
		model.addAttribute("msg","学号错误，查无此人");
		return "login";
	}
	
	@RequestMapping("/toCustomer.action")
	public String toCustomer() {
		return "customer";
		
	}
	
	@RequestMapping(value = "/logout.action")
	public String logout(HttpSession session) {
		session.invalidate();
		return "redirect:login.action";
	}
	
	@RequestMapping(value = "/logout.action", method = RequestMethod.GET)
	public String toLogin() {
		
		return "login";
	}
	

}
