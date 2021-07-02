package com.test;

import java.sql.DriverManager;
import java.sql.*;

public final class Manager extends Empl {
	Manager(String name,int age){
	    super(name,age,"Manager",30000);
	    
	}
	public int raiseSalary() {
		int i=0;
		try{Class.forName("com.mysql.cj.jdbc.Driver");  
	   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/iprimed", "root", "Navya@123");
	     Statement st=con.createStatement();
	     int c=st.executeUpdate("update employee set salary=salary+5000 where designation='Manager'");
	     i=1;
		}finally { return i; }
}
}