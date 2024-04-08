/*
 * 1.Java API for connecting and executing SQL statements in  a relational database. 
 * 2.java(JDBC API)application
 * 3.JDBC provides classes and interfaces to establish connections with databases.
 * 4.connection is established, you can create Statement or PreparedStatement objects to execute SQL statements.
 * 5.JDBC methods may throw SQLException , try catch block use , properly close resources like connections, statements, and result sets in a finally block
 * 6.JDBC drivers can  four types: 1.native code 2.native client 3.middle-tier server 4. pure Java drivers.
 * 7.JDBC supports databases including MySQL, PostgreSQL, Oracle, SQL Server, SQLite.
 *
 * Structure of URL >--->	//(java) API:Database ://LocalMachine:port is always 3306/database name
 * //1.Register driver
  //com.mysql.cj.jdbc.Driver.   >---->   Driver. is a class here and   com.mysql.cj.jdbc. is a package
		
 * */
package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class FirstJdbcExample
{
	
    
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		
		Class.forName("com.mysql.cj.jdbc.Driver");  // step1 --> this is a class type of a driver 
      
        Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/anudip","root","ADI#27#nal"); // step2 ---> Establish Connection

        Statement stmt=conn.createStatement(); //step3 --->create statement
     
     //studid  int  studname varchar(20) divi varchar(2)  studrno int   //database columns
     
        stmt.executeUpdate("insert into student values(2,'Rohit','A',223257)");   // step4 >---> using the executeUpdate Insert value in database externally
        System.out.println("Record Inserted Sucessfully");     // Operation performed
    }

       			
}


