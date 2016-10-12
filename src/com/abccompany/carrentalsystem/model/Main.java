package com.abccompany.carrentalsystem.model;

import java.sql.SQLException;
import java.util.List;

import com.abccompany.carrentalsystem.dataaccess.Dao;
import com.abccompany.carrentalsystem.dataaccess.DataAccess;
import com.abccompany.carrentalsystem.dataaccess.DataAccessFactory;

public class Main {
	public static void main(String[] args) throws SQLException {
		Dao dao = new VehicleDao();
		DataAccess da = DataAccessFactory.getDataAccess();
		
		
			da.readAll(dao);
			List<Vehicle> vehicles = (List<Vehicle>)dao.getResults();
			//all cars
			
			for(Vehicle vehicle: vehicles){
				System.out.println(vehicle);
			}
		//here
		
	}
}
