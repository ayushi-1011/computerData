package com.sunbeam.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.sunbeam.dbUtil.DbUtil;
import com.sunbeam.entity.Batch;

public class BatchDao implements AutoCloseable {
private Connection connection;

public BatchDao() throws SQLException{
	connection = DbUtil.getConnection();
}

public void insertBatch(Batch batch) throws SQLException {
	String sql = "INSERT INTO batches(name,course) VALUES(?,?)";
	try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
		preparedStatement.setString(1, batch.getName());
		preparedStatement.setString(2, batch.getCourse());
		preparedStatement.executeUpdate();
	}
}

@Override
public void close() throws Exception {
	// TODO Auto-generated method stub
	
}

}
