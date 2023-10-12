package org.tnsif.jdbc.mvc;

import java.sql.SQLException;
import java.util.List;

public class Executor {
	public static void main(String args[]) throws SQLException {
		StudentServiceImpl service;
		int n;
		Student st;
		List<Student> studList;
		try {
			service = new StudentServiceImpl();
			//studList = service.getAllStudents();
			//System.out.println(studList);
			
			System.out.println("-----------------GET ALL STUDENTS--------------------------");
			/* st = new Student(1, "Neha", 87);
			service.addStudent(st);
			service.addStudent(new Student(2, "Reehan", 47));
			service.addStudent(new Student(3, "Aira", 63));
			service.addStudent(new Student(4, "Sahil", 47));
			service.addStudent(new Student(5, "Kunal", 47));
			service.addStudent(new Student(6, "Aisha", 47));
			service.addStudent(new Student(7, "Niti", 47));*/
			
			studList = service.getAllStudents();
			System.out.println(studList);
			
			System.out.println("----------------STUDENTS WITH 75 AND MORE PERCENTAGE-------------------------");
			studList = service.getStudentsByPer(75);
			System.out.println(studList);
			
			System.out.println("-------------STUDENTS NAMES STARTING WITH A-----------------------");
			studList = service.getStudentsNameStartsWith("a%");
			System.out.println(studList);
			
			/*System.out.println("---------------ALL STUDENTS DELETED---------------------");
			n = service.deleteAllStudents();
			System.out.println(n>0? n+ "record(s) deleted..." : "No students Available");*/
			
					
			/*System.out.println("---------------DELETED RECORD OF SPECIFIC ROLLNO-----------------------");
			n=service.deleteByRollNo(6);
			System.out.println(n>0? n+ "record(s) deleted..." : "No students Available");*/
			
		   /* System.out.println("-------------SPECIFIC STUDENTS UPDATED-------------------------");
			n = service.updateStudentPer(5);
			System.out.println(n>0? n+ "record(s) updated..." : "No students Available");*/
			
			System.out.println("-------------SPECIFIC STUDENTS UPDATED-------------------------");
			n = service.updateStudentPerByRollNo(2,75);
			System.out.println(n>0? n+ "record(s) updated..." : "No students Available");
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
