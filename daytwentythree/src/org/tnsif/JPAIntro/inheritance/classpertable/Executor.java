package org.tnsif.JPAIntro.inheritance.classpertable;
import javax.persistence.EntityManager;
import org.tnsif.JPAIntro.JPAUtil;
public class Executor {

	public static void main(String[] args) {
	EntityManager em=JPAUtil.getEntityManager();
		
		//add vehicle record
		Vehicle vObj=new Vehicle();
		vObj.setType("Four Wheeler");
		vObj.setModelNo(1230);
		vObj.setCompany("TATA");
		
		Vehicle vObjOne=new Vehicle();
		vObjOne.setType("Four Wheeler");
		vObjOne.setModelNo(888);
		vObjOne.setCompany("Mahindra");
		
		Car carObjOne=new Car();
		carObjOne.setModelNo(111);
		carObjOne.setCompany("Hondai");
		carObjOne.setFuelType("Petrol");
		carObjOne.setAverage(17.2f);
		carObjOne.setPrice(900000);
		carObjOne.setType("Four Wheeler");
		
		em.getTransaction().begin();
		em.persist(vObj);
		em.persist(vObjOne);
		em.persist(carObjOne);
		em.getTransaction().commit();


	}

}
