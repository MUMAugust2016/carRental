package com.abccompany.carrentalsystem.model;

import java.time.LocalDate;

public class Employee {
	private static final long serialVersionUID = 100005L;

	private String employeeId;

	private String department;

	private LocalDate emplDate;

	private String gender;

	private String email;

	public Employee() {
	}

	public Employee(String employeeId) {
		this.employeeId = employeeId;
	}

	public Employee(String employeeId, String department, LocalDate emplDate,
			String gender, String email) {
		this.employeeId = employeeId;
		this.department = department;
		this.emplDate = emplDate;
		this.gender = gender;
		this.email = email;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public LocalDate getEmplDate() {
		return emplDate;
	}

	public void setEmplDate(LocalDate emplDate) {
		this.emplDate = emplDate;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (employeeId != null ? employeeId.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if (!(object instanceof Employee)) {
			return false;
		}
		Employee other = (Employee) object;
		if ((this.employeeId == null && other.employeeId != null)
				|| (this.employeeId != null && !this.employeeId
						.equals(other.employeeId))) {
			return false;
		}
		return true;
	}

}
