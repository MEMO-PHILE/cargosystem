package com.amdocs.cargomanagementsystem;

public class CargoNotExistException extends Exception {
	
	public CargoNotExistException(String Message) {
		
		System.out.println(Message);
	}

}