package com.sunbeam;

import java.util.Scanner;

public abstract class Player {
	int id;
	String name;
	int age;
	int matchesPlayed;
	

	public Player() {
		
	}
	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", age=" + age + ", matchesPlayed=" + matchesPlayed;
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


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getMatchesPlayed() {
		return matchesPlayed;
	}


	public void setMatchesPlayed(int matchesPlayed) {
		this.matchesPlayed = matchesPlayed;
	}
Scanner sc = new Scanner(System.in);

	public  void accept() {
		System.out.println("enter id:");
		id = sc.nextInt();
		System.out.println("enter name:");
		name = sc.next();
		System.out.println("enter age");
		age =sc.nextInt();
		System.out.println("enter matches played:");
		matchesPlayed = sc.nextInt();
	};

}
