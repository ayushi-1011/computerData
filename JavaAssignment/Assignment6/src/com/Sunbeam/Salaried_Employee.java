package com.Sunbeam;

import java.util.Scanner;

public class Salaried_Employee extends Employee{
private float weeklySalary;
	public Salaried_Employee() {
	System.out.println("inside salaried_employee");
	}
	
	Scanner sc = new Scanner(System.in);
@Override
public void accept() {
	super.accept();
	System.out.println("enter weeklySalary:");
	weeklySalary = sc.nextFloat();
	}

@Override
public String toString() {
	return super.toString()+"Salaried_Employee [weeklySalary=" + weeklySalary + "]";
}
public void calculateSalary() {
	System.out.println("total salary:"+(getSalary()+weeklySalary));
}
}