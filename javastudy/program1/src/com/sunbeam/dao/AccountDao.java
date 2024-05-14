package com.sunbeam.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.sunbeam.entity.Account;
import com.sunbeam.util.DbUtil;

public class AccountDao implements AutoCloseable {
	private Connection connection;
	
	public AccountDao() throws SQLException {
		connection = DbUtil.getConnection();
	}
public void insertAccount(Account account) throws SQLException{
	String sql = "insert into Account(name,email,phone,balance) values(?,?,?,?)";
	try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){
		preparedStatement.setString(1, account.getName());
		preparedStatement.setString(2, account.getEmail());
		preparedStatement.setInt(2, account.getPhone());
		preparedStatement.setInt(2, account.getBalance());
		preparedStatement.executeUpdate();
	}
}
	@Override
	public void close() throws Exception {
		// TODO Auto-generated method stub
		
	}

}
