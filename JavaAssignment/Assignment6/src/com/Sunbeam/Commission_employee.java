package com.Sunbeam;

import java.util.Scanner;

public class Commission_employee extends Employee {
private float gross_Sales;
private float commission_Rate;

	public Commission_employee() {
	System.out.println("inside Commission_employee");
	}
	
	Scanner sc = new Scanner(System.in);
	@Override
public void accept() {
		super.accept();
		System.out.println("enter gross_sales:");
		gross_Sales = sc.nextFloat();
		System.out.println("enter commission_rate:");
		commission_Rate =sc.nextFloat();
	
}
	
	
	@Override
	public String toString() {
		return super.toString()+"Commission_employee [gross_Sales=" + gross_Sales + ", commission_Rate=" + commission_Rate + "]";
	}


	public float getGross_Sales() {
		return gross_Sales;
	}

	@Override
	public void calculateSalary() {
	System.out.println("total commission employee salary:"+getSalary()+(gross_Sales*commission_Rate));
		
	}
}
