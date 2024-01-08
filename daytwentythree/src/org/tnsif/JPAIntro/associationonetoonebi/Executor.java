package org.tnsif.JPAIntro.associationonetoonebi;
import javax.persistence.EntityManager;

import org.tnsif.JPAIntro.JPAUtil;
public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager em = JPAUtil.getEntityManager();
		Address addressObj = new Address(); 
		addressObj.setAddressId(101);
		addressObj.setCity("Nashik");
		addressObj.setState("Maharshtra");
		
		Address addressObjOne = new Address(); 
		addressObjOne.setAddressId(201);
		addressObjOne.setCity("Jaipur");
		addressObjOne.setState("Rajashthan");
		
		Address addressObjTwo = new Address(); 
		addressObjTwo.setAddressId(301);
		addressObjTwo.setCity("Surat");
		addressObjTwo.setState("Gujarat");
		
		Student studObj = new Student();
		studObj.setStudentId(1);
		studObj.setName("Niti");
		studObj.setAddress(addressObj);
		
		Student studObjOne = new Student();
		studObjOne.setStudentId(2);
		studObjOne.setName("Mayra");
		studObjOne.setAddress(addressObjOne);
		
		Student studObjTwo = new Student();
		studObjTwo.setStudentId(3);
		studObjTwo.setName("Kirti");
		studObjTwo.setAddress(addressObjTwo);
		
		/*em.getTransaction().begin();
		//em.persist(addressObj);
		//em.persist(studObj);
		
		em.persist(addressObjOne);
		em.persist(studObjOne);
		
		em.persist(addressObjTwo);
		em.persist(studObjTwo);
		em.getTransaction().commit();*/
		
	
		/*Address addr = em.find(Address.class, 201);
		System.out.println(addr);
		addr.setCity("Mumbai");
		em.getTransaction().begin();
		em.merge(addr);
		em.getTransaction().commit();*/
		
		/*Student stud = em.find(Student.class, 2);
		System.out.println(stud);
		stud.setName("Meera");
		em.getTransaction().begin();
		
		em.merge(stud);
		em.getTransaction().commit();*/

	}

}
