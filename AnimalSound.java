package oops;


class A2 {
 
 void makeSound()   // Method to make sound
 {
     System.out.println("Animal makes a sound");
 }
}

//Subclass
class Cat extends Animal {

 
 void makeSound()    // Overriding the makeSound method
 {
     System.out.println("Cat Meow");
 }
}


public class AnimalSound {
 public static void main(String[] args) {
     
     AnimalSound as = new AnimalSound();   // Create an instance of AnimalSound
     
     							
     as.makeSound("cat Meow");   // Make the animal sound
     
     
     Cat cat = new Cat(); // Create an instance of Cat
     
     
     cat.makeSound();  // Make the cat sound
 }

private void makeSound(String string) {
	
}


}

