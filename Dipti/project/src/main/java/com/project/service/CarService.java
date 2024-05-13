package com.project.service;

import com.project.transferobject.CarRequest;
import com.project.transferobject.CarResponse;

public interface CarService {
	
	//abstraction concept is used
	//we have not shown the implementation in this 
	public CarResponse saveCar(CarRequest cr);

}
