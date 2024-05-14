package com.add.fruit;


public class Mango extends Fruit {

	 
	public Mango() {
		
	}
public Mango(String name,double weight,String color) {
	super(name,weight,color);
}
	
@Override
public String taste() {
	return "sweet";
}

@Override
public String toString() {
	return super.toString();
}
}

