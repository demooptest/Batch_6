package com.project.transferobject;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Dipti
 * @date 08-05-24
 * This is a POJO/Model for Car Entity 
 * Encapsulation - Binding everything into a single entity
 */

//@Getter
//@Setter
//@ToString
@NoArgsConstructor
@EqualsAndHashCode
public class CarRequest {
	
	private int Id;
	
	private String carName;
	
	private String carModel;
	
	private String color;
	 
	private String carNumber;

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	public String getCarName() {
		return carName;
	}

	public void setCarName(String carName) {
		this.carName = carName;
	}

	public String getCarModel() {
		return carModel;
	}

	public void setCarModel(String carModel) {
		this.carModel = carModel;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}
	

}
