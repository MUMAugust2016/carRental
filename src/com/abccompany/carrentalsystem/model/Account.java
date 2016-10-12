package com.abccompany.carrentalsystem.model;

public class Account {

	private static final long serialVersionUID = 10001L;

	private String password;

	private String status;

	private String role;

	private Integer id;

	private Employee username;

	public Account() {
	}

	public Account(Integer id) {
		this.id = id;
	}

	public Account(Integer id, String password, String status, String role) {
		this.id = id;
		this.password = password;
		this.status = status;
		this.role = role;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Employee getUsername() {
		return username;
	}

	public void setUsername(Employee username) {
		this.username = username;
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
		if (!(object instanceof Account)) {
			return false;
		}
		Account other = (Account) object;
		if ((this.id == null && other.id != null)
				|| (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Account[ id=" + id + " ]";
	}
}
