package com.sunbeam.entity;

import java.util.Date;

public class Module {
private int id;
private String name;
private int start_date;
private int days;
private String faculty;
private int batch_id;


public void Module() {
	
}


public Module(int id, String name, int start_date, int days, String faculty, int batch_id) {
	super();
	this.id = id;
	this.name = name;
	this.start_date = start_date;
	this.days = days;
	this.faculty = faculty;
	this.batch_id = batch_id;
}


public Module() {
	// TODO Auto-generated constructor stub
}


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public int getStart_date() {
	return start_date;
}




public int getDays() {
	return days;
}


public void setDays(int days) {
	this.days = days;
}


public String getFaculty() {
	return faculty;
}


public void setFaculty(String faculty) {
	this.faculty = faculty;
}


public int getBatch_id() {
	return batch_id;
}


public void setBatch_id(int batch_id) {
	this.batch_id = batch_id;
}


@Override
public String toString() {
	return "Module [id=" + id + ", name=" + name + ", start_date=" + start_date + ", days=" + days + ", faculty="
			+ faculty + ", batch_id=" + batch_id + "]";
}





}
