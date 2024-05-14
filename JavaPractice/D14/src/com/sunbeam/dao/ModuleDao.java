package com.sunbeam.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Date;
import com.sunbeam.dbUtil.DbUtil;
import com.sunbeam.entity.Module;

public class ModuleDao implements AutoCloseable {
private Connection connection;

public ModuleDao() throws SQLException{
	connection = DbUtil.getConnection();
}

public void insertModule(Module module) throws SQLException {
	String sql = "INSERT INTO modules(name,start_date,days,faculty,batch_id) VALUES(?,?,?,?,?)";
	try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
		preparedStatement.setString(1, module.getName());
		preparedStatement.setDate(2, (Date) module.getStart_date());
		preparedStatement.setInt(3,module.getDays());
		preparedStatement.setString(4,module.getFaculty());
		preparedStatement.setInt(5,module.getBatch_id());
		preparedStatement.executeUpdate();
	}
}

@Override
public void close() throws Exception {
	// TODO Auto-generated method stub
	
}

}
