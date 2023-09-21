package com.amdocs.cargomanagementsystem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import com.amdocs.cargomanagementsystem.entity.Cargo;
import com.amdocs.cargomanagementsystem.entity.Driver;
import com.amdocs.cargomanagementsystem.service.CargoService;
import com.amdocs.cargomanagementsystem.service.DriverService;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/cargo")
public class CargoController {

	@Autowired
	CargoService cargoService;
	
	@RequestMapping("/")
	public String home(Model m) {
		m.addAttribute("cargoList",cargoService.getAllCargo());
		return "index-cargo";
	}
	
	@RequestMapping("/addCargo")
	public String addCargo() {
		return "add-cargo";
	}
	
	
	@RequestMapping(value="/handleCargo",method=RequestMethod.POST)
	public RedirectView handleCargo(@ModelAttribute Cargo cargo) {
		cargoService.addCargo(cargo);
		RedirectView redirectView=new RedirectView();
		redirectView.setUrl("/cargo/");
		return redirectView;
	}
	
	@RequestMapping("/delete/{id}")
	public RedirectView deleteCargo(@PathVariable("id") int id) {
		cargoService.deleteCargo(id);
		RedirectView redirectView=new RedirectView();
		redirectView.setUrl("/cargo/");
		return redirectView;
	}
	
	@RequestMapping("/update/{id}")
	public String updateCargo(@PathVariable("id") int id,Model model) {
		Cargo cargo=cargoService.getCargo(id);
		model.addAttribute("cargo",cargo);
		return "update-cargo";
	}
}
