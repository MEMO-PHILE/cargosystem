package com.amdocs.cargomanagementsystem.entity;

import java.util.HashSet;

import java.util.Set;


import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Cargo {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String name;
	private long contactNo;
	private String serviceType;

	@OneToMany(mappedBy = "cargo", cascade = CascadeType.ALL)
    private Set<Truck> truck = new HashSet<>();
	
	public Cargo() {
	}

	public Cargo(int id, String name,long contactNo, String serviceType) {
		super();
		this.id = id;
		this.name = name;
		this.contactNo=contactNo;
		this.serviceType = serviceType;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getServiceType() {
		return serviceType;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public void setServiceType(String serviceType) {
		this.serviceType = serviceType;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ",contactNo="+contactNo+", serviceType=" + serviceType + "]";
	}

}
