package com.amdocs.cargomanagementsystem.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.amdocs.cargomanagementsystem.entity.Cargo;
import com.amdocs.cargomanagementsystem.entity.Driver;

@Repository
public interface CargoRepo extends JpaRepository<Cargo,Integer>{

}
