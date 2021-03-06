package com.jpahibernate.app;

import java.util.Date;
import java.util.List;

import com.jpahibernate.dao.ServiceDao;
import com.jpahibernate.model.Booking;
import com.jpahibernate.model.Flight;

public class AssociationTest {
	public static void main(String[] args) {
		Flight flight1 = new Flight();
		flight1.setFlightid("F4");
		flight1.setAirline("Spice Jet");
		flight1.setSource("KOL");
		flight1.setDestination("DEL");
		
		Booking booking1 = new Booking();
		booking1.setName("Raju");
		booking1.setAge(23);
		booking1.setBookingdate(new Date());
		
		Booking booking2 = new Booking();
		booking2.setName("Rishi");
		booking2.setAge(20);
		booking2.setBookingdate(new Date());
		
		Booking booking3 = new Booking();
		booking3.setName("Anshu");
		booking3.setAge(35);
		booking3.setBookingdate(new Date());
		
		Booking booking4 = new Booking();
		booking4.setName("Ekta");
		booking4.setAge(27);
		booking4.setBookingdate(new Date());
		
		Booking booking5 = new Booking();
		booking5.setName("Adiba");
		booking5.setAge(37);
		booking5.setBookingdate(new Date());
		
//		flight1.getBookinglist().add(booking1);
//		flight1.getBookinglist().add(booking2);
//		flight1.getBookinglist().add(booking3);
//		flight1.getBookinglist().add(booking4);
//		flight1.getBookinglist().add(booking5);
		
		boolean flag= new ServiceDao().addFlight(flight1);
		System.out.println(flag);
//		Flight f1 = new Flight();
//		f1.setFlightid("F1");
//		Flight f = new ServiceDao().getFlight(f1);
//		if(f!=null){
//			System.out.printf("\n%-20s %-20s %-20s\n",f.getAirline(),f.getSource(),f.getDestination());
//			List<Booking> blist = f.getBookinglist();
//			for(Booking b:blist)
//				System.out.printf("\n%-20s%-20s %-20s",b.getAge(),b.getName(),b.getBookingdate());
//		}else{
//			System.out.println("Not found");
//		}
		
		System.exit(0);
	}
}
