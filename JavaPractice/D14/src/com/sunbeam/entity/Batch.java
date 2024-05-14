package com.sunbeam.entity;

public class Batch {
private int id;
private String name;
private String course;

public Batch() {
	
}
public Batch(int id,String name,String course) {
     this.id=id;
	this.name=name;
	this.course=course;
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
public String getCourse() {
	return course;
}
public void setCourse(String course) {
	this.course = course;
}
@Override
public String toString() {
	return "Batch [id=" + id + ", name=" + name + ", course=" + course + "]";
}

}
