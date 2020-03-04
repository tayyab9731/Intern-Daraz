package com.venturedive.project.model;
import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;

import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
@Entity

@Inheritance(strategy=InheritanceType.JOINED) 
public class customer extends AbstractPersistable<Long>{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
  

    @OneToOne(mappedBy = "customer", fetch = FetchType.LAZY,
            cascade = CascadeType.ALL)
    private UserDetails details;

    public customer() {
    }

    public customer(String name) {
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

	public UserDetails getAddress() {
		return details;
	}

	public void setAddress(UserDetails address) {
		this.details = address;
	}

}