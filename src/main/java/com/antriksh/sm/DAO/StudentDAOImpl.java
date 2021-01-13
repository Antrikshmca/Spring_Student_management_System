package com.antriksh.sm.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.antriksh.sm.api.Student;
import com.antriksh.sm.api.rowmapper.StudentRowMapper;
@Repository
public class StudentDAOImpl implements StudentDAO {

	@Autowired
	private JdbcTemplate jt;
	@Override
	public List<Student> loadStudent() {
		List<Student> list=new ArrayList<>();
		String sql="SELECT * FROM student";
		jt.query(sql, new StudentRowMapper());
		return list;
	}

}
