package com.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.model.Car;
import com.project.repository.CarRepositry;
import com.project.to.CarRequest;
import com.project.to.CarResponse;

@Service
public class CarServiceImpli implements CarService {
	
	@Autowired
	private CarRepositry crrepo;
	
	@Override
	public CarResponse saveCar(CarRequest cr) {
		
		Car car = new Car();
		car.setCarName(cr.getCarName());
		car.setCarModel(cr.getCarModel());
		car.setCarcolor(cr.getCarcolor());
		car.setCarNumber(cr.getCarNumber());
	
		CarResponse carResponse = new CarResponse();
		
		try {
			crrepo.save(car);
			carResponse.setMessage("Set succesfully");
		} catch (Exception e) {
			
			carResponse.setError(e.getMessage());
		}	
		
		return carResponse;
	}

}
