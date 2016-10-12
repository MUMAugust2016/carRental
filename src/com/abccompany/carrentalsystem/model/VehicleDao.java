package com.abccompany.carrentalsystem.model;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.abccompany.carrentalsystem.dataaccess.Dao;

public class VehicleDao implements Dao {

	private int plate;
	private List<Vehicle>listOfVehicles;
	//get all vehicles
	@Override
	public String getSql() {
		return "SELECT * FROM Vehicle";
	}

	@Override
	public void unpackResultSet(ResultSet rs) throws SQLException {
		listOfVehicles = new ArrayList<Vehicle>();
		while(rs.next()){
			int plateNumber = Integer.parseInt(rs.getString(1));
			int numberOfSeats  = Integer.parseInt(rs.getString(2));
			String carType = rs.getString(3);
			double dailyPrice = Double.parseDouble(rs.getString(4));
			String make = rs.getString(5);
			String transmission = rs.getString(6);
			int manufacturYear = Integer.parseInt(rs.getString(7));
			byte[] photo = rs.getString(8).getBytes();
			
			//add to the list of vehicles
			
			listOfVehicles.add(new Vehicle(plateNumber, numberOfSeats, carType, dailyPrice, make, transmission,
					manufacturYear, photo));
		}
		
	}

	@Override
	public List<?> getResults() {
		return listOfVehicles;
	}

	@Override
	public String getSqlOne() {
		// TODO Auto-generated method stub
		return "select * from vehicle where plate = "+ getPlate();
	}

	public int getPlate() {
		return plate;
	}

	public void setPlate(int plate) {
		this.plate = plate;
	}
	

}
