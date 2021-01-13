package com.antriksh.sm.api.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.beans.factory.annotation.Autowired;

import com.antriksh.sm.api.Student;

public class StudentRowMapper implements org.springframework.jdbc.core.RowMapper<Student> {
	@Autowired
	private Student stu;

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		stu.setId(rs.getInt("id"));
		stu.setName(rs.getString("name"));
		stu.setMobile(rs.getLong("mobile"));
		stu.setCountry(rs.getString("country"));
		return null;
	}
}
