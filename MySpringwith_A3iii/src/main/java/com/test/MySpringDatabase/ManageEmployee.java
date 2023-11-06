package com.test.MySpringDatabase;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.test.MySpringDatabase.Employee;
import com.test.MySpringDatabase.EmployeeMapper;

public class ManageEmployee implements EmployeeDAO {
	private JdbcTemplate jt;
	private DataSource dataSource;
	
	public DataSource getDataSource() {
		return dataSource;
	}

	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		jt=new JdbcTemplate(this.dataSource);
	}

	public void AddEmployee(Integer eid, String ename, Integer esalary) {
		// TODO Auto-generated method stub
		String SQL = "insert into employee values (?, ?, ?)";
		jt.update( SQL,eid, ename, esalary);
		System.out.println("Created Record Name = " + ename + " salary = " + esalary);
		return;
	}

	public void AddEmployee(Employee s) {
		String SQL = "insert into employee values (?, ?, ?)";
		jt.update( SQL,s.getEid(), s.getEname(), s.getEsalary());
		System.out.println("Created Record Name = " +s.toString());
		return;		
	}

	
	public List<Employee> getEmployee(Integer id) {
		 String SQL = "select * from employee where eid=?";
		List <Employee> emp = jt.query(SQL, new EmployeeMapper(),id);
		 return emp;
		
	}

	public List<Employee> listEmployee() {
		 String SQL = "select * from employee";
		// TODO Auto-generated method stub
		 List <Employee> emp = jt.query(SQL, new EmployeeMapper());
		return emp;
	}
	
}

	
