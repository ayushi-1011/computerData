package com.sunbeam.tester;

import java.sql.SQLException;
import java.util.Scanner;

import com.sunbeam.dao.AccountDao;
import com.sunbeam.entity.Account;

public class AccountTest {
	public static void main(String[] args) throws SQLException, Exception {
		try(AccountDao accountDao = new AccountDao()){
			try(Scanner sc = new Scanner(System.in)){
				Account account = new Account();
				System.out.println("enter name:");
				account.setName(sc.next());
				System.out.println("enter email:");
				account.setEmail(sc.next());
				System.out.println("enter phone:");
				account.setPhone(sc.nextInt());
				System.out.println("enter balance:");
				account.setBalance(sc.nextInt());
				
				accountDao.insertAccount(account);
				System.out.println("account added");
				
				
			}
		}catch(SQLException e){
			e.printStackTrace();
		}
	}

}
