package com.test;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public final class Programmer extends Empl {
	Programmer(String name,int age){
	    super(name,age,"Programmer",20000);
	    
	}
	public int raiseSalary() {
		int i=0;
		try{Class.forName("com.mysql.cj.jdbc.Driver");  
	   Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/iprimed","root","Navya@123");
	     Statement st=con.createStatement();
	     int c=st.executeUpdate("update employee set salary=salary+6000 where designation='Programmer'");
	     i=1;
	}finally {  return i;}
}
}
