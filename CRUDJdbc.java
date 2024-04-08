package com.jdbc;

	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.sql.Statement;

	public class CRUDJdbc
	{

	    public static void main(String[] args) throws ClassNotFoundException, SQLException 
	    {

	        Class.forName("com.mysql.cj.jdbc.Driver"); // step1  Load JDBC Driver

	        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/anudip", "root", "ADI#27#nal"); // step2 ---> Establish Connection

	        Statement stmt = conn.createStatement(); // step3 --->create statement Object

	        // Update Operation
	        String updateQuery = "UPDATE student SET divi = 'B' WHERE studid = 1";    //using statement update query
	        int rowsUpdated = stmt.executeUpdate(updateQuery);
	        System.out.println("Number of rows updated: " + rowsUpdated);

	        // Delete Operation
	        String deleteQuery = "DELETE FROM student WHERE studid = 2";                //using statement Delete query
	        int rowsDeleted = stmt.executeUpdate(deleteQuery);
	        System.out.println("Number of rows deleted: " + rowsDeleted);

	        // Data after update and delete
	        ResultSet rs = stmt.executeQuery("SELECT * FROM student"); // fetch data from database this exequtequery // step4
	                                                                    // ---> instruction to mysql //it return resultset object

	        int studid;
	        String studname; // getting the all data in the specified format or data types
	        String divi;
	        int studrno;

	        System.out.println("=========================================");
	        System.out.println("Student details....");

	        while (rs.next()) {
	            studid = rs.getInt(1); // getting data from database in organize manner
	            studname = rs.getString(2);
	            divi = rs.getString(3);
	            studrno = rs.getInt(4);

	            System.out.println(studid + " " + studname + " " + divi + " " + studrno);

	        }
	        conn.close();
	    }
	}
