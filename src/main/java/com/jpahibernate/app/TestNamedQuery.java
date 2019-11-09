package com.jpahibernate.app;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jpahibernate.model.Flight;

public class TestNamedQuery {
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em = emf.createEntityManager();
		Query query1 = em.createNamedQuery("findFlights");
		List<Flight> list= query1.getResultList();
		System.out.println("Flight name: ");
		for(Flight f:list){
			System.out.println(f);
		}

		Query query2 = em.createNamedQuery("getFlights").setParameter("id", "F3");
		System.out.println(query2.getSingleResult());
		
		Query query3 = em.createNamedQuery("bookingInfo");
		List<Object[]> res3 = query3.getResultList();
		for(Object[] result: res3)
			System.out.println(result[0]+" "+result[1]);
		
		Query query4 = em.createQuery("select count(DISTINCT f.source), count(DISTINCT f.destination) from Flight f where f.airline='Spice Jet'");
		Object[] res4 = (Object[]) query4.getSingleResult();
		System.out.println("Source: "+res4[0]+"\nDestination: "+res4[1]);
		
		Query query5 = em.createQuery("SELECT f FROM Flight f ORDER BY f.airline DESC");
		List<Flight> flights1 = query5.getResultList();
		for(Flight f1: flights1){
			System.out.println(f1);
		}
		
		System.exit(0);
	}
}
