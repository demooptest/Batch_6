package com.project.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.model.Car;
import com.project.transferobject.CarResponse;

@RestController
@RequestMapping(path="/car")
public class CarController {
	
	//return type for RestController is always ResponseEntity
	//RequestBody annotation is used so that spring understands this is my car
	//CarReponse contain response to give after saving a car
	
	@PostMapping(value="/save")
	public ResponseEntity<CarResponse> saveCar (@RequestBody Car car){
		
		CarResponse carResponse = new CarResponse();
		
		return new ResponseEntity<> (carResponse,HttpStatus.OK);
	}

}
