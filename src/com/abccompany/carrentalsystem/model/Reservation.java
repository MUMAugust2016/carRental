package com.abccompany.carrentalsystem.model;

import java.awt.List;
import java.time.LocalDate;

public class Reservation {

	private static final long serialVersionUID = 100008L;

	private Integer confirmationNumber;

	private LocalDate pickupDate;

	private LocalDate dropoffDate;

	private Vehicle vehicle;

	private List transactionList;

	public Reservation() {
	}

	public Reservation(Integer confirmationNumber) {
		this.confirmationNumber = confirmationNumber;
	}

	public Reservation(Integer confirmationNumber, LocalDate pickupDate,
			LocalDate dropoffDate) {
		this.confirmationNumber = confirmationNumber;
		this.pickupDate = pickupDate;
		this.dropoffDate = dropoffDate;
	}

	public Integer getConfirmationNumber() {
		return confirmationNumber;
	}

	public void setConfirmationNumber(Integer confirmationNumber) {
		this.confirmationNumber = confirmationNumber;
	}

	public LocalDate getPickupDate() {
		return pickupDate;
	}

	public void setPickupDate(LocalDate pickupDate) {
		this.pickupDate = pickupDate;
	}

	public LocalDate getDropoffDate() {
		return dropoffDate;
	}

	public void setDropoffDate(LocalDate dropoffDate) {
		this.dropoffDate = dropoffDate;
	}

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	public List getTransactionList() {
		return transactionList;
	}

	public void setTransactionList(List transactionList) {
		this.transactionList = transactionList;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (confirmationNumber != null ? confirmationNumber.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if (!(object instanceof Reservation)) {
			return false;
		}
		Reservation other = (Reservation) object;
		if ((this.confirmationNumber == null && other.confirmationNumber != null)
				|| (this.confirmationNumber != null && !this.confirmationNumber
						.equals(other.confirmationNumber))) {
			return false;
		}
		return true;
	}

	// @Override
	// public String toString() {
	// return "Reservation[ confirmationNumber=" + confirmationNumber + " ]";
	// }

}
