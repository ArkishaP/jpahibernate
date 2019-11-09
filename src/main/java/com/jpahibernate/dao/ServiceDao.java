package com.jpahibernate.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jpahibernate.model.Flight;
import com.jpahibernate.model.Places;

public class ServiceDao {

	public boolean addPlace(Places place){
		boolean flag = false;
		try{
		//code for jpa
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("pu");
		EntityManager em= emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(place);
		em.getTransaction().commit();
		flag = true;
		}catch(Exception e){
			System.out.println(e);
		}
		return flag;
	}
	
	public Places getPlace(Places place){
		Places p = null;
		try{
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
			EntityManager em = emf.createEntityManager();
			p = (Places)em.find(Places.class, place.getPlaceid());
		}catch(Exception e){
			System.out.println(e);
		}
		return p;
	}

	public boolean addFlight(Flight flight){
		boolean flag= false;
		try{
			EntityManagerFactory emf= Persistence.createEntityManagerFactory("pu");
			EntityManager em= emf.createEntityManager();
			em.getTransaction().begin();
			em.persist(flight);
			em.getTransaction().commit();
			flag=true;
		}catch(Exception e){
			System.out.println(e);
		}
		return flag;
	}
	public Flight getFlight(Flight flight){
		Flight f = null;
		try{
			EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
			EntityManager em = emf.createEntityManager();
			f = em.find(Flight.class, flight.getFlightid());
		}catch(Exception e){
			System.out.println(e);
		}
		return f;
	}
	
}

