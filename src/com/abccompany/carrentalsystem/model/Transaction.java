package com.abccompany.carrentalsystem.model;

import java.time.LocalDate;

public class Transaction {

	private static final long serialVersionUID = 100009L;

	private Integer id;

	private String status;

	private LocalDate updatedDate;

	private Reservation reservation;

	public Transaction() {
	}

	public Transaction(Integer id) {
		this.id = id;
	}

	public Transaction(Integer id, String status, LocalDate updatedDate) {
		this.id = id;
		this.status = status;
		this.updatedDate = updatedDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDate getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(LocalDate updatedDate) {
		this.updatedDate = updatedDate;
	}

	public Reservation getReservation() {
		return reservation;
	}

	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
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
		if (!(object instanceof Transaction)) {
			return false;
		}
		Transaction other = (Transaction) object;
		if ((this.id == null && other.id != null)
				|| (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}

	// @Override
	// public String toString() {
	// return "Transaction[ id=" + id + " ]";
	// }

}
