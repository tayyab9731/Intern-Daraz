package com.venturedive.project.model;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
@Entity
public class Applications {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    private String name;
    private long price;
    private String specification;
    private String image;
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "type_id", nullable = false)
    private ApplicationTypes applicationtype;

	public Applications( String name, long price, String specification, String image,
			ApplicationTypes applicationtype) {
		super();
	
		this.name = name;
		this.price = price;
		this.specification = specification;
		this.image = image;
		this.applicationtype = applicationtype;
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

	public long getPrice() {
		return price;
	}

	public void setPrice(long price) {
		this.price = price;
	}

	public String getSpecification() {
		return specification;
	}

	public void setSpecification(String specification) {
		this.specification = specification;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public ApplicationTypes getApplicationtype() {
		return applicationtype;
	}

	public void setApplicationtype(ApplicationTypes applicationtype) {
		this.applicationtype = applicationtype;
	}
}
