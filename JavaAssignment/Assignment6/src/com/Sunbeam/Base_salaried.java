package com.Sunbeam;

public class Base_salaried extends Commission_employee {

	public Base_salaried() {
		System.out.println("inside base_salaried");
	}
	
	
public void calculateSalary() {
	super.accept();
	System.out.println("total salary"+(getSalary()+getGross_Sales()));
}
}
