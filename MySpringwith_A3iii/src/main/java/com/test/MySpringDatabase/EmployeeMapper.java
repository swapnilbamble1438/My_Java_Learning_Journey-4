package com.test.MySpringDatabase;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class EmployeeMapper implements RowMapper<Employee>{

	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		Employee emp=new Employee();
		 emp.setEid(rs.getInt("eid"));
		 emp.setEname(rs.getString("ename"));
		 emp.setEsalary(rs.getInt("esalary"));
		// TODO Auto-generated method stub
		return emp;
	}

}
