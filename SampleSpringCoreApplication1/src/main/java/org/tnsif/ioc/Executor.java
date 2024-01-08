package org.tnsif.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Executor {

	public static void main(String[] args) {
		//HelloWorld obj = new HelloWorld();
//ApplicationContext ac= ClassPathXmlApplicationContext("src/beans.xml");
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
		HelloWorld obj = ac.getBean(HelloWorld.class);
		obj.sayHello();
		System.out.println(obj);
		
		HelloWorld obj1 = ac.getBean(HelloWorld.class);
		System.out.println(obj1);
		
		Student stud1 = ac.getBean("one",Student.class);
		System.out.println(stud1);
		Student stud2 = ac.getBean("two",Student.class);
		System.out.println(stud2);

		Person pObj = ac.getBean("personOne", Person.class);
		System.out.println(pObj);

	}

	
}
