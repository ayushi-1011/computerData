package com.sunbeam;

public class Date {
private int day;
private int month;
private int year;

public Date() {
	this(1,1,1990);
}

public Date(int day,int  month,int year) {
	this.day=day;
	this.month=month;
	this.year=year;
	System.out.println("parameterized");
}
public void setYear(int year) {
	this.year=year;
}

public int getYear() {
	return year;
}
public void display()
{
	System.out.println("day"+day+"month"+month+"year"+year);
}
}
