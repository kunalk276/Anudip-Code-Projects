
// INHERITANCE Example
// IS-A relationship
// eg. car IS A Vehicle

package oops;






class Vehicle1
{
	String brand="TOYOTA";  // vehicle Attribute
	
	public void horn() // Vehicle Method
	{
		System.out.println("BeeP BeeP ......");
	}
}


public class CarExample extends Vehicle1 {

	String modelName="INNOVA";  // Car attribute
	
	public static void main(String[] args) {

		CarExample  myCar = new CarExample(); // Create myCar object name
				
		myCar.horn();  // calling horn method  from Vehicle class
		
		// For display records
		
		System.out.println(myCar.brand+" "+myCar.modelName);
	}

}
