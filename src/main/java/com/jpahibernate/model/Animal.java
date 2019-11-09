package com.jpahibernate.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Animal {
	@Id
//	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String name;
	private String species;
	public Animal() {
		super();
	}
	public Animal(int id, String name, String species) {
		super();
		this.id = id;
		this.name = name;
		this.species = species;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	@Override
	public String toString() {
		return "Animal [id=" + id + ", name=" + name + ", species=" + species + "]";
	}
	
	
}
