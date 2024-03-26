package com.iostreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;



public class SerializeExample {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		FileOutputStream fos=new FileOutputStream("PDetails.txt");
		
		ObjectOutputStream oos=new ObjectOutputStream(fos);
		
		PersonExample ps=new PersonExample(4, "KUNAL");
		
		oos.writeObject(ps);
		
		oos.close();
		fos.close();
		System.out.println("File is Created....");
		
		System.out.println("===*===*===*===*===*===*===*===*===*===");

		FileInputStream fis=new FileInputStream("PDetails.txt");
		
		ObjectInputStream ois =new ObjectInputStream(fis);
		
		PersonExample pe=(PersonExample) ois.readObject();   //type casting (PersonExample)
		
		
		System.out.println(pe.getPid());   // Deserailzing -- primitive type Object convert
		System.out.println(pe.getPname());
		
		ois.close();
		fis.close();
		
	}

}
