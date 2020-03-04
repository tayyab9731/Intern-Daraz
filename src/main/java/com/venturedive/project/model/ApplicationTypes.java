package com.venturedive.project.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

@Entity
public class ApplicationTypes implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long type_ID;
	private long type_Name;
	
	@OneToMany(mappedBy = "applicationtype", fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Set<Applications> application;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST)
	@JoinTable(name = "Brand_Application_Brdige", joinColumns = {
	@JoinColumn(name = "type_id", referencedColumnName = "type_id", nullable = false, updatable = false) }, inverseJoinColumns = {
	@JoinColumn(name = "brand_id", referencedColumnName = "id", nullable = false, updatable = false) })

	private Set<Brand> brands = new HashSet<>();

	public ApplicationTypes() {
		super();
	}

	public long getType_ID() {
		return type_ID;
	}

	public void setType_ID(long type_ID) {
		this.type_ID = type_ID;
	}

	public ApplicationTypes(long type_Name) {
		super();

		this.type_Name = type_Name;
	}

	public long getType_Name() {
		return type_Name;
	}

	public void setType_Name(long type_Name) {
		this.type_Name = type_Name;
	}

	public Set<Applications> getApplication() {
		return application;
	}

	public void setApplication(Set<Applications> application) {
		this.application = application;
	}

}
