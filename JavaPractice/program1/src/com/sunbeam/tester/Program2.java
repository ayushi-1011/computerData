package com.sunbeam.tester;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import com.sunbeam.dao.StudentDao;
import com.sunbeam.entity.Student;

public class Program2 {
	
	

	public static void main(String[] args) throws Exception {
		try(StudentDao studentDao = new StudentDao()){
			List<Student> studentsList = studentDao.getAllStudents();
			for (Student student : studentsList)
					System.out.println(student);
		}
		catch (SQLException e) {
			e.printStackTrace();
		}
		System.out.println("-------------------------------");
		List<Student> studentsList = new ArrayList<Student>();
		StudentDao studentDao = new StudentDao();
		studentsList = studentDao.getAllStudents();
		System.out.println("student sorted on empid -->");
		Collections.sort(studentsList,(e1,e2)-> Double.compare(e1.getMarks(), e2.getMarks()));
		studentsList.forEach(e -> System.out.println(e));
		
		System.out.println();
		System.out.println("student sorted on Name -->");
		Collections.sort(studentsList,(e1,e2)-> e1.getName().compareTo(e2.getName()));
		studentsList.forEach(e-> System.out.println(e));
		
		
	}

}
