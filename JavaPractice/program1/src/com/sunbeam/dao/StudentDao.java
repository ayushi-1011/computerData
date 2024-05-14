package com.sunbeam.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.sunbeam.entity.Student;
import com.sunbeam.util.DbUtil;

public class StudentDao implements AutoCloseable {
	private Connection connection;
	
public StudentDao() throws SQLException{
	connection = DbUtil.getConnection();
}

public void insertStudent(Student student) throws SQLException{
	String sql= "INSERT INTO student(name,marks,mobile)VALUES(?,?,?)";
	try(PreparedStatement preparedStatement=connection.prepareStatement(sql)){
	preparedStatement.setString(1,student.getName());
	preparedStatement.setDouble(2, student.getMarks());
	preparedStatement.setString(3, student.getMobile());
	preparedStatement.executeUpdate();
}
}
public List<Student> getAllStudents() throws SQLException {
	String sql = "SELECT * FROM student";
	try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
		ResultSet rs = preparedStatement.executeQuery();
		List<Student> studentsList = new ArrayList<Student>();
		Student student;
		while (rs.next()) {
			student = new Student();

			student.setRollno(rs.getInt(1));
			student.setName(rs.getString(2));
			student.setMarks(rs.getDouble(3));
			student.setMobile(rs.getString(4));

			studentsList.add(student);
		}
		return studentsList;
	}
}
public Student findStudent(int rollno) throws SQLException {
	String sql = "SELECT * FROM student WHERE rollno = ?";
	try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
		preparedStatement.setInt(1, rollno);
		ResultSet rs = preparedStatement.executeQuery();
		if(rs.next()) {
			Student student = new Student();
			student.setRollno(rollno);
			student.setName(rs.getString(2));
			student.setMarks(rs.getDouble(3));
			student.setMobile(rs.getString(4));
			return student;
		}
		return null;
	}

}

	@Override
	public void close() throws Exception {
	if(connection!=null)
		connection.close();
	}
	

}
