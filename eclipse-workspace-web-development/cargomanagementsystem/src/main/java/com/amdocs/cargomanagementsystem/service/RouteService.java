package com.amdocs.cargomanagementsystem.service;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.amdocs.cargomanagementsystem.entity.Driver;
import com.amdocs.cargomanagementsystem.entity.Route;
import com.amdocs.cargomanagementsystem.entity.Truck;
import com.amdocs.cargomanagementsystem.repo.DriverRepo;
import com.amdocs.cargomanagementsystem.repo.RouteRepo;
import com.amdocs.cargomanagementsystem.repo.TruckRepo;

@Service
public class RouteService {

	@Autowired
	private RouteRepo routeRepo;

	
	public Route addRoute(Route route) {
		return routeRepo.save(route);
	}
	
	public Route getRoute(int id) {
		return routeRepo.findById(id).get();
	}
	
	public List<Route> getAllRoute(){
		return routeRepo.findAll();
	}
	
	public void deleteRoute(int id) {
		routeRepo.deleteById(id);
	}
	
	public Route updateRoute(int routeId,Route route) {
		Route existingRoute=routeRepo.findById(routeId).orElse(null);
		
		if(existingRoute!=null)
		{
			existingRoute.setName(route.getName());
			existingRoute.setDistance(route.getDistance());
			return routeRepo.save(existingRoute);
		}
		return null;
	}
}
