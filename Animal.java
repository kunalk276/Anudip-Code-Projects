package oops;

class A1{

 void move()  // Method 
 {
     System.out.println("Animal moves");
 }
}

//Subclass
class Cheetah extends Animal {
 
 
 void move() {
     System.out.println("Cheetah runs");
 }
}

//Main class
public class Animal {
 public static void main(String[] args) {
     
    
	 Animal animal = new Animal();   // Create an instance of Animal
      
          animal.move();    // Move the animal

     
    
     Cheetah cheetah = new Cheetah();    // Create an instance of Cheetah
     
     
     cheetah.move();         // Move the cheetah
 }

 void move() {
		
}
}
