package com.amdocs.cargomanagementsystem.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Route {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	private String name;
	private long distance;
	private String destination;
	
	public Route() {}
	
	@Override
	public String toString() {
		return "Route [id=" + id + ", name=" + name + ", distance=" + distance + ", destination="+destination+"]";
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
	public long getDistance() {
		return distance;
	}
	public void setDistance(long distance) {
		this.distance = distance;
	}
	
	public Route(int id, String name, long distance,String destination) {
		super();
		this.id = id;
		this.name = name;
		this.distance = distance;
		this.destination=destination;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}


}
