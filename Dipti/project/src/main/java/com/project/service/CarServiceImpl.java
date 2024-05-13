package com.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.model.Car;
import com.project.repository.CarRepository;
import com.project.transferobject.CarRequest;
import com.project.transferobject.CarResponse;

@Service
public class CarServiceImpl implements CarService{

	@Autowired
	private CarRepository carRepo;
	
	@Override
	public CarResponse saveCar(CarRequest carRequest) {
		
		Car car = new Car();
		
		//taking car name stored in car request and setting in car
		car.setCarName(carRequest.getCarName());
		car.setCarModel(carRequest.getCarModel());
		car.setColor(carRequest.getColor());
		car.setCarNumber(carRequest.getCarNumber());
		
		CarResponse carResponse = new CarResponse();
		
		try {
			carRepo.save(car);
			carResponse.setMessage("Saved Successfully!");
		} catch (Exception e) {
			carResponse.setError(e.getMessage());
			carResponse.setError("Failure");
			e.printStackTrace();
		}
		
		return null;
	}

}
