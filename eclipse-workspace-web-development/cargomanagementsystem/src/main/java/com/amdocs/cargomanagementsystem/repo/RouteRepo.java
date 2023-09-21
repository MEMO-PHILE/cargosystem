package com.amdocs.cargomanagementsystem.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.amdocs.cargomanagementsystem.entity.Driver;
import com.amdocs.cargomanagementsystem.entity.Route;

@Repository
public interface RouteRepo extends JpaRepository<Route,Integer>{

}
