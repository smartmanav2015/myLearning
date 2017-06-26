package com.sapient.writeReplace.readResolve;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;





public class WriteReplaceTest implements Serializable {
	
	static String file = "c:\\serial.ser";
	
	public static void main (String args []) throws IOException, ClassNotFoundException{
		
		serialize();
		deSerialize();
		
	}
	
	public static void serialize() throws IOException{
		
		Employee e = new Employee("aakash", "saxena", 100);
		
		FileOutputStream fo = new FileOutputStream(file);
		
		ObjectOutputStream os = new ObjectOutputStream(fo);
		
		os.writeObject(e);
		
		fo.close();
		
	}
	
	public static void deSerialize() throws IOException, ClassNotFoundException{
		
		FileInputStream fi = new FileInputStream(file);
		
		ObjectInputStream oi = new ObjectInputStream(fi);
		
		Employee eRead = (Employee)oi.readObject();
		
		System.out.println(eRead);
		
		fi.close();
		
	}
	
	

}
