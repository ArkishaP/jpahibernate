package com.jpahibernate.app;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jpahibernate.model.Animal;

public class StateLifecycle {
	public static void main(String[] args) {
		Animal animal = new Animal();
		animal.setId(1);
		animal.setName("Dog");
		animal.setSpecies("Mammal");
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
//		em.persist(animal);
//		animal.setName("Cat");
//		em.detach(animal);
//		animal.setName("Cow");
//		em.remove(animal);
		em.merge(animal);
		animal.setName("Lion");
//		em.merge(animal);
		em.getTransaction().commit();
		System.out.println("Done");
		System.exit(0);
		
	}
}
