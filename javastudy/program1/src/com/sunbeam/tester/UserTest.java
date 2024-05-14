package com.sunbeam.tester;

import java.sql.SQLException;
import java.util.Scanner;

import com.sunbeam.dao.UserDao;
import com.sunbeam.entity.User;

public class UserTest {
public static void main(String[] args) throws SQLException, Exception {
	try(UserDao userDao = new UserDao()){
		try(Scanner sc = new Scanner(System.in)){
			User user = new User();
			System.out.println("enter email:");
			user.setEmail(sc.next());
			System.out.println("enter password:");
			user.setPassword(sc.next());
			
			userDao.insertUser(user);
			System.out.println("user added");
		}
		
	}catch(SQLException e) {
		e.printStackTrace();
	}
}
}
