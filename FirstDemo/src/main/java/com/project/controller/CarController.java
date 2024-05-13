package com.project.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.service.CarServiceImpli;
import com.project.to.CarRequest;
import com.project.to.CarResponse;

@RestController
@RequestMapping(path = "DS1/car")

public class CarController {
	
    @Autowired
    private CarServiceImpli carServiceImpli;
    
	
	@PostMapping(value = "save_Car")
	public ResponseEntity<CarResponse> saveCar(@RequestBody CarRequest car) {
//		CarResponse cr = new CarResponse(); //deletedline
		
		CarResponse cr = carServiceImpli.saveCar(car);
		
		return new ResponseEntity<>(cr, HttpStatus.OK);

	}
}