package com;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.Scanner;

public class Person implements Serializable{

	private String name;
	private Date birthDate;
	private Address homeAddr;
	
	public Person() {
		
	}
	
	public Person(String name, Date birthDate, Address homeAddr) {
		
		this.name = name;
		this.birthDate = birthDate;
		this.homeAddr = homeAddr;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Address getHomeAddr() {
		return homeAddr;
	}

	public void setHomeAddr(Address homeAddr) {
		this.homeAddr = homeAddr;
	}
	
	public void acceptData(Scanner sc) {
		System.out.println("Enter name: ");
		name=sc.next();
		
		System.out.println("Enter date(dd/mm/yyyy): ");
		String dateString = sc.next();
        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");
        try {
			birthDate = format.parse(dateString);
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
        
        System.out.println("Enter Address:");
        homeAddr = new Address();
        homeAddr.acceptData(sc);
	}
	


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Person))
			return false;
		Person other = (Person) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", birthDate=" + birthDate + ", homeAddr=" + homeAddr + "]";
	}

	

}
class SortDistName implements Comparator<Person>{

	@Override
	public int compare(Person o1, Person o2) {
		int DistCompare = o1.getHomeAddr().getDist().compareTo(o2.getHomeAddr().getDist());
		int NameCompare = o1.getName().compareTo(o2.getName());
		return (DistCompare == 0)?NameCompare:DistCompare;
	}
	
}

