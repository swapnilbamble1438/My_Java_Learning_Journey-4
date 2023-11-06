package com.test;

import javax.sql.DataSource;

public interface TuitionDAO{
		
		public void setDataSource(DataSource ds);
		
		public void AddTuition(String Name,int Standard,String Division);
		
		public void AddTuition(Tuition a);
		
		public void UpdateTuition(Tuition u);
		
		public void DeleteTuition(Tuition d);
	}

