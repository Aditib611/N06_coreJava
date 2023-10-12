package org.tnsif.collections;

public class Student implements Comparable<Student> {
	private int rollno;
	private String name;
	
	private float per;
	@Override
	
	
	public String toString() {
		return "Student [ rollno=" + rollno + ", name=" + name + ", per=" + per + "]";
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int rollno, String name, float per) {
		super();
		this.rollno = rollno;
		this.name = name;
		
		this.per = per;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public float getPer() {
		return per;
	}
	public void setPer(float per) {
		this.per = per;
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		//return name.compareTo(o.name);
		//return (int)(o.per-per); //desc
		//return (int)(per-o.per); //asc
		return (int)(rollno-o.rollno); //asc
		
	}
	
	
	
}
