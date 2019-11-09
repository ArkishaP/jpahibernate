package com.jpahibernate.app;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jpahibernate.model.Booking;
import com.jpahibernate.model.Flight;

public class FlightJpql {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery("SELECT f from Flight f");
		List<Flight> flights = query.getResultList();
		for(Flight f : flights){
			System.out.println(f);
			for(Booking b: f.getBookinglist()){
				System.out.println("\t"+b);
			}
		}
		System.exit(0);
	}
}
