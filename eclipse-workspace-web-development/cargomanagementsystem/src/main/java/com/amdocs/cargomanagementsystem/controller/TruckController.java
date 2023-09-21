package com.amdocs.cargomanagementsystem.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.amdocs.cargomanagementsystem.CargoNotExistException;
import com.amdocs.cargomanagementsystem.entity.Truck;
import com.amdocs.cargomanagementsystem.service.CargoService;
import com.amdocs.cargomanagementsystem.service.TruckService;


@RestController
@RequestMapping("/truck")
public class TruckController {

	@Autowired
	private TruckService truckService;
	@Autowired
	private CargoService cargoService;
	
	@PostMapping("/add/{cargoId}")
	public Truck addTruck(@PathVariable int cargoId,@RequestBody Truck truck) throws CargoNotExistException 
	{
		return truckService.addTruck(cargoId,truck);
	}

	@GetMapping("/")
	public List<Truck> getAllTruck()
	{
		return truckService.getAllTruck();
		
	}
	
	@GetMapping("/{truckId}")
	public Truck getTruck(@PathVariable int truckId)
	{
		return truckService.getTruck(truckId);
	}
	
	@PutMapping("/update/{truckId}/{cargoId}")
	public Truck updateTruck(@PathVariable int truckId,@PathVariable int cargoId,@RequestBody Truck truck)
	{
		return truckService.updateTruck(cargoId,truckId, truck);
	}
	
	
	@DeleteMapping("/delete/{truckId}")
	public void deleteTruck(@PathVariable int truckId)
	{
		truckService.deleteTruck(truckId);
	}
	
}
