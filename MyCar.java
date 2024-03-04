package demoClass;

public class MyCar {
 
  // Create a fullThrottle() method
  public void fullThrottle() 
  {
    System.out.println("The car is going  slow Please SPEED UP !");
  }

  // Create a speed() method
  public void speed(int maxSpeed) 
  {
    System.out.println("Max speed is: " + maxSpeed);
  }

  // Inside main method myCar object
  public static void main(String[] args) {
    MyCar myCar = new MyCar();     // Create myCar object
    
    myCar.fullThrottle();      // Calling fullThrottle()method
    
    myCar.speed(100);          // Calling speed()method
  }
}
