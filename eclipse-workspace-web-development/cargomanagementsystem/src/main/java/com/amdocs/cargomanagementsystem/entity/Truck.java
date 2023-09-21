package com.amdocs.cargomanagementsystem.entity;

import java.util.Date;


import org.springframework.format.annotation.DateTimeFormat;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Truck {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String vehicleNo;
	private long capacity;
	
	@DateTimeFormat(pattern = "yyyy-mm-dd")
	@Temporal(TemporalType.DATE)
	private Date registrationDate;
	
	@ManyToOne
    @JoinColumn(name = "cargo_id")
    private Cargo cargo;
	
	public Truck() {}
	
	public Truck(int id, String vehicleNo, long capacity, Date registrationDate) {
		super();
		this.id = id;
		this.vehicleNo = vehicleNo;
		this.capacity = capacity;
		this.registrationDate = registrationDate;
	}
	
	public Cargo getCargo() {
		return cargo;
	}

	public void setCargo(Cargo cargo) {
		this.cargo = cargo;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getVehicleNo() {
		return vehicleNo;
	}
	public void setVehicleNo(String vehicleNo) {
		this.vehicleNo = vehicleNo;
	}
	public long getCapacity() {
		return capacity;
	}
	public void setCapacity(long capacity) {
		this.capacity = capacity;
	}
	public Date getRegistrationDate() {
		return registrationDate;
	}
	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}
	
	@Override
	public String toString() {
		return "Truck [id=" + id + ", vehicleNo=" + vehicleNo + ", capacity=" + capacity + ", registrationDate="
				+ registrationDate + "]";
	}

	
}
