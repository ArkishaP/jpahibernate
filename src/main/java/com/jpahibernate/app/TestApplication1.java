package com.jpahibernate.app;

import com.jpahibernate.dao.ServiceDao;
import com.jpahibernate.model.Places;

public class TestApplication1 {

	public static void main(String[] args) {
	
		Places places= new Places();
		//true
		places.setPlaceid(101);
		//false
//		places.setPlaceid(10033);
		Places p = new ServiceDao().getPlace(places);
		if(p!=null)	
			System.out.println(p.getPlacename());
		else
			System.out.println("not found");
		System.exit(0);
}
}
