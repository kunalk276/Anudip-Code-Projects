package com.iostreams;

import java.io.DataInput;
import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;

public class PrimitiveIOExample {

	
	public static void main(String[] args) throws IOException {
		
		FileOutputStream fos =new FileOutputStream("primitive.txt");
		
		DataOutputStream dos=new DataOutputStream(fos);   //Created object of a  DataOutputStream
		
		dos.writeBoolean(true);   // pass the object and call a method
		dos.writeInt(27);
		dos.writeDouble(2.7);

		dos.close();
		fos.close();
		
		System.out.println("File is Created");
		
		System.out.println();
		System.out.println("===*===*===*===*===*===*===*===*===*===");
		System.out.println();
		
		System.out.println("File Reading");
		
		System.out.println();
		
		
		FileInputStream fis=new  FileInputStream("primitive.txt");
		DataInputStream dis=new DataInputStream(fis);
		
		System.out.println(dis.readBoolean());    // If the sequence is changed in primitive data its show default value 
		System.out.println(dis.readInt());
		System.out.println(dis.readFloat());
		
		
		dis.close();
		fis.close();
	}

}

