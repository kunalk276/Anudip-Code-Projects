package demo;
// No concreate classs will have a abstract method
// It is not compulsory that abstract class must have abstract methods. 
// It may or may not have abstract methods. 
// But the class which has at least one abstract method must be declared as abstract.
// Abstract Class can be a combination of concrete and abstract methods.
// Any class extending an abstract class must implement all abstract methods. 
// If it does not implement, it must be declared as abstract.
// Abstract method can not be private , Static 
//Constructor & Field cannot be declare abstract 

 abstract class Animal   
{
	  int i;
	  
	 public Animal () //constructor create
	 {
		 
	 }
	  abstract void soundAnimal(); // Abstract method -->  by default public
	
	void display()   // Concrete method
	{
		
		
	}
	
	void kunal()
	{
		
		
	}
	
	//abstract void ABC();
	
} 

class Cat extends Animal
{

	@Override
	void soundAnimal() {
		// TODO Auto-generated method stub
		 System.out.println("Meow..");
	}

	void ABC() {
		// TODO Auto-generated method stub
		
	}
	


}

class Cow extends Animal
{

	@Override
	void soundAnimal() {
		// TODO Auto-generated method stub
		 System.out.println("Hamma.. ");
	}

	void ABC() {
		// TODO Auto-generated method stub
		
	}
	
	

}

public class AbstractDemo {

	public static void main(String[] args) {
		// You cannot create object of a class
		
		// Animal a1=new Animal();
		
		Cat c1=new Cat(); // 
		Animal a1 = c1 ;  // refrence variable 
		
		// Concrete class object is auto upcasted to the abstrct class

	}

}
