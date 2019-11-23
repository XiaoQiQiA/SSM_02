package com.wc.core.po;

import java.io.Serializable;

public class StudentGrade implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String name;
	private double grades;
	private double sixiang;
	private double keji;
	private double shenxin;
	private double zongfen;
	public StudentGrade() {
		super();
		// TODO Auto-generated constructor stub
	}
	public StudentGrade(Integer id, String name,double grades, double sixiang, double keji, double shenxin, double zongfen) {
		super();
		this.id = id;
		this.name = name;
		this.grades = grades;
		this.sixiang = sixiang;
		this.keji = keji;
		this.shenxin = shenxin;
		this.zongfen = zongfen;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getGrades() {
		return grades;
	}
	public void setGrades(double grades) {
		this.grades = grades;
	}
	public double getSixiang() {
		return sixiang;
	}
	public void setSixiang(double sixiang) {
		this.sixiang = sixiang;
	}
	public double getKeji() {
		return keji;
	}
	public void setKeji(double keji) {
		this.keji = keji;
	}
	public double getShenxin() {
		return shenxin;
	}
	public void setShenxin(double shenxin) {
		this.shenxin = shenxin;
	}
	public double getZongfen() {
		return zongfen;
	}
	public void setZongfen(double zongfen) {
		this.zongfen = zongfen;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	

}
