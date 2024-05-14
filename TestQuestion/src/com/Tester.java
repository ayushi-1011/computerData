package com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;



public class Tester {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Person> pSet = new LinkedHashSet<Person>();
		
		
		int choice;
		while(true) {
			System.out.println("0.Exit"+"\n"+
					"1. add new person."+'\n'+
					"2. display all."+'\n'+
					"3. find by name."+'\n'+
					"4. save in file."+'\n'+
					"5. load from file."+'\n'+
					"6. display in sorted order of dist and name."+'\n');
			
			System.out.println("-------------------");
			System.out.println("Enter choice: ");
			choice=sc.nextInt();
			
			switch(choice) {
			case 1:
				//Add new person
				Person p = new Person();
				p.acceptData(sc);
				pSet.add(p);
				System.out.println("person added successfully...");
				break;
			case 2:
				//display all
				if(pSet.size()!=0) {
				for (Person person : pSet) {
					System.out.println(person);
				}
				}else {
					System.out.println("ADD PERSON");
				}
				
				break;
			case 3:
				//find name
				System.out.println("Enter name to search: ");
				String srchName = sc.next();
				
				Person key = new Person();
				key.setName(srchName);
				if(pSet.contains(key)) {
					System.out.println("Found...");
				}else {
					System.out.println("Not Found...");
				}
				break;
				
			case 4:
				//save file
				try(FileOutputStream fos = new FileOutputStream("file.txt")){
					try(ObjectOutputStream oos = new ObjectOutputStream(fos)){
						oos.writeObject(pSet);
					}
				}catch (Exception e) {
					e.printStackTrace();
				}
				
				break;
				
			case 5:
				//load file
				try(FileInputStream fis = new FileInputStream("file.txt")){
					try(ObjectInputStream ois = new ObjectInputStream(fis)){
						LinkedHashSet<Person> pHashSet = (LinkedHashSet<Person>)ois.readObject();
						for (Person person : pHashSet) {
							System.out.println(person);
						}
					}
				}catch (Exception e) {
					e.printStackTrace();
				}
				break;
				
			case 6:
				//
     			 SortDistName sortDistName = new SortDistName();
				 
				 List <Person> pList=new ArrayList <Person>(pSet);
				 Collections.sort(pList,sortDistName);
				 for (Person person : pList) {
					System.out.println(person);
				}
			}if(choice==0) break;
		}
		

	}

}
