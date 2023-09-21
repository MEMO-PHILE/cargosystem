package com.amdocs.cargomanagementsystem.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amdocs.cargomanagementsystem.entity.Driver;
import com.amdocs.cargomanagementsystem.repo.DriverRepo;

@Service
public class DriverService {

	@Autowired
	private DriverRepo driverRepo;

	@Autowired
	private TruckService truckService;
	
	public boolean addDriver(Driver driver) {
		if(driver.getTruck()!=null)
			driver.setTruck(truckService.getTruck(driver.getTruck().getId()));
		return driverRepo.save(driver)!=null;
	}
	
	public Driver getDriver(int id) {
		return driverRepo.findById(id).get();
	}
	
	public List<Driver> getAllDriver(){
		return driverRepo.findAll();
	}
	
	public void deleteDriver(int id) {
		driverRepo.deleteById(id);
	}
	
	
}
