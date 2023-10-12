package org.tnsif.jdbc.mvc;

public class Student {
	private int rollno;
	private String sname ;
	private float per;
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public float getPer() {
		return per;
	}
	public void setPer(float per) {
		this.per = per;
	}
	Student(int rollno, String sname, float per) {
		super();
		this.rollno = rollno;
		this.sname = sname;
		this.per = per;
	}
	Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", sname=" + sname + ", per=" + per + "]";
	}
	
}
