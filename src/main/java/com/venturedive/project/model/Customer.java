package com.venturedive.project.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity

@Inheritance(strategy = InheritanceType.JOINED)
public class Customer extends AbstractPersistable<Long> {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;

	@OneToOne(mappedBy = "customer", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private CustomerDetail details;

	@OneToMany(mappedBy = "customer", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<OrderDetail> orders;
	public Customer() {
	}

	public Set<OrderDetail> getOrders() {
		return orders;
	}

	public void setOrders(Set<OrderDetail> orders) {
		this.orders = orders;
	}

	public Customer(String name) {
		super();
		this.name = name;

	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public CustomerDetail getAddress() {
		return details;
	}

	public void setAddress(CustomerDetail address) {
		this.details = address;
	}

}
