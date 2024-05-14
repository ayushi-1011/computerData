package com.sunbeam.shape.dim2d;

import java.util.Scanner;

public class rectangle {


int length;
int breadth;

public void accept()
{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter length and breadth:");
	length = sc.nextInt();
	breadth = sc.nextInt();
}
public void display() {
	System.out.println("rectangle:"+(length*breadth));
}
}