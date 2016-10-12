package com.abccompany.carrentalsystem.model;

public class Payment {

	private static final long serialVersionUID = 100007L;

	private int paymentType;

	private int initialAmount;

	private String status;

	private Integer id;

	private Customer customer;

	private Reservation reservation;

	public Payment() {
	}

	public Payment(Integer id) {
		this.id = id;
	}

	public Payment(Integer id, int paymentType, int initialAmount, String status) {
		this.id = id;
		this.paymentType = paymentType;
		this.initialAmount = initialAmount;
		this.status = status;
	}

	public int getPaymentType() {
		return paymentType;
	}

	public void setPaymentType(int paymentType) {
		this.paymentType = paymentType;
	}

	public int getInitialAmount() {
		return initialAmount;
	}

	public void setInitialAmount(int initialAmount) {
		this.initialAmount = initialAmount;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
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
		if (!(object instanceof Payment)) {
			return false;
		}
		Payment other = (Payment) object;
		if ((this.id == null && other.id != null)
				|| (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Payment[ id=" + id + " ]";
	}

}
