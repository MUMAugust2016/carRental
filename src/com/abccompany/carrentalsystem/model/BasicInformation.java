package com.abccompany.carrentalsystem.model;

import java.time.LocalDate;

public class BasicInformation {
	private static final long serialVersionUID = 100002L;

	private String firstName;

	private String middleName;

	private LocalDate dateOfBirth;

	private String email;

	private Integer id;

	private Employee employee;

	public BasicInformation() {
	}

	public BasicInformation(Integer id) {
		this.id = id;
	}

	public BasicInformation(Integer id, String firstName, String middleName,
			LocalDate dateOfBirth, String email) {
		this.id = id;
		this.firstName = firstName;
		this.middleName = middleName;
		this.dateOfBirth = dateOfBirth;
		this.email = email;
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

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Employee getEmployee() {
		return employee;
	}

	public void setEmployee(Employee employee) {
		this.employee = employee;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (id != null ? id.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if (!(object instanceof BasicInformation)) {
			return false;
		}
		BasicInformation other = (BasicInformation) object;
		if ((this.id == null && other.id != null)
				|| (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Basicinformation[ id=" + id + " ]";
	}

}
