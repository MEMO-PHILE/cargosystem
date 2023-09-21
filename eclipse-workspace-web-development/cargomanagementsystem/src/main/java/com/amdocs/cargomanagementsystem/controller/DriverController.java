package com.amdocs.cargomanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import com.amdocs.cargomanagementsystem.entity.Driver;
import com.amdocs.cargomanagementsystem.service.DriverService;
import com.amdocs.cargomanagementsystem.service.TruckService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/driver")
public class DriverController {

	@Autowired
	DriverService driverService;
	
	@Autowired
	TruckService truckService;
	
	@RequestMapping("/")
	public String home(Model model) {
		model.addAttribute("driverList",driverService.getAllDriver());
		return "index-driver";
	}
	
	@RequestMapping("/addDriver")
	public String addDriver(Model model) {
		model.addAttribute("truckList",truckService.getAllTruck());
		model.addAttribute("driver",new Driver());
		return "add-driver";
	}
	
	
	@RequestMapping(value="/handleDriver",method=RequestMethod.POST)
	public RedirectView handleDriver(@ModelAttribute Driver driver) {
		
		driverService.addDriver(driver);
		RedirectView redirectView=new RedirectView();
		redirectView.setUrl("/driver/");
		return redirectView;
	}
	
	@RequestMapping("/delete/{id}")
	public RedirectView deleteDriver(@PathVariable("id") int id) {
		driverService.deleteDriver(id);
		RedirectView redirectView=new RedirectView();
		redirectView.setUrl("/driver/");
		return redirectView;
	}
	
	@RequestMapping("/update/{id}")
	public String updateDriver(@PathVariable("id") int id,Model model) {
		Driver driver=driverService.getDriver(id);
		model.addAttribute("driver",driver);
		model.addAttribute("truckList",truckService.getAllTruck());
		return "update-driver";
	}
}
