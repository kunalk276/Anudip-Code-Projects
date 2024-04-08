package com.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class PreparedStatementExample {



	public static void main(String[] args) throws ClassNotFoundException, SQLException {
       Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/anudip", "root", "ADI#27#nal");
		int studid;
	     String studname;   // getting the all data in the specified format or data types
	     String divi;
	     int studrno;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("\n Please fill Student Detals Details");
		System.out.println("Enter The Id");
		studid= sc.nextInt();
		System.out.println("Enter The name");
		studname= sc.next();
		System.out.println("Enter The Division");
		divi= sc.next();
		System.out.println("Enter The Roll Number");
		studrno= sc.nextInt();
		
		
		PreparedStatement pstmt=conn.prepareStatement("insert into student values(?,?,?,?)");
		
		pstmt.setInt(1, studid);
		pstmt.setString(2, studname);
		pstmt.setString(3, divi);
		pstmt.setInt(4, studrno);
		
		
		int i=pstmt.executeUpdate();
		conn.close();
		System.out.println(i + "This is also added");
	}

}
