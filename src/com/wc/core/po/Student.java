package com.wc.core.po;

import java.io.Serializable;

public class Student implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String password;
	private String name;

	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(Integer id, String password, String name) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;

	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	

}
