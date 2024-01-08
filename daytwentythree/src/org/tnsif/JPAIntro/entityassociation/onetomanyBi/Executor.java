package org.tnsif.JPAIntro.entityassociation.onetomanyBi;

import java.util.HashSet;


import javax.persistence.EntityManager;

import org.tnsif.JPAIntro.JPAUtil;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager em =JPAUtil.getEntityManager();
		Department deptObjOne = new Department();
		deptObjOne.setId(101);
		deptObjOne.setName("Account");		
		
		Department deptObjTwo = new Department();
		deptObjTwo.setId(102);
		deptObjTwo.setName("Sales");		
		
		Department deptObjThree = new Department();
		deptObjOne.setId(103);
		deptObjOne.setName("IT");	
		
		Employee empObjOne = new Employee();
		empObjOne.setId(1);
		empObjOne.setName("Jeevan");
		empObjOne.setDepartment(deptObjOne);
		
		Employee empObjTwo= new Employee();
		empObjTwo.setId(2);
		empObjTwo.setName("Akash");
		empObjTwo.setDepartment(deptObjTwo);
		
		Employee empObjThree = new Employee();
		empObjThree.setId(3);
		empObjThree.setName("Monali");
		empObjThree.setDepartment(deptObjTwo);
		
		Employee empObjFour = new Employee();
		empObjFour.setId(4);
		empObjFour.setName("Pratik");
		empObjFour.setDepartment(deptObjThree);
		
		HashSet<Employee> empSet = new HashSet<Employee>();
		empSet.add(empObjOne);
		deptObjOne.setEmployees(empSet);
		
		empSet.clear();
		empSet.add(empObjTwo);
		empSet.add(empObjThree);
		deptObjTwo.setEmployees(empSet);
		
		empSet.clear();
		empSet.add(empObjFour);
		deptObjTwo.setEmployees(empSet);
		
	}

}
