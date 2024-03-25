package com.springcore2;

import java.util.*;

public class Emp {
	private String name;
	private List<String> phno;
	private Set<String> add;
	private Map<String,String> course;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhno() {
		return phno;
	}
	public void setPhno(List<String> phno) {
		this.phno = phno;
	}
	public Set<String> getAdd() {
		return add;
	}
	public void setAdd(Set<String> add) {
		this.add = add;
	}
	public Map<String, String> getCourse() {
		return course;
	}
	public void setCourse(Map<String, String> course) {
		this.course = course;
	}
	public Emp(String name, List<String> phno, Set<String> add, Map<String, String> course) {
		super();
		this.name = name;
		this.phno = phno;
		this.add = add;
		this.course = course;
	}
	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
