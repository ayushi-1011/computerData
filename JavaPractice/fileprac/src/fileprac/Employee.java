package fileprac;

import java.io.Serializable;

public class Employee implements Serializable{
int empid;
String name;
double salary;
public Employee(int empid,String name,double salary) {
	this.empid=empid;
	this.name=name;
	this.salary=salary;
}
public Employee() {
	
}
@Override
public String toString() {
	return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + "]";
}

}
