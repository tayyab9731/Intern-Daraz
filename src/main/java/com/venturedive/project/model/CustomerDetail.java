package com.venturedive.project.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
public class CustomerDetail extends AbstractPersistable<Long> {

	private String email;
	private String password;
	private boolean isActive;

//for User

	public Customer getUser() {
		return customer;
	}

	public void setUser(Customer user) {
		this.customer = user;
	}

	@OneToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "user_id", nullable = false)
	private Customer customer;

	
	public CustomerDetail() {
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(boolean isActive) {
		this.isActive = isActive;
	}

	public CustomerDetail(String email, String password, boolean b) {
		super();

		this.email = email;
		this.password = password;
		this.isActive = b;
	}

	// getters and setters, equals(), toString() .... (omitted for brevity)
}