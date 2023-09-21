package com.amdocs.cargomanagementsystem.service;

import java.util.List;




import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amdocs.cargomanagementsystem.CargoNotExistException;
import com.amdocs.cargomanagementsystem.entity.Cargo;
import com.amdocs.cargomanagementsystem.entity.Driver;
import com.amdocs.cargomanagementsystem.entity.Truck;
import com.amdocs.cargomanagementsystem.repo.CargoRepo;
import com.amdocs.cargomanagementsystem.repo.DriverRepo;
import com.amdocs.cargomanagementsystem.repo.TruckRepo;

@Service
public class TruckService {

	@Autowired
	private TruckRepo truckRepo;

	@Autowired
	private CargoRepo cargoRepo;
	
	@Autowired
	private DriverService driverService;
	
	
	public Truck addTruck(int cargoId,Truck truck) throws CargoNotExistException{
		Cargo cargo = cargoRepo.findById(cargoId).orElse(null);
		if(cargo!=null) {
			truck.setCargo(cargo);
			return truckRepo.save(truck);
		}
		else
			throw new CargoNotExistException("Cargo don't exist");
	}
	
	public Truck getTruck(int id) {
		return truckRepo.findById(id).get();
	}
	
	public List<Truck> getAllTruck(){
		return truckRepo.findAll();
	}
	
	public void deleteTruck(int id) {
		
		List<Driver> driverList=driverService.getAllDriver();
		for(Driver driver:driverList) {
			if(driver.getTruck()!=null && driver.getTruck().getId()==id) {
				driver.setTruck(null);
				driverService.addDriver(driver);
			}
		}
		truckRepo.deleteById(id);
	}
	
	public Truck updateTruck(int cargoId,int truckId,Truck truck) {
		Cargo cargo = cargoRepo.findById(cargoId).orElse(null);
		Truck existingTruck=truckRepo.findByCargoAndId(cargo, truckId);
		
		if(existingTruck!=null)
		{
			existingTruck.setVehicleNo(truck.getVehicleNo());
			existingTruck.setCapacity(truck.getCapacity());
			existingTruck.setRegistrationDate(truck.getRegistrationDate());
			return truckRepo.save(existingTruck);
		}
		return null;
	}
	
	public List<Truck> getTruckByCargoId(int cargoId) {
        Cargo cargo = cargoRepo.findById(cargoId).orElse(null);
        return truckRepo.findByCargo(cargo);
    }
}
