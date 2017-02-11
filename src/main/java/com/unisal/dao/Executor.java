package com.unisal.dao;

import java.io.IOException;
import java.sql.SQLException;

import com.unisal.model.City;

public class Executor {
	
	private static final CityDAO cityDAO = CityDAO.getInstance();
	public static void main(String[] args) {
		
		City city = new City();
		city.setId(new Long(2));
		city.setNome("Guara");
		city.setGeocodigo(155445);
		city.setLatitude(-22.1234567);
		city.setLongitude(-44.1234567);
		
		try{
		
			cityDAO.update(city);
		}catch (ClassNotFoundException | SQLException | IOException e){
			System.out.println(e.toString());
		}
		
	}
}
		
/*		City city = new City();
		city.setId(new Long(1));
						
	try{
			cityDAO.delete(city);			
		}catch (ClassNotFoundException | SQLException | IOException e){
			System.out.println(e.toString());
		}
	}
}

*/
		
/*City city = new City();
city.setNome("Itajuba");
city.setGeocodigo(0.0);
city.setLatitude(0.0);
city.setLongitude(0.0);

CityDAO cityDAO = CityDAO.getInstance();
try {
	cityDAO.insert(city);
} catch (ClassNotFoundException | SQLException | IOException e) {
	System.out.println(e.toString());
}
	}
	}*/
