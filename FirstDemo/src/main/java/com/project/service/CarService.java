package com.project.service;

import com.project.to.CarRequest;
import com.project.to.CarResponse;

public interface CarService {
	
	public CarResponse saveCar(CarRequest cr);

}
