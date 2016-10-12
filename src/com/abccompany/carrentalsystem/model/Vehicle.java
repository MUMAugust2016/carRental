package com.abccompany.carrentalsystem.model;

public class Vehicle {
	private static final long serialVersionUID = 100010L;

	private Integer plate;

	private int numberOfSeats;

	private String carType;

	private double dailyPrice;

	private String make;

	private String transmission;

	private int manufacturedYear;

	private byte[] photo;

	public Vehicle() {
	}

	public Vehicle(Integer plate) {
		this.plate = plate;
	}

	public Vehicle(Integer plate, int numberOfSeats, String carType,
			double dailyPrice, String make, String transmission,
			int manufacturedYear, byte[] photo) {
		this.plate = plate;
		this.numberOfSeats = numberOfSeats;
		this.carType = carType;
		this.dailyPrice = dailyPrice;
		this.make = make;
		this.transmission = transmission;
		this.manufacturedYear = manufacturedYear;
		this.photo = photo;
	}

	public Integer getPlate() {
		return plate;
	}

	public void setPlate(Integer plate) {
		this.plate = plate;
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public String getCarType() {
		return carType;
	}

	public void setCarType(String carType) {
		this.carType = carType;
	}

	public double getDailyPrice() {
		return dailyPrice;
	}

	public void setDailyPrice(double dailyPrice) {
		this.dailyPrice = dailyPrice;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getTransmission() {
		return transmission;
	}

	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}

	public int getManufacturedYear() {
		return manufacturedYear;
	}

	public void setManufacturedYear(int manufacturedYear) {
		this.manufacturedYear = manufacturedYear;
	}

	public byte[] getPhoto() {
		return photo;
	}

	public void setPhoto(byte[] photo) {
		this.photo = photo;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (plate != null ? plate.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if (!(object instanceof Vehicle)) {
			return false;
		}
		Vehicle other = (Vehicle) object;
		if ((this.plate == null && other.plate != null)
				|| (this.plate != null && !this.plate.equals(other.plate))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Vehicle [plate=" + plate + ", numberOfSeats=" + numberOfSeats
				+ ", carType=" + carType + ", dailyPrice=" + dailyPrice
				+ ", make=" + make + ", transmission=" + transmission
				+ ", manufacturedYear=" + manufacturedYear + "]";
	}

	
}
