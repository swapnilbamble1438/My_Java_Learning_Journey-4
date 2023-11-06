package com.test.MySpring;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.JdbcTemplate;

import com.test.MySpring.Member;
import com.test.MySpring.MemberMapper;

public class ManageMember implements MemberDAO {
	
	private JdbcTemplate jt;
	private DataSource dataSource;
	   
	public DataSource getDataSource() {
		return dataSource;
	}
	
	public void setDataSource(DataSource dataSource) {
		this.dataSource = dataSource;
		jt = new JdbcTemplate(this.dataSource);
	}
	
	public void AddMember(Integer mid, String mname, Integer msalary) {
		
		String SQL = "insert into member values(?,?,?)";
		jt.update(SQL, mid, mname, msalary);
		System.out.println("Created Record Name = " + mname + " salary = " + msalary);
		return;	
	}
	
	public void AddMember(Member s) {
		String SQL = "insert into member values(?,?,?)";
		jt.update(SQL,s.getMid(),s.getMname(),s.getMsalary());
		System.out.println("Created Record Name = " + s.toString());
	}
	
	
	
	public List<Member> getEmployee(Integer id){
		String SQL = "select * from member where eid = ?";
		List<Member> mem = jt.query(SQL, new MemberMapper(),id);
		return mem;	
	}
	
	
	public List<Member> listMember() {
		String SQL = "select * from member";
		List<Member> mem = jt.query(SQL, new MemberMapper());
		return mem;
		
	}
	
	public void UpdateMember(Member u) {
		String SQL = "update member set  mid = ?,mname = ?, msalary = ? where mid = 3";
		jt.update(SQL,u.getMid(),u.getMname(),u.getMsalary());
		System.out.println("Updated Record Name = " + u.toString());
	}
	
	public void DeleteMember(Member d) {
		String SQL = "delete from member where mid = ?";
		jt.update(SQL,d.getMid());
		System.out.println("Deleted Record Name = " + d.toString());
	}
	
	

}
