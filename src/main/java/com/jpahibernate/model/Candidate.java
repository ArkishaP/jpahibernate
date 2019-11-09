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
public class Candidate {
	@Id
	private int canid;
	private String cname;
	@ManyToMany(cascade=CascadeType.ALL)
	private List<Laptop> laptops = new ArrayList<Laptop>();
	
	public Candidate() {
		super();
	}
	public int getCanid() {
		return canid;
	}
	public void setCanid(int canid) {
		this.canid = canid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public List<Laptop> getLaptops() {
		return laptops;
	}
	public void setLaptops(List<Laptop> laptops) {
		this.laptops = laptops;
	}
	@Override
	public String toString() {
		return "Candidate [canid=" + canid + ", cname=" + cname + "]";
	}
	
}
