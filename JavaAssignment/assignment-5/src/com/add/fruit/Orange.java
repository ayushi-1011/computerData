package com.add.fruit;

public class Orange extends Fruit {

	 
	public Orange() {
		
	}

	
public Orange(String name, double weight, String color) {
	// TODO Auto-generated constructor stub
	super(name,weight,color);
}
@Override
public String taste() {
	return "sour";
}

@Override
public String toString() {
	return super.toString();
}
}
