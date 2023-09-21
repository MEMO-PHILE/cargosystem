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

import com.amdocs.cargomanagementsystem.entity.Route;
import com.amdocs.cargomanagementsystem.service.RouteService;


@RestController
@RequestMapping("/route")
public class RouteController {

	@Autowired
	private RouteService routeService;

	@PostMapping("/add")
	public Route addRoute(@RequestBody Route route)
	{
		return routeService.addRoute(route);
	}

	@GetMapping("/")
	public List<Route> getAllRoute()
	{
		return routeService.getAllRoute();
		
	}
	
	@GetMapping("/{routeId}")
	public Route getRoute(@PathVariable int routeId)
	{
		return routeService.getRoute(routeId);
	}
	
	@PutMapping("/update/{routeId}")
	public Route updateRoute(@PathVariable int routeId,@RequestBody Route route)
	{
		return routeService.updateRoute(routeId, route);
	}
	
	
	@DeleteMapping("/delete/{routeId}")
	public void deleteRoute(@PathVariable int routeId)
	{
		routeService.deleteRoute(routeId);
	}
	
}
