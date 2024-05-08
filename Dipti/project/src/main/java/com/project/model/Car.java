package com.project.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author Dipti
 * @date 08-05-24
 * This is a POJO/Model for Car Entity 
 */

@Getter
@Setter
@ToString
@NoArgsConstructor
@EqualsAndHashCode
public class Car {
	
	private String carName;
	
	private String carModel;
	
	private String color;
	 
	private String carNumber;

}
