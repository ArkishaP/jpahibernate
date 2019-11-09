package com.jpahibernate.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Laptop {
	@Id
	private int modelno;
	private String vendor;
	private int price;
	@ManyToMany(mappedBy="laptops")
	private List<Candidate> candidates = new ArrayList<Candidate>();
	
	public Laptop() {
		super();
	}
	public int getModelno() {
		return modelno;
	}
	public void setModelno(int modelno) {
		this.modelno = modelno;
	}
	public String getVendor() {
		return vendor;
	}
	public void setVendor(String vendor) {
		this.vendor = vendor;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public List<Candidate> getCandidates() {
		return candidates;
	}
	public void setCandidates(List<Candidate> candidates) {
		this.candidates = candidates;
	}
	@Override
	public String toString() {
		return "Laptop [modelno=" + modelno + ", vendor=" + vendor + ", price=" + price + ", candidates=" + candidates
				+ "]";
	}
	
}
