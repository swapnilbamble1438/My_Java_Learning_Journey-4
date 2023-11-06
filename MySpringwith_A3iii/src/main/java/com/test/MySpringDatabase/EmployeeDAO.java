package com.test.MySpringDatabase;

import javax.sql.DataSource;

public interface EmployeeDAO {

	// This is the method to be used to initialize database resources ie. connection
	public void setDataSource(DataSource ds);
	// This is the method to be used to create a record in the Student table.
	public void AddEmployee(Integer eid,String ename, Integer esalary);
	public void AddEmployee(Employee s);
	
}
