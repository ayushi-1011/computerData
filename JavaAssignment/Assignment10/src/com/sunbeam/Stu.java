package com.sunbeam;
public class Stu implements Comparable<Stu>{
int rollno;
String name;
int marks;

	public Stu() {
		// TODO Auto-generated constructor stub
	}
public Stu(int rollno,String name,int marks) {
	this.rollno=rollno;
	this.name=name;
	this.marks=marks;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	@Override
	public String toString() {
		return "Stu [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}
	@Override
	public int compareTo(Stu o) {
		return Integer.compare(o.marks, this.marks);
	}

}
