package com.test;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

public class ManageTuition implements TuitionDAO{
	
	private JdbcTemplate jt;
	private DataSource dataSource;
	
	
	public DataSource getDataSource() {
		return dataSource;
	}
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		jt = new JdbcTemplate(this.dataSource);
	}
	
	public void AddTuition(String Name,int Standard,String Division)
	{
		String sql = "insert into Tuition values(?,?,?)";
		jt.update(sql, Name,Standard,Division);
		
		System.out.println("Created Record: Name = " + Name +  " Standard = " + Standard + " Division = " + Division);
		
	}
	
	public void AddTuition(Tuition a){
		String sql = "insert into Tuition values(?,?,?)";
		jt.update(sql,a.getName(),a.getStandard(),a.getDivision());
		System.out.println("Created Record Name = "+ a.toString());
		
	}
	
	public List<Tuition> ListTuition(){
		String sql = "select * from Tuition";
		List<Tuition> t = jt.query(sql, new TuitionMapper());
		return t;
	}
	
	public void UpdateTuition(Tuition u)
	{
		String sql = "update Tuition set Name = ?,Standard = ?, Division = ? where Name = ?";
		jt.update(sql,u.getName(),u.getStandard(),u.getDivision());
		System.out.println("Updated Record Name = " + u.toString());
	}
	
	public void DeleteTuition(Tuition d)
	{
		String sql = "delete from Tuition where Name = ?";
		jt.update(sql,d.getName());
		System.out.println("Delete Record Name = " + d.toString());
	}
}
