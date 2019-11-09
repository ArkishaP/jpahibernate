package com.jpahibernate.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jpahibernate.model.Person;
import com.jpahibernate.model.PersonDetail;

public class TestOneToOneMap {
	public static void main(String[] args) {
		Person person = new Person();
		person.setFirstName("Raja");
		person.setLastName("Singh");
		person.setEmail("rajarulez@gmail.com");
		
		PersonDetail personDetail = new PersonDetail();
		personDetail.setYoutubeChannel("RajaRulzzz");
		
		person.setPersonDetail(personDetail);
		personDetail.setPerson(person);
		try{
			EntityManagerFactory emf= Persistence.createEntityManagerFactory("pu");
			EntityManager em= emf.createEntityManager();
			em.getTransaction().begin();
			em.persist(person);
			em.persist(personDetail);
			em.getTransaction().commit();
			System.out.println("done");
		}catch(Exception e){
			System.out.println(e);
		}
		System.exit(0);
	}
}
