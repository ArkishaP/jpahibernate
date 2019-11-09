package com.jpahibernate.app;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class JpqlDistinct {

	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("pu");
		EntityManager em= emf.createEntityManager();
		Query query= em.createQuery("SELECT DISTINCT f.source FROM Flight f");
		List<String> sources= query.getResultList();
		System.out.println("Sources: ");
		for(String s:sources){
			System.out.println(s);
		}
		System.out.println(sources.size());
	}
}
