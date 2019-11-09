package com.jpahibernate.app;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.jpahibernate.model.Flight;

public class ParamQuery {

	public static void main(String[] args) {
		try{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter airline");
		String airline = sc.nextLine();
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em = emf.createEntityManager();
		Query query = em.createQuery("SELECT f from Flight f WHERE upper(f.airline)=:a");
		query.setParameter("a", airline.toUpperCase());
		Flight f = (Flight)query.getSingleResult();
		System.out.println(f);
		}catch(NoResultException e){
			System.out.println("No Flight Found");
		}
		catch(Exception e){
			System.out.println(e);
		}
		System.exit(0);

	}

}
