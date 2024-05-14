package com;

import java.io.Serializable;
import java.util.Scanner;

public class Address implements Serializable {
	private String area;
	private String dist;
	private int pin;
	
	public Address() {
		
	}
	public Address(String area, String dist, int pin) {
		
		this.area = area;
		this.dist = dist;
		this.pin = pin;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getDist() {
		return dist;
	}
	public void setDist(String dist) {
		this.dist = dist;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	
	public void acceptData(Scanner sc) {
		System.out.println("Enter Area: ");
		area=sc.next();
		System.out.println("Enter District: ");
		dist=sc.next();
		System.out.println("Enter pin: ");
		pin = sc.nextInt();
	}
	@Override
	public String toString() {
		return "Address [area=" + area + ", dist=" + dist + ", pin=" + pin + "]";
	}
	
	

}
