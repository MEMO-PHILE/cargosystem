package com.amdocs.cargomanagementsystem.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amdocs.cargomanagementsystem.entity.Cargo;
import com.amdocs.cargomanagementsystem.entity.Driver;
import com.amdocs.cargomanagementsystem.repo.CargoRepo;
import com.amdocs.cargomanagementsystem.repo.DriverRepo;

@Service
public class CargoService {

	@Autowired
	private CargoRepo cargoRepo;

	
	public boolean addCargo(Cargo cargo) {
		return cargoRepo.save(cargo)!=null;
	}
	
	public Cargo getCargo(int id) {
		return cargoRepo.findById(id).get();
	}
	
	public List<Cargo> getAllCargo(){
		return cargoRepo.findAll();
	}
	
	public void deleteCargo(int id) {
		cargoRepo.deleteById(id);
	}
	
	
}
