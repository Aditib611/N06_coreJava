package org.tnsif.JPAIntro;

import javax.persistence.EntityManager;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManager em = JPAUtil.getEntityManager();
		Product p1 = new Product();
		p1.setProductId(101);
		p1.setProductName("Pen");
		p1.setQuantity(4);
		p1.setRate(45);
		em.getTransaction().begin();
		em.persist(p1);
		em.getTransaction().commit();

	}

}
