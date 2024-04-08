package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class MySecondJdbcExample {

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		 
		 Class.forName("com.mysql.cj.jdbc.Driver");   // step1
		 
		 Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/anudip","root","ADI#27#nal"); // step2 ---> Establish Connection

	     Statement stmt=conn.createStatement(); //step3 --->create statement
	     
	     ResultSet rs = stmt.executeQuery("select * from student") ;   // fetch data from database this exequtequery    // step4 ---> instruction to mysql   //it return resultset object
	     
	     int studid;
	     String studname;   // getting the all data in the specified format or data types
	     String divi;
	     int studrno;
	     
	     System.out.println("Student details....");
	     
	     System.out.println("=========================================");
	     
	     while(rs.next())
	     {
	    	 studid=rs.getInt(1);   // getting data from database in organize manner
	    	 studname= rs.getString(2);
	    	 divi =rs.getString(3);
	    	 studrno= rs.getInt(4);
	    	 
	    	 System.out.println(studid+" "+studname+" "+divi+" "+studrno);
	    	 
	    	 
	     }
	     conn.close();
	}

}

//delete update crud
