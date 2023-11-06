package com.test.MySpring;

import javax.sql.DataSource;

public interface MemberDAO {
	
	public void setDataSource(DataSource ds);
	
	public void AddMember(Integer mid, String mname, Integer msalary);
		
	public void AddMember(Member s);
	
	public void UpdateMember(Member u);
	
	public void DeleteMember(Member d);
	

}
