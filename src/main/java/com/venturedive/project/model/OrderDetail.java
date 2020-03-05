package com.venturedive.project.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class OrderDetail {
	  @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;
private String paymentmethod;
private Date orderdate;
@ManyToOne(fetch = FetchType.LAZY, optional = false)
@JoinColumn(name = "user_ID", nullable = false)
private Customer customer;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getPaymentmethod() {
	return paymentmethod;
}
public void setPaymentmethod(String paymentmethod) {
	this.paymentmethod = paymentmethod;
}
public Date getOrderdate() {
	return orderdate;
}
public void setOrderdate(Date orderdate) {
	this.orderdate = orderdate;
}
public Customer getCustomer() {
	return customer;
}
public void setCustomer(Customer customer) {
	this.customer = customer;
}
}
