package com.springcore1;

public class Student {
	private int studentid;
	private String stdname;
	private String stdAdd;
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
		System.out.println("call student");
	}
	public String getStdname() {
 
		return stdname;
	}
	public void setStdname(String stdname) {
		System.out.println("callname");

		this.stdname = stdname;
	}
	public String getStdAdd() {
 
		return stdAdd;
	}
	public void setStdAdd(String stdAdd) {
		System.out.println("callname");

		this.stdAdd = stdAdd;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int studentid, String stdname, String stdAdd) {
		super();
		this.studentid = studentid;
		this.stdname = stdname;
		this.stdAdd = stdAdd;
	}
	@Override
	public String toString() {
		return "Student [studentid=" + studentid + ", stdname=" + stdname + ", stdAdd=" + stdAdd + "]";
	}

}
