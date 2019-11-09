package com.jpahibernate.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jpahibernate.model.Candidate;
import com.jpahibernate.model.Laptop;

public class ManyToManyTest {
	public static void main(String[] args) {
		
		Candidate c1 = new Candidate();
		c1.setCanid(1);
		c1.setCname("Raja");
		Candidate c2 = new Candidate();
		c2.setCanid(2);
		c2.setCname("Rani");
		
		Laptop l1 = new Laptop();
		l1.setVendor("HP");
		l1.setModelno(1);
		l1.setPrice(24000);
		Laptop l2 = new Laptop();
		l2.setVendor("Dell");
		l2.setModelno(2);
		l2.setPrice(01000);
		
		c1.getLaptops().add(l1);
		c2.getLaptops().add(l1);
		c2.getLaptops().add(l2);
//		l1.getCandidates().add(c1);
//		l1.getCandidates().add(c2);
//		l2.getCandidates().add(c2);
		try{
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
			EntityManager em = emf.createEntityManager();
			em.getTransaction().begin();
			em.persist(c1);
			em.persist(c2);
//			em.persist(l1);
//			em.persist(l2);
			em.getTransaction().commit();
			System.out.println("Done");
		}catch(Exception e){
			System.out.println(e);
		}finally{
		System.exit(0);
		}

	}
}
