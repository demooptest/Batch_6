package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.model.Car;

// JPA Repo need two generics for class that we have to use the repo functions and 
// data type of its primary key
public interface CarRepository extends JpaRepository<Car,Integer> {

}
