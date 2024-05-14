package com.sunbeam;

import java.util.Scanner;

public class Time {
	
private int hrs;
private int mins;

public Time() {
	System.out.println("ctor called");
	hrs = 10;
	mins=10;
}

public Time(int hrs,int mins) {
	System.out.println("parameterized");
	this.hrs=hrs;
	this.mins=mins;
}
public void accept()

{
	Scanner sc = new Scanner(System.in);
	System.out.println("enter the hrs");
	hrs=sc.nextInt();
	System.out.println("enter the min");
	mins = sc.nextInt();
	
}
void setHrs(int hrs) {
	this.hrs=hrs;
}
int getHrs() {
	return hrs;
}
public void display() {
	System.out.println("time-"+ hrs + ":" + mins);
	
}

}
