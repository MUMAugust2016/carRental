package com.abccompany.carrentalsystem.model;

import java.time.LocalDate;

public class Member {

	private static final long serialVersionUID = 100007L;

	private String type;

	private LocalDate memberSince;

	private Integer id;

	private Customer customerId;

	public Member() {
	}

	public Member(Integer id) {
		this.id = id;
	}

	public Member(Integer id, String type, LocalDate memberSince) {
		this.id = id;
		this.type = type;
		this.memberSince = memberSince;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public LocalDate getMemberSince() {
		return memberSince;
	}

	public void setMemberSince(LocalDate memberSince) {
		this.memberSince = memberSince;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Customer getCustomerId() {
		return customerId;
	}

	public void setCustomerId(Customer customerId) {
		this.customerId = customerId;
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
		if (!(object instanceof Member)) {
			return false;
		}
		Member other = (Member) object;
		if ((this.id == null && other.id != null)
				|| (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Member1[ id=" + id + " ]";
	}
}
