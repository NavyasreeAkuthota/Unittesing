package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public final class Clerk extends Empl{
	Clerk(String name,int age){
	    super(name,age,"Clerk",20000);
	    
	}
	public int raiseSalary() {
		int i=0;
		try{Class.forName("com.mysql.cj.jdbc.Driver");  
	   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/iprimed","root","Navya@123");
	     Statement st=con.createStatement();
	     int c=st.executeUpdate("update employee set salary=salary+4000 where designation='Clerk'");
	     i=1;
	     con.close();
	}finally{
		return i;}
}

}
