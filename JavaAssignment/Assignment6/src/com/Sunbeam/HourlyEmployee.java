package com.Sunbeam;

import java.util.Scanner;

public class HourlyEmployee extends Employee {
	private float hours;
	public HourlyEmployee() {
System.out.println("inside hourlyemployee");
	}
	Scanner sc =new Scanner(System.in);
	@Override
public void accept() {
		super.accept();
	System.out.println("enter no. of hours worked:");
	hours = sc.nextFloat();
	
}
	
@Override
public String toString() {
	return super.toString()+"HourlyEmployee [hours=" + hours + "]";
}
public void calculateSalary() {
	System.out.println("total salary:"+(getSalary()+hours*15));
}
}