package com.add.fruit;

public class Fruit {
private String color;
private double weigth;
private String name;
private boolean isFresh= true;


public Fruit() {
	
}
public Fruit(String name,double weigth,String color) {
	this.color=color;
	this.weigth=weigth;
	this.name= name;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public double getWeigth() {
	return weigth;
}
public void setWeigth(double weigth) {
	this.weigth = weigth;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public boolean isFresh() {
	return isFresh;
}
public void setFresh(boolean isFresh) {
	this.isFresh = isFresh;
}
public String Test() {
	return "no specific taste";

}

public String taste() {
	return "no specific taste";
}
@Override
public String toString() {
	return "fruit details:"+name+",colour="+color+",weigth="+weigth;

}
}