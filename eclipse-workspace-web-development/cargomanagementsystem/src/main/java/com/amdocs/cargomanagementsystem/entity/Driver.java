package com.amdocs.cargomanagementsystem.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Driver {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String name;
	private long contactNo;
	private long licenseNo;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="truck_id",nullable=true)
	private Truck truck;

	public Driver() {
	}

	public Driver(int id, String name,long contactNo, long licenseNo,Truck truck) {
		super();
		this.id = id;
		this.name = name;
		this.contactNo=contactNo;
		this.licenseNo = licenseNo;
		this.truck=truck;
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

	public long getLicenseNo() {
		return licenseNo;
	}

	public long getContactNo() {
		return contactNo;
	}

	public void setContactNo(long contactNo) {
		this.contactNo = contactNo;
	}

	public void setLicenseNo(long licenseNo) {
		this.licenseNo = licenseNo;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ",contactNo="+contactNo+", licenseNo=" + licenseNo + ","+truck+"]";
	}

	public Truck getTruck() {
		return truck;
	}

	public void setTruck(Truck truck) {
		this.truck = truck;
	}

}
