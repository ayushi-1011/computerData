package com.app.geometry;

import java.util.Scanner;

public class Point2D {
float x;
float y;


public Point2D() {
	this(0,0);
}
public Point2D(float x,float y) {
	this.x=x;
	this.y=y;
}

public float getX() {
	return x;
}
public void setX(float x) {
	this.x = x;
}
public float getY() {
	return y;
}
public void setY(float y) {
	this.y = y;
}


public String getString() {
	 return "x: "+this.x+"and y: "+this.y;
	 
}

public static boolean isEqual(Point2D P1,Point2D P2)
{
	if(P1.x==P2.x&& P2.y==P2.y) { 
		return true;
	}

return false;
}
public static double calculate(Point2D P1,Point2D P2) {
	double distance = Math.sqrt((Math.pow((P1.x - P2.x), 2) + Math.pow((P1.y - P2.y), 2)));
	return distance;
}
}
