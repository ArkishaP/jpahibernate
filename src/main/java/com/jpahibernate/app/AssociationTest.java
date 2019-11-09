package com.jpahibernate.app;

import java.util.Date;
import java.util.List;

import com.jpahibernate.dao.ServiceDao;
import com.jpahibernate.model.Booking;
import com.jpahibernate.model.Flight;

public class AssociationTest {
	public static void main(String[] args) {
//		Flight flight1 = new Flight();
//		flight1.setFlightid("F2");
//		flight1.setAirline("Air India");
//		flight1.setSource("MUM");
//		flight1.setDestination("AHM");
//		
//		Booking booking1 = new Booking();
//		booking1.setName("Raja");
//		booking1.setAge(21);
//		booking1.setBookingdate(new Date());
//		
//		Booking booking2 = new Booking();
//		booking2.setName("Rani");
//		booking2.setAge(22);
//		booking2.setBookingdate(new Date());
//		
//		flight1.getBookinglist().add(booking1);
//		flight1.getBookinglist().add(booking2);
		
//		boolean flag= new ServiceDao().addFlight(flight1);
//		System.out.println(flag);
		Flight f1 = new Flight();
		f1.setFlightid("F1");
		Flight f = new ServiceDao().getFlight(f1);
		if(f!=null){
			System.out.printf("\n%-20s %-20s %-20s\n",f.getAirline(),f.getSource(),f.getDestination());
			List<Booking> blist = f.getBookinglist();
			for(Booking b:blist)
				System.out.printf("\n%-20s%-20s %-20s",b.getAge(),b.getName(),b.getBookingdate());
		}else{
			System.out.println("Not found");
		}
		
		System.exit(0);
	}
}
