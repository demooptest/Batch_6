package com.project.to;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author deep
 * @date 10/05/2024 This is POJO  for Car Entity
 * 
 */
//@Getter
//@Setter
@ToString
@NoArgsConstructor
@EqualsAndHashCode

public class CarRequest {
	

	private String carName;

	private String carModel;

	private String carcolor;

	private String carNumber;
	
	private int SeatCapacity;

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

	public String getCarcolor() {
		return carcolor;
	}

	public void setCarcolor(String carcolor) {
		this.carcolor = carcolor;
	}

	public String getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public int getSeatCapacity() {
		return SeatCapacity;
	}

	public void setSeatCapacity(int seatCapacity) {
		SeatCapacity = seatCapacity;
	}
	
	
	

}
