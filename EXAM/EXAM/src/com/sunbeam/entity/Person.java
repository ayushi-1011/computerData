package com.sunbeam.entity;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;


class Person implements Serializable {
    private String name;
    private Date birthDate;
    private Address homeAddr;

    public Person(String name, Date birthDate, Address homeAddr) {
        this.name = name;
        this.birthDate = birthDate;
        this.homeAddr = homeAddr;
    }

    // Getters and setters
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

    @Override
    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        return "Name: " + name + ", Birth Date: " + sdf.format(birthDate) + ", Address: " + homeAddr;
    }
}
