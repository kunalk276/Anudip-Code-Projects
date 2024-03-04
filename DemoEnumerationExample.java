package demo;
// Enumeration(enum )-- use to set constant , it like class  , constant means it can not change in execution 
// enum used for also --Shape , Days , Month ,

enum Direction
{
	North,
	South,
	East,
	West
}

enum Shapes 
{
    Circle,
    Square,
    Triangle
}

enum Days 
{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY
}

enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER
}

public class DemoEnumerationExample {

	public static void main(String[] args) {

		// this for single data fetch one by one 
		
		// For Direction
		Direction d1=Direction.North;
		Direction d2=Direction.South;
		
		
		System.out.println("The first : "+d1);
		System.out.println("The Second : "+d2);

		
		//  for Shape 
        Shapes shape1 = Shapes.Circle;
        Shapes shape2 = Shapes.Square;

        System.out.println("Shape 1: " + shape1);
        System.out.println("Shape 2: " + shape2);

        //for Days 
        Days day1 = Days.MONDAY; // object declare
        Days day2 = Days.WEDNESDAY;

        System.out.println("Day 1: " + day1);
        System.out.println("Day 2: " + day2);

        // For Month 
        Month month1 = Month.JANUARY;
        Month month2 = Month.APRIL;

        System.out.println("Month 1: " + month1);
        System.out.println("Month 2: " + month2);
		
        
        
		// this is for group fetch by using for each
        
        // For Direction
		for(Direction dir : Direction.values())
		{
			System.out.println(dir);
		}
		
		// for Shape
        System.out.println("Shapes:");
        for (Shapes shape : Shapes.values())
        {
            System.out.println(shape);
        }

        //  for Days
        System.out.println("\nDays of the week:");
        for (Days day : Days.values())
        {
            System.out.println(day);
        }

        // for Month
        System.out.println("\nMonths of the year:");
        for (Month month : Month.values()) 
        {
            System.out.println(month);
        }


		// using else if
		
        // For Direction
		Direction dir = Direction.North; // Assuming Direction.North is defined
		if (dir == Direction.East)
		{
		    System.out.println("Direction : East");
		} else if (dir == Direction.West) 
		{
		    System.out.println("Direction : West");
		}
		
		// For Shapes
		Shapes shape = Shapes.Square;  // enum type -->.square
        if (shape == Shapes.Circle) {
            System.out.println("Shape: Circle");
        } else if (shape == Shapes.Square) {
            System.out.println("Shape: Square");
        }
        
        // For Days 
        Days day = Days.MONDAY;
        if (day == Days.MONDAY) {
            System.out.println("Day: Monday");
        } else if (day == Days.TUESDAY) {
            System.out.println("Day: Tuesday");
        } 
        
        // For Year
        Month month = Month.JANUARY;
        if (month == Month.JANUARY) {
            System.out.println("Month: January");
        } else if (month == Month.FEBRUARY) {
            System.out.println("Month: February");
        } 
	}

}
