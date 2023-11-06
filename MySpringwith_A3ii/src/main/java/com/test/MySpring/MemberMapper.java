package com.test.MySpring;

import java.sql.ResultSet;
import java.sql.SQLException;


import org.springframework.jdbc.core.RowMapper;

public class MemberMapper implements RowMapper<Member>{
	
	public Member mapRow(ResultSet rs,int rowNum) throws SQLException{
		Member mem = new Member();
		mem.setMid(rs.getInt("mid"));
		mem.setMname(rs.getString("mname"));
		mem.setMsalary(rs.getInt("msalary"));
		
		
		return mem;
		
	}
	

}
