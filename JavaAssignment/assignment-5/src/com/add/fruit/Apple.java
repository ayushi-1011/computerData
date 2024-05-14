package com.add.fruit;

public class Apple extends Fruit {

	 
	public Apple() {
		
	}
public Apple(String name,double weight,String color) {
	super(name,weight,color);
}
	
@Override
public String taste() {
	return "sweet n sour";
}

@Override
public String toString() {
	return super.toString();
}
}
