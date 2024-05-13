package com.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.model.Car;

public interface CarRepositry extends JpaRepository<Car,Integer> {

}
