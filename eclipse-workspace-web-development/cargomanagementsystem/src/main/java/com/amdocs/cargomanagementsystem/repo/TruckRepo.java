package com.amdocs.cargomanagementsystem.repo;

import java.util.List;


import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import com.amdocs.cargomanagementsystem.entity.Cargo;
import com.amdocs.cargomanagementsystem.entity.Driver;
import com.amdocs.cargomanagementsystem.entity.Truck;

@Repository
public interface TruckRepo extends JpaRepository<Truck,Integer>{
	List<Truck> findByCargo(Cargo cargo);
    Truck findByCargoAndId(Cargo cargo, int truckId);
}
