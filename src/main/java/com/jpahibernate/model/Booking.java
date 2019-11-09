package com.jpahibernate.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="Booking")
@NamedQuery(name="bookingInfo", query="SELECT f.airline, b.name FROM Flight f, Booking b WHERE f=b.flight")
public class Booking {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int bookingid;
	@Column(name="pname")
	private String name;
	@Column(name="page")
	private int age;
	@Temporal(TemporalType.DATE)
	private Date bookingdate;
	@ManyToOne
	@JoinColumn(name="flightid")
	private Flight flight;
	
	@Override
	public String toString() {
		return "Booking [bookingid=" + bookingid + ", name=" + name + ", age=" + age + ", bookingdate=" + bookingdate
				+ "]";
	}
	public Booking() {
		super();
	}
	public Booking(int bookingid, String name, int age, Date bookingdate, Flight flight) {
		super();
		this.bookingid = bookingid;
		this.name = name;
		this.age = age;
		this.bookingdate = bookingdate;
		this.flight = flight;
	}
	public int getBookingid() {
		return bookingid;
	}
	public void setBookingid(int bookingid) {
		this.bookingid = bookingid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Date getBookingdate() {
		return bookingdate;
	}
	public void setBookingdate(Date bookingdate) {
		this.bookingdate = bookingdate;
	}
	public Flight getFlight() {
		return flight;
	}
	public void setFlight(Flight flight) {
		this.flight = flight;
	}
	
	
}
