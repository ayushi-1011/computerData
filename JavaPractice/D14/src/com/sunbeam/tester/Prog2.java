package com.sunbeam.tester;

import java.util.Scanner;
import java.sql.Date;
import com.sunbeam.dao.ModuleDao;

import com.sunbeam.entity.Module;

public class Prog2 {
public static void main(String[] args) throws Exception{
	try(ModuleDao moduleDao = new ModuleDao()){
		try(Scanner sc = new Scanner(System.in)){
			Module module = new Module();
		
			System.out.println("enter name:");
			module.setName(sc.next());
			module.setStart_date(sc.nextInt());
		}
	}
}
}
