package com.sunbeam.tester;

import java.sql.SQLException;
import java.util.Scanner;

import com.sunbeam.dao.StudentDao;
import com.sunbeam.entity.Student;

public class Program01 {
public static void main(String[] args) {
	try(StudentDao studentDao = new StudentDao()){
		try(Scanner sc = new Scanner(System.in)){
			Student student =new Student();
			System.out.println("Enter name-");
			student.setName(sc.next());
			System.out.println("enter marks-");
			student.setMarks(sc.nextDouble());
			System.out.println("enter mobile-");
			student.setMobile(sc.next());
			
			studentDao.insertStudent(student);
			System.out.println("added");
		}
	} catch (SQLException e) {
	
		e.printStackTrace();
	
} catch (Exception e1) {
		
		e1.printStackTrace();
	}
}
}