package com.jpahibernate.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="flight")
public class Flight {

	@Id
	private String flightid;
	private String airline;
	private String source;
	private String destination;
	
	@OneToMany(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="flightid")
	private List<Booking> bookinglist = new ArrayList<Booking>();

	public Flight() {
		super();
	}

	public Flight(String flightid, String airline, String source, String destination, List<Booking> bookinglist) {
		super();
		this.flightid = flightid;
		this.airline = airline;
		this.source = source;
		this.destination = destination;
		this.bookinglist = bookinglist;
	}

	public String getFlightid() {
		return flightid;
	}

	public void setFlightid(String flightid) {
		this.flightid = flightid;
	}

	public String getAirline() {
		return airline;
	}

	public void setAirline(String airline) {
		this.airline = airline;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public List<Booking> getBookinglist() {
		return bookinglist;
	}

	public void setBookinglist(List<Booking> bookinglist) {
		this.bookinglist = bookinglist;
	}

	
}
