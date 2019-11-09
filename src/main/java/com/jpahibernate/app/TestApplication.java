package com.jpahibernate.app;

import com.jpahibernate.dao.ServiceDao;
import com.jpahibernate.model.Places;

public class TestApplication {

	public static void main(String[] args) {
	
		Places places= new Places();
		places.setLocation("Ahmedabad");
		places.setPlaceid(102);
		places.setPlacename("Lal Darwaja");
		boolean flag= new ServiceDao().addPlace(places);
		System.out.println(flag);
		
		System.exit(0);
	}
}
