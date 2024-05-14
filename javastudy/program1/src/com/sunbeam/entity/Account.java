package com.sunbeam.entity;

public class Account {
private String name;
private String email;
private int phone;
private int balance;

public Account() {
	
}

public Account(String name, String email, int phone, int balance) {
	super();
	this.name = name;
	this.email = email;
	this.phone = phone;
	this.balance = balance;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public int getPhone() {
	return phone;
}

public void setPhone(int phone) {
	this.phone = phone;
}

public int getBalance() {
	return balance;
}

public void setBalance(int balance) {
	this.balance = balance;
}

@Override
public String toString() {
	return "Account [name=" + name + ", email=" + email + ", phone=" + phone + ", balance=" + balance + "]";
}

}
