package com.abccompany.carrentalsystem.model;

public class EmployeeAddress {

	private static final long serialVersionUID = 100006L;

	private String street;

	private String city;

	private String state;

	private int zip;

	private int phone;

	private Integer id;

	private Employee employeeId;

	public EmployeeAddress() {
	}

	public EmployeeAddress(Integer id) {
		this.id = id;
	}

	public EmployeeAddress(Integer id, String street, String city,
			String state, int zip, int phone) {
		this.id = id;
		this.street = street;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phone = phone;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Employee getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(Employee employeeId) {
		this.employeeId = employeeId;
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
		if (!(object instanceof EmployeeAddress)) {
			return false;
		}
		EmployeeAddress other = (EmployeeAddress) object;
		if ((this.id == null && other.id != null)
				|| (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Employeeaddress[ id=" + id + " ]";
	}
}
