package org.tnsif.JPAIntro.inheritance;
import javax.persistence.EntityManager;

import org.tnsif.JPAIntro.JPAUtil;
public class Executor {

	public static void main(String[] args) {
		EntityManager em= JPAUtil.getEntityManager();
		Person p=new Person();
		p.setPersonId(101);
		p.setName("Sakshi");
		em.getTransaction().begin();
		em.persist(p);
		em.getTransaction().commit();
		
		Employee e=new Employee();
		e.setPersonId(102);
		e.setName("Zashi");
		e.setSalary(70000);
		
		em.getTransaction().begin();
		em.persist(e);
		em.getTransaction().commit();
		
	}
}
