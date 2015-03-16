package com.gavin.jdbc.dao.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.SimpleJdbcTemplate;
import org.springframework.stereotype.Service;
import com.gavin.jdbc.SpringJdbcSql;
import com.gavin.jdbc.Student;
import com.gavin.jdbc.dao.StudentDao;

/**
 * 
 * @author wenguang.xu
 *
 */
@Service
public class StudentDaoJdbcImpl implements StudentDao {

	@Autowired
	private SimpleJdbcTemplate jdbcTemplate;

	@Override
	public void updateStudent(Student stu) {
		jdbcTemplate.update(SpringJdbcSql.UPDATE_STUDENT, stu.getName(),stu.getAddress(),stu.getId());
	}
}
