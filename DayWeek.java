package stringdemo;

import java.util.Scanner;

public class DayWeek 
{

	public static void main(String[] args)
	{
		 Scanner scanner = new Scanner(System.in);
	        
	        
	        System.out.print("Enter the date (in format DD MM YYYY): ");   //  user enter the date
	        int day = scanner.nextInt();
	        int month = scanner.nextInt();
	        int year = scanner.nextInt();

	        
	        scanner.close();  // avoid resource leak

	        // Calculate the day of the week using Zeller's Congruence algorithm
	        int dayOfWeek = calculateDayOfWeek(day, month, year);

	        // Display the day of the week
	        System.out.println("The day of the week is: " + getDayOfWeekName(dayOfWeek));
	    }

	    
	    public static int calculateDayOfWeek(int day, int month, int year) // Method to calculate the day of the week 
	    {
	        if (month < 3) 
	        {
	            month += 12;
	            year--;
	        }
	        int century = year / 100;
	        year = year % 100;

	        int dayOfWeek = (day + ((13 * (month + 1)) / 5) + year + (year / 4) + (century / 4) - (2 * century)) % 7;

	        
	        if (dayOfWeek < 0)  //  set of calendar fields
	        {
	            dayOfWeek += 7;
	        }

	        return dayOfWeek;
	    }

	    // Method to get name of day of week
	    public static String getDayOfWeekName(int dayOfWeek) //Method
	    {
	        switch (dayOfWeek) 
	        {
	            case 0:
	                return "Saturday";
	            case 1:
	                return "Sunday";
	            case 2:
	                return "Monday";
	            case 3:
	                return "Tuesday";
	            case 4:
	                return "Wednesday";
	            case 5:
	                return "Thursday";
	            case 6:
	                return "Friday";
	            default:
	                return "Invalid day";
	        }
	    }
	}