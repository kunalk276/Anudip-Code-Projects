package demoClass;

public class LampExample {


		  boolean isOn;

		  
		  void turnOn() {   // First method define for the turn on light
		    isOn = true;
		    System.out.println("Light ON? " + isOn);

		  }
		  
		  void turnOff()    // Second method define for the turn on light
		  {
			  isOn=false;
			  System.out.println("Light ON? " + isOn);
		  }
		  public static void main(String[] args) {
		    
			  
		    LampExample led1 = new LampExample();   // create object for Lamp

		    
		    led1.turnOn(); // Call a First function
		    
		    
		    LampExample led2 = new LampExample();
		    
		    led2.turnOff(); // call a second function
		    
		    
		  }
		}

	
