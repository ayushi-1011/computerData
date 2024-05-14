package com.app.geometry;

import java.util.Scanner;

public class test {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Point2D P1 = new Point2D();
	Point2D P2 = new Point2D();
	
	System.out.println("enter P1 coordinates:");
	System.out.println("ENTER X:");
	P1.setX(sc.nextFloat());
	System.out.println("ENTER Y:");
	P1.setY(sc.nextFloat());
	System.out.println("enter P2 2 coordinates:");
	System.out.println("ENTER X:");
	P2.setX(sc.nextFloat());
	System.out.println("ENTER Y:");
	P2.setY(sc.nextFloat());
	
	System.out.println("p1:"+P1.getString());
	System.out.println("--------------");
	System.out.println("p2:"+P2.getString());
	
	if(P1.isEqual(P1, P2)) {
		System.out.println("same");
	}
	else {
		System.out.println("distance:"+String.format("%.4f",P1.calculate(P1, P2)));
	}
}
}
