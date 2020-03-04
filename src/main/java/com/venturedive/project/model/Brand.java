package com.venturedive.project.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Brand implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String about;

	@ManyToMany(mappedBy = "brands", fetch = FetchType.LAZY)
	private Set<ApplicationTypes> applicationtypes = new HashSet<>();

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

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public Set<ApplicationTypes> getApplicationtypes() {
		return applicationtypes;
	}

	public void setApplicationtypes(Set<ApplicationTypes> applicationtypes) {
		this.applicationtypes = applicationtypes;
	}

	public Brand() {
	}

	public Brand(String name, String about) {
		this.name = name;
		this.about = about;
	}
}
