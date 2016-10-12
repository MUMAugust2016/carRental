package com.abccompany.carrentalsystem.model;

import java.time.LocalDate;

public class Customer {

	private static final long serialVersionUID = 100003L;

	private String driverLicenseNumber;

	private String firstName;

	private String middleName;

	private String lastName;

	private LocalDate dob;

	private String email;

	private int phone;

	private String customerId;

	public Customer() {
	}

	public Customer(String customerId) {
		this.customerId = customerId;
	}

	public Customer(String customerId, String driverLicenseNumber,
			String firstName, String middleName, String lastName,
			LocalDate dob, String email, int phone) {
		this.customerId = customerId;
		this.driverLicenseNumber = driverLicenseNumber;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.dob = dob;
		this.email = email;
		this.phone = phone;
	}

	public String getDriverLicenseNumber() {
		return driverLicenseNumber;
	}

	public void setDriverLicenseNumber(String driverLicenseNumber) {
		this.driverLicenseNumber = driverLicenseNumber;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (customerId != null ? customerId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if (!(object instanceof Customer)) {
			return false;
		}
		Customer other = (Customer) object;
		if ((this.customerId == null && other.customerId != null)
				|| (this.customerId != null && !this.customerId
						.equals(other.customerId))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Customer[ customerId=" + customerId + " ]";
	}
}
