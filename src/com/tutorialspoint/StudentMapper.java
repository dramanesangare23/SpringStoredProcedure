package com.tutorialspoint;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class StudentMapper implements RowMapper<Student>{

	@Override
	public Student mapRow(ResultSet resultSet, int rowNum) throws SQLException {
		Student student = new Student();
		student.setAge(resultSet.getInt("age"));
		student.setName(resultSet.getString("name"));
		student.setId(resultSet.getInt("id"));
		return student;
	}
	
}
