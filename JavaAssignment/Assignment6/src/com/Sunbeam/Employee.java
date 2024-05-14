package com.Sunbeam;

import java.util.Scanner;

public abstract class Employee {
private String firstname;
private String lastname;
private float salary;
	public Employee() {
		System.out.println("in employee constructor");
	}
	Scanner sc = new Scanner(System.in);
public void accept() {
	System.out.println("enter firstname:");
	firstname = sc.next();
	System.out.println("enter lastname:");
	lastname = sc.next();
	}
@Override
public String toString() {
	return "Employee [firstname=" + firstname + ", lastname=" + lastname + ", salary=" + salary + "]";
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public float getSalary() {
	return salary;
}
public void setSalary(float salary) {
	this.salary = salary;
}
public abstract void calculateSalary();


}
