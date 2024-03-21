////  *Comparable* and *Comparator* both interfaces used to sort collection elements.
////  *Comparable* provides a single sorting sequence.
////  *Comparator* provides multiple sorting sequences
////  *Comparable* provides compareTo() method to sort elements.
////  *Comparator* provides compare() method to sort elements.
////	*Comparable* is present in java.lang package.
////  *Comparator* is present in the java.util package.
//package com.collections;
//
//import java.util.ArrayList;
//import java.util.Collections;
//
//public class Student implements Comparable<StudentTest>
//{
//	int id;
//	String name;
//	int age;
//	
//	public StudentTest(int id, String name, int age)   //  create Parameterized constructor  using right click
//	{
//		super();
//		this.id = id;           // this keyword used for declare variable and passing parameter are equals  tells compiler this two are not different
//		this.name = name;
//		this.age = age;
//	}
//
//	@Override
//	public int compareTo(StudentTest o)  // 'compareTo' used within a class compare  // unimplemented student class can override here 
//	{
//		if (age == o.age)
//		{
//			return 0;
//		}
//		else if(age > o.age)
//		{
//			return 1;
//			
//		}
//		else
//		{
//			return -1;
//		}
//	}
//	
//}
//
//public class StudentTest
//{
//
//	public static void main(String[] args) 
//	{
//		
//		ArrayList<StudentTest> al=new ArrayList<StudentTest>();
//		
//		StudentTest s1=new StudentTest(1,"KUNAL" , 22);  // parameterized constructor asking for value that declare in Student Constructor
//		StudentTest s2=new StudentTest(2,"Sagar" , 23);
//		StudentTest s3=new StudentTest(3,"Rohit" , 21);
//		StudentTest s4=new StudentTest(4,"Rajan" , 24);
//		
//		al.add(s1);   // using ArrayList  Store the objects 
//		al.add(s2);
//		al.add(s3);
//		al.add(s4);
//		
//		Collections.sort(al);   // sorting the object of ArrayList  al
//		
//		for(StudentTest s:al)   // Create student reference 
//		{
//			System.out.println(s.id+" "+ s.name+" "+s.age);   // Print the list Age ascending
//		}
//	}
//
//}
